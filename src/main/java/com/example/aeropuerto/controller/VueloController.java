package com.example.aeropuerto.controller;

import com.example.aeropuerto.dto.VueloDTO;
import com.example.aeropuerto.model.Aeropuerto;
import com.example.aeropuerto.model.Avion;
import com.example.aeropuerto.model.Vuelo;
import com.example.aeropuerto.repository.VueloRepository;
import com.example.aeropuerto.service.VueloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vuelos")
public class VueloController {

    @Autowired
    private VueloService vueloService;
    @Autowired
    private com.example.aeropuerto.repository.AvionRepository avionRepository;
    @Autowired
    private com.example.aeropuerto.repository.AeropuertoRepository aeropuertoRepository;

    @GetMapping
    public List<Vuelo> getAll() {

        return vueloService.getAllVuelos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Vuelo> getById(@PathVariable Long id) {
        return vueloService.getVueloById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Vuelo create(@RequestBody VueloDTO dto) {
        Vuelo vuelo = new Vuelo();

        vuelo.setDestino(dto.getDestino());
        vuelo.setFechaSalida(dto.getFechaSalida());
        vuelo.setFechaLlegada(dto.getFechaLlegada());

        // Buscar relaciones por ID
        Avion avion = avionRepository.findById(dto.getAvionId()).orElseThrow();
        Aeropuerto origen = aeropuertoRepository.findById(dto.getOrigenId()).orElseThrow();
        Aeropuerto destino = aeropuertoRepository.findById(dto.getDestinoId()).orElseThrow();

        vuelo.setAvion(avion);
        vuelo.setAeropuertoOrigen(origen);
        vuelo.setAeropuertoDestino(destino);

        return vueloService.saveVuelo(vuelo);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        vueloService.deleteVuelo(id);
        return ResponseEntity.noContent().build();
    }
}