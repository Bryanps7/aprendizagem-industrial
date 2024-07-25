import java.util.Scanner;

public class mainIMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int op = 0; // Escolha do programa
        int num = 0; // Número de pacientes

        int id = 0;
        String nome = "";
        int idade = 0;
        double peso = 0.0;
        double altura = 0.0;
        double mediaIdade = 0.0, mediaPeso = 0.0, mediaAltura = 0.0;
        double somaIdade = 0, somaPeso = 0, somaAltura = 0;

        System.out.println("+---------------------------------+");
        System.out.println("|   Sistema de avaliação do IMC   |");
        System.out.println("+---------------------------------+");
        System.out.print("| DIGITE O NÚMERO DE PACIENTES: ");
        num = sc.nextInt();
        imcPessoa[] pes1  = new imcPessoa[num];
        do{
            System.out.println("+---------------------------------+");
            System.out.println("|   Sistema de avaliação do IMC   |");
            System.out.println("+---------------------------------+");
            System.out.println("|                                 |");
            System.out.println("| 0 - SAIR DO PROGRAMA            |");
            System.out.println("| 1 - CADASTRO PACIENTE           |");
            System.out.println("| 2 - CALCULO IMC DO PACIENTE     |");
            System.out.println("| 3 - CLASSIFICAR O PACIENTE      |");
            System.out.println("| 4 - CALCULAR MÉDIA DOS DADOS    |");
            System.out.println("|                                 |");
            System.out.println("+---------------------------------+");
            System.out.print("| Digite sua opção: ");
            op = sc.nextInt();
            switch (op) {
                case 0:
                    System.out.println("| ADEUS SOLDADO                   |");
                    break;
                case 1:
                    for (int i = 0; i < pes1.length; i++) {
                        sc.nextLine(); // verificar
                        System.out.print("| Digite o código do paciente: ");
                        id = sc.nextInt();
                        sc.nextLine();
                        System.out.print("| Digite o nome do paciente: ");
                        nome = sc.nextLine();
                        System.out.print("| Digite a idade do paciente: ");
                        idade = sc.nextInt();
                        System.out.print("| Digite o peso do paciente: ");
                        peso = sc.nextDouble();
                        System.out.print("| Digite a altura do paciente: ");
                        altura = sc.nextDouble();
                        System.out.println("| O Cliente "+nome+" tem o código "+id+" com as seguintes informações: ");
                        System.out.println("  | Idade: "+idade);
                        System.out.println("  | Peso: "+peso);
                        System.out.println("  | Altura: "+altura);

                        pes1[i] = new imcPessoa(id, nome, idade, peso, altura);


                    }
                    break;
                case 2:
                    System.out.println("+---------------------------------+");
                    System.out.print("| Digite o código do paciente: ");
                    id = sc.nextInt();
                    sc.nextLine(); // verificarrrr
                    for(int i = 0; i < pes1.length; i++ ) {
                        if(id == pes1[i].getId()) {
                            pes1[i].calcularImc();
                            System.out.println("| O Resultado do IMC é : "+pes1[i].getImc());
                        }
                    }
                    break;
                case 3:
                    System.out.println("+---------------------------------+");
                    System.out.print("| Digite o código do paciente: ");
                    id = sc.nextInt();
                    sc.nextLine(); // verificarrrr
                    for(int i = 0; i < pes1.length; i++ ) {
                        if(id == pes1[i].getId()) {
                            pes1[i].ClassificarIMC();
                            System.out.println("| O Resultado do IMC é : "+ pes1[i].getClassIMC());
                        }
                    }
                    break;
                case 4:
                    for( int i = 0; i < pes1.length; i++) {
                        mediaIdade += pes1[i].getIdade();
                        mediaPeso += pes1[i].getPeso();
                        mediaAltura += pes1[i].getAltura();
                    }
                    mediaIdade = (double) somaIdade / pes1.length; // (double) => Casting é conversão do tipo para o cálculo
                    mediaPeso = (double) somaPeso / pes1.length;
                    mediaAltura = (double) somaAltura / pes1.length;

                    System.out.println("===================================");
                    System.out.printf("| Média idade: %.2f | Média Peso: %.2f | Média Altura: %.2f",
                            mediaIdade, mediaPeso, mediaAltura);
                    System.out.println("===================================");
                    break;
                default:
                    System.out.println("| RESPOSTA INVÁLIDA               |");
                    break;
            }

        }while(op != 0);



        sc.close();
    }
}
