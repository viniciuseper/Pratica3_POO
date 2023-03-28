package br.com.carnaval;

public class Camarote extends Ingresso{

    public String locCamarote;
    public double vlrCamarote = 75.00;


    public Camarote(double valor, String locCamarote, double vlrCamarote) {
        super(valor);
        this.locCamarote = locCamarote;
        this.vlrCamarote = vlrCamarote;
    }

    public String getLocCamarote() {
        return locCamarote;
    }

    public void setLocCamarote(String locCamarote) {
        this.locCamarote = locCamarote;
    }

    public double getVlrCamarote() {
        return vlrCamarote;
    }

    public void setVlrCamarote(double vlrCamarote) {
        this.vlrCamarote = vlrCamarote;
    }

    public double vlrTotalCaramorte(){
        return getValor() + getVlrCamarote();
    }
}
