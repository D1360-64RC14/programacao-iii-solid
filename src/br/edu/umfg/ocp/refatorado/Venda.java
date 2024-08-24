package br.edu.umfg.ocp.refatorado;

import java.util.ArrayList;

public class Venda {
    private TipoEstado tipoEstado;
    private ArrayList<Produto> produtos;

    public Venda(TipoEstado tipoEstado) {
        this.tipoEstado = tipoEstado;
    }

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removeProduto(Produto produto) {
        produtos.remove(produto);
    }

    @Override
    public String toString() {
        var builder = new StringBuilder();
        double totalImpostos = 0.0;

        builder
                .append("=== Venda ===\n")
                .append("Estado: \n")
                .append(tipoEstado)
                .append("\n\n");

        builder.append("--- Produtos ---\n");

        for (var produto : produtos) {
            builder
                    .append(" - ")
                    .append(produto.getDescricao())
                    .append('\n');

            builder
                    .append(" --- ")
                    .append("Impostos Estaduais: ")
                    .append("R$ ")
                    .append(produto.getValorImpostoEstadual(tipoEstado));

            builder
                    .append(" --- ")
                    .append("Impostos Federais: ")
                    .append("R$ ")
                    .append(produto.getValorImpostoFederal());

            builder.append('\n');
        }

        return builder.toString();
    }
}
