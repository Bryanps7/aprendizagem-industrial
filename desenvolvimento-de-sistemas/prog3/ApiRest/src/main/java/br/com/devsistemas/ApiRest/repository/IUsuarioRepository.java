package br.com.devsistemas.ApiRest.repository;

import br.com.devsistemas.ApiRest.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {

}
