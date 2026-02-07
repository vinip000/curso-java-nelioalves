package VetoresListas.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Funcionario> list = new ArrayList<>();
        System.out.print("Quantos funcionarios serão registrados? ");
        int n = sc.nextInt(); 

        for (int i = 0; i < n; i++) {
            System.out.println();
            int id = sc.nextInt();
            while (hasId(list, id)) {
                System.out.println("ID já existe! Tente novamente: ");
                id = sc.nextInt();
            }
            
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            double salario = sc.nextDouble();
            list.add(new Funcionario(id, nome, salario));
        }

        System.out.println();
        System.out.print("Digite o ID do funcionário que terá aumento salarial: ");
        int id = sc.nextInt();
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if (func == null) {
            System.out.println("ID não encontrado!");
        } else {
            System.out.print("Digite a porcentagem de aumento: ");
            double percent = sc.nextDouble();
            func.aumentarSalario(percent);
        }  

        System.out.println();
        System.out.println("Lista de funcionários:");
        for (Funcionario obj : list) {
            System.out.println(obj);
        }

        sc.close();
    }

    public static boolean hasId(List<Funcionario> list, int id) {
        Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return func != null;    
    }
    
}
