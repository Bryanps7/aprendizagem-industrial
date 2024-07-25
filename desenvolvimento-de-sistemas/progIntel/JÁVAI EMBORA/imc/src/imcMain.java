import java.util.Scanner;

public class imcMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op = 0;
        ImcClass imcMano = new ImcClass();

        do{
            System.out.println("=========================");
            System.out.println("        IMC 2001");
            System.out.println("=========================");
            System.out.println(" ");
            System.out.println(" (0) Sair do programa");
            System.out.println(" (1) Fazer seu cadastro");
            op = sc.nextInt();
            switch (op){
                case 0:
                    System.out.println(" Adeus Compadre");
                    break;
                case 1:
                    System.out.println(" ");
                    System.out.print("    Insira seu nome:");
                    String nome = sc.nextLine();
                    System.out.println(" ");
                    System.out.print("    Insira seu peso: ");
                    double peso = sc.nextDouble();
                    System.out.println(" ");
                    System.out.print("    Insira sua altura: ");
                    double altura = sc.nextDouble();
                    imcMano = new ImcClass(nome, peso, altura);
                    
                    break;
                default:
                    System.out.println(" Resposta Inválida");
                    break;
            }
        }while(op != 0);
        sc.close();
    }
}
