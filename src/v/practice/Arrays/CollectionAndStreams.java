package v.practice.Arrays;

import v.practice.Arrays.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionAndStreams {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Fisica", 30);
        Curso curso2 = new Curso("Programación", 20);
        Curso curso3 = new Curso("Matematicas", 40);
        Curso curso4 = new Curso("Economía", 50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        int tiempo=0;
        for (Curso curso : cursos) {
            tiempo += curso.getTiempo();
        }
        System.out.println("Tiempo total de los cursos, con for "+tiempo);
        System.out.println("Ahora lo mismo con el método Stream");
        System.out.println("Tiempo total de cursos con Stream y demás: "
                + cursos.stream().mapToInt(Curso::getTiempo).sum());
        System.out.println("Numero maximo del tiempo en los cursos: "
                + cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
        System.out.println("Ahora tiempo maximo con for:");
        int max = 0;
        for (Curso curso : cursos) {
            if (curso.getTiempo() > max) {
                max = curso.getTiempo();
            }
        }
        System.out.println("Con for tiempo mayor: "+max);

        System.out.println("Con Stream haremos que sumé todos los tiempos pero filtrando un curso menos, en esta ocación el de programación");

        System.out.println("La suma sin el curso de programación es: "+
                cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Programación"))
                        .mapToInt(Curso::getTiempo).sum());

        List<Curso> nuevaListaCursos = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparing(Curso::getTiempo).reversed()).toList();
        System.out.println("****************");
        System.out.println(nuevaListaCursos);

    }
}
