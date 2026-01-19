package POO.Funcionario;
import java.util.Locale;
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        Funcionario func = new Funcionario();
        System.out.print("Nome: ");
        func.nome = sc.nextLine();
        System.out.print("Salário bruto: ");
        func.salarioBruto = sc.nextDouble();
        System.out.print("Imposto: ");
        func.imposto = sc.nextDouble();

        System.out.println("Dados do Funcionário: " + func);
        System.out.print("Digite a porcentagem para aumentar o salário: ");
        double taxa = sc.nextDouble();
        func.salarioBruto = func.aumentarsalario(taxa);
        System.out.println("Dados atualizados: " + func);

        sc.close();
    }
}
