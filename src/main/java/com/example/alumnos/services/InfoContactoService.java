package com.example.alumnos.services;

import com.example.alumnos.dto.InfoContactoDTO;
import java.util.List;

public interface InfoContactoService {
    List<InfoContactoDTO> getAllInfoContacto();
    InfoContactoDTO getInfoContactoById(Long id);
}
