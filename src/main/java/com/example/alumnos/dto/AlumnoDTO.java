package com.example.alumnos.dto;

import com.example.alumnos.persistance.models.Alumno;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AlumnoDTO {
    private Long idalumno;
    private String nombre;
    private String apellido;

    public AlumnoDTO(Alumno alumno) {
        this.idalumno = alumno.getIdalumno();
        this.nombre = alumno.getNombre();
        this.apellido = alumno.getApellido();
    }
}
