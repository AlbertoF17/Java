package Apuntes.Juego;

import java.util.Objects;

public class Persona implements Comparable {
    int edad;

    float altura;

    String dni;

    public Persona(String dni, int edad, float altura) {
        this.dni = dni;
        this.edad = edad;
        this.altura = altura;
    }

    @Override
    public int compareTo(Object o) {
        if (!(o instanceof Persona)){
            throw new IllegalArgumentException("El objeto introducido no es una instancia de la clase Persona");
        }
        Persona otra = (Persona) o;
        return this.dni.compareTo(otra.dni);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Persona)) {
            return false;
        }
        Persona al = (Persona) obj;
        return this.dni.equals(al.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni);
    }

    @Override
    public String toString() {
        return "Persona{" +
                "edad=" + edad +
                ", altura=" + altura +
                ", dni='" + dni + '\'' +
                '}';
    }
}
