package br.edu.umfg.lip.legado;

public class AlunoEAD {
    private String ra;
    private String nome;
    private String email;
    private String senha;
    private double notaFinal;

    public AlunoEAD(String ra, String nome, String email, String senha) {
        this.ra = ra;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getRa() {
        return ra;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public double getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(double notaFinal) {
        this.notaFinal = notaFinal;
    }
}
