package com.sena.examenes.application.service;

import com.sena.examenes.application.port.out.PasswordEncoderPort;
import com.sena.examenes.application.port.out.RolRepositoryPort;
import com.sena.examenes.application.port.out.UsuarioRepositoryPort;
import com.sena.examenes.domain.Rol;
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

    static class RolRepositoryPortFalso implements RolRepositoryPort {
        private final List<Rol> datos = new ArrayList<>();

        public Rol guardar(Rol rol) { datos.add(rol); return rol; }

        public Optional<Rol> buscarPorNombre(String nombre) {
            return datos.stream()
                    .filter(r -> r.getNombre().equalsIgnoreCase(nombre))
                    .findFirst();
        }

        public List<Rol> listarTodos() { return datos; }
    }

    static class PasswordEncoderPortFalso implements PasswordEncoderPort {
        public String codificar(String textoPlano) { return "hash-" + textoPlano; }

        public boolean verificar(String textoPlano, String hashAlmacenado) {
            return ("hash-" + textoPlano).equals(hashAlmacenado);
        }
    }

    @Test
    void noPermiteRegistrarUsernameDuplicado() {
        UsuarioService service = new UsuarioService(
                new UsuarioRepositoryPortFalso(),
                new RolRepositoryPortFalso(),
                new PasswordEncoderPortFalso());

        service.registrar("cbarrientos", "cbarrientos@sena.edu.co", "clave1234");

        assertThrows(IllegalStateException.class, () ->
                service.registrar("cbarrientos", "otro@correo.com", "otraClave"));
    }
}
