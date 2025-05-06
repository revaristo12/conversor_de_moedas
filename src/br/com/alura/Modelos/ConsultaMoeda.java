package br.com.alura.Modelos;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoeda {

    public double buscaMoedas(String moeda, String outraMoeda, double valor) {
        URI endereco = URI.create("https://v6.exchangerate-api.com/v6/2a04a37556c14194aaae8aa1/pair/" + moeda + "/" + outraMoeda);

        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();
            JsonObject json = gson.fromJson(response.body(), JsonObject.class);
            double taxa = json.get("conversion_rate").getAsDouble();
            double convertido = valor * taxa;
            System.out.printf("Taxa de conversão %s -> %s: %.2f%n", moeda, outraMoeda, taxa);
            System.out.printf("Valor convertido: %.2f %s%n", convertido, outraMoeda);
            return convertido;

        } catch (Exception e) {
            throw new RuntimeException("Não consegui obter os valores. Erro: " + e.getMessage());
        }
    }

    @Override
    public String toString() {
        return "ConsultaMoeda: Classe para consultar valores de câmbio.";
    }
}