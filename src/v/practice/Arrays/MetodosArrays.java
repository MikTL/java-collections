package v.practice.Arrays;

import java.util.*;
import java.util.stream.Collectors;

public class MetodosArrays {
    public static void main(String[] args) {
        String valor1 = "zbc";
        String valor2 = "ocd";
        String valor3 = "cde";
        String valor4 = "pol";
        ArrayList<String> list = new ArrayList<>();
        list.add(valor1);
        list.add(valor2);
        list.add(valor3);
        list.add(valor4);



        System.out.println(list);
        Collections.sort(list); //modifica el array, ordena por el abecedario
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);

        List<String>valoresList=list.stream().sorted().toList();
        System.out.println("*******");
        System.out.println(valoresList);


        ArrayList<Integer> arrayEnteros = new ArrayList<>();
        arrayEnteros.add(5);
        arrayEnteros.add(8);
        arrayEnteros.add(1);
        arrayEnteros.sort(Collections.reverseOrder().reversed());
        System.out.println("El array de enteros "+arrayEnteros);
    }
}
