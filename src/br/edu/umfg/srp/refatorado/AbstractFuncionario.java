package br.edu.umfg.srp.refatorado;

public abstract class AbstractFuncionario {
    protected String nome;
    protected double salario;

    public AbstractFuncionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract String getSalario();
}
