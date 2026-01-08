package estruturaCondicional;

public class exemplo1 {
    public static void main(String[] args) {
       int tempo = 101;
       int resultado = 0;
       int valor = 0;
        
       if(tempo > 100){
        resultado = (tempo - 100) * 2;
        valor = 50 + resultado;
        System.out.println("Valor a pagar: R$" + valor + ",00");
       } else {
        System.out.println("Valor a pagar: R$ 50,00");
       }
    }
}
