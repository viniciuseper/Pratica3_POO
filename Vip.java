package br.com.carnaval;

public class Vip extends Ingresso{

    public double vlrVip;

    public Vip(double valor, double vlrVip) {
        super(valor);
        this.vlrVip = vlrVip;
    }

    public double getVlrVip() {
        return vlrVip;
    }

    public void setVlrVip(double vlrVip) {
        this.vlrVip = vlrVip;
    }

    public double vlrTotalVip(){
        return getValor() + getVlrVip();
    }
}
