package Apuntes.Juego;

public class Alumno extends Persona{
    String nombre;
    String apellidos;

    public Alumno(String dni, String nombre, String apellidos) {
        super(dni);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}
