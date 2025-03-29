package com.example.aeropuerto.repository;

import com.example.aeropuerto.model.Avion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AvionRepository extends JpaRepository<Avion, Long> {}