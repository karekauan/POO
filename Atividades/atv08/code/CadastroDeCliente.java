package atv08.code;

public class CadastroDeCliente {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente();
        
        cliente.setCodigo(1);
        cliente.setNome("Eloá Benedita Aurora da Costa");
        cliente.setDataNascimento("22/05/2000");
        cliente.setEndereco("Avenida do Canal, N°662");
        cliente.setCidade("Resende");
        cliente.setEstado("RJ");
        cliente.setCep("27540-090");
        cliente.setEmail("eloa_dacosta@alwan.com.br");
        cliente.setNumeroCartaoCredito("1234 5678 9012 3456");

        System.out.println("Código: " + cliente.getCodigo());
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Data de Nascimento: " + cliente.getDataNascimento());
        System.out.println("Endereço: " + cliente.getEndereco());
        System.out.println("Cidade: " + cliente.getCidade());
        System.out.println("Estado: " + cliente.getEstado());
        System.out.println("CEP: " + cliente.getCep());
        System.out.println("E-mail: " + cliente.getEmail());
        System.out.println("Número do Cartão de Crédito: " + cliente.getNumeroCartaoCredito());
        
    }
    
}
