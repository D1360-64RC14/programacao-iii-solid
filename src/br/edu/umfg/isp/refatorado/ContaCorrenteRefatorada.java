package br.edu.umfg.isp.refatorado;

public class ContaCorrenteRefatorada extends AbstractConta
        implements IContaRefatorada
{
    public ContaCorrenteRefatorada(String documento, String nome) {
        super(documento, nome);
    }
}
