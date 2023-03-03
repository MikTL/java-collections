package v.practice.Arrays;

import v.practice.Arrays.model.Alumno;
import v.practice.Arrays.model.Curso;

import java.util.Collection;
import java.util.HashSet;

public class EqualsHashCode2 {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometría", 30);
        Alumno alumno1 = new Alumno("Luis Miguel","001");
        Alumno alumno2 = new Alumno("Juan Carlos","002");
        Alumno alumno3 = new Alumno("Jose Maria","003");
        Alumno alumno4 = new Alumno("Gustavo Lima","004");
        Alumno alumno5 = new Alumno("Jorge Curioso","005");

        Collection<Alumno> listaAlumnos = new HashSet<>();
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);

        Alumno alumnoNuevo=new Alumno("Luis Miguel","001");

        System.out.println(curso1.getAlumnos().contains(alumnoNuevo)); // El contains de aqui es la que sobreescribimos
        //en la clase alumno
        System.out.println(curso1.verificaAlumno(alumnoNuevo));

        System.out.println(curso1.getAlumnos());


    }
}
