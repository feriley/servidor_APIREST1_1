package com.example.alumnos.services;

import com.example.alumnos.dto.InfoContactoDTO;
import com.example.alumnos.persistance.models.InfoContacto;
import com.example.alumnos.persistance.repository.InfoContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class InfoContactoServiceImpl implements InfoContactoService {

    @Autowired
    private InfoContactoRepository infoContactoRepo;

    @Override
    public List<InfoContactoDTO> getAllInfoContacto() {
        return infoContactoRepo.findAll()
                .stream()
                .map(InfoContactoDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public InfoContactoDTO getInfoContactoById(Long id) {
        InfoContacto infoContacto = infoContactoRepo.findById(id).orElse(null);
        return infoContacto != null ? new InfoContactoDTO(infoContacto) : null;
    }
}
