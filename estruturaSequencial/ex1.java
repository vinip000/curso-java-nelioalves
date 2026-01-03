package estruturaSequencial;
import java.util.Locale;
public class ex1 {

    public static void main(String[] args) {
       
        double x = 9.23456;
        
        System.out.println(x);
        System.out.printf( "%.2f%n", x); //duas casas decimais
        System.out.printf( "%.4f%n", x); //quatro casas decimais
        Locale.setDefault(Locale.US); //definindo o uso do ponto como separador decimal
        System.out.printf( "%.4f%n", x); //usando ponto como separador decimal
        System.out.println("Resultado = " + x + " Metros"); //usando concatenação
        System.out.printf("Resultado = %.2f Metros%n", x); //usando printf
}
}
