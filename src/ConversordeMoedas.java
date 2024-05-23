import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConversordeMoedas {

    public Moedas convereterMoedas(String moedadeEntrada, String moedaDeSaida, double valor) {

        HttpClient client = HttpClient.newHttpClient();
        String key = "3b34e66c8f52b4729765c003";

        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/" + key + "/pair/" +
                moedadeEntrada + "/" + moedaDeSaida + "/" + valor);


        HttpRequest request = HttpRequest.newBuilder().uri(endereco).build();

        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(), Moedas.class);

        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
