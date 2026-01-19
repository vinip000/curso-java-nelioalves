
package estruturaSequencial.Exercicios;

public class exercicio2 {
    public static void main(String[] args) {
        System.out.println("Exercício 2 - Estrutura Sequencial");

        double raio = 2.0;
        double pi = 3.14159;

        double area = pi * Math.pow(raio, 2);
        System.out.printf("A área do círculo de raio %.4f é igual a %.4f%n", raio, area);

        double raio2 = 100.64;
        double area2 = pi * Math.pow(raio2, 2);
        System.out.printf("A área do círculo de raio %.4f é igual a %.4f%n", raio2, area2);

        double raio3 = 150.00;
        double area3 = pi * Math.pow(raio3, 2);
        System.out.printf("A área do círculo de raio %.4f é igual a %.4f%n", raio3, area3);


    }
}
