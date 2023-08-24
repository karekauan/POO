package atv14;

public class Moto extends Veiculo {

    private int cilindradas;
    
    public Moto(String marca, String modelo, int ano, int cilindradas) {
        super(marca, modelo, ano);
        setCilindradas(cilindradas);
    }

    public int getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String exibirDetalhes() {
        return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nCilindradas: " + getCilindradas();
    }
    
}
