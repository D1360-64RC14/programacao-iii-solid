package br.edu.umfg.ocp.refatorado;

public abstract class AbstractImpostoFederal {
    private String descricao;
    private double aliquota;

    protected AbstractImpostoFederal(String descricao, double aliquota) {
        this.descricao = descricao;
        this.aliquota = aliquota;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getAliquota() {
        return aliquota;
    }
}
