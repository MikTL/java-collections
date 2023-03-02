package v.practice.Arrays;

import java.util.ArrayList;

public class CrearArrays {
    public static void main(String[] args) {
        String valor1 = "Abc";
        String valor2 = "bcd";
        String valor3 = "cde";
        ArrayList<String> list = new ArrayList<>();
        list.add(valor1);
        list.add(valor2);
        list.add(valor3);

        //System.out.println(list);
        list.remove(valor1);
        //System.out.println(list);
        list.add(valor1);
        list.set(2, "abc");
        //System.out.println(list);

        /*RECORRER UN ARRAY*/
        for (int i = 0; list.size()> i ; i++){
            System.out.println(list.get(i));
        }
        System.out.println("*******************");
        for (String valor : list) {
            System.out.println(valor);
        }
        System.out.println("*******************");
        list.forEach(valor->{
            System.out.println(valor);
        });
    }
}
