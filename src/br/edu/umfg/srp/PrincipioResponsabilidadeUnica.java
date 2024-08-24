package br.edu.umfg.srp;

import br.edu.umfg.srp.legado.Funcionario;
import br.edu.umfg.srp.legado.TipoFuncionario;
import br.edu.umfg.srp.refatorado.Estagiario;
import br.edu.umfg.srp.refatorado.Vendedor;

public class PrincipioResponsabilidadeUnica {
    public static void executarLegado() {
        var estagiario = new Funcionario(
                "Arnaldo da Silva",
                800,
                TipoFuncionario.Estagiario
        );

        var vendedor = new Funcionario(
                "José Valdo",
                2500,
                TipoFuncionario.Vendedor
        );

        System.out.println(estagiario.getSalario());
        System.out.println(vendedor.getSalario());
    }

    public static void executarRefatorado() {
        var estagiario = new Estagiario(
                "Arnaldo da Silva",
                800
        );

        var vendedor = new Vendedor(
                "José Valdo",
                2500
        );

        System.out.println(estagiario.getSalario());
        System.out.println(vendedor.getSalario());
    }
}
