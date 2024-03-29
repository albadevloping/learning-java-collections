import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
    private Integer nota;

    public Alumno(String nombre, Integer  nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", nota=" + nota +
                '}';
    }

    @Override
    public int compareTo(Alumno a) {
        //para evitar una excepción
        if(this.nombre == null){
            return 0;
        }
        return this.nombre.compareTo(a.nombre);
        //COMO LA NOTA ES UN PRIMITIVO DEBO HACER LO SIGUIENTE
        //if(this.nota == a.nota){
        //      return 0;
        //}
        //if(this.nota > a.nota){
        //      return 1;
        //}else if(this.nota < a.nota){
        //      return -1;
        //}
        //      return -1;

    }

    // Comparar referencias distintas pero con el mismo valor
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        //si quitas nota solo va a comparar por nombre
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    public int hashCode() {
        //si quitas nota solo va a comparar por nombre
        return Objects.hash(nombre, nota);
    }
}
