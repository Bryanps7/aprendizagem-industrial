package br.com.devsistem.Prog2Cadastro;

import br.com.devsistem.Prog2Cadastro.principal.Principal;
import br.com.devsistem.Prog2Cadastro.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Prog2CadastroApplication implements CommandLineRunner {
	@Autowired
	private IUsuarioRepository repositorio;

	public static void main(String[] args) {
		SpringApplication.run(Prog2CadastroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.mostraMenu();
	}
}
