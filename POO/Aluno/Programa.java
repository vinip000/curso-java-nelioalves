package POO.Aluno;
import java.util.Locale;
import java.util.Scanner;


public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Aluno aluno = new Aluno();  
        System.out.print("Nome do Aluno: ");
        aluno.nome = sc.nextLine();
        System.out.print("Digite a primeira nota: ");
        aluno.nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        aluno.nota2 = sc.nextDouble();
        System.out.print("Digite a terceira nota: ");
        aluno.nota3 = sc.nextDouble();

        System.out.printf("NOTA FINAL: %.2f%n", aluno.notaFinal());
        aluno.resultadoFinal();

        sc.close();
    }
    
}
