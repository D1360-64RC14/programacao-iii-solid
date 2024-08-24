package br.edu.umfg.srp.refatorado;

public class Gerente extends AbstractFuncionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String getSalario() {
        return nome + " SALARIO: " + salario * 1.25;
    }
}
