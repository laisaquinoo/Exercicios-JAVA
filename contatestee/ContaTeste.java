
package contatestee;


class ContaTeste{
	public static void main(String[] args){

	Conta conta = new Conta(100);
	System.out.println(conta);

	System.out.println("Tentando sacar " + 70);
	System.out.println("Sacando " + conta.saca(70));
	System.out.println(conta);

	System.out.println("Depositando " + 20);
	conta.deposita(20);
	System.out.println(conta);

	System.out.println("Tentando sacar " + 70);
	System.out.println("Sacando " + conta.saca(70));
	System.out.println(conta);
	}
 	}

