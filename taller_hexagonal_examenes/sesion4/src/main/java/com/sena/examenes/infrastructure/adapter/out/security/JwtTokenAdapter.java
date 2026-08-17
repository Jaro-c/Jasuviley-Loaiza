package com.sena.examenes.infrastructure.adapter.out.security;

import com.sena.examenes.application.port.out.TokenPort;
import com.sena.examenes.domain.Rol;
import com.sena.examenes.domain.Usuario;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtException;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import javax.crypto.SecretKey;
import java.util.Base64;
import java.util.Date;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JwtTokenAdapter implements TokenPort {

    private static final long EXPIRACION_MS = 3_600_000L;
    private final SecretKey clave;

    public JwtTokenAdapter(@Value("${jwt.secret}") String secretoBase64) {
        this.clave = Keys.hmacShaKeyFor(Base64.getDecoder().decode(secretoBase64));
    }

    @Override
    public String generar(Usuario usuario) {
        String roles = usuario.getRoles().stream()
                .map(Rol::getNombre)
                .collect(Collectors.joining(","));
        return Jwts.builder()
                .subject(usuario.getUsername())
                .claim("roles", roles)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + EXPIRACION_MS))
                .signWith(clave)
                .compact();
    }

    @Override
    public Optional<String> validarYObtenerUsername(String token) {
        try {
            Claims claims = Jwts.parser().verifyWith(clave).build()
                    .parseSignedClaims(token).getPayload();
            return Optional.of(claims.getSubject());
        } catch (JwtException e) {
            return Optional.empty();
        }
    }
}
