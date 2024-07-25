import java.util.Scanner;

public class cilindroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===============================");
        System.out.println("Cálculo do Volume do Cilindro");
        System.out.println("===============================");
        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();
        System.out.print("Digite o valor da altura: ");
        double altura = sc.nextDouble();

        Cilindro c1 = new Cilindro(raio, altura);

        double volume = c1.calcularVolume();

        System.out.printf("O volume do cilindro é: %.3f m³",volume);
        sc.close();
    }
}
