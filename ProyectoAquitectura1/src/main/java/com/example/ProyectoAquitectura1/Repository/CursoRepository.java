package com.example.ProyectoAquitectura1.Repository;

import com.example.ProyectoAquitectura1.Model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}
