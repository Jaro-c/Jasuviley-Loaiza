package com.sena.examenes.application.service;

import com.sena.examenes.application.port.out.UsuarioRepositoryPort;
import com.sena.examenes.domain.Usuario;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertThrows;

class UsuarioServiceTest {

    static class UsuarioRepositoryPortFalso implements UsuarioRepositoryPort {
        private final List<Usuario> datos = new ArrayList<>();

        public Usuario guardar(Usuario u) { datos.add(u); return u; }

        public Optional<Usuario> buscarPorUsername(String username) {
            return datos.stream()
                    .filter(u -> u.getUsername().equalsIgnoreCase(username))
                    .findFirst();
        }

        public List<Usuario> listarActivos() {
            return datos.stream().filter(Usuario::isActivo).toList();
        }

        public boolean existePorUsername(String username) {
            return buscarPorUsername(username).isPresent();
        }
    }

    @Test
    void noPermiteRegistrarUsernameDuplicado() {
        UsuarioService service = new UsuarioService(new UsuarioRepositoryPortFalso());
        service.registrar("cbarrientos", "cbarrientos@sena.edu.co");

        assertThrows(IllegalStateException.class, () ->
                service.registrar("cbarrientos", "otro@correo.com"));
    }
}
