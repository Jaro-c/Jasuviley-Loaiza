package com.sena.examenes.infrastructure.security;

import com.sena.examenes.application.port.out.TokenPort;
import com.sena.examenes.application.port.out.UsuarioRepositoryPort;
import com.sena.examenes.domain.Rol;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;
import java.io.IOException;
import java.util.List;

@Component
public class JwtAuthenticationFilter extends OncePerRequestFilter {

    private final TokenPort tokenPort;
    private final UsuarioRepositoryPort usuarioRepositoryPort;

    public JwtAuthenticationFilter(TokenPort tokenPort,
                                    UsuarioRepositoryPort usuarioRepositoryPort) {
        this.tokenPort = tokenPort;
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request,
            HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

        String header = request.getHeader("Authorization");
        if (header != null && header.startsWith("Bearer ")) {
            String token = header.substring(7);
            tokenPort.validarYObtenerUsername(token).ifPresent(username ->
                    autenticarEnElContexto(username));
        }
        filterChain.doFilter(request, response);
    }

    private void autenticarEnElContexto(String username) {
        usuarioRepositoryPort.buscarPorUsername(username).ifPresent(usuario -> {
            List<SimpleGrantedAuthority> authorities = usuario.getRoles().stream()
                    .map(Rol::getNombre)
                    .map(nombre -> new SimpleGrantedAuthority("ROLE_" + nombre))
                    .toList();
            var auth = new UsernamePasswordAuthenticationToken(
                    usuario.getUsername(), null, authorities);
            SecurityContextHolder.getContext().setAuthentication(auth);
        });
    }
}
