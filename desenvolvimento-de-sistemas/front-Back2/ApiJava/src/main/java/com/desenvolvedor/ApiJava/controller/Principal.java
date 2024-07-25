package com.desenvolvedor.ApiJava.controller;


import com.desenvolvedor.ApiJava.model.Usuario;
import com.desenvolvedor.ApiJava.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
public class Principal {
    private IUsuarioRepository bryan;

    @Autowired
    public Principal(IUsuarioRepository repositorio){
        this.bryan = repositorio;

    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> postUsuario(@PathVariable Usuario novoUsuario){
        try{
               Usuario user = bryan.save(novoUsuario);
               return ResponseEntity.ok(user);
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/usuarios/{id}")
    public ResponseEntity<Usuario> getUsuarioPorId(@PathVariable Long id){
        try{
            Optional<Usuario> usuario = bryan.findById(id);
            if (usuario.isPresent()){
                Usuario user = usuario.get();
                System.out.print(user.toString());
                return ResponseEntity.ok(user);
            }else{
                return ResponseEntity.notFound().build();
            }
        }catch (Exception e){
            e.printStackTrace();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        List<Usuario> usuario = bryan.findAll();
        usuario.forEach(user -> System.out.println(usuario));
        return usuario;
    }

    @GetMapping("/")
    public String home() {
        return "Servidor Rodando em perfeito estado";
    }
}
