package br.com.uvv.model;

public class Cliente {
    public String CdCliente;
    public String Nome;
    public String Cpf;
    public Endereco Endereco;
    public Loja LojaCadastrada;
    public int QtdCompras = 0;
    public double ComprasMensais = 0;

    public Cliente(){

    }
    public Cliente(String Nome, Loja loja){
        this.Nome = Nome;
        this.LojaCadastrada = loja;
    }


    public String getCdCliente() {
        return CdCliente;
    }

    public void setCdCliente(String cdCliente) {
        CdCliente = cdCliente;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    public br.com.uvv.model.Endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(br.com.uvv.model.Endereco endereco) {
        Endereco = endereco;
    }

    public Loja getLojaCadastrada() {
        return LojaCadastrada;
    }

    public void setLojaCadastrada(Loja lojaCadastrada) {
        LojaCadastrada = lojaCadastrada;
    }
}
