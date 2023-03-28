package br.com.carnaval;

public class Normal extends Ingresso{

    public double vlrNormal;

    public Normal(double valor) {
        super(valor);
    }

    public double vlrNormal(){
        return getValor();
    }
}