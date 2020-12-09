package br.com.uvv.dao;

import br.com.uvv.model.Produto;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;


public class ProdutosDao {
    private static Map Produtos = new LinkedHashMap<>();

    public ProdutosDao(){
        PopularItens();
    }

    public ArrayList<Produto> todosItens() {
        return new ArrayList<>(Produtos.values());
    }

    public void PopularItens(){
        Produtos.put("ELE01",new Produto.Builder().comNome("Mouse 1").comCdProduto("ELE01").comQuantidade(18).comDescricao("mouse 1").comPreco(10).build());
        Produtos.put("ELE02",new Produto.Builder().comNome("Mouse 2").comCdProduto("ELE02").comQuantidade(5).comDescricao("mouse 2").comPreco(300).build());
        Produtos.put("ELE03",new Produto.Builder().comNome("Teclado 1").comCdProduto("ELE03").comQuantidade(200).comDescricao("teclado 1").comPreco(500).build());
        Produtos.put("ELE04",new Produto.Builder().comNome("Tv 1").comCdProduto("ELE04").comQuantidade(15).comDescricao("tv 1").comPreco(5000).build());
        Produtos.put("COS01",new Produto.Builder().comNome("Roupa 1").comCdProduto("COS01").comQuantidade(200).comDescricao("roupa 1").comPreco(59.99).build());
        Produtos.put("COS02",new Produto.Builder().comNome("Roupa 2").comCdProduto("COS02").comQuantidade(1000).comDescricao("roupa 2").comPreco(19.99).build());
        Produtos.put("TEL01",new Produto.Builder().comNome("Celular 1").comCdProduto("TEL01").comQuantidade(200).comDescricao("celular 1").comPreco(10000).build());
        Produtos.put("TEL02",new Produto.Builder().comNome("Celular 2").comCdProduto("TEL02").comQuantidade(300).comDescricao("celular 2").comPreco(4500).build());
        Produtos.put("FIS01",new Produto.Builder().comNome("Halter 1").comCdProduto("FIS01").comQuantidade(18).comDescricao("halter 1").comPreco(800).build());
    }

    public void CadastrarProduto(Produto produto){
        Produtos.put(produto.CdProduto, produto);
    }
    public String ComprarPoduto(Produto produto){
        produto.setPreco(produto.getPreco() * DescontoPreco(produto));

        if(Produtos.containsKey(produto.getCdProduto())){
            Produto ProdutoVendido =  (Produto)Produtos.get(produto.getCdProduto());
            if(ProdutoVendido.getQuantidade() > 0) {
                System.out.println("Comprar Aprovada");
                ProdutoVendido.setQuantidade(ProdutoVendido.getQuantidade()-1);
                Produtos.put(ProdutoVendido.getCdProduto(), ProdutoVendido);
                return "Comprar Aprovada";
            }
            return "Produto fora de Estoque";
        }
        return "Não vendemos esse produto";
    }
    public double DescontoPreco(Produto produto){
        if(produto.getPreco() > 500){
            if(produto.getPreco()>1000){
                return 0.9;
            }
            return 0.95;
        }
        return 1;
    }

}
