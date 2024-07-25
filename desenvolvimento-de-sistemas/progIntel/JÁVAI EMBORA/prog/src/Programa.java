import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Estoque prod1 = new Estoque();
        Estoque prod2 = new Estoque();

        int id = 10;

        prod1.nome = "mouse";
        prod1.id = 5;
        prod1.quantidade = 111;

        prod2 = prod1;
        prod2.nome = "teclado";


        System.out.println(id);
        System.out.println(prod1.nome);

//        System.out.print("Digite o nome do produto: ");
//        String nome = sc.nextLine();
//        prod.nome = nome;
//
//        System.out.print("Digite o código do produto: ");
//        int codigo = sc.nextInt();
//        prod.id = codigo;
//
//        System.out.print("Digite a quantidade do produto: ");
//        int quantidade = sc.nextInt();
//        prod.quantidade = quantidade;
//
//        System.out.printf("O produto %s de código %d tem uma quantidade de %d %n"
//        , prod.nome);

        sc.close();
    }
}
