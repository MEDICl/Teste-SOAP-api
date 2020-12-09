package br.com.uvv.dao;


import br.com.uvv.model.Cliente;
import br.com.uvv.model.Loja;

import java.util.ArrayList;
import java.util.List;

public class ClienteDao {
    private static List<Cliente> Clientes = new ArrayList<>();
    public ClienteDao(){ popularClientes(); }

    public void popularClientes(){
            Clientes.add(new Cliente("Felipe Mant",new Loja("LJ0C1", true)));
        Clientes.add(new Cliente("Pedro Med",new Loja("LJ0C1", true)));
        Clientes.add(new Cliente("Lucas Seix",new Loja("LJ0C2", false)));
        Clientes.add(new Cliente("Rodrigo Dev",new Loja("LJ0C2", false)));
        Clientes.add(new Cliente("Fabio Aug",new Loja("LJ0C3", false)));
        Clientes.add(new Cliente("Ronaldo Ceu",new Loja("LJ0C3", false)));
        Clientes.add(new Cliente("Jesus Cri",new Loja("LJ0C4", false)));
        Clientes.add(new Cliente("Fabio Mel",new Loja("LJ0C4", false)));
    }

    public Cliente buscarCliente(Cliente cli){
        for (Cliente cliente :
                Clientes) {
            if(cliente.Nome.equals(cli.Nome))
                return cliente;
        }
        Clientes.add(cli);
        return cli;
    }

    public void Comprou(double valor, Cliente cliente){
        int index = Clientes.indexOf(cliente);
        if(cliente.QtdCompras == 10)
            cliente.QtdCompras = 0;
        cliente.QtdCompras++;
        cliente.ComprasMensais += valor;
        Clientes.add(index, cliente);
    }
}
