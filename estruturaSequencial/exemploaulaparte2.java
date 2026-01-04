package estruturaSequencial;
import java.util.Scanner;

public class exemploaulaparte2 { 
    public static void main (String []args){

        Scanner sc = new Scanner (System.in);

        int a;
        String s1, s2,s3;

        a = sc.nextInt();
        sc.nextLine(); // consumindo a quebra de linha pendente
        s1 = sc.nextLine();
        s2 = sc.nextLine(); 
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();

    }

}