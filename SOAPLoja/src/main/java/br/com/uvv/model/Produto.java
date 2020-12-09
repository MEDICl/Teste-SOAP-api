package br.com.uvv.model;

import sun.security.krb5.internal.crypto.Des;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

@XmlRootElement
public class Produto {
    public String CdProduto;
    public String Nome;
    public String Descricao;
    public double Preco;
    public int Quantidade;

    public Produto(){
        super();
    }

    public Produto(String nome, String cdProduto, String descricao, int quantidade, double preco  ){
        super();
        this.CdProduto = cdProduto;
        this.Nome = nome;
        this.Descricao = descricao;
        this.Preco = preco;
        this.Quantidade = quantidade;
    }

    public String getCdProduto() {
        return CdProduto;
    }

    public void setCdProduto(String cdProduto) {
        CdProduto = cdProduto;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }

    public double getPreco() {
        return Preco;
    }

    public void setPreco(double preco) {
        Preco = preco;
    }

    public int getQuantidade() {
        return Quantidade;
    }

    public void setQuantidade(int quantidade) {
        Quantidade = quantidade;
    }


    public static class Builder {

        private String CdProduto;
        private String Nome;
        private String Descricao;
        private double Preco;
        private int Quantidade;

        public Builder comNome(String Nome) {
            this.Nome = Nome;
            return this;
        }

        public Builder comCdProduto(String CdProduto) {
            this.CdProduto = CdProduto;
            return this;
        }

        public Builder comDescricao(String Descricao) {
            this.Descricao = Descricao;
            return this;
        }

        public Builder comQuantidade(int Quantidade) {
            this.Quantidade = Quantidade;
            return this;
        }

        public Builder comPreco(double Preco) {
            this.Preco = Preco;
            return this;
        }

        public Produto build() {
            return new Produto(this.Nome,this.CdProduto,this.Descricao,this.Quantidade,this.Preco);
        }

    }

}
