package br.edu.umfg.ocp;

import br.edu.umfg.ocp.legado.Produto;
import br.edu.umfg.ocp.legado.TipoVenda;
import br.edu.umfg.ocp.legado.Venda;

import java.util.ArrayList;

public class PrincipioAbertoFechado {
    public static void executarLegado() {
        var cocaCola = new Produto("Coca Cola", 6.99);
        var batataFrita = new Produto("Batata Frita 400g", 13.58);

        var venda = new Venda(TipoVenda.Parana);

        venda.addProduct(cocaCola);
        venda.addProduct(batataFrita);

        System.out.println(venda);
    }

    public static void executarRefatorado() {
        var impostosEstaduais = new ArrayList<>(

        );
    }
}
