package com.sena.examenes.application.service;

import com.sena.examenes.application.port.in.UsuarioUseCase;
import com.sena.examenes.application.port.out.UsuarioRepositoryPort;
import com.sena.examenes.domain.Usuario;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService implements UsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario registrar(String username, String email) {
        if (usuarioRepositoryPort.existePorUsername(username)) {
            throw new IllegalStateException("Ya existe un usuario con ese username.");
        }
        Usuario nuevo = new Usuario(username, email);
        return usuarioRepositoryPort.guardar(nuevo);
    }

    @Override
    public Optional<Usuario> buscarPorUsername(String username) {
        return usuarioRepositoryPort.buscarPorUsername(username);
    }

    @Override
    public List<Usuario> listarActivos() {
        return usuarioRepositoryPort.listarActivos();
    }
}
