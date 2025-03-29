package com.example.aeropuerto.model;

import jakarta.persistence.*;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Aeropuerto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String ciudad;

    @OneToMany(mappedBy = "aeropuertoOrigen")
    @JsonIgnore
    private List<Vuelo> vuelosOrigen;

    @OneToMany(mappedBy = "aeropuertoDestino")
    @JsonIgnore
    private List<Vuelo> vuelosDestino;

    public Aeropuerto() {
    }

    public Aeropuerto(Long id, String nombre, String ciudad, List<Vuelo> vuelosOrigen, List<Vuelo> vuelosDestino) {
        this.id = id;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.vuelosOrigen = vuelosOrigen;
        this.vuelosDestino = vuelosDestino;
    }
    //GetSett

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Vuelo> getVuelosOrigen() {
        return vuelosOrigen;
    }

    public void setVuelosOrigen(List<Vuelo> vuelosOrigen) {
        this.vuelosOrigen = vuelosOrigen;
    }

    public List<Vuelo> getVuelosDestino() {
        return vuelosDestino;
    }

    public void setVuelosDestino(List<Vuelo> vuelosDestino) {
        this.vuelosDestino = vuelosDestino;
    }
}