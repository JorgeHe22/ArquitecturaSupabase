package com.example.ProyectoAquitectura1.Repository;

import com.example.ProyectoAquitectura1.Model.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Long> {
}