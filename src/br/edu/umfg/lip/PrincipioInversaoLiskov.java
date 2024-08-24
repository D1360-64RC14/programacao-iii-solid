package br.edu.umfg.lip;

import br.edu.umfg.isp.refatorado.IContaRefatorada;
import br.edu.umfg.lip.legado.Aluno;
import br.edu.umfg.lip.legado.AlunoEAD;
import br.edu.umfg.lip.refatorado.AbstractAluno;
import br.edu.umfg.lip.refatorado.AlunoEADRefatorado;
import br.edu.umfg.lip.refatorado.AlunoPresencialRefatorado;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class PrincipioInversaoLiskov {
    public static void executarLegado() {
        var alunoA = new Aluno(
                "RA1",
                "Ana"
        );
        alunoA.setNotaFinal(88);

        var alunoB = new AlunoEAD(
                "RAEAD1",
                "Beatriz",
                "beatriz@mail.com",
                "batata doce"
        );
        alunoB.setNotaFinal(88);

        System.out.println("RA | NOME | NOTA FINAL");
        System.out.println(alunoA.getRa() + " | " + alunoA.getNome() + " | " + alunoA.getNotaFinal());
        System.out.println(alunoB.getRa() + " | " + alunoB.getNome() + " | " + alunoB.getNotaFinal());
    }

    public static void executarRefatorado() {
        var alunoA = new AlunoPresencialRefatorado(
                "RA1",
                "Ana",
                88
        );

        var alunoB = new AlunoEADRefatorado(
                "RAEAD1",
                "Beatriz",
                88,
                "beatriz@mail.com",
                "batata doce"
        );

        System.out.println("RA | NOME | NOTA FINAL");
        escreverAlunoRefatorado(alunoA);
        escreverAlunoRefatorado(alunoB);
    }

    private static void escreverAlunoRefatorado(AbstractAluno aluno) {
        System.out.println(aluno.getRa() + " | " + aluno.getNome() + " | " + aluno.getNotaFinal());
    }
}
