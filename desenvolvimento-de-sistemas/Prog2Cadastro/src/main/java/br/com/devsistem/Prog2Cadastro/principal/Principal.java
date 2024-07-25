package br.com.devsistem.Prog2Cadastro.principal;

import br.com.devsistem.Prog2Cadastro.model.Usuario;
import br.com.devsistem.Prog2Cadastro.repository.IUsuarioRepository;

import java.util.Scanner;

public class Principal {
    private final IUsuarioRepository repositorio;
    private Scanner sc = new Scanner(System.in);

    public Principal (IUsuarioRepository resporitorio){
        this.repositorio = resporitorio;
    }
    public void mostraMenu() {
        String opcao = "Sair";
        do {
            String menu = """
                |-------------------------------------------------------------|
                |------------ Programa de Cadastro do Usuário ----------------|
                |-------------------------------------------------------------|
                |                                                             |
                | Cadastrar usuário no sistema -------------------------------|
                | Listar usuário no sistema ----------------------------------|
                | Atualizar usuário no sistema -------------------------------|
                | Apagar usuário no sistema ----------------------------------|
                | Sair do sistema --------------------------------------------|
                |-------------------------------------------------------------|
                """;
            System.out.println(menu);
            System.out.print("Digite a sua opção:");
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
                    System.out.println(" Programa Finalizado ");
                    break;
                default:
                    System.out.println(" Opção Inválida !");
            }

        }while (!opcao.equalsIgnoreCase("Sair"));
    }

    public void cadastrarUsuario(){
        String novoUsuario = "S";
        while(novoUsuario.equalsIgnoreCase("s")){
            System.out.print("Digite o nome do usuário:");
            String nome = sc.nextLine();
            System.out.print("Digite a idade do usuário:");
            Integer idade = sc.nextInt();
            sc.nextLine();

            Usuario usuario = new Usuario(nome,idade);
            repositorio.save(usuario);

            System.out.print("Deseja cadastrar um novo usuário (S/N) ?");
            novoUsuario = sc.nextLine();
        }
    }
    public void listarUsuario(){
        System.out.println(" ------------------------------------------------");
        repositorio.findAll().forEach(usuario -> System.out.print(usuario));
        System.out.println(" ------------------------------------------------ ");
    }
    public void atualizarUsuario(){
        System.out.println("atualizando usuário");
    }
    public void apagarUsuario(){
        System.out.println("apagando usuário");
    }
}
