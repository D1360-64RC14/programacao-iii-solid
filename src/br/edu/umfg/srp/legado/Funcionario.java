package br.edu.umfg.srp.legado;

public class Funcionario {
    private String nome;
    private double salario;
    private TipoFuncionario tipo;

    public Funcionario(
            String nome,
            double salario,
            TipoFuncionario tipo
    ) {
        this.nome = nome;
        this.salario = salario;
        this.tipo = tipo;
    }

    public String getSalario() {
        if (TipoFuncionario.Estagiario.equals(this.tipo)) {
            return this.nome + " SALARIO: " + this.salario;
        }

        return this.nome + " SALARIO: " + this.salario * 1.10;
    }
}
