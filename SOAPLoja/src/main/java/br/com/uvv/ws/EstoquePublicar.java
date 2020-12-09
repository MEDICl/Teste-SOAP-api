package br.com.uvv.ws;


import javax.xml.ws.Endpoint;

public class EstoquePublicar {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();
        String URL = "http://localhost:8080/estoquews";

        System.out.println("EstoqueWS rodando: " + URL + "?wsdl");
        Endpoint.publish(URL, estoque);
    }
}
