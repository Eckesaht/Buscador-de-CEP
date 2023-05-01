package br.com.buscadordecep.controller;

import br.com.buscadordecep.model.ApiModel;
import br.com.buscadordecep.model.EnderecoModel;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApiController{
    protected int cep;
    protected List<EnderecoModel> enderecos = new ArrayList<>();
    protected FileWriter arquivoJson = new FileWriter("Enderecos.json");
    protected Scanner scanner = new Scanner(System.in);
    protected Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy
            .UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();

    public ApiController() throws IOException, InterruptedException {
        this.iniciar();
    }

    protected void serializarJson() throws IOException, InterruptedException {
        ApiModel api = new ApiModel(this.cep);
        // Endereco record = gson.fromJson(api.getResponse(), Endereco.class);
        // EnderecoModel json = EnderecoModel(record);
        EnderecoModel json = gson.fromJson(api.getResponse(), EnderecoModel.class);
        this.enderecos.add(json);
        System.out.println(json);
        arquivoJson.write(gson.toJson(enderecos));
    }

    protected void iniciar() throws IOException, InterruptedException {
        System.out.println("Insira um CEP: ");
        this.cep = scanner.nextInt();
        this.serializarJson();
        this.finalizarPrograma();
    }

    protected void finalizarPrograma() throws IOException {
        this.scanner.close();
        this.arquivoJson.close();
    }

}
