package br.edu.umfg.ocp.refatorado.imposto.estadual;

import br.edu.umfg.ocp.refatorado.AbstractImpostoEstadual;
import br.edu.umfg.ocp.refatorado.TipoEstado;

public class ICMSParana extends AbstractImpostoEstadual {
    public ICMSParana() {
        super("ICMS", 19.0 / 100);
    }

    @Override
    public TipoEstado getTipoEstado() {
        return TipoEstado.Parana;
    }
}
