
package trabalho;

public class jogadorWeb extends jogador {    
    String navegador;
       
    public jogadorWeb(String nome, String cpf, String navegador) {
        super(nome, cpf, 200);
        this.navegador = navegador;
    }
    
    public String getNavegador() {
        return this.navegador;
    }    
        
    @Override
    public int getPontuacao() {
        return this.pontuacao;
    }
   
    @Override
    public int aumentarPontuacao(int pontoAdicional) {
        this.pontuacao += pontoAdicional * 2;
        return this.pontuacao;
    }
    
    
}