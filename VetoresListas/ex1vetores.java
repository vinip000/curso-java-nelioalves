package VetoresListas;

import java.util.Locale;
import java.util.Scanner;

public class ex1vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = sc.nextInt();
        }   
        System.out.println("NÚMEROS NEGATIVOS:");
        
        for (int i = 0; i < n; i++) {
            if (numbers[i] < 0) {
                System.out.println(numbers[i]);
            }
        }


        sc.close();
    }
    
}
