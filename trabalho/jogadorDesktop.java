
package trabalho;

public class jogadorDesktop extends jogador {
    String localidade;
    
    public jogadorDesktop(String nome, String cpf, String localidade) {
        super(nome, cpf, 100);
        this.localidade = localidade;
    }

    @Override
    public String getNome() {
        return this.nome;
    }
    
    public String getLocalidade() {
        return this.localidade;
    }
     
    @Override
    public int getPontuacao() {
        return this.pontuacao;
    }
    
    @Override
    public int aumentarPontuacao(int pontoAdicional) {
        this.pontuacao += pontoAdicional;
        return this.pontuacao;
    }

  
}