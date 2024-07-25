import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] vet = {0,0,0,0,0};
        int tres = 0;
        int cinco = 0;
        int treCin = 0;
        int erro = 0;

        System.out.println("=================================================");
        System.out.println("   Calcular impar e divisiveis por 3, 5, 3 e 5   ");
        System.out.println("=================================================");
        for(int i=0; i < vet.length; i++){
            System.out.printf("Digite o valor de V[%d]: ",i);
            vet[i] = sc.nextInt();
        }
        for(int i=0; i < vet.length; i++){
            if((vet[i] % 3 == 0)&&(vet[i] % 5 == 0)){
                treCin += 1;
            }else if(vet[i] % 3 == 0){
                tres += 1;
            }else if(vet[i] % 5 == 0){
                cinco += 1;
            }else{
                erro += 1;
            }
        }
        System.out.printf("%d são divisiveis por 3 e 5 ao mesmo tempo.\n%d são divisiveis por 3.\n%d são divisiveis por 5.\n%d não são divisiveis por 3 ou 5.", treCin, tres, cinco, erro);



        sc.close();
    }
}
