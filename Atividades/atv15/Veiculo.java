package atv15;

public abstract class Veiculo {
    
    private String marca;
    private String modelo;
    
    public Veiculo(String marca, String modelo){
        setMarca(marca);
        setModelo(modelo);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public abstract String ligarMotor();

}
