package br.edu.umfg.ocp.legado;

import java.util.ArrayList;

public class Venda {
    private TipoVenda tipo;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Venda(TipoVenda tipo) {
        this.tipo = tipo;
    }

    public void addProduct(Produto produto) {
        produtos.add(produto);
    }

    public void removeProduct(Produto produto) {
        produtos.remove(produto);
    }

    @Override
    public String toString() {
        var result = new StringBuilder();

        result
                .append(tipo)
                .append(": ")
                .append("\n");

        for (var produto : produtos) {
            result
                    .append(produto.getDescricao())
                    .append(" | ")
                    .append(produto.getValor())
                    .append("\n");
        }

        result.append(calcularTotalComImpostos());

        return result.toString();
    }

    private String calcularTotalComImpostos() {
        var result = new StringBuilder();
        double total = 0;

        result.append("\n");
        result.append("*** TOTAL COM IMPOSTOS ***");

        for (var produto : produtos) {
            total += produto.getValor();
        }

        total *= 1.0165;
        total *= 1.0765;

        if (TipoVenda.Parana.equals(tipo)) {
            total *= 1.19;
        } else if (TipoVenda.SaoPaulo.equals(tipo)) {
            total *= 1.18;
        } else if (TipoVenda.SantaCatarina.equals(tipo)) {
            total *= 1.17;
        }

        result.append("\n");
        result.append(total);

        return result.toString();
    }
}
