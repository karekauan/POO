package atv15;

public class ExercicioPolimorfismo {
    
    public static void main(String[] args) {
        
        Carro c = new Carro("Volkswagen", "Gol");
        System.out.println(c.ligarMotor());

        Moto m = new Moto("Honda", "CG");
        System.out.println(m.ligarMotor());

        Caminhao C = new Caminhao("Volvo", "FH");
        System.out.println(C.ligarMotor());

    }

}
