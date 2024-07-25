import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ClassEstoque> dadosEstoque = new ArrayList<ClassEstoque>();
        ClassEstoque estoque = new ClassEstoque();

        int op = 0;
        int idm = 0, quantidadem = 0;
        String nomem = "", marcam = "", option = "";
        boolean verif = false;
        do{
            System.out.println("+----------------------------------------+");
            System.out.println("|  Estoque lar dos idosos com ArrayList  |");
            System.out.println("+----------------------------------------+");
            System.out.println("|                                        |");
            System.out.println("| 0 - Sair do programa                   |");
            System.out.println("| 1 - Cadastrar produto                  |");
            System.out.println("| 2 - Apagar produto                     |");
            System.out.println("| 3 - Modificar produto                  |");
            System.out.println("| 4 - Listar produtos                    |");
            System.out.println("|                                        |");
            System.out.println("+----------------------------------------+");
            System.out.print("| Insira sua opção: ");
            op = sc.nextInt();
            System.out.println("+----------------------------------------+");
            switch (op){
                case 1:
                    System.out.print("| Insira o código do produto: ");
                    idm = sc.nextInt();
                    for (int i = 0; i < dadosEstoque.size(); i++){
                        if(idm == dadosEstoque.get(i).getId()){
                            System.out.println("+----------------------------------------+");
                            System.out.println("| Código Existente!!!                    |");
                            System.out.println("+----------------------------------------+");
                            System.out.print("| Insira outro código: ");
                            idm = sc.nextInt();
                        }
                    } // Indentificar código existente
                    sc.nextLine(); // verificarrrrrrrrrrrrrrr
                    System.out.print("| Insira o nome do produto: ");
                    nomem = sc.nextLine();
                    System.out.print("| Insira a marca do produto: ");
                    marcam = sc.nextLine();
                    System.out.print("| Insira a quantidade de produtos: ");
                    quantidadem = sc.nextInt();

                    estoque = new ClassEstoque(idm, nomem, marcam, quantidadem);
                    dadosEstoque.add(estoque);
                    break;
                case 2:
                    verif = false;
                    System.out.print("| Insira o código do produto: ");
                    idm = sc.nextInt();
                    for (int i = 0; i < dadosEstoque.size(); i++){
                        if (idm == dadosEstoque.get(i).getId()){
                            System.out.println("| Tem certeza que deseja apagar esse produto? s/n");
                            System.out.printf(dadosEstoque.get(i).toString());
                            System.out.print("| R: ");
                            sc.nextLine(); // verificarrrrrrr
                            option = sc.nextLine();
                            if(option == "s"){
                                dadosEstoque.remove(i);
                                System.out.println("| Produto Deletado                       |");
                            }
                            verif = true;
                        }
                    }
                    if(verif == false){
                        System.out.println("+----------------------------------------+");
                        System.out.println("| Não encontrei o produto                |");
                        System.out.println("+----------------------------------------+");
                        System.out.println(" ");
                    }
                    break;
                case 3:
                    System.out.print(" Digite o código do produto: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    for(int i = 0; i < dadosEstoque.size();i++){
                        if(dadosEstoque.get(i).getId() == id){
                            dadosEstoque.remove(i);
                            System.out.print(" Digite o novo nome: ");
                            String nome = sc.nextLine();
                            System.out.print(" Digite a nova marca: ");
                            String marca = sc.nextLine();
                            System.out.print(" Digite a nova quantidade: ");
                            int quantidade = sc.nextInt();
                            sc.nextLine();
                            // fazendo a instância do estoque na classe
                            estoque = new ClassEstoque(id,nome,marca,quantidade);
                            dadosEstoque.add(i,estoque);
                        }
                    }
                    break;
                case 4:
                    for (ClassEstoque dados : dadosEstoque){
                        System.out.print(dados.toString());
                    }
                    break;
                default:
                    System.out.println("| Opção Inválida                         |");
                    break;
            }


        }while(op != 0);



        sc.close();
    }
}