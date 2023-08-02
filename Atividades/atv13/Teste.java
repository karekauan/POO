package atv13;

public class Teste {

    public static void main(String[] args) {
        
        PessoaJuridica pj = new PessoaJuridica();
        pj.setNome("João");
        pj.setCnpj("12345678901234");

        System.out.println("Nome: " + pj.getNome());
        System.out.println("CNPJ: " + pj.getCnpj());

        System.out.println("------------------------------");

        Funcionario f = new Funcionario();
        f.setNome("Cleber");
        f.setCartao("159875321");
        
        System.out.println("Nome: " + f.getNome());
        System.out.println("Cartão: " + f.getCartao());

    }
    
}
