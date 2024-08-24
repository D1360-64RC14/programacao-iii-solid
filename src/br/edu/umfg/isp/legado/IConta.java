package br.edu.umfg.isp.legado;

public interface IConta {
    void creditar(double valor);
    void debitar(double valor);
    void investir(double value);
    double getSaldo();
}
