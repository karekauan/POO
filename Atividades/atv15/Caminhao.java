package atv15;

public class Caminhao extends Veiculo {

    public Caminhao(String marca, String modelo) {
        super(marca, modelo);
    }

    public String ligarMotor() {
        return "Caminhão ligou o motor";
    }
    
}
