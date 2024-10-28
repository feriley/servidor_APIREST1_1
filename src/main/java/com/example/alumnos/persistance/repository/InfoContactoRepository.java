package com.example.alumnos.persistance.repository;

import com.example.alumnos.persistance.models.InfoContacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfoContactoRepository extends JpaRepository<InfoContacto, Long> {
}
