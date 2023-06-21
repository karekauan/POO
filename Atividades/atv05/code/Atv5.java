package atv05.code;

import javax.swing.JOptionPane;

public class Atv5 {

    public static void main(String[] args) {

        double gastosJaneiro = 30000.00;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;

        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        JOptionPane.showMessageDialog(null, "Gastos do trimestre: R$" + String.format("%.2f", gastosTrimestre));

        double mediaMensal = gastosTrimestre / 3;

        JOptionPane.showMessageDialog(null, "Média mensal de gastos: R$" + String.format("%.2f", mediaMensal));
    }
    
}