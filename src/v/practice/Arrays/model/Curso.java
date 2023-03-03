package v.practice.Arrays.model;

import java.util.*;

public class Curso {
    private String nombre;
    private int tiempo;
    private List<Aula> aulaList = new LinkedList<>();
    private Collection<Alumno> alumnos = new HashSet<>();
    //    private Collection<Alumno> alumnos = new LinkedHashSet<>();
    private Map<String, Alumno> alumnoMap = new HashMap<>();
    //private Map<String, Alumno> alumnoMap = new LinkedHashMap<>();


    public Curso(String nombre, int tiempo) {
        setNombre(nombre);
        setTiempo(tiempo);
    }

    public Curso(String nombre, int tiempo, List<Aula> list) {
        setNombre(nombre);
        setTiempo(tiempo);
        setClaseList(list);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public List<Aula> getAulaList() {
        return Collections.unmodifiableList(aulaList);
    }

    public void setClaseList(List<Aula> aulaList) {
        this.aulaList = aulaList;
    }

    public void addAula(Aula aula) {
        this.aulaList.add(aula);
    }

    public void addAlumno(Alumno alumno) {
        this.alumnos.add(alumno);
        this.alumnoMap.put(alumno.getCodigo(), alumno);
    }

    public boolean verificaAlumno(Alumno alumno) {
        return this.alumnos.contains(alumno);
    }

    public Collection<Alumno> getAlumnos() {
        return alumnos;
    }

    public Map<String, Alumno> getAlumnoMap() {
        return alumnoMap;
    }

    @Override
    public String toString() {
        return this.nombre;
    }
}
