package estruturaSequencial;

public class equacoes {
    public static void main(String[] args) {
        double x = 3.0;
        double y = 4.0;
        double z = -5.0;
        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.00);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println(A);
        System.out.println(B);

    }
}
