package teste1;

import teste1.Conta.TiposConta;

public class Banco implements IBanco {

    public Banco(){}

    @Override
    public void cadastraCliente(String cpf, String nome) {
        Conta.get(cpf).setNome(nome);
    }

    @Override
    public void setEndereco(String cpf, String nomeDaRua, int numero) {
        Conta aconta = Conta.get(cpf);
        aconta.setNomeDaRua(nomeDaRua);
        aconta.setNumero(numero);
    }

    @Override
    public void setConta(String cpf, TiposConta tipoContas) {
        Conta aconta = Conta.get(cpf);

        if (tipoContas == null) {
            aconta.setTipoDaConta(TiposConta.MINIMA);
        }else {
            aconta.setTipoDaConta(tipoContas);
        }
    }

    @Override
    public boolean sacar(String cpf, double valor) {
        Conta conta = Conta.get(cpf);

        if (conta.getSaldo() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            return true;

        } else if ((conta.getTipoDaConta().equals(TiposConta.STANDARD) ||
                conta.getTipoDaConta().equals(TiposConta.UM_PORCENTO)) &&
                conta.getSaldo() + conta.getChequeEspecial() >= valor) {
            conta.setSaldo(conta.getSaldo() - valor);
            return true;

        } else {
            return false;
        }
    }

   
    @Override
    public void depositar(String cpf, double valor) {
        Conta aconta = Conta.get(cpf);
        aconta.setSaldo(aconta.getSaldo() + valor);
    }

    /**
     *
     * @param cpf
     * @param valor
     */
    @Override
    public void setChequeEspecial(String cpf, double valor) {
        Conta aconta = Conta.get(cpf);

        if (!aconta.getTipoDaConta().equals(TiposConta.MINIMA)) {
            aconta.setChequeEspecial(valor);
        }else {
            aconta.setChequeEspecial(0);
        }
    }

    @Override
    public void cobrarTaxas() {
        Conta.bancoConta.entrySet().forEach((qtdConta) -> {
            if (qtdConta.getValue().getTipoDaConta().equals(TiposConta.STANDARD)) {
                double saldo = qtdConta.getValue().getSaldo();
                double chequeEspecial = (saldo < 0 ? saldo * 0.09 : 0);

                qtdConta.getValue().setSaldo((saldo - 7.00) + chequeEspecial);

            } else if (qtdConta.getValue().getTipoDaConta().equals(TiposConta.UM_PORCENTO)) {
                double saldo = qtdConta.getValue().getSaldo();

                if (qtdConta.getValue().getSaldo() > 0) {
                    qtdConta.getValue().setSaldo((saldo - 30) - saldo * 0.01);
                }else {
                    qtdConta.getValue().setSaldo((saldo - 30) + saldo * 0.01);
                }
            }
        });
    }

    
    @Override
    public void imprimirRelatorio() {
        System.out.println();
        Conta.bancoConta.entrySet().stream().map((qtdConta) -> {
            System.out.println();
            return qtdConta;
        }).map((qtdConta) -> {
            return qtdConta;
        }).map((qtdConta) -> {
            System.out.println("Nome: " + qtdConta.getValue().getNome());
            return qtdConta;
        }).map((qtdConta) -> {
            System.out.println("Endereço: " + qtdConta.getValue().getNomeDaRua());
            return qtdConta;
        }).map((qtdConta) -> {
            System.out.println("Cpf: " + qtdConta.getValue().getCpf());
            return qtdConta;
        }).map((qtdConta) -> {
            System.out.println("Tipo da Conta: " + qtdConta.getValue().getTipoDaConta());
            return qtdConta;
        }).map((qtdConta) -> {
            System.out.println("Saldo: " + qtdConta.getValue().getSaldo());
            return qtdConta;
        }).map((qtdConta) -> {
            System.out.println("Cheque Especial: " + qtdConta.getValue().getChequeEspecial());
            return qtdConta;
        }).map((_item) -> {
            System.out.println();
            return _item;
        }).forEachOrdered((_item) -> {
            System.out.println();
        });
        System.out.println();
    }


    
}
