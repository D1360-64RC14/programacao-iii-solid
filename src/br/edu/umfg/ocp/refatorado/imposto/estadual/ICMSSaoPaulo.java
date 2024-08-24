package br.edu.umfg.ocp.refatorado.imposto.estadual;

import br.edu.umfg.ocp.refatorado.AbstractImpostoEstadual;
import br.edu.umfg.ocp.refatorado.TipoEstado;

public class ICMSSaoPaulo extends AbstractImpostoEstadual {
    public ICMSSaoPaulo() {
        super("ICMS", 18.0 / 100);
    }

    @Override
    public TipoEstado getTipoEstado() {
        return TipoEstado.SaoPaulo;
    }
}
