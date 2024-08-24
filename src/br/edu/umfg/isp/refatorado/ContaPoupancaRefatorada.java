package br.edu.umfg.isp.refatorado;

public class ContaPoupancaRefatorada extends AbstractConta
        implements IContaRefatorada
{
    public ContaPoupancaRefatorada(String documento, String nome) {
        super(documento, nome);
    }
}
