import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        while (a!= 4) {
            if (a == 1) {
                System.out.println("Alcool");
                alcool++;
            }
            if (a == 2) {
                System.out.println("Gasolina");
                gasolina++;
            }
            if (a == 3) {
                System.out.println("Diesel");
                diesel++;
            }
        
            a = sc.nextInt();
        }
           System.out.println("MUITO OBRIGADO");
                System.out.println("Alcool: " + alcool);
                System.out.println("Gasolina: " + gasolina);
                System.out.println("Diesel: " + diesel);
               
        sc.close();
    }
}
