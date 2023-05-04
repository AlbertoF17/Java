package Apuntes.Juego;

public class Alumno extends Persona{
    String nombre;
    String apellidos;

    public Alumno(String dni, String nombre, String apellidos, int edad, float altura) {
        super(dni, edad, altura);
        this.nombre = nombre;
        this.apellidos = apellidos;
    }
}
