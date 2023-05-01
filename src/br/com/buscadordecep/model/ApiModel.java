package br.com.buscadordecep.model;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiModel {
    protected String responseBody;

    public ApiModel(int cep) throws IOException, InterruptedException {
        String URL = "https://viacep.com.br/ws/" + cep + "/json/";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(URL)).build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        this.responseBody = response.body();
    }

    public String getResponse() {
        return this.responseBody;
    }
}
