package com.example.aeropuerto.dto;

public class AvionDTO {
    private String modelo;
    private int capacidad;

    public AvionDTO() {}

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
