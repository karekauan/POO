package atv11.code;

public class UsaPessoa {

    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();

        p1.setNome("João");
        p1.setIdade(20);
        p1.setAltura(1.80);

        System.out.println("Pessoa:");
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        System.out.println("Altura: " + p1.getAltura());
    }
    
}
