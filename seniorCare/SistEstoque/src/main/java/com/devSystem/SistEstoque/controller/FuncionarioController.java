package com.devSystem.SistEstoque.controller;

import com.devSystem.SistEstoque.dto.FuncionarioDTO;
import com.devSystem.SistEstoque.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/funcionario")
@CrossOrigin("*")
public class FuncionarioController {

    @Autowired
    private FuncionarioService serviceFuncionario;

    @PostMapping
    public ResponseEntity<?> cadastrarFuncionario(@RequestBody FuncionarioDTO novoFuncionario){
        try{
            FuncionarioDTO funcionario = serviceFuncionario.cadastrar(novoFuncionario);
            return ResponseEntity.ok(funcionario);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
