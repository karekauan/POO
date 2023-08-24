package atv14;

public class Carro extends Veiculo {

    private int numeroDePortas;

    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        setNumeroDePortas(numeroDePortas);
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }

    public String exibirDetalhes() {
        return "Marca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "\nNumero de portas: " + getNumeroDePortas();
    }
    
}
