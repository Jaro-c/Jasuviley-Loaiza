package com.sena.examenes.application.service;

import com.sena.examenes.application.port.in.UsuarioUseCase;
import com.sena.examenes.application.port.out.PasswordEncoderPort;
import com.sena.examenes.application.port.out.RolRepositoryPort;
import com.sena.examenes.application.port.out.UsuarioRepositoryPort;
import com.sena.examenes.domain.Rol;
import com.sena.examenes.domain.Usuario;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@Service
public class UsuarioService implements UsuarioUseCase {

    private final UsuarioRepositoryPort usuarioRepositoryPort;
    private final RolRepositoryPort rolRepositoryPort;
    private final PasswordEncoderPort passwordEncoderPort;

    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort,
                           RolRepositoryPort rolRepositoryPort,
                           PasswordEncoderPort passwordEncoderPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
        this.rolRepositoryPort = rolRepositoryPort;
        this.passwordEncoderPort = passwordEncoderPort;
    }

    @Override
    public Usuario registrar(String username, String email, String password) {
        if (usuarioRepositoryPort.existePorUsername(username)) {
            throw new IllegalStateException("Ya existe un usuario con ese username.");
        }
        String hash = passwordEncoderPort.codificar(password);
        Usuario nuevo = new Usuario(username, email, hash);
        return usuarioRepositoryPort.guardar(nuevo);
    }

    @Override
    public Usuario asignarRol(String username, String nombreRol) {
        Usuario usuario = usuarioRepositoryPort.buscarPorUsername(username)
                .orElseThrow(() -> new NoSuchElementException(
                        "No existe un usuario con ese username."));
        Rol rol = rolRepositoryPort.buscarPorNombre(nombreRol)
                .orElseThrow(() -> new NoSuchElementException(
                        "No existe un rol con ese nombre."));
        usuario.asignarRol(rol);
        return usuarioRepositoryPort.guardar(usuario);
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
