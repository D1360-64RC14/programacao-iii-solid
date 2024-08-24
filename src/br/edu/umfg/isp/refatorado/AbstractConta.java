package br.edu.umfg.isp.refatorado;

public abstract class AbstractConta implements IContaRefatorada {
    private String documento;
    private String nome;
    private double saldo;

    public AbstractConta(String documento, String nome) {
        this.documento = documento;
        this.nome = nome;
    }

    @Override
    public void creditar(double valor) {
        saldo += valor;
    }

    @Override
    public void debitar(double valor) {
        saldo -= valor;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }
}
