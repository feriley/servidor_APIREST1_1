package com.example.alumnos.controllers;

import com.example.alumnos.dto.InfoContactoDTO; // Asegúrate de que esto exista
import com.example.alumnos.services.InfoContactoService; // Asegúrate de que este servicio exista
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacto")
@CrossOrigin(origins = "http://127.0.0.1:5500") // Añado CORS a los controladores 
public class InfoContactoController {

    @Autowired
    private InfoContactoService infoContactoService;

    // Método de ejemplo para obtener información de contacto
    @GetMapping("/{id}")
    public InfoContactoDTO getInfoContacto(@PathVariable Long id) {
        return infoContactoService.getInfoContactoById(id);
    }
    
    // Agrega otros métodos según sea necesario
}
