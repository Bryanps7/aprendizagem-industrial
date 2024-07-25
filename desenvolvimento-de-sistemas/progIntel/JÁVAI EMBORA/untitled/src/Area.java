import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = 0.0; // double = real
        double altura = 0.0, area = 0.0;

        System.out.print("Digite o valor da Base: ");
        base = sc.nextDouble();
        System.out.printf("O valor da base é: %.2f"+ base);



        sc.close();
    }
}
