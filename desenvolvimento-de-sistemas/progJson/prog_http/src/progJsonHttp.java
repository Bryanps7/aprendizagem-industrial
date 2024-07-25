import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class progJsonHttp {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner sc = new Scanner(System.in);

        // troca de dados http => pergunta resposta jdk17
        // https://docs.oracle.com/en/java/javase/17/docs/api/
        // pergunta: request => https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html
        // resposta: response => https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpResponse.html
        // indicar o recurso => a página ou serviço desejado
        // abrir o corpo da carta

        int cep = 0;
        System.out.print("Insira o CEP: ");
        cep = sc.nextInt();

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://viacep.com.br/ws/"+cep+"/json/"))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response);
        System.out.println(response.statusCode());
        System.out.println(response.body());

        sc.close();
    }
}
