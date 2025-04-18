package com.example.aeropuerto.service;

import com.example.aeropuerto.model.Vuelo;
import com.example.aeropuerto.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class VueloService {

    @Autowired
    private VueloRepository vueloRepository;

    public List<Vuelo> getAllVuelos() {
        return vueloRepository.findAll();
    }

    public Optional<Vuelo> getVueloById(Long id) {
        return vueloRepository.findById(id);
    }

    public Vuelo saveVuelo(Vuelo vuelo) {
        return vueloRepository.save(vuelo);
    }

    public void deleteVuelo(Long id) {
        vueloRepository.deleteById(id);
    }
}