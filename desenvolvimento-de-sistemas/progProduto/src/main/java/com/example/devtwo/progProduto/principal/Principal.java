package com.example.devtwo.progProduto.principal;

import com.example.devtwo.progProduto.model.Produto;

import java.util.Scanner;

public class Principal {
    Scanner sc = new Scanner(System.in);
    public void mostraMenu() {
        int opcao = -1;
        
        String menu = """
                +------------------------------------+
                |   SISTEMA DO CADASTRO DE PRODUTO   |
                +------------------------------------+
                |                                    |
                | 0 - SAIR                           |
                | 1 - CADASTRAR                      |
                | 2 - LISTAR                         |
                | 3 - ATUALIZAR                      |
                | 4 - APAGAR                         |
                +------------------------------------+
                """;
        System.out.println(menu);
        System.out.println("| Qual a sua opção: ");
        opcao = sc.nextInt();

        switch (opcao){
            case 0:
                System.out.println("| Programa Finalizado com sucesso    |");
                break;
            case 1:
                cadastrarProduto();
                break;
            case 2:
                listarProduto();
                break;
            case 3:
                atualizarProduto();
                break;
            case 4:
                apagarProduto();
                break;
            default:
                System.out.println("| Opção Inválida                     |");
                break;

        }
    }
    private void cadastrarProduto() {
        String novoPrduto = "S";
        while(novoPrduto.equalsIgnoreCase("s")){
            System.out.println("Digite o nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Digite a marca do produto: ");
            String marca = sc.nextLine();
            System.out.println("Digite a quantidade do produto: ");
            Integer quanti = sc.nextInt();
            System.out.println("Digite o preço do produto: ");
            Double preco = sc.nextDouble();

            Produto prod = new Produto(nome,marca,quanti,preco);
            repositorio.save(prod);

            System.out.println("Deseja cadastrar um novo produto? ");
            novoPrduto = sc.nextLine();
        }
    }
    private void listarProduto() {
        System.out.println("+-----------------------------------------+");
        repositorio.findAll().forEach
        System.out.println("+-----------------------------------------+");
    }
    private void atualizarProduto() {
    }
    private void apagarProduto() {
    }
}
