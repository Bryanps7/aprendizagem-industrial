package br.com.devsistem.Prog1Cadastro.principal;

import java.util.Scanner;

public class Principal {
    private Scanner sc = new Scanner(System.in);
    public void mostraMenu() {
        String opcao = "Sair";
        do {
            String menu = """       
                    |-------------------------------------------|
                    |----- Programa de Cadastro do Usuário -----|
                    |-------------------------------------------|
                    |                                           |
                    |- Cadastrar Usuário no sistema ------------|
                    |- Listar usuário no sistema ---------------|
                    |- Atualizar usuário no sistema ------------|
                    |- Apagar usuário no sistema ---------------|
                    |- Sair do Sistema -------------------------|
                    |-------------------------------------------|
                    """;
            System.out.println(menu);
            System.out.print("Digite a sua opção: ");
            opcao = sc.nextLine();

            switch (opcao.toLowerCase()){
                case "cadastrar":
                    cadastrarUsuario();
                    break;
                case "listar":
                    listarUsuario();
                    break;
                case "atualizar":
                    atualizarUsuario();
                    break;
                case "apagar":
                    apagarUsuario();
                    break;
                case "sair":
                    System.out.println("|- Programa Finalizado ---------------------|");
                    break;
                default:
                    System.out.println("|- Opção Inválida ! ------------------------|");
                    break;
            }

        }while(!opcao.equalsIgnoreCase("Sair"));
    }

    private void cadastrarUsuario() {
        String novoUsuario = "S";
        while(novoUsuario.equalsIgnoreCase("s")){
            sc.nextLine();
            System.out.print("Digite o nome do usuário: ");
            String nome = sc.nextLine();
            System.out.print("Digite a idade do usuário: ");
            Integer idade = sc.nextInt();

            Usuario usuario = new Usuario(nome,idade);
            repositorio.save(usuario)


            System.out.print("Desejá cadastrar um novo usuario? (S/N): ");
            novoUsuario = sc.nextLine();
        }
    }
    private void listarUsuario() {
        System.out.println("Listando");
    }
    private void atualizarUsuario() {
        System.out.println("Atualizar");
    }
    private void apagarUsuario() {
        System.out.println("Apagar");
    }
}
