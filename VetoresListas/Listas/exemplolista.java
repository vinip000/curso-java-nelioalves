package VetoresListas.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exemplolista {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("gabriela");
        list.add("Vinicius");
        list.add("Pedro");
        list.add("badbunny");
        list.add(2, "marcos");
        list.add("maria");

        System.out.println(list.size());

        //list.remove(2);
        list.removeIf(x->x.charAt(0) == 'm');
        for(String x: list){
            System.out.println(x);
        }
        System.out.println("----------------------------------------");
        System.out.println("Index of Pedro: " + list.indexOf("Pedro"));
        System.out.println("Index of Marcos: " + list.indexOf("marcos"));
        System.out.println("----------------------------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());
        for ( String x : result) {
            System.out.println(x);
        }
        System.out.println("----------------------------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'g').findFirst().orElse(null);
        System.out.println(name);
    }   
}
