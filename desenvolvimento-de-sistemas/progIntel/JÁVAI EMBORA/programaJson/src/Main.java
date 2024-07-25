import com.google.gson.Gson;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);


        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/88200000/json/"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());


        System.out.println(response.body());

        Gson gson = new Gson();

        String dados = response.body();

        progClass prod = gson.fromJson(dados, progClass.class);

        System.out.println(prod.toString());

        FileWriter txt = new FileWriter("Produto.txt", true);
        txt.write(prod.toString());
        txt.close();

        try (Reader lerTxt = new FileReader("endereco.txt")) {
            int codUnicode;
            System.out.println("============================");
            System.out.print(" Contéudo do arquivo de texto: ");
            while ((codUnicode = LerTxt.read()) != -1) {
                System.out.print((char) codUnicode);
            }
        }

        sc.close();
    }
}