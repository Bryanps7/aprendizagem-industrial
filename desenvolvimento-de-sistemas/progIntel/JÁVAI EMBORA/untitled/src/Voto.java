import java.util.Scanner;

public class Voto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================= Voto =================");
        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = sc.nextInt();
        System.out.println("========================================");

        if((idadePessoa < 16) && (idadePessoa >= 0)){
            System.out.println("Você ainda não tem idade para votar");
        }else if((idadePessoa < 18) && (idadePessoa >= 16)){
            System.out.println("Voto Opcional");
        }else if((idadePessoa <= 70) && (idadePessoa >= 18)){
            System.out.println("Seu voto é obrigatorio em funcao da idade");
        }else if(idadePessoa > 70){
            System.out.println("Voto Opcional");
        }else{
            System.out.println("Digite novamente");
        }



        sc.close();
    }
}
