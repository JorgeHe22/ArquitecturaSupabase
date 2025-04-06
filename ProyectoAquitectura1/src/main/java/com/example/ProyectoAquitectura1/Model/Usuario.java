package com.example.ProyectoAquitectura1.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "perfil_id", referencedColumnName = "id")
    private Perfil perfil;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Perfil getPerfil() { return perfil; }
    public void setPerfil(Perfil perfil) { this.perfil = perfil; }
}
