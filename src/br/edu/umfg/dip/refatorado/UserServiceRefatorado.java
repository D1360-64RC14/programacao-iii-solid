package br.edu.umfg.dip.refatorado;

public class UserServiceRefatorado {
    private final String DEFAULT_EMAIL = "eu@empresa.com.br";

    private IEmailService emailService;

    public UserServiceRefatorado(IEmailService emailService) {
        this.emailService = emailService;
    }

    public void registerUser(String email) {
        var message = "Bem vindo! Você foi registrado.";
        emailService.enviarEmail(DEFAULT_EMAIL, email, message);
    }
}
