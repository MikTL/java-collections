package v.practice.Arrays;

import v.practice.Arrays.model.Curso;

import java.util.ArrayList;

public class ArraysObjetosCursos {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Geometría", 30);
        Curso curso2 = new Curso("Cálculo", 20);
        Curso curso3 = new Curso("Quimica", 40);
        Curso curso4 = new Curso("Historia", 30);

        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println( cursos);
    }
}
