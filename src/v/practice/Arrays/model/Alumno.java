package v.practice.Arrays.model;

public class Alumno {
    private String nombre;
    private String codigo;

    public Alumno(String nombre, String codigo) {
        setNombre(nombre);
        setCodigo(codigo);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString(){
        return this.nombre;
    }

    @Override
    public boolean equals(Object obj) {
        Alumno alumno = (Alumno) obj;
        return this.getNombre().equals(alumno.getNombre());
    }
    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }
}
