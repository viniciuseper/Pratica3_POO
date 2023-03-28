package br.com.folhadepagamento;

public class FProdutividade extends Funcionario{

    public double valor;
    public int producao;
    public boolean produtividades;

    public FProdutividade(int matricula, String nome, double salario, double valor, int producao) {
        super(matricula, nome, salario);
        this.valor = valor;
        this.producao = producao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getProducao() {
        return producao;
    }

    public void setProducao(int producao) {
        this.producao = producao;
    }

    public void calcProdutividade(boolean produtividades) {
        if (produtividades) {
            double produtividade;
            produtividade = getValor() * getProducao();
            setSalario(salario + produtividade);
        }
    }
}
