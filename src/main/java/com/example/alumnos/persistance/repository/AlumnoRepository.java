package com.example.alumnos.persistance.repository;

import com.example.alumnos.persistance.models.Alumno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlumnoRepository extends JpaRepository<Alumno, Long> {
}
