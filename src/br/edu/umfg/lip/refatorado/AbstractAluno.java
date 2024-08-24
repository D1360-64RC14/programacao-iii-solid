package br.edu.umfg.lip.refatorado;

public abstract class AbstractAluno {
    private String ra;
    private String nome;
    private double notaFinal;

    public AbstractAluno(String ra, String nome, double notaFinal) {
        this.ra = ra;
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
