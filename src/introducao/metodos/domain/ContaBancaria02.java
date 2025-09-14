package introducao.metodos.domain;

public class ContaBancaria02 {
    private String numeroConta;
    private double saldo;
    private double valor;

    public ContaBancaria02(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public ContaBancaria02(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double deposito) {
        if (deposito < 0) {
            System.out.println("Valor inválido!");
        } else {
            this.saldo += deposito;
        }
    }

    public void sacar(double saque) {
        if (this.saldo < saque) {
            System.out.println("Voce nao tem esse valor! saldo atual: " + saldo);
        } else {
            this.saldo -= saque;
        }
    }

    public void imprimir() {
        System.out.println("Conta bancária: " + this.numeroConta + " Saldo: " + this.saldo);
    }
}
