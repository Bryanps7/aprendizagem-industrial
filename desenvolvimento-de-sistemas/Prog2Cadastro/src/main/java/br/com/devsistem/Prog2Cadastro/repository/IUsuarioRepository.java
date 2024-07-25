package br.com.devsistem.Prog2Cadastro.repository;

import br.com.devsistem.Prog2Cadastro.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long> {
}
