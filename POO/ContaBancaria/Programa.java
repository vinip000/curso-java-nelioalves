package POO.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Conta conta;

        System.out.print("Entre com o número da conta: ");
        int number=sc.nextInt();
        System.out.print("Entre com o titular da conta: ");
        String holder=sc.next();
        System.out.print("Haverá depósito inicial (s/n)? ");
        char resp =sc.next().charAt(0);

        if (resp=='s' || resp=='S') {
            System.out.print("Entre com o valor de depósito inicial: ");
            double initialDeposit=sc.nextDouble();
            conta = new Conta(number, holder, initialDeposit);
        }
        else {
            conta = new Conta(number, holder, 0.0);

        }
           
        System.out.println();
        System.out.print("Dados da conta:"); 
        System.out.println(conta);


        System.out.println();
        System.out.print("Entre com um valor para deposito: ");
        double depositValue=sc.nextDouble();
        conta.depositar(depositValue);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.print("Entre com um valor para saque: ");
        double withdrawValue=sc.nextDouble();
        conta.sacar(withdrawValue);
        System.out.println("Dados atualizados da conta:");
        System.out.println(conta);








        sc.close();
        
    }

}