import java.util.Scanner;

public class hospedeMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int op = 0;
        int qt = 0; // Quantidade de Hóspedes

        // Variáveis auxiliares do programa principal
        int id = 0, diasMesAtual = 0, diasAluguel = 0;
        String nome = "", telefone = "", email = "";
        double valorDiaria = 49.90;

        System.out.println("+------------------------------------------+");
        System.out.println("|  Sistema de gerenciamento da Hospedaria  |");
        System.out.println("+------------------------------------------+");
        System.out.print("| Digite o número de hóspedes: ");
        qt = sc.nextInt();
        hospedeClass[] hosp = new hospedeClass[qt];
        System.out.println("+------------------------------------------+");

        do{
            System.out.println("+------------------------------------------+");
            System.out.println("|              HOTEL DO BRYAN              |");
            System.out.println("+------------------------------------------+");
            System.out.println("|                                          |");
            System.out.println("|  0 - Sair do Programa                    |");
            System.out.println("|  1 - Cadastrar Hóspedes                  |");
            System.out.println("|  2 - Calcular Aluguel Hospedagem         |");
            System.out.println("|                                          |");
            System.out.println("+------------------------------------------+");
            System.out.print("| Digite sua opção: ");
            op = sc.nextInt();
            System.out.println("+------------------------------------------+");

            switch (op){
                case 1:
                    for(int i = 0; i < hosp.length; i++) {
                        hosp[i] = new hospedeClass(); // precisa criar os campos
                        System.out.print("| Digite o código do Hóspede (quarto): ");
                        id = sc.nextInt();
                        hosp[i].setId(id);
                        sc.nextLine();
                        System.out.print("| Digite o nome do Hóspede: ");
                        nome = sc.nextLine();
                        hosp[i].setNome(nome);
                        System.out.print("| Digite o Telefone do Hóspede: ");
                        telefone = sc.nextLine();
                        hosp[i].setTelefone(telefone);
                        System.out.print("| Digite o email do Hóspede: ");
                        email = sc.nextLine();
                        hosp[i].setEmail(email);
                        System.out.print("| Digite os dias do mês atual: ");
                        diasMesAtual = sc.nextInt();
                        hosp[i].setDiasMesAtual(diasMesAtual);
                        System.out.print("| Digite os dias de Contrato: ");
                        diasAluguel = sc.nextInt();
                        hosp[i].setDiasAluguel(diasAluguel);

                    }
                    break;
                case 2:
                    System.out.println("| Digite o código do Hóspede (quarto): ");
                    id = sc.nextInt();
                    for(int i = 0; i < hosp.length;i++) {
                        if(id == hosp[i].getId()) {
                            valorDiaria = hosp[i].calcularAluguel(valorDiaria);

                        }
                    }
                    break;
                default:
                    System.out.println("| Resposta Inválida                        |");
                    break;
            }
        }while(op != 0);

        sc.close();
    }
}
