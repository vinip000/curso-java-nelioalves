package estruturaSequencial;   
import java.util.Scanner;
import java.util.Locale;

public class entradaDados1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;   
        nome = sc.nextLine(); 
        System.out.println("Seu nome é: " + nome);

        int idade;
        idade = sc.nextInt();
        System.out.println("Sua idade é: " + idade);

        double altura;
        altura = sc.nextDouble();
        System.out.printf("Sua altura é: %.2f%n", altura);

        char genero;
        genero = sc.next().charAt(0);//lendo o primeiro caractere da string
        System.out.println("Seu gênero é: " + genero);

        sc.close();


    }
}