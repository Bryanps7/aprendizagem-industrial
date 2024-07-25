package com.devSystem.progDoador.controller;

import com.devSystem.progDoador.model.Doador;
import com.devSystem.progDoador.repository.IDoadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/doador")
@CrossOrigin("*")
public class DoadorController {
    @Autowired
    private final IDoadorRepository repositorioDoador;

    public DoadorController(IDoadorRepository repositorioDoador){
        this.repositorioDoador = repositorioDoador;
    }

    @PostMapping
    public ResponseEntity<String> cadastrarDoador(@RequestBody Doador doadorGravar) {
        try{
            Doador dadosDoador = repositorioDoador.save(doadorGravar);
            System.out.println(dadosDoador.toString());

            return ResponseEntity.ok("Dados gravados!!");
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }
    }

}
