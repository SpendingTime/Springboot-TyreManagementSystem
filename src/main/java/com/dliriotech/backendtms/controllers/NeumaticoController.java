package com.dliriotech.backendtms.controllers;

import com.dliriotech.backendtms.data.NeumaticoDao;
import com.dliriotech.backendtms.tables.Neumaticos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NeumaticoController {

    @Autowired
    private NeumaticoDao neumaticoDao;

    @CrossOrigin("*")
    @GetMapping("/neumaticos")
    public List<Neumaticos> listNeumaticos() {
        List<Neumaticos> neumaticos = neumaticoDao.listarNeumaticos();
        System.out.println("Neumáticos encontrados: " + neumaticos);
        return neumaticos;
    }

    @CrossOrigin("*")
    @GetMapping("/milena")
    public String texto() {
        return "Me encantas <3";
    }
}
