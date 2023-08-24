package atv14;

public class TesteVeiculos {

    public static void main(String[] args) {
        
        Carro c = new Carro("Volkswagen", "Gol", 2010, 4);
        System.out.println(c.exibirDetalhes());

        System.out.println("------------------");

        Moto m = new Moto("Honda", "CG", 2016, 125);
        System.out.println(m.exibirDetalhes());

    }
    
}
