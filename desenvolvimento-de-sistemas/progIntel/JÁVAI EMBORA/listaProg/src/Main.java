import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cidade = new ArrayList<>();
        ArrayList<Integer> populacao = new ArrayList<>();

        cidade.add("Tijucas");
        cidade.add("Itapema");
        cidade.add("Porto Belo");
        cidade.add("Biguaçu");
        cidade.add("Florianópolis");
        cidade.add("Balneareo Camboriu");
        cidade.add("Canelinha");
        cidade.add("São João Batista");
        cidade.add("Bombinhas");
        cidade.add("Itajai");
        cidade.add("Tubarão");
        cidade.add("Navegantes");
        cidade.add("São José");
        cidade.add("Comboriu");
        cidade.add("Brusque");
        cidade.add("Blumenau");
        cidade.add("Nova Trento");
        cidade.add("Urubici");
        cidade.add("Caçador");
        cidade.add("Joinville");
        cidade.add("Gaspar");

        populacao.add(1);
        populacao.add(11);
        populacao.add(14);
        populacao.add(153);
        populacao.add(146);
        populacao.add(125);
        populacao.add(636);
        populacao.add(221);
        populacao.add(5371);
        populacao.add(1353);
        populacao.add(2152);
        populacao.add(252351);

        cidade.add(3, "Laguna");

        System.out.println(cidade);
        System.out.println(populacao);


        cidade.remove("Gaspar");
        System.out.println(cidade);


        String valor = cidade.get(2);
        System.out.println(valor);


        int tamanho = cidade.size();

        System.out.println(tamanho);
    }
}