package com.example.ProyectoAquitectura1.Repository;


import com.example.ProyectoAquitectura1.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
