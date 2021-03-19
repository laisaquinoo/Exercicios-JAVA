
package prova;

class Carro {
	String nome;
	int ano;
	double gasolina;
	
 	Carro (String aNome, int aAno){
		this.nome = aNome;
		this.ano = aAno;
		this.gasolina = 0.0;
	}
 	
 	@Override
	public String toString(){
        String res= "";
        res += "N"+ this.nome+",";
	res+="A"+this.ano+",";
	res+="G"+this.gasolina+"\n";
 		return res;
	}
}
