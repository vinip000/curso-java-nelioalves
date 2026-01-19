package POO.Retangulo;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Retangulo ret = new Retangulo();
        System.out.println("Entre com a largura e a altura do retângulo: ");
        ret.largura = sc.nextDouble();
        ret.altura = sc.nextDouble();
        
        System.out.printf("AREA = %.2f%n", ret.area());
        System.out.printf("PERIMETRO = %.2f%n", ret.perimetro());
        System.out.printf("DIAGONAL = %.2f%n", ret.diagonal());

        sc.close(); 
    }
}
