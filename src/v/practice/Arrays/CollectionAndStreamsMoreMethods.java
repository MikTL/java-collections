package v.practice.Arrays;

import v.practice.Arrays.model.Curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectionAndStreamsMoreMethods {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Fisica", 30);
        Curso curso2 = new Curso("Programación", 20);
        Curso curso3 = new Curso("Matematicas", 40);
        Curso curso4 = new Curso("Economía", 35);
        Curso curso5 = new Curso("Economía", 23);
        Curso curso6 = new Curso("Fisica", 15);
        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);

        System.out.println("Con Stream haremos que sumé todos los tiempos " +
                "pero filtrando un curso menos, en esta ocación el de programación");
        System.out.println("La suma sin el curso de programación es: "+
                cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Programación"))
                        .mapToInt(Curso::getTiempo).sum());

        // Promedio
        System.out.println("El promedio de tiempo de los cursos es "+
                cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
        // Minimo
        System.out.println("El tiempo minimo de los cursos es "+cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
        //Agrupar Repetidos
        Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getNombre));
        System.out.println("******* Agrupaciones ******");
        groupCurso.forEach((key,value)->{
            System.out.println(key+" - "+value.size());
        });
        System.out.println("Usando el Stream Paralelo " + cursos.parallelStream().mapToInt(Curso::getTiempo).sum());

        //Calculando TIempo de de suma de elementos con stream y streamParalelo
        long startTimeP = System.nanoTime();
        cursos.parallelStream().mapToInt(Curso::getTiempo).sum();
        long endTimeP = System.nanoTime();
        long durationp = endTimeP - startTimeP;

        System.out.println("duracion paralelo "+durationp);
        long startTimeS = System.nanoTime();
        cursos.stream ().mapToInt(Curso::getTiempo).sum();
        long endTimeS = System.nanoTime();
        long durationS = endTimeS - startTimeS;
        System.out.println("duracion Stream "+durationS);
        // En este caso demora es mas rapido el Stream porque hay pocos datos que procesar, pero con grandes
        // cantidades es mas eficiente el ParallelStream
    }
}
