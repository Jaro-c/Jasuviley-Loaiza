package com.sena.examenes.infrastructure.adapter.out.persistence;

import com.sena.examenes.domain.Rol;
import com.sena.examenes.domain.Usuario;
import org.springframework.stereotype.Component;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class UsuarioMapper {

    private final RolJpaRepository rolJpaRepository;

    public UsuarioMapper(RolJpaRepository rolJpaRepository) {
        this.rolJpaRepository = rolJpaRepository;
    }

    public UsuarioEntity aEntity(Usuario usuario) {
        UsuarioEntity entity = new UsuarioEntity(null, usuario.getUsername(),
                usuario.getEmail(), usuario.getPasswordHash(), usuario.isActivo());
        entity.setRoles(rolesAEntity(usuario.getRoles()));
        return entity;
    }

    private Set<RolEntity> rolesAEntity(Set<Rol> roles) {
        return roles.stream()
                .map(this::buscarRolEntityExistente)
                .collect(Collectors.toSet());
    }

    private RolEntity buscarRolEntityExistente(Rol rol) {
        return rolJpaRepository.findByNombreIgnoreCase(rol.getNombre())
                .orElseThrow(() -> new IllegalStateException(
                        "El rol '" + rol.getNombre() + "' no existe en BD."));
    }

    public Usuario aDominio(UsuarioEntity entity) {
        Usuario usuario = new Usuario(entity.getUsername(), entity.getEmail(),
                entity.getPasswordHash());
        if (!entity.isActivo()) {
            usuario.desactivar();
        }
        entity.getRoles().forEach(rolEntity -> usuario.asignarRol(
                new Rol(rolEntity.getNombre(), rolEntity.getDescripcion())));
        return usuario;
    }
}
