package com.example.aeropuerto.dto;


public class AeropuertoDTO {
    private String nombre;
    private String ciudad;

    public AeropuertoDTO() {}

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
}
