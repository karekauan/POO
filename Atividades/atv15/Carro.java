package atv15;

public class Carro extends Veiculo {

    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public String ligarMotor() {
        return "Carro ligou o motor";
    }
    
}
