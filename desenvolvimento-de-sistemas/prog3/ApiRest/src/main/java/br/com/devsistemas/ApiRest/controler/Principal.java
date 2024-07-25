package br.com.devsistemas.ApiRest.controler;

import br.com.devsistemas.ApiRest.model.Usuario;
import br.com.devsistemas.ApiRest.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
public class Principal {
    private IUsuarioRepository repositorio;

    @Autowired
    public Principal(IUsuarioRepository repositorio){
        this.repositorio = repositorio;
    }
    // ------------------------------------------
    @GetMapping("/usuario")
    public List<Usuario> getUsuario(){
        List<Usuario> usuario = repositorio.findAll();
        usuario.forEach(user -> System.out.print(user.toString()));
        return usuario;
    }

    @GetMapping("/")
    public String home() {
        return "Servidor Funcionando Perfeitamente";
    }


}
