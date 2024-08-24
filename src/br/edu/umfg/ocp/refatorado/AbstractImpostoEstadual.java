package br.edu.umfg.ocp.refatorado;

public abstract class AbstractImpostoEstadual {
    private String descricao;
    private double aliquota;

    protected AbstractImpostoEstadual(String descricao, double aliquota) {
        this.descricao = descricao;
        this.aliquota = aliquota;
    }

    public abstract TipoEstado getTipoEstado();

    public String getDescricao() {
        return descricao;
    }

    public double getAliquota() {
        return aliquota;
    }
}
