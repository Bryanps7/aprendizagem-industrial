import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        String url = "https://viacep.com.br/ws/88200000/json/";

        // Criando uma instancia do cliente
        HttpClient client = HttpClient.newHttpClient();

        // criando uma intancia de requisição http com um endpoint
        HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();

        // Criando uma instancia de resposta http e recebendo os dados
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        // imprimindo a resposta da requisição
        System.out.println(response);

        // imprimindo o status da requisição
        System.out.println(response.statusCode());

        // imprimindo o cabeçalho da requisição
        System.out.println(response.headers());

        // imprimindo o corpo (body) da requisição
        System.out.println(response.body());

        Gson gson = new Gson();

        Endereco = new 

        sc.close();
    }
}