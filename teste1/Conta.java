package teste1;

import java.util.HashMap;

public class Conta extends Cliente {

    public static HashMap<String, Conta> bancoConta = new HashMap<>();

    private double saldo;
    private double chequeEspecial;
    private TiposConta tipoDaConta;

    public static Conta get(String cpf) {
        if (bancoConta.containsKey(cpf)) {
            return bancoConta.get(cpf);
        }
        return new Conta(cpf);
    }

    public Conta(String cpf) {
        super(cpf);
        bancoConta.put(cpf, this);
    }

     public enum TiposConta {

        MINIMA, STANDARD, UM_PORCENTO;

    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public TiposConta getTipoDaConta() {
        return tipoDaConta;
    }

    public void setTipoDaConta(TiposConta tipoDaConta) {
        this.tipoDaConta = tipoDaConta;
    }

}
