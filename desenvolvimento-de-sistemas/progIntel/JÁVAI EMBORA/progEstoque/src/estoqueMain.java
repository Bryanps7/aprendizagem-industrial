import java.util.Scanner;

public class estoqueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        String confirma = "n";
        estoque produto = new estoque();
        do {
            String bobo = sc.nextLine();
            System.out.println("=======================================");
            System.out.println("    Sistema de controle de Estoque");
            System.out.println("=======================================");
            System.out.println(" ");
            System.out.println("    0 - Para sair do programa");
            System.out.println("    1 - Para adicionar ao estoque");
            System.out.println("    2 - Para baixar no estoque");
            System.out.println("    3 - Para mostrar estoque");
            System.out.println(" ");
            System.out.println("    9 - Para Cadastrar ao estoque");
            System.out.println("---------------------------------------");
            System.out.print(" Digite sua opção: ");
            op = sc.nextInt();

            switch (op){
                case 0:
                    System.out.println(" Adeus Guerreiro!");
                    break;
                case 1:
                    System.out.println(" ");
                    System.out.print(" Digite o código do produto: ");
                    int codigo2 = sc.nextInt();
                    sc.nextLine();
                    if(codigo2 == produto.getId()){
                        System.out.println("");
                        System.out.print("    Digite a quantidade do produto: ");
                        int quantidade = sc.nextInt();
                        sc.nextLine();
                        produto.adicionarEstoque(quantidade);
                        System.out.println("========================================");
                        System.out.println(produto.toString());
                        System.out.println("========================================");
                    }else{
                        System.out.println("    Código do produto inexistente");
                    }
                    break;
                case 2:
                    System.out.println(" ");
                    System.out.print(" Digite o código do produto: ");
                    int codigo3 = sc.nextInt();
                    sc.nextLine();
                    if(codigo3 == produto.getId()){
                        System.out.println("");
                        System.out.print("    Digite a quantidade para remover produto: ");
                        int quantidade = sc.nextInt();
                        sc.nextLine();
                        produto.baixarEstoque(quantidade);
                        System.out.println("========================================");
                        System.out.println(produto.toString());
                        System.out.println("========================================");
                    }else{
                        System.out.println("    Código do produto inexistente");
                    }
                    break;
                case 3:
                    System.out.println(" ");
                    System.out.print(" Digite o código do produto: ");
                    int codigo4 = sc.nextInt();
                    sc.nextLine();
                    if(codigo4 == produto.getId()){
                        System.out.println("========================================");
                        System.out.println(produto.toString());
                        System.out.println("========================================");
                    }else{
                        System.out.println("    Código do produto inexistente");
                    }
                    break;
                case 9:
                    System.out.println(" ");
                    System.out.print("    Digite o código do produto: ");
                    int codigo = sc.nextInt();
                    sc.nextLine();
                    System.out.println(" ");
                    System.out.print("    Digite o nome do produto: ");
                    String nomeProduto = sc.nextLine();
                    System.out.println(" ");
                    System.out.print("    Digite a quantidade do produto: ");
                    int quantidadeProduto = sc.nextInt();
                    produto = new estoque(codigo, nomeProduto, quantidadeProduto);
                    System.out.println("---------------------------------------");
                    System.out.println(produto.toString());
                    System.out.println("---------------------------------------");
                    break;
                default:
                    System.out.println(" Inválido");
                    break;
            }
        }while (op != 0);
        sc.close();
    }
}
