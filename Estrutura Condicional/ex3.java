package estruturaCondicional;

public class ex3 {
    public static void main (String[] args){
        int a = 6;
        int b = 24;

        if (b % a == 0 || a % b == 0){
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }
    }
}
