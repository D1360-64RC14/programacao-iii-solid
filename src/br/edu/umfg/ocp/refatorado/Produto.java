package br.edu.umfg.ocp.refatorado;

import java.util.ArrayList;
import java.util.Arrays;

public class Produto {
    private final String descricao;
    private final double valor;

    private final AbstractImpostoEstadual[] impostosEstaduais;
    private final AbstractImpostoFederal[] impostosFederais;

    public Produto(
            String descricao,
            double valor,
            AbstractImpostoEstadual[] impostosEstaduais,
            AbstractImpostoFederal[] impostosFederais
    ) {
        this.descricao = descricao;
        this.valor = valor;

        this.impostosEstaduais = impostosEstaduais.clone();
        this.impostosFederais = impostosFederais.clone();
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public double getValorImpostoFederal() {
        return Arrays.stream(impostosFederais)
                .map(AbstractImpostoFederal::getAliquota)
                .reduce(0.0, (acc, x) -> acc + getValor() * x);
    }

    public double getValorImpostoEstadual(TipoEstado tipoEstado) {
        return Arrays.stream(impostosEstaduais)
                .filter(x -> x.getTipoEstado().equals(tipoEstado))
                .map(AbstractImpostoEstadual::getAliquota)
                .reduce(0.0, (acc, x) -> acc + getValor() * x);
    }
}
