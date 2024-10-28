package com.example.alumnos.controllers;

import com.example.alumnos.dto.AlumnoDTO;
import com.example.alumnos.dto.CrearAlumnoDTO;
import com.example.alumnos.dto.InfoContactoDTO;
import com.example.alumnos.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alumnos")
@CrossOrigin(origins = "http://127.0.0.1:5500") // Añado CORS a los controladores 
public class AlumnoController {

    @Autowired
    private AlumnoService alumnoService;

    // 1. Consultar todos los alumnos (sin información de contacto)
    @GetMapping
    public List<AlumnoDTO> getAllAlumnos() {
        return alumnoService.getAllAlumnos();
    }

    // 2. Consultar un solo alumno (sin información de contacto)
    @GetMapping("/{id}")
    public AlumnoDTO getAlumno(@PathVariable Long id) {
        return alumnoService.getAlumnoById(id);
    }

    // 3. Consultar los datos de contacto de un alumno (con el id del alumno)
    @GetMapping("/{id}/contacto")
    public InfoContactoDTO getInfoContacto(@PathVariable Long id) {
        return alumnoService.getInfoContactoByAlumnoId(id);
    }

    // 4. Crear nuevo alumno (con información de contacto)
    @PostMapping
    public void createAlumno(@RequestBody CrearAlumnoDTO alumnoDTO) {
        alumnoService.createAlumno(alumnoDTO);
    }

    // 5. Borrar alumno (con información de contacto)
    @DeleteMapping("/{id}")
    public void deleteAlumno(@PathVariable Long id) {
        alumnoService.deleteAlumno(id);
    }
}
