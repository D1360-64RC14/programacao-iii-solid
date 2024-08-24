package br.edu.umfg.dip.refatorado;

public class EmailServiceRefatorado implements IEmailService {
    @Override
    public void enviarEmail(String remet, String dest, String msg) {
        System.out.println("De: " + remet + "; Para: " + dest + " | " + msg);
    }
}
