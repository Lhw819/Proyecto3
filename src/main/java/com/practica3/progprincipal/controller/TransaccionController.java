package com.practica3.progprincipal.controller;

import com.practica3.progprincipal.model.Transaccion;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/transacciones")
public class TransaccionController {

    @GetMapping
    public List<Transaccion> listar() {
        return List.of(
                new Transaccion("ingreso", 1000),
                new Transaccion("gasto", 500)
        );
    }

    @PostMapping
    public String registrar(@RequestBody Transaccion t) {
        return "Transacción registrada: " + t.getTipo() + " - " + t.getMonto();
    }
}