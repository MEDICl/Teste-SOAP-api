package br.com.uvv.model;

import br.com.uvv.ws.Estoque;

public class Loja {
    public String CdLoja;
    public Endereco Endereco;
    public boolean Sede;

    public Loja(){}

    public Loja(String cdLoja,boolean sede){
        this.CdLoja = cdLoja;
        this.Sede = sede;
    }

    public String getCdLoja() {
        return CdLoja;
    }

    public void setCdLoja(String cdLoja) {
        CdLoja = cdLoja;
    }

    public br.com.uvv.model.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(br.com.uvv.model.Endereco endereco) {
        Endereco = endereco;
    }

    public boolean isSede() {
        return Sede;
    }

    public void setSede(boolean sede) {
        Sede = sede;
    }

}
