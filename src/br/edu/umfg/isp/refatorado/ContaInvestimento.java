package br.edu.umfg.isp.refatorado;

public class ContaInvestimento extends AbstractConta
        implements IContaRefatorada, IContaInvestimento
{
    private double investido;

    public ContaInvestimento(String documento, String nome) {
        super(documento, nome);
    }

    @Override
    public void investir(double value) {
        debitar(value);
        investido += value;
    }

    @Override
    public double getSaldo() {
        return super.getSaldo() + investido;
    }
}
