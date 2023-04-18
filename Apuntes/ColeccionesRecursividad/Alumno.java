package Apuntes.ColeccionesRecursividad;

import java.util.Objects;

public class Alumno implements Comparable{
    String nombre;

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre);
    }

    @Override
    public int compareTo(Object o) {
        Alumno a = (Alumno) o;
        return nombre.compareTo(a.nombre);
    }
}
