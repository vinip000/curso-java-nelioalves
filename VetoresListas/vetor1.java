package VetoresListas;
import java.util.Locale;
import java.util.Scanner;

public class vetor1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            vect[i] = sc.nextDouble();
        }

        System.out.println("VALORES:");
        for (int i=0; i<n; i++) {
            System.out.printf("%.2f%n", vect[i]);
        }


        sc.close();

      
    }
}
