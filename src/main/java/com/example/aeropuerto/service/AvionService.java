package com.example.aeropuerto.service;

import com.example.aeropuerto.model.Avion;
import com.example.aeropuerto.repository.AvionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvionService {

    @Autowired
    private AvionRepository avionRepository;

    public List<Avion> getAllAviones() {
        return avionRepository.findAll();
    }

    public Optional<Avion> getAvionById(Long id) {
        return avionRepository.findById(id);
    }

    public Avion saveAvion(Avion avion) {
        return avionRepository.save(avion);
    }

    // Por si quiero guardar varios aviones
    public List<Avion> saveAvion(List<Avion> aviones) {
        return avionRepository.saveAll(aviones);
    }

    public void deleteAvion(Long id) {
        avionRepository.deleteById(id);
    }
}

