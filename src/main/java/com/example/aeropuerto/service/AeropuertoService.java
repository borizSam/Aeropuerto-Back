package com.example.aeropuerto.service;

import com.example.aeropuerto.model.Aeropuerto;
import com.example.aeropuerto.model.Vuelo;
import com.example.aeropuerto.repository.AeropuertoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AeropuertoService {

    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    public List<Aeropuerto> getAllAeropuertos() {
        return aeropuertoRepository.findAll();
    }

    public Optional<Aeropuerto> getAeropuertoById(Long id) {
        return aeropuertoRepository.findById(id);
    }

    public Aeropuerto saveAeropuerto(Aeropuerto aeropuerto) {
        return aeropuertoRepository.save(aeropuerto);
    }

    public void deleteAeropuerto(Long id) {
        aeropuertoRepository.deleteById(id);
    }
}