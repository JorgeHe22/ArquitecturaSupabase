package com.example.ProyectoAquitectura1.Controller;


import com.example.ProyectoAquitectura1.Model.Profesor;
import com.example.ProyectoAquitectura1.Service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProfesorController {

    @Autowired
    public ProfesorService profesorService;

    @PostMapping("/guardar")
    public Profesor guardar (@RequestBody Profesor profesor){
        return profesorService.guardar(profesor);
    }

    @GetMapping("/listar")
    public List<Profesor> listar(){
        return profesorService.listar();
    }


}
