package Practicas.Debugger;

import java.util.Arrays;

public class AlumnoErrores {
    String nombre;
    float[] notas;

    public AlumnoErrores(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
        notas = new float[0];
    }

    public AlumnoErrores(String nombre, float[] notas) {
        validarNombre(nombre);
        this.nombre = nombre;
        validarNotas(notas);
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public float[] getNotas() {
        return notas;
    }

    private void validarNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("No se admiten nombres nulos.");
        }

        if (nombre.isBlank()) {
            throw new IllegalArgumentException("No se admiten nombres vacios.");
        }
    }

    private void validarNotas(float[] notas) {
        if (notas == null) {
            throw new IllegalArgumentException("No se admiten arrays nulos.");
        }
    }

    @Override
    public String toString() {
        return "AlumnoErrores{" +
                "nombre='" + nombre + '\'' +
                ", notas=" + Arrays.toString(notas) +
                '}';
    }

    public void publicarNota(float nota) {
        if (nota < 0 || nota > 10) {
            throw new IllegalArgumentException("Las notas deben ser un rango entre 0 y 10");
        }
        float[] newNotas = new float[notas.length+1];
        for (int i = 0; i < notas.length; i++) {
            newNotas[i] = notas[i];
        }
        newNotas[notas.length] = nota;
        notas = newNotas;
    }

    public void eliminarNota(int n) {
        if (n < 0 || n > notas.length) {
            throw new IllegalArgumentException("No existe nota con ese indice.");
        }
        float[] newNotas = new float[notas.length-1];
        for (int i = 0; i < newNotas.length; i++) {
            if (i<n) {
                newNotas[i] = notas[i];
            } else if (i>=n) {
                newNotas[i] = notas[i+1];
            }
        }
        notas = newNotas;
    }

    public void editarNota(int n, float nota) {
        if (notas.length <= n) {
            throw new IllegalArgumentException("No existe nota con ese indice.");
        }
        if (nota <= 0) {
            throw new IllegalArgumentException("Las notas deben ser un rango entre 0 y 10");
        }
        notas[n] = nota;
    }
}
