package v.practice.Arrays;

import v.practice.Arrays.model.Curso;

import java.util.*;

public class MetodosArraysObjetos {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Python", 30);
        Curso curso2 = new Curso("Java", 20);
        Curso curso3 = new Curso("C", 40);
        Curso curso4 = new Curso("Ruby", 50);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        System.out.println( cursos);
        cursos.sort(Comparator.comparing(Curso::getNombre));
        System.out.println(cursos);
        Collections.sort(cursos, Comparator.comparing(Curso::getTiempo));
        System.out.println(cursos);

        // Aqui estamos creando una lista con el el ArrayList anterior, estamos ordenando por
        // tiempo y filtrando para que ignora si encuentra "Ruby"
        List<Curso> nuevaListaCursos = cursos.stream().filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby")).sorted(Comparator.comparing(Curso::getTiempo).reversed()).toList();
        System.out.println("****************");
        System.out.println(nuevaListaCursos);

    }
}
