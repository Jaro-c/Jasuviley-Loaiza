package com.sena.examenes.infrastructure.adapter.in.rest;

import com.sena.examenes.application.port.in.UsuarioUseCase;
import com.sena.examenes.domain.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    private final UsuarioUseCase usuarioUseCase;

    public UsuarioController(UsuarioUseCase usuarioUseCase) {
        this.usuarioUseCase = usuarioUseCase;
    }

    @PostMapping
    public ResponseEntity<UsuarioResponse> registrar(
            @RequestBody UsuarioRequest request) {
        Usuario usuario = usuarioUseCase.registrar(request.username(), request.email());
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(UsuarioResponse.desde(usuario));
    }

    @GetMapping("/{username}")
    public ResponseEntity<UsuarioResponse> buscar(@PathVariable String username) {
        return usuarioUseCase.buscarPorUsername(username)
                .map(UsuarioResponse::desde)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping
    public List<UsuarioResponse> listarActivos() {
        return usuarioUseCase.listarActivos().stream()
                .map(UsuarioResponse::desde)
                .toList();
    }

    @ExceptionHandler(IllegalStateException.class)
    public ResponseEntity<String> manejarDuplicado(IllegalStateException e) {
        return ResponseEntity.status(HttpStatus.CONFLICT).body(e.getMessage());
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> manejarDatosInvalidos(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
