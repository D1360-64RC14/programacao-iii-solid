package br.edu.umfg.isp;

import br.edu.umfg.isp.legado.ContaCorrente;
import br.edu.umfg.isp.legado.ContaPoupanca;
import br.edu.umfg.isp.refatorado.ContaCorrenteRefatorada;
import br.edu.umfg.isp.refatorado.ContaInvestimento;
import br.edu.umfg.isp.refatorado.ContaPoupancaRefatorada;
import br.edu.umfg.isp.refatorado.IContaRefatorada;

public class PrincipioSegregacaoInterface {
    public static void executarLegado() {
        var cc = new ContaCorrente(
                "001",
                "Alfredo"
        );

        cc.creditar(1000);
        cc.debitar(50);

        var cp = new ContaPoupanca(
                "002",
                "Bruna"
        );

        cp.creditar(500);
        cp.creditar(50);

        System.out.println("Saldo CC: " + cc.getSaldo());
        System.out.println("Saldo CP: " + cp.getSaldo());
    }

     public static void executarRefatorado() {
        var cc = new ContaCorrenteRefatorada(
                "001",
                "Ana"
        );

        cc.creditar(1000);
        cc.debitar(50);

        var cp = new ContaPoupancaRefatorada(
                "002",
                "Breno"
        );

        cp.creditar(500);
        cp.creditar(50);

        var ci = new ContaInvestimento(
                "003",
                "Carol"
        );

        ci.creditar(300);
        ci.investir(150);
        ci.debitar(55);

         escreverSaldoConta("CC", cc);
         escreverSaldoConta("CP", cp);
         escreverSaldoConta("CI", ci);
     }

     private static void escreverSaldoConta(String tipo, IContaRefatorada conta) {
         System.out.println("Saldo Conta " + tipo + ": " + conta.getSaldo());
     }
}
