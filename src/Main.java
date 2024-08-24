import br.edu.umfg.dip.PrincipioInversaoDependencia;
import br.edu.umfg.isp.PrincipioSegregacaoInterface;
import br.edu.umfg.lip.PrincipioInversaoLiskov;
import br.edu.umfg.ocp.PrincipioAbertoFechado;
import br.edu.umfg.srp.PrincipioResponsabilidadeUnica;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        System.out.println("\n--- SRP ---");
        PrincipioResponsabilidadeUnica.executarLegado();
        PrincipioResponsabilidadeUnica.executarRefatorado();

        System.out.println("\n--- OCP ---");
        PrincipioAbertoFechado.executarLegado();
        PrincipioAbertoFechado.executarRefatorado();

        System.out.println("\n--- LSP ---");
        PrincipioInversaoLiskov.executarLegado();
        PrincipioInversaoLiskov.executarRefatorado();

        System.out.println("\n--- ISP ---");
        PrincipioSegregacaoInterface.executarLegado();
        PrincipioSegregacaoInterface.executarRefatorado();

        System.out.println("\n--- DIP ---");
        PrincipioInversaoDependencia.executarLegado();
        PrincipioInversaoDependencia.executarRefatorado();
        PrincipioInversaoDependencia.executarRefatoradoReal();
    }
}