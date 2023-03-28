package br.com.folhadepagamento;

public class FPadrao extends Funcionario{

    public int padrao;

    public boolean fpadrao;

    public FPadrao(int matricula, String nome, double salario, int padrao) {
        super(matricula, nome, salario);
        this.padrao = padrao;
    }

    public void calcPadrao(boolean fpadrao) {
        if (fpadrao) {
            getSalario();
        }
    }
}