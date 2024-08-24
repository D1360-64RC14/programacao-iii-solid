package br.edu.umfg.dip.legado;

public class UserService {
    private final String DEFAULT_MAIL = "eu@empresa.com.br";

    private EmailService emailService;

    public UserService() {
        this.emailService = new EmailService();
    }

    public void registerUser(String email) {
        var message = "Bem vindo! Você foi registrado.";
        emailService.enviarEmail(DEFAULT_MAIL, email, message);
    }
}
