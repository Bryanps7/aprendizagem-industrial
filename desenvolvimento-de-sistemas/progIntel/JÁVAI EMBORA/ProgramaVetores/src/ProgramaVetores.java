import java.util.Scanner;

public class ProgramaVetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vet1 = {1,2,3,4,5};
        int [] vet2 = {0,0,0,0,0};
        int [] vet3 = {0,0,0,0,0};

        System.out.println("===================================================");
        System.out.println(" Verifica se a soma de 2 vetores tem resultado par");
        System.out.println("===================================================");
        for(int i=0; i < vet1.length; i++){
            System.out.printf(" Digite o V[%d] = ",i);
            vet2[i] = sc.nextInt();
        }
        for(int i=0; i < vet2.length;i++){
            vet3[i] = vet1[i] + vet2[i];
            if( vet3[i] % 2 == 0){
                System.out.printf("O valor de V[%d] = %d é par %n",i,vet3[i]);
            }else{
                System.out.printf("O valor de V[%d] = %d é impar",i,vet3[i]);
            }
        }

        System.out.println(" ");

        sc.close();
    }
}
