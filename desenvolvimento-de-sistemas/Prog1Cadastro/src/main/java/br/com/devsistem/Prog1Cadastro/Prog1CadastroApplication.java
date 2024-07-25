package br.com.devsistem.Prog1Cadastro;

import br.com.devsistem.Prog1Cadastro.principal.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Prog1CadastroApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Prog1CadastroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();
		principal.mostraMenu();
	}
}
