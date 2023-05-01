package Atv03.code;

import javax.swing.JOptionPane;

public class Atv3 {
    public static void main(String[] args) {
        double nota1, nota2, trabalho, media;

        nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da primeira prova: "));
        nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota da segunda prova: "));
        trabalho = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do trabalho: "));

        media = (nota1 + nota2 + trabalho) / 3;

        JOptionPane.showMessageDialog(null, "A média é: " + String.format("%.2f", media));
    }
}


