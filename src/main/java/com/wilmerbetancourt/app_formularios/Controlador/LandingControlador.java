package com.wilmerbetancourt.app_formularios.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LandingControlador {

    @GetMapping("/landing")
    public String holaMundo(){
        return "pages/landing";
    }
}
