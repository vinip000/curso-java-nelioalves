package VetoresListas.Pensionato;
import java.util.Locale;
import java.util.Scanner;


public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quartos serão alugados? ");
        int n = sc.nextInt();

        Aluguel[] vect = new Aluguel[10];


        for (int i=0; i<n; i++) {
            sc.nextLine();
            System.out.println("Aluguel #" + (i+1) + ":");
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
            vect[quarto] = new Aluguel(nome, email, quarto);
        }

        System.out.println();
        System.out.println("Quartos ocupados:");
        for (int i=0; i<10; i++) {
            if (vect[i] != null) {
                System.out.println(vect[i]);
            }
        }

        sc.close();
        

    }
}
