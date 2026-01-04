package estruturaSequencial;

public class ex4 {
    public static void main(String[] args) {
        int a, b;
        double resultado;

        a = 5;
        b = 2;

        resultado = a / b; // divisão entre inteiros, com erro, pois não tem o casting dos valores
        resultado = (double) a / b; // corrigido com o casting
        
        System.out.println(resultado);
       
}
}
