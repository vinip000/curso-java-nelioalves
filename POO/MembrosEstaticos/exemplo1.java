package POO.MembrosEstaticos;
import java.util.Locale;
import java.util.Scanner;

public class exemplo1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.print("Entre com o valor do raio: ");
        double raio = sc.nextDouble();
        

        double circ = Calculator.circunferencia(raio);
        double vol = Calculator.volume(raio);
    
        System.out.printf("CIRCUNFERÊNCIA: %.2f%n", circ);
        System.out.printf("VOLUME: %.2f%n", vol);
        System.out.printf("VALOR DE PI: %.2f%n", Calculator.PI);

        sc.close();
    }
  
}
