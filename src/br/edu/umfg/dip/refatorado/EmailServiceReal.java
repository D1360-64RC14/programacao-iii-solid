package br.edu.umfg.dip.refatorado;

import org.simplejavamail.api.mailer.Mailer;
import org.simplejavamail.email.EmailBuilder;

public class EmailServiceReal implements IEmailService, AutoCloseable {
    private final Mailer mailer;

    public EmailServiceReal(Mailer mailer) {
        this.mailer = mailer;
    }

    @Override
    public void enviarEmail(String remet, String dest, String msg) {
        var text = "De: " + remet + "; Para: " + dest + " | " + msg;

        var email = EmailBuilder.startingBlank()
                .from(remet)
                .to(dest)
                .withSubject("Email Automatico")
                .withPlainText(text)
                .buildEmail();

        mailer.sendMail(email);
    }

    @Override
    public void close() throws Exception {
        mailer.close();
    }
}
