package Objetos;

public class ContaBancaria {

    private String numeroConta;
    private double saldo;
    public void depositar(double valor) {saldo = saldo + valor;}
    public void sacar(double valor) {saldo = saldo - valor;}
    public double saldoAtual() {return saldo;}

    public ContaBancaria(){

    }

    public void setDepositar(String numeroConta, double depositar) {
        this.numeroConta = numeroConta;
        this.saldo = saldo + depositar;
    }

    public void setSacar(String numeroConta, double depositar, double sacar) {
        if (saldo >= sacar) {
        this.numeroConta = numeroConta;
        this.saldo = saldo - sacar;}
        else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void setSaldoAtual(String numeroConta, double saldoAtual ) {
        this.numeroConta = numeroConta;
        this.saldo = saldoAtual;
    }
}
