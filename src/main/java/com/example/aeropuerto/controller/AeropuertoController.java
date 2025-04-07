package com.example.aeropuerto.controller;

import com.example.aeropuerto.dto.AeropuertoDTO;
import com.example.aeropuerto.model.Aeropuerto;
import com.example.aeropuerto.repository.AeropuertoRepository;
import com.example.aeropuerto.service.AeropuertoService;
import com.example.aeropuerto.service.AvionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/aeropuertos")
public class AeropuertoController {

    @Autowired
    private AeropuertoService aeropuertoService;

    @GetMapping
    public List<Aeropuerto> getAll() {

        return aeropuertoService.getAllAeropuertos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aeropuerto> getById(@PathVariable Long id) {
        return aeropuertoService.getAeropuertoById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Aeropuerto create(@RequestBody AeropuertoDTO dto) {
        Aeropuerto aeropuerto = new Aeropuerto();
        aeropuerto.setNombre(dto.getNombre());
        aeropuerto.setCiudad(dto.getCiudad());
        return aeropuertoService.saveAeropuerto(aeropuerto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        aeropuertoService.deleteAeropuerto(id);
        return ResponseEntity.noContent().build();
    }

}