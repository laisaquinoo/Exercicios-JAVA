
package contatestee;

 class Conta{

	double saldo;

	Conta(double aSaldo){
	this.saldo = aSaldo;
	}

    void deposita(double valor){
	this.saldo += valor;
	}

	double saca(double valor){
	if(valor <= this.saldo){
	this.saldo -= valor;
	return valor;
	}
	else {
	valor = this.saldo;
	this.saldo = 0.0;
	return valor;
	}
	}

	@Override
	public String toString(){
	String resposta = "Saldo na conta: " + this.saldo;
	return resposta;
	}

}

