package com.example.alumnos.dto;

import com.example.alumnos.persistance.models.InfoContacto;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class InfoContactoDTO {
    private Long idinfocontacto;
    private String direccion;
    private String telefono;
    private Long alumnoId;

    public InfoContactoDTO(InfoContacto info) {
        this.idinfocontacto = info.getIdinfocontacto();
        this.direccion = info.getDireccion();
        this.telefono = info.getTelefono();
        this.alumnoId = info.getAlumno().getIdalumno();
    }
}
