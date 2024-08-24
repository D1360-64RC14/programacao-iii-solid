package br.edu.umfg.dip;

import br.edu.umfg.dip.legado.EmailService;
import br.edu.umfg.dip.legado.UserService;
import br.edu.umfg.dip.refatorado.EmailServiceReal;
import br.edu.umfg.dip.refatorado.EmailServiceRefatorado;
import br.edu.umfg.dip.refatorado.UserServiceRefatorado;
import org.simplejavamail.mailer.MailerBuilder;

public class PrincipioInversaoDependencia {
    public static void executarLegado() {
        var userService = new UserService();

        userService.registerUser("gdiego416@gmail.com");
    }

    public static void executarRefatorado() {
        var emailService = new EmailServiceRefatorado();
        var userService = new UserServiceRefatorado(emailService);

        userService.registerUser("diego@mail.com");
    }

    public static void executarRefatoradoReal() {
        var mailer = MailerBuilder
                .withSMTPServer("smtp.freesmtpservers.com", 25)
                .buildMailer();
        var emailService = new EmailServiceReal(mailer);
        var userService = new UserServiceRefatorado(emailService);

        userService.registerUser("diego@mail.com");

        try {
            emailService.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
