package com.sena.examenes.infrastructure.adapter.out.security;

import com.sena.examenes.application.port.out.PasswordEncoderPort;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class PasswordEncoderAdapter implements PasswordEncoderPort {

    private final PasswordEncoder passwordEncoder;

    public PasswordEncoderAdapter(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String codificar(String textoPlano) {
        return passwordEncoder.encode(textoPlano);
    }

    @Override
    public boolean verificar(String textoPlano, String hashAlmacenado) {
        return passwordEncoder.matches(textoPlano, hashAlmacenado);
    }
}
