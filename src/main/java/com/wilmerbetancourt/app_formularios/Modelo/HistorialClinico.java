package com.wilmerbetancourt.app_formularios.Modelo;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;


@Data

public class HistorialClinico {
    @NotBlank(message = "El nombre es obligatorio")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres")
    private String nombre;

    @NotNull(message = "La fecha de nacimiento es obligatoria")
    private String fechaNacimiento;

    @NotBlank(message = "El género es obligatorio")
    private String genero;

    @NotBlank(message = "El número de teléfono es obligatorio")
    @Size(min = 10, max = 15, message = "El número de teléfono debe tener entre 10 y 15 dígitos")
    private String telefono;

    @NotBlank(message = "La dirección es obligatoria")
    private String direccion;

    private Double peso;

    private Double altura;

    private String alergias;

    private String enfermedadesPrevias;

    private String medicamentos;

    private String cirugias;

    private String doctorAsignado;

    @NotNull(message = "La fecha de consulta es obligatoria")
    private String fechaConsulta;

    private String motivoConsulta;

    private String diagnostico;

    private String tratamiento;

    private String proximaCita;

    private String observaciones;
}

