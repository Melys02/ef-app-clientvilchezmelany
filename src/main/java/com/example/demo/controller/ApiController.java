package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RequiredArgsConstructor
@RestController
    public class ApiController {


        // API protegida - requiere autenticación
        @GetMapping("/api/protected")
        public String protectedApi() {
            return "Esta es una API protegida";
        }

        // API pública - no requiere autenticación
        @GetMapping("/api/public")
        public String publicApi() {
            return "Esta es una API pública, accesible sin autenticación";
        }

}
