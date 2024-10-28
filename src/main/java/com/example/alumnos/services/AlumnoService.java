package com.example.alumnos.services;

import com.example.alumnos.dto.AlumnoDTO;
import com.example.alumnos.dto.CrearAlumnoDTO;
import com.example.alumnos.dto.InfoContactoDTO;
import java.util.List;

public interface AlumnoService {
    List<AlumnoDTO> getAllAlumnos();
    AlumnoDTO getAlumnoById(Long id);
    InfoContactoDTO getInfoContactoByAlumnoId(Long id);
    void createAlumno(CrearAlumnoDTO alumnoDTO);
    void deleteAlumno(Long id);
}
