package com.example.devtwo.progProduto;

import com.example.devtwo.progProduto.principal.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProgProdutoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProgProdutoApplication.class, args);
	}

	@Autowired
	private IProdutoRepository repositorio

	@Override
	public void run(String... args) throws Exception {
		Principal produto = new Principal();
		produto.mostraMenu();
	}

}