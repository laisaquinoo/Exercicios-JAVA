
package trabalho;


public abstract class jogador {
    protected String nome;
    protected  String cpf;
    protected  int pontuacao;
    
    public abstract int aumentarPontuacao(int pontoAdicional);
    
    public jogador(String nome, String cpf, int pontuacao) {
        this.nome = nome;
        this.cpf = cpf;
        this.pontuacao = pontuacao;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public abstract int getPontuacao();
    
}