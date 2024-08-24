package br.edu.umfg.lip.refatorado;

public class AlunoEADRefatorado extends AbstractAluno {
    private String email;
    private String senha;

    public AlunoEADRefatorado(String ra, String nome, double notaFinal, String email, String senha) {
        super(ra, nome, notaFinal);
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }
}
