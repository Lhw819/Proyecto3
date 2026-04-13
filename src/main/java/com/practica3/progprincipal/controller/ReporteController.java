package com.practica3.progprincipal.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/reportes")
public class ReporteController {

    @GetMapping("/balance")
    public String balance() {
        return "Balance general: ingresos 1000 - gastos 500 = 500";
    }
}