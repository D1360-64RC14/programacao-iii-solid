package br.edu.umfg.ocp.refatorado.imposto.estadual;

import br.edu.umfg.ocp.refatorado.AbstractImpostoEstadual;
import br.edu.umfg.ocp.refatorado.TipoEstado;

public class ICMSSantaCatarina extends AbstractImpostoEstadual {
    public ICMSSantaCatarina() {
        super("ICMS", 17.0 / 100);
    }

    @Override
    public TipoEstado getTipoEstado() {
        return TipoEstado.SantaCatarina;
    }
}
