package br.com.buscadordecep.model;

// import br.com.buscadordecep.record.Endereco;

//    public EnderecoModel(Endereco dados) {
//        this.cep = dados.cep();
//        this.logradouro = dados.logradouro();
//        this.complemento = dados.complemento();
//        this.bairro = dados.bairro();
//        this.localidade = dados.localidade();
//        this.uf = dados.uf();
//        this.ibge = dados.ibge();
//        this.gia = dados.gia();
//        this.ddd = dados.ddd();
//        this.siafi = dados.siafi();
//    }

import com.google.gson.annotations.SerializedName;

public class EnderecoModel {
    @SerializedName("cep") protected String cep;
    @SerializedName("logradouro") protected String logradouro;
    @SerializedName("complemento") protected String complemento;
    @SerializedName("bairro") protected String bairro;
    @SerializedName("localidade") protected String localidade;
    @SerializedName("uf") protected String uf;
    @SerializedName("ibge") protected String ibge;
    @SerializedName("gia") protected String gia;
    @SerializedName("ddd") protected String ddd;
    @SerializedName("siafi") protected String siafi;


    @Override
    public String toString() {
        return  "CEP: " + this.cep + "\n" +
                "Logradouro: " + this.logradouro + "\n" +
                "Complemento: " + this.complemento + "\n" +
                "Bairro: " + this.bairro + "\n" +
                "Localidade: " + this.localidade + "\n" +
                "UF: " + this.uf + "\n" +
                "IBGE: " + this.ibge + "\n" +
                "GIA: " + this.gia + "\n" +
                "DDD: " + this.ddd + "\n" +
                "SIAFI: " + this.siafi;
    }
}
