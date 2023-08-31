package com.dliriotech.backendtms.controllers;

import com.dliriotech.backendtms.data.EquipoDao;
import com.dliriotech.backendtms.tables.Equipos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EquipoController {

    @Autowired
    private EquipoDao equipoDao;

    @CrossOrigin("*")
    @GetMapping("/equipos")
    public List<Equipos> listEquips() {
        List<Equipos> equipos = equipoDao.listarEquipos();
        System.out.println("Vehiculos encontrados: " + equipos);
        return equipos;
    }

    @CrossOrigin("*")
    @GetMapping("/texto")
    public String texto() {
        return "Hola mundo";
    }
}
