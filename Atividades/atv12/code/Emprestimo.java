package atv12.code;

// A classe Emprestimo deve ser construída com os seguintes atributos: valorTotal (representando o valor total do empréstimo), taxaJuros (indicando o percentual de juros mensal) e numeroParcelas (representando a quantidade de parcelas do empréstimo). Além disso, a classe deve possuir um método chamado proximaParcela(), que não recebe parâmetros e retorna o valor da próxima parcela a ser paga. Cada vez que esse método é invocado, ele deve retornar o valor correspondente à próxima parcela. Caso não haja mais parcelas a serem pagas, o método deve retornar -1.

public class Emprestimo {
    
    private float valorTotal;
    private float taxaJuros;
    private int numeroParcelas;
    private int parcelaAtual;
    
    public Emprestimo(float valorTotal, float taxaJuros, int numeroParcelas) {
        this.valorTotal = valorTotal;
        this.taxaJuros = taxaJuros;
        this.numeroParcelas = numeroParcelas;
        this.parcelaAtual = 0;
    }
    
    public float proximaParcela() {
        if (this.parcelaAtual < this.numeroParcelas) {
            this.parcelaAtual++;
            return (this.valorTotal / this.numeroParcelas) * (1 + this.taxaJuros);
        }
        return -1;
    }
    
}
