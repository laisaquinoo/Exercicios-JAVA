
package prova;


public class PROVA {
 	public static void main(String[] args) {
		Carro meuCarro = new Carro ("meu carro", 1982);
		System.out.println(meuCarro);
                aumentaGasolina(meuCarro);
                System.out.println(meuCarro);
        }
	static void aumentaGasolina(Carro carro){
 		carro.gasolina = carro.gasolina+35.0;
 	}

}

    
