package br.edu.umfg.dip.legado;

public class EmailService {
    public void enviarEmail(String remet, String dest, String msg) {
        System.out.println("De: " + remet + "; Para: " + dest + " | " + msg);
    }
}
