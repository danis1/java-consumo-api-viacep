package br.edu.fatecpg.consumoapi.service;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class BuscaCep {

    public String informacoes(String url) throws IOException, InterruptedException {

        // instancia para iniciar a conexão:
        HttpClient client = HttpClient.newHttpClient();

        //prepara o pedido
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .timeout(Duration.ofMinutes(2))
                .GET()
                .build();

        //faz o pedido

        //lista que recebe as informacoes
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }
}
