package com.sena.examenes.domain;

import java.util.Objects;

public class Rol {

    private final String nombre;
    private final String descripcion;

    public Rol(String nombre, String descripcion) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del rol no puede estar vacio.");
        }
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rol)) return false;
        Rol otro = (Rol) o;
        return nombre.equalsIgnoreCase(otro.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre.toLowerCase());
    }
}
