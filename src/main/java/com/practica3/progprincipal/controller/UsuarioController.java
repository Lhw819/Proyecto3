package com.practica3.progprincipal.controller;

import com.practica3.progprincipal.model.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @GetMapping
    public List<Usuario> listar() {
        return List.of(new Usuario("Sol", "123"), new Usuario("Leo", "456"));
    }

    @PostMapping
    public String guardar(@RequestBody Usuario u) {
        return "Usuario guardado: " + u.getNombre();
    }
}