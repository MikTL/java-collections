package v.practice.Arrays;

import java.util.HashSet;
import java.util.Set;

public class InterfaceSet2 {
    public static void main(String[] args) {
        String alumno1 = "Luis Miguel";
        String alumno2 = "Juan Carlos";
        String alumno3 = "Jose Maria";
        String alumno4 = "Gustavo Lima";
        String alumno5 = "Jorge Curioso";

        Set<String> listaAlumnos = new HashSet<>();

        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);
        listaAlumnos.add("Carlos Cabrera");

        for (String alumno : listaAlumnos) {
            //como se vera en el resultado la lista no tiene un orden especifico
            System.out.println(alumno);
        }
        System.out.println(listaAlumnos
        );
    }
}
