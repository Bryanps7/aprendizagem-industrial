import java.util.Scanner;

public class coneMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("======= Volume Cilindro ========");
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        System.out.print("Digite o valor do altura: ");
        double altura = sc.nextDouble();

        coneClass c1 = new coneClass(raio, altura);

        double volume = c1.calcularVolume();

        System.out.printf("O volume do Cone é: %.3f m³ %n",volume);

        System.out.println("================================");
        sc.close();
    }
}
