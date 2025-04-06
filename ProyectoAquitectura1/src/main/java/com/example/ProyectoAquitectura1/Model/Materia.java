package com.example.ProyectoAquitectura1.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "materia")
public class Materia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @ManyToMany
    @JoinTable(
            name = "materia_estudiante",
            joinColumns = @JoinColumn(name = "materia_id"),
            inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
    private List<Estudiante> estudiantes;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public List<Estudiante> getEstudiantes() { return estudiantes; }
    public void setEstudiantes(List<Estudiante> estudiantes) { this.estudiantes = estudiantes; }
}
