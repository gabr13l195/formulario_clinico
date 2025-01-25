package com.wilmerbetancourt.app_formularios.Controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.wilmerbetancourt.app_formularios.Modelo.HistorialClinico;

import jakarta.validation.Valid;

@Controller
public class FormularioControlador {

    // Mostrar el formulario
    @GetMapping("/formulario")
    public String mostrarFormulario(Model model) {
        model.addAttribute("historialClinico", new HistorialClinico());
        return "pages/formulario";
    }

    // Procesar el formulario
    @PostMapping("/formulario")
    public String procesarFormulario(@Valid @ModelAttribute("historialClinico") HistorialClinico historialClinico,
                                     BindingResult result,
                                     Model model) {
        if (result.hasErrors()) {
            return "pages/formulario";
        }

        // Aquí se podria guardar los datos en la base de datos o procesarlos de alguna forma
        model.addAttribute("mensaje", "Formulario enviado con éxito");
        return "pages/resultado"; // Crea una página "resultado" para mostrar el mensaje
    }
}

