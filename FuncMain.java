package br.com.folhadepagamento;
import javax.swing.JOptionPane;

public class FuncMain {
    public static void main(String[] args) {

        int opcao, producao;
        double percentual, vendas, valor;

        do {
        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Informe a matrícula: "));
        String nome = JOptionPane.showInputDialog("Informe o nome: ");
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário: "));


            opcao = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo do funcionáiro: \n<1> Padrão \n<2> Comissionado \n<3> Produção"));

            switch (opcao) {
                case 1:
                    FPadrao fp1 = new FPadrao(matricula, nome, salario, opcao);
                    fp1.setMatricula(matricula);
                    fp1.setNome(nome);
                    fp1.setSalario(salario);
                    JOptionPane.showMessageDialog(null, "Matrícula: " + fp1.getMatricula() + "\nNome: " + fp1.getNome() + "\nSalário: " + fp1.getSalario(), "Funcionário", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    vendas = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor total das vendas: "));
                    percentual = Double.parseDouble(JOptionPane.showInputDialog("Informe o % de comissão: "));
                    FComissionado fc1 = new FComissionado(matricula, nome, salario, percentual, vendas);
                    fc1.setMatricula(matricula);
                    fc1.setNome(nome);
                    fc1.setSalario(salario);
                    fc1.setVendas(vendas);
                    fc1.setPercentual(percentual);
                    fc1.calcComissao(true);
                    JOptionPane.showMessageDialog(null, "Matrícula: " + fc1.getMatricula() + "\nNome: " + fc1.getNome() + "\nSalário: " + fc1.getSalario(), "Funcionário", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 3:
                    valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor que é recebido por unidade produzida: "));
                    producao = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade produzida: "));
                    FProdutividade fpr1 = new FProdutividade(matricula, nome, salario, valor, producao);
                    fpr1.setMatricula(matricula);
                    fpr1.setNome(nome);
                    fpr1.setSalario(salario);
                    fpr1.setValor(valor);
                    fpr1.setProducao(producao);
                    fpr1.calcProdutividade(true);
                    JOptionPane.showMessageDialog(null, "Matrícula: " + fpr1.getMatricula() + "\nNome: " + fpr1.getNome() + "\nSalário: " + fpr1.getSalario(), "Funcionário", JOptionPane.INFORMATION_MESSAGE);
                    break;
            }
        } while (opcao != 4);
    }
}

