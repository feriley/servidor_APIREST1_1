package com.example.alumnos.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CrearAlumnoDTO {
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
}
