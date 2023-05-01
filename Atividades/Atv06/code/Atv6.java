package Atv06.code;

import javax.swing.JOptionPane;

public class Atv6 {

    // Dados os valores de um depósito fixo mensal e um montante desejado, crie uma classe para determinar quantos meses serão necessários para acumular o montante desejado, considerando juros mensais de 0,5%.

    public static void main(String[] args) {

        double depositoMensal = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do depósito mensal:"));
        double montanteDesejado = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o valor do montante desejado:"));

        double montanteAtual = 0;
        int meses = 0;

        while (montanteAtual < montanteDesejado) {
            montanteAtual += depositoMensal;
            montanteAtual += montanteAtual * 0.005;
            meses++;
        }

        JOptionPane.showMessageDialog(null, "Serão necessários " + meses + " meses para acumular o montante desejado.");

    }
    
}
