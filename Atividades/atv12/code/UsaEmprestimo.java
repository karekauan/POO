package atv12.code;

public class UsaEmprestimo {
    
    public static void main(String[] args) {
        Emprestimo E1 = new Emprestimo(1000, 0.1f, 2);
        Emprestimo E2 = new Emprestimo(1000, 0.1f, 3);
        while (true) {
            float parcela1 = E1.proximaParcela();
            float parcela2 = E2.proximaParcela();
            if (parcela1 == -1 && parcela2 == -1) {
                break;
            }
            System.out.printf("Parcela 1: %.2f | Parcela 2: %.2f\n", parcela1, parcela2);
        }
    }
    
}
