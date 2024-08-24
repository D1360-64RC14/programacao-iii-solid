package br.edu.umfg.isp.refatorado;

public interface IContaRefatorada {
    void creditar(double valor);
    void debitar(double valor);
    double getSaldo();
}
