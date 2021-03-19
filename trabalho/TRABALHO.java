
package trabalho;

public class TRABALHO {

    public static void main(String[] args) {
    
        jogadorDesktop jogador1 = new jogadorDesktop("Maria Eduarda G.", "785123997011", "Sao Paulo");
        jogador1.aumentarPontuacao(1000);
        System.out.println("Nome jogador desktop: "+jogador1.getNome());
        System.out.println("Cpf: "+jogador1.getCpf());
        System.out.println("Localidade: "+jogador1.getLocalidade());
        System.out.println("Total Pontuacao: "+jogador1.getPontuacao()+"\n");
        
        jogadorWeb jogador2 = new jogadorWeb ("Ana luisa C. ", "13780067100", "Google");
        jogador2.aumentarPontuacao(1000);
        System.out.println("Nome jogador Web:"+jogador2.getNome());
        System.out.println("Cpf: " + jogador2.getCpf());
        System.out.println("Tipo de navegador: "+jogador2.getNavegador());
        System.out.println("Total Pontuacao: "+jogador2.getPontuacao());
             
    }
    
}
