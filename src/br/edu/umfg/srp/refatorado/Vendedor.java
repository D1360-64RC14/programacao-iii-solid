package br.edu.umfg.srp.refatorado;

public class Vendedor extends AbstractFuncionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String getSalario() {
        return nome + " SALARIO: " + salario * 1.10;
    }
}
