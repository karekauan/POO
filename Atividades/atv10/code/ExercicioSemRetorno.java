package atv10.code;

public class ExercicioSemRetorno {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        imprimirNumeros(numeros);
        somaNumeros(numeros);
        imprimirNumeros(numeros);
    }

    public static void imprimirNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();
    }

    public static void somaNumeros(int[] numeros) {
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }
        System.out.println(soma);
    }
}