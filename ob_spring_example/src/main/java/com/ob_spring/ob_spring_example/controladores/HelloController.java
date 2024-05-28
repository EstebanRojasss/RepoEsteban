package com.ob_spring.ob_spring_example.controladores;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola mundo perras";
    }

}
