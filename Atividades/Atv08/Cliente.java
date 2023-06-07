package Atv08;

public class Cliente {

    private int codigo;
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String email;
    private String numeroCartaoCredito;

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;

    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return this.dataNascimento;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEndereco() {
        return this.endereco;

    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return this.cidade;

    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return this.estado;

    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCep() {
        return this.cep;

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return this.email;

    }

    public void setNumeroCartaoCredito(String numeroCartaoCredito) {
        this.numeroCartaoCredito = numeroCartaoCredito;
    }

    public String getNumeroCartaoCredito() {
        return this.numeroCartaoCredito;

    }
    
}
