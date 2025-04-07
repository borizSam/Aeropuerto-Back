package com.example.aeropuerto.controller;

import com.example.aeropuerto.dto.AvionDTO;
import com.example.aeropuerto.model.Avion;
import com.example.aeropuerto.repository.AvionRepository;
import com.example.aeropuerto.service.AvionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/aviones")
public class AvionController {

    @Autowired
    private AvionService avionService;

    @GetMapping
    public List<Avion> getAll() {

        return avionService.getAllAviones();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Avion> getById(@PathVariable Long id) {
        return avionService.getAvionById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Avion create(@RequestBody AvionDTO dto) {
        Avion avion = new Avion();
        avion.setModelo(dto.getModelo());
        avion.setCapacidad(dto.getCapacidad());
        return avionService.saveAvion(avion);
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        avionService.deleteAvion(id);
        return ResponseEntity.noContent().build();
    }
}