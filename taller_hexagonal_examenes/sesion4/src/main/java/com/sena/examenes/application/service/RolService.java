package com.sena.examenes.application.service;

import com.sena.examenes.application.port.in.RolUseCase;
import com.sena.examenes.application.port.out.RolRepositoryPort;
import com.sena.examenes.domain.Rol;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RolService implements RolUseCase {

    private final RolRepositoryPort rolRepositoryPort;

    public RolService(RolRepositoryPort rolRepositoryPort) {
        this.rolRepositoryPort = rolRepositoryPort;
    }

    @Override
    public Rol crear(String nombre, String descripcion) {
        if (rolRepositoryPort.buscarPorNombre(nombre).isPresent()) {
            throw new IllegalStateException("Ya existe un rol con ese nombre.");
        }
        Rol nuevo = new Rol(nombre, descripcion);
        return rolRepositoryPort.guardar(nuevo);
    }

    @Override
    public List<Rol> listarTodos() {
        return rolRepositoryPort.listarTodos();
    }
}
