package VetoresListas;

import java.util.Locale;
import java.util.Scanner;

public class vetor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = sc.nextInt();
        Produto [] vect = new Produto[n];

        for (int i=0; i<n; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            double preco = sc.nextDouble();
            vect[i] = new Produto(nome, preco);
        }

        double sum = 0.0;
        for (int i=0; i<n; i++) {
            sum += vect[i].getPreco();
        }

        double avg = sum / n;
        System.out.printf("PREÇO MÉDIO: %.2f%n", avg);



        sc.close();
    }
}
