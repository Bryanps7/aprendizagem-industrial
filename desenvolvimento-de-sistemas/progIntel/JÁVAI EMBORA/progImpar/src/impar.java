import java.util.Scanner;

public class impar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vet = {0,0,0,0,0};

        System.out.println("=============================");
        System.out.println("   Imprimi números impares   ");
        System.out.println("=============================");
        for(int i=0; i < vet.length; i++){
            System.out.printf(" Insira o valor para o V[%d]: ",i);
            vet[i] = sc.nextInt();
        }
        for(int i=0; i < vet.length; i++){
            if(vet[i] % 2 == 1){
                System.out.printf("%d é um número impar.\n",vet[i]);
            }
        }

        sc.close();
    }
}
