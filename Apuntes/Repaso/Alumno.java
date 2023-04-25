package Apuntes.Repaso;

public class Alumno implements Cloneable{
    private String dni;
    private String nombre;
    private String apellidos;

    public Alumno(String dni, String nombre, String apellidos) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null){
            return false;
        }
        if(!(obj instanceof Alumno)){
            return false;
        }
        Alumno al = (Alumno) obj;
        return this.dni.equals(al.dni);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(dni); //válido para más de un criterio
        return dni.hashCode(); //válido para un sólo criterio
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}