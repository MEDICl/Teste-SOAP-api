package br.com.uvv.model;

public class Endereco {
    String Rua;
    String Cep;
    int TpMoradia;
    String Cidade;
    String Bairro;

    public Endereco(){

    }

    public String getRua() {
        return Rua;
    }

    public void setRua(String rua) {
        Rua = rua;
    }

    public String getCep() {
        return Cep;
    }

    public void setCep(String cep) {
        Cep = cep;
    }

    public int getTpMoradia() {
        return TpMoradia;
    }

    public void setTpMoradia(int tpMoradia) {
        TpMoradia = tpMoradia;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getBairro() {
        return Bairro;
    }

    public void setBairro(String bairro) {
        Bairro = bairro;
    }

}
