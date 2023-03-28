package br.com.folhadepagamento;

public class FComissionado extends Funcionario{

    public double percentual;
    public double vendas;
    public boolean comissionado;

    public FComissionado(int matricula, String nome, double salario, double percentual, double vendas) {
        super(matricula, nome, salario);
        this.percentual = percentual;
        this.vendas = vendas;
    }

    public double getPercentual() {
        return percentual;
    }

    public void setPercentual(double percentual) {
        this.percentual = percentual;
    }

    public double getVendas() {
        return vendas;
    }

    public void setVendas(double vendas) {
        this.vendas = vendas;
    }

    public void calcComissao(boolean comissionado) {
        if (comissionado) {
            double comissao;
            comissao = getVendas() * getPercentual();
            setSalario(getSalario() + comissao);
        }
    }
}
