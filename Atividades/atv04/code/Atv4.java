package atv04.code;

import javax.swing.JOptionPane;

public class Atv4 {

    public static void main(String[] args) {

        double gastosJaneiro = 30000.00;
        double gastosFevereiro = 33030.77;
        double gastosMarco = 23899.01;

        double gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;

        JOptionPane.showMessageDialog(null, "Gastos do trimestre: R$" + String.format("%.2f", gastosTrimestre));
    }
    
}
