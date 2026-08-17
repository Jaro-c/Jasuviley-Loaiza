package com.sena.examenes.infrastructure.adapter.out.persistence;

import com.sena.examenes.application.port.out.RolRepositoryPort;
import com.sena.examenes.domain.Rol;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public class RolRepositoryAdapter implements RolRepositoryPort {

    private final RolJpaRepository jpaRepository;

    public RolRepositoryAdapter(RolJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Rol guardar(Rol rol) {
        RolEntity entity = new RolEntity(null, rol.getNombre(), rol.getDescripcion());
        RolEntity guardado = jpaRepository.save(entity);
        return new Rol(guardado.getNombre(), guardado.getDescripcion());
    }

    @Override
    public Optional<Rol> buscarPorNombre(String nombre) {
        return jpaRepository.findByNombreIgnoreCase(nombre)
                .map(e -> new Rol(e.getNombre(), e.getDescripcion()));
    }

    @Override
    public List<Rol> listarTodos() {
        return jpaRepository.findAll().stream()
                .map(e -> new Rol(e.getNombre(), e.getDescripcion()))
                .toList();
    }
}
