package Apuntes.Juego;

public class Persona implements Comparable {
    String dni;

    public Persona(String dni) {
        this.dni = dni;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Persona)){
            throw new IllegalArgumentException("El objeto introducido no es una instancia de la clase Persona");
        }
        Persona otra = (Persona) o;
        return this.dni.compareTo(otra.dni);
    }
}
