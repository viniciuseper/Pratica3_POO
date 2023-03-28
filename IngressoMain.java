package br.com.carnaval;
import javax.swing.JOptionPane;
public class IngressoMain{
    public static void main(String[] args) {

        int opcao;
        double valor = 35.00, vlrVip = 15.00, vlrCamarote = 30.00;
        String locCamarote = "Frente";

        do
        {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Ingresso para o Carnaval:\n<1> Ingresso Normal\n<2> VIP\n<3> Camarote\n"));

            switch (opcao) {
                case 1:
                    Normal nml = new Normal(valor);
                    nml.setValor(valor);
                    JOptionPane.showMessageDialog(null, "Valor do Ingresso: " + nml.vlrNormal(), "Carnaval", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    Vip vip = new Vip(valor, vlrVip);
                    vip.setValor(valor);
                    vip.setVlrVip(vlrVip);
                    JOptionPane.showMessageDialog(null, "Valor do Ingresso: " + vip.vlrTotalVip(), "Carnaval", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                    valor = 35.00;
                    vlrCamarote = 30.00;
                    locCamarote = "Frente";
                    Camarote cmrt = new Camarote(valor, locCamarote, vlrCamarote);
                    cmrt.setValor(valor);
                    cmrt.setLocCamarote(locCamarote);
                    cmrt.setVlrCamarote(vlrCamarote);
                    JOptionPane.showMessageDialog(null, "Valor do Ingresso: " + cmrt.vlrTotalCaramorte() + "\nLocalização: " + cmrt.locCamarote, "Carnaval", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        }
        while (opcao <= 3);
    }
}