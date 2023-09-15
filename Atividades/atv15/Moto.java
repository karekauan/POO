package atv15;

public class Moto extends Veiculo {
    
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public String ligarMotor() {
        return "Moto ligou o motor";
    }

}
