package br.edu.umfg.ocp.refatorado.imposto.federal;

import br.edu.umfg.ocp.refatorado.AbstractImpostoFederal;

public class PIS extends AbstractImpostoFederal {
    public PIS() {
        super("PIS", 1.65 / 100);
    }
}
