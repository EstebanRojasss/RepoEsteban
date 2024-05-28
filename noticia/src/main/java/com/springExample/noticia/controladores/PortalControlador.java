package com.springExample.noticia.controladores;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalControlador {

    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo";
    }
}
