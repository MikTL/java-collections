package v.practice.Arrays;

import v.practice.Arrays.model.Alumno;
import v.practice.Arrays.model.Curso;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class IteratorAlumnos {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometría", 30);
        Alumno alumno1 = new Alumno("Luis Miguel","001");
        Alumno alumno2 = new Alumno("Juan Carlos","002");
        Alumno alumno3 = new Alumno("Jose Maria","003");
        Alumno alumno4 = new Alumno("Gustavo Lima","004");
        Alumno alumno5 = new Alumno("Jorge Curioso","005");

        Collection<Alumno> listaAlumnos = new LinkedHashSet<>();
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);

        curso1.getAlumnos().forEach(System.out::println);
        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();
//        System.out.println(alumnoIterator);
        System.out.println("*********");
        while (alumnoIterator.hasNext()){
            System.out.println(alumnoIterator.next());
        }
        System.out.println(alumnoIterator.next()); //Error porque ya se recorrio todos los elementos
        // y no hay un siguiente elemento
    }
}
