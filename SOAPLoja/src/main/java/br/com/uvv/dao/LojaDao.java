package br.com.uvv.dao;

import br.com.uvv.model.Loja;

import java.util.ArrayList;
import java.util.List;

public class LojaDao {
    List<Loja> Lojas = new ArrayList<>();
    public LojaDao(){ CarregarLojas(); }
    public void CarregarLojas() {
        Lojas.add(new Loja("LJ0C1", true));
        Lojas.add(new Loja("LJ0C2", true));
        Lojas.add(new Loja("LJ0C3", true));
        Lojas.add(new Loja("LJ0C4", true));
    }
}
