package v.practice.Arrays;

import v.practice.Arrays.model.Alumno;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class EqualsHashCode {
    public static void main(String[] args) {
        Alumno alumno1 = new Alumno("Luis Miguel","001");
        Alumno alumno2 = new Alumno("Juan Carlos","002");
        Alumno alumno3 = new Alumno("Jose Maria","003");
        Alumno alumno4 = new Alumno("Gustavo Lima","004");
        Alumno alumno5 = new Alumno("Jorge Curioso","005");

        Collection<Alumno> listaAlumnos = new HashSet<>();
        listaAlumnos.add(alumno1);
        listaAlumnos.add(alumno2);
        listaAlumnos.add(alumno3);
        listaAlumnos.add(alumno4);
        listaAlumnos.add(alumno5);

        Alumno alumnoNuevo=new Alumno("Luis Miguel","001"); //Mismos datos que el alumno 1
        System.out.println(listaAlumnos.contains(alumno1)); //True

        System.out.println(listaAlumnos.contains(alumnoNuevo)); //False porque no son el mismo objeto
        // a menos que la listaAlumnos sea un ArrayList ahi si daria true, o tambien se puede sobreEscribas
        // el metodo hashCode, como lo haŕe.

        //Entonces si queremos que el igualen por los datos podemos sobreescribir el método Equals en el Alumno

        //Estamos comparando un objeto con otro objeto del mismo tipo
        System.out.println("Con el equals sobreescrito "+alumno1.equals(alumnoNuevo));

    }
}
