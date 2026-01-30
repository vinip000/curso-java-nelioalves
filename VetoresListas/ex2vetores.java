package VetoresListas;
import java.util.Scanner;
import java.util.Locale;

public class ex2vetores {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas pessoas você vai digitar? ");
        int n = sc.nextInt();
        Pessoa[] vect = new Pessoa[n];

        for (int i=0; i<n; i++) {
            sc.nextLine();
            String nome = sc.nextLine();
            int idade = sc.nextInt();
            double altura = sc.nextDouble();
            vect[i] = new Pessoa(nome, idade, altura);
        }

        double sum = 0.0;
            for (int i=0; i<n; i++) {
            sum += vect[i].getAltura();
        }
        double avg = sum / n;
        
        System.out.printf("ALTURA MÉDIA: %.2f%n", avg);

        int cont = 0;
        for (int i=0; i<n; i++) {
            if (vect[i].getIdade() < 16) {
                cont++;
            }
        }
        double percent = cont * 100.0 / n;
        System.out.printf("PESSOAS COM MENOS DE 16 ANOS: %.1f%%%n", percent);
        for (int i=0; i<n; i++) {
            if (vect[i].getIdade() < 16) {
                System.out.println(vect[i].getNome());
            }
        }
        


        sc.close();
    }
    
}
