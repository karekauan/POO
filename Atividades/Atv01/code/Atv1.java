package Atv01.code;

// Crie uma classe em Java que seja capaz de apresentar a soma de todos os argumentos inteiros ou reais recebidos, 
// use JoptionPane para ler os argumentos o código para de ler quando for digitado vazio Argumentos inválidos devem ser desconsiderados sem provocar a exibição de erros ou exceções

import javax.swing.JOptionPane;

public class Atv1 {
    public static void main(String[] args) {
        double soma = 0;
        String entrada = JOptionPane.showInputDialog("Digite um número: ");
        while (!entrada.isEmpty()) {
            try {
                soma += Double.parseDouble(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida");
            }
            entrada = JOptionPane.showInputDialog("Digite um número: ");
        }
        JOptionPane.showMessageDialog(null, "A soma dos números digitados é: " + soma);
    }
}

