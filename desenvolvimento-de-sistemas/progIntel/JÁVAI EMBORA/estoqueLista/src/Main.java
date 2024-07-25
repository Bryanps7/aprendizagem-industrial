import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> id = new ArrayList<>();
        ArrayList<String> nome = new ArrayList<>();
        ArrayList<String> marca = new ArrayList<>();
        ArrayList<Integer> quantidade = new ArrayList<>();

        int op = 0;
        int idM = 0, quantidadeM = 0;
        String nomeM = "", marcaM = "";

        do{
            System.out.println("+------------------------------+");
            System.out.println("| estoque lar idosos com lista |");
            System.out.println("+------------------------------+");
            System.out.println("|                              |");
            System.out.println("| 0 - Sair do programa         |");
            System.out.println("| 1 - Cadastrar Produto        |");
            System.out.println("| 2 - Apagar Produto           |");
            System.out.println("| 3 - Atualizar quantidade     |");
            System.out.println("| 4 - Listar Produtos          |");
            System.out.println("|                              |");
            System.out.println("+------------------------------+");
            System.out.print("| Insira sua opção: ");
            op = sc.nextInt();
            System.out.println("+------------------------------+");
            switch (op){
                case 1:
                    System.out.print("Insira o código do produto: ");
                    idM = sc.nextInt();
                    for(int i = 0; i < id.size(); i++){

                    }
                    id.add(idM);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        }while (op != 0);


        sc.close();
    }