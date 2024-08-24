package br.edu.umfg.isp.legado;

public class ContaCorrente implements IConta {
    private String documento;
    private String nome;
    private double saldo;

    public ContaCorrente(String documento, String nome) {
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

    @Override
    public void investir(double value) {

    }
}
