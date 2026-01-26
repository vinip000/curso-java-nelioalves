package POO.ContaBancaria;

public class Conta {
    public int numeroConta;
    public String nomeTitular;
    private double saldo;

    public Conta(int numeroConta, String nomeTitular, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        depositar(saldoInicial);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;
    }   

    public String getNomeTitular() {
        return nomeTitular;
    }  

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }   

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void depositar(double quantia) {
        saldo += quantia;
    }

    public void sacar(double quantia) {
        saldo -= quantia + 5.0;
    }

    public String toString() {
        return String.format("Conta %d, Titular: %s, Saldo: $ %.2f", numeroConta, nomeTitular, saldo);
    }


}
