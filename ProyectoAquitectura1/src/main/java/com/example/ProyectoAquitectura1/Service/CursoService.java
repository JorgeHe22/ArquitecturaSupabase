package com.example.ProyectoAquitectura1.Service;


import com.example.ProyectoAquitectura1.Model.Curso;
import com.example.ProyectoAquitectura1.Model.Profesor;
import com.example.ProyectoAquitectura1.Repository.CursoRepository;
import com.example.ProyectoAquitectura1.Repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CursoService {

    @Autowired
    private CursoRepository cursoRepository;

    @Autowired
    private ProfesorRepository profesorRepository;

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso guardarCurso(Curso curso) {
        if (curso.getProfesor() != null && curso.getProfesor().getId() != null) {
            Optional<Profesor> profesorOpt = profesorRepository.findById(curso.getProfesor().getId());

            if (!profesorOpt.isPresent()) {
                throw new RuntimeException("El profesor con ID " + curso.getProfesor().getId() + " no existe.");
            }

            curso.setProfesor(profesorOpt.get()); // Asignar el profesor encontrado
        } else {
            throw new RuntimeException("Debe proporcionar un profesor con un ID válido.");
        }

        return cursoRepository.save(curso);
    }
}
