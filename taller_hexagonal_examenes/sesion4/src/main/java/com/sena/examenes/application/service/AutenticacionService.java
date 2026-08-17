package com.sena.examenes.application.service;

import com.sena.examenes.application.port.in.AutenticacionUseCase;
import com.sena.examenes.application.port.out.PasswordEncoderPort;
import com.sena.examenes.application.port.out.TokenPort;
import com.sena.examenes.application.port.out.UsuarioRepositoryPort;
import com.sena.examenes.domain.Usuario;
import org.springframework.stereotype.Service;

@Service
public class AutenticacionService implements AutenticacionUseCase {

    private static final String CREDENCIALES_INVALIDAS =
            "Username o password incorrectos.";

    private final UsuarioRepositoryPort usuarioRepositoryPort;
    private final PasswordEncoderPort passwordEncoderPort;
    private final TokenPort tokenPort;

    public AutenticacionService(UsuarioRepositoryPort usuarioRepositoryPort,
                                 PasswordEncoderPort passwordEncoderPort,
                                 TokenPort tokenPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
        this.passwordEncoderPort = passwordEncoderPort;
        this.tokenPort = tokenPort;
    }

    @Override
    public String login(String username, String password) {
        Usuario usuario = usuarioRepositoryPort.buscarPorUsername(username)
                .orElseThrow(() -> new IllegalStateException(CREDENCIALES_INVALIDAS));

        boolean coincide = passwordEncoderPort.verificar(
                password, usuario.getPasswordHash());
        if (!coincide) {
            throw new IllegalStateException(CREDENCIALES_INVALIDAS);
        }
        return tokenPort.generar(usuario);
    }
}
