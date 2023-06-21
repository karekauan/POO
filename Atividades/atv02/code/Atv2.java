package atv02.code;

import java.util.Scanner;

public class Atv2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Informe um inteiro: ");
        int a = input.nextInt();

        input.close();

        int b = a-1;
        int c = a+1;
        a = b * c;

        // Este programa executa um cálculo de exemplo de folha de pagamento
        System.out.println("O valor de a é: " + a);
    }
}