package com.sena.examenes.domain;

import java.util.HashSet;
import java.util.Set;

public class Usuario {

    private String username;
    private String email;
    private boolean activo;
    private final Set<Rol> roles;

    public Usuario(String username, String email) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("El username no puede estar vacio.");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("El email no puede estar vacio.");
        }
        this.username = username;
        this.email = email;
        this.activo = true;
        this.roles = new HashSet<>();
    }

    public String getUsername() { return username; }
    public String getEmail() { return email; }
    public boolean isActivo() { return activo; }

    public void desactivar() {
        this.activo = false;
    }

    public void asignarRol(Rol rol) {
        if (rol == null) {
            throw new IllegalArgumentException("El rol no puede ser nulo.");
        }
        roles.add(rol);
    }

    public boolean tieneRol(String nombreRol) {
        return roles.stream()
                .anyMatch(r -> r.getNombre().equalsIgnoreCase(nombreRol));
    }

    public Set<Rol> getRoles() {
        return Set.copyOf(roles);
    }
}
