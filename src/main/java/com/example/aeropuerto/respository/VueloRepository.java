package com.example.aeropuerto.repository;

import com.example.aeropuerto.model.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VueloRepository extends JpaRepository<Vuelo, Long> {}