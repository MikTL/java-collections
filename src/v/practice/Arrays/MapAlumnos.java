package v.practice.Arrays;

import v.practice.Arrays.model.Alumno;
import v.practice.Arrays.model.Curso;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;

public class MapAlumnos {
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

        Optional<Alumno> alumnoOptional = curso1.getAlumnos().stream().filter(alumno -> "003".equalsIgnoreCase(alumno.getCodigo())).findFirst();
        if(alumnoOptional.isPresent()){
            System.out.println(alumnoOptional.get());
        }
        Alumno alumnoMap= curso1.getAlumnoMap().get("003");
        System.out.println(alumnoMap);
    }
}
