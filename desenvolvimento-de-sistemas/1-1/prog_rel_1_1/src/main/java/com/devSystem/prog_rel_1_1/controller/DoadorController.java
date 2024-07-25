package com.devSystem.prog_rel_1_1.controller;

import com.devSystem.prog_rel_1_1.model.Doador;
import com.devSystem.prog_rel_1_1.repository.IDoadorRepository;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/doador")
@CrossOrigin("*")
public class DoadorController {

    private final IDoadorRepository repositoryDoador;

    public DoadorController(IDoadorRepository repositoryDoador){
        this.repositoryDoador = repositoryDoador;
    }

    @PostMapping
    public ResponseEntity<Doador> postDoador(@RequestBody Doador novoDoador){
        try {
            Doador doador = repositoryDoador.save(novoDoador);
            return ResponseEntity.ok(doador);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping
    public List<Doador> listarDoador(){
        List<Doador> doador = repositoryDoador.findAll();
        doador.forEach(lista -> System.out.println(lista.toString()));

        return doador;
    }

    @GetMapping("/{codDoador}")
    public ResponseEntity<Doador> consultarDoador(@PathVariable Long codDoador) {
        try{
            Optional<Doador> doadorOptional = repositoryDoador.findById(codDoador);
            if (doadorOptional.isPresent()){
                Doador doador = doadorOptional.get();
                System.out.println(doador.toString());
                return ResponseEntity.ok(doador);
            }else{
                return ResponseEntity.notFound().build();
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
