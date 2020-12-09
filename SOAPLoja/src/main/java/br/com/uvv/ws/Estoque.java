package br.com.uvv.ws;

import br.com.uvv.dao.ClienteDao;
import br.com.uvv.dao.LojaDao;
import br.com.uvv.dao.ProdutosDao;
import br.com.uvv.model.*;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

@WebService
public class Estoque {
    public ProdutosDao Estoque = new ProdutosDao();
    public LojaDao Lojas = new LojaDao();
    public ClienteDao Clientes = new ClienteDao();

    @WebMethod(operationName = "todosOsProdutos")
    @WebResult(name = "produto")
    public List<Produto> getProdutos() {
        System.out.println("Chamando todos os Produtos");
        return Estoque.todosItens();
    }
    @WebMethod(operationName = "cadastrarProduto")
    public Produto CadastrarProduto(@WebParam(name = "produto") Produto produto){
        System.out.println("Cadastrando Produto");
        Estoque.CadastrarProduto(produto);
        return produto;
    }

    @WebMethod(operationName = "Comprar")
    public String Comprar(@WebParam(name = "Produto") Produto produto,@WebParam(name = "Cliente") Cliente cliente,@WebParam(name = "Loja") Loja loja){
        Cliente cliCad =  Clientes.buscarCliente(cliente);

        if(cliCad.LojaCadastrada.getCdLoja().equals(loja.getCdLoja())){
            produto.setPreco(produto.getPreco() * 0.9);
        }
        if(cliCad.QtdCompras == 10){
            produto.setPreco(produto.getPreco() * 0.85);
        }
        if(cliCad.ComprasMensais > 100000){
            produto.setPreco(produto.getPreco() * 0.80);
        }


        Clientes.Comprou(produto.Preco, cliCad);
        System.out.println( cliente.getNome() + ": compra aprovada no valor de R$" + produto.getPreco());
        return Estoque.ComprarPoduto(produto);
    }

}
