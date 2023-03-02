package v.practice.Arrays;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class InterfaceSet2 {
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Juan Carlos";
        String alumno3 = "Jose Maria";
        String alumno4 = "Gustavo Lima";
        String alumno5 = "Jorge Curioso";

        Collection<String> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add("Carlos Cabrera");
        listaAlumnos.add("Carlos Cabrera"); //solo tomara un solo nombre, no duplicados
        for (String alumno : listaAlumnos) {
            //como se vera en el resultado la lista no tiene un orden especifico
            System.out.println(alumno);
        }
        System.out.println("**********");
        boolean valida = listaAlumnos.contains("Gustavo Lima");
        System.out.println(valida);
        String maxLength = listaAlumnos.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println("El alumno con mas caracteres en su nombre es: '"
                +maxLength+" con un total de "+maxLength.length()+" caracteres");
        System.out.println("*********");
        listaAlumnos.removeIf("Gustavo Lima"::equalsIgnoreCase);
        for (String alumno :
                listaAlumnos) {
            System.out.println(alumno);
        }
        System.out.println(listaAlumnos.stream().filter(alumno -> alumno.equalsIgnoreCase("Gustavo Polar")).findFirst().orElse("No Existe"));

    }
}
