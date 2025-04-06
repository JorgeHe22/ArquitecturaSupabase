package com.example.ProyectoAquitectura1.Model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "profesor")
public class Profesor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String profesion;
    private String correo;
    private String apellido;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnoreProperties("profesor") // Evita recursión infinita
    private List<Curso> cursos;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getProfesion() { return profesion; }
    public void setProfesion(String profesion) { this.profesion = profesion; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public List<Curso> getCursos() { return cursos; }
    public void setCursos(List<Curso> cursos) { this.cursos = cursos; }
}
