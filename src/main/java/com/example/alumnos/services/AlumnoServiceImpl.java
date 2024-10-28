package com.example.alumnos.services;

import com.example.alumnos.dto.AlumnoDTO;
import com.example.alumnos.dto.CrearAlumnoDTO;
import com.example.alumnos.dto.InfoContactoDTO;
import com.example.alumnos.persistance.models.Alumno;
import com.example.alumnos.persistance.models.InfoContacto;
import com.example.alumnos.persistance.repository.AlumnoRepository;
import com.example.alumnos.persistance.repository.InfoContactoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AlumnoServiceImpl implements AlumnoService {

    @Autowired
    private AlumnoRepository alumnoRepo;

    @Autowired
    private InfoContactoRepository infoRepo;

    @Override
    public List<AlumnoDTO> getAllAlumnos() {
        return alumnoRepo.findAll().stream().map(AlumnoDTO::new).collect(Collectors.toList());
    }

    @Override
    public AlumnoDTO getAlumnoById(Long id) {
        Alumno alumno = alumnoRepo.findById(id).orElse(null);
        return alumno != null ? new AlumnoDTO(alumno) : null;
    }

    @Override
    public InfoContactoDTO getInfoContactoByAlumnoId(Long id) {
        Alumno alumno = alumnoRepo.findById(id).orElse(null);
        return (alumno != null && alumno.getInfoContacto() != null) ? new InfoContactoDTO(alumno.getInfoContacto()) : null;
    }

    @Override
    public void createAlumno(CrearAlumnoDTO alumnoDTO) {
        Alumno alumno = new Alumno();
        alumno.setNombre(alumnoDTO.getNombre());
        alumno.setApellido(alumnoDTO.getApellido());

        InfoContacto infoContacto = new InfoContacto();
        infoContacto.setDireccion(alumnoDTO.getDireccion());
        infoContacto.setTelefono(alumnoDTO.getTelefono());
        infoContacto.setAlumno(alumno);

        alumno.setInfoContacto(infoContacto);
        alumnoRepo.save(alumno);
    }

    @Override
    public void deleteAlumno(Long id) {
        alumnoRepo.deleteById(id);
    }
}
