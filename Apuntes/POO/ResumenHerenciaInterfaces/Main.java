package Apuntes.POO.ResumenHerenciaInterfaces;

import javax.naming.OperationNotSupportedException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Alumno a1;
        try {
            a1 = new Alumno(null, 24, "12345670C");
        } catch (IllegalArgumentException e) {
            mostrarError(e,"Se creará el alumno Maria 24 12345670C");
            a1 = new Alumno("Maria", 24, "12345670C");
        }

        try {
            a1.setNombre(null);
        } catch (IllegalArgumentException e) {
            mostrarError(e,"");
        }

        a1.preguntarSinHaberLeido();

        Alumno a2;
        try {
            a2 = new Alumno("Alicia", -5, "12345679B");
        } catch (IllegalArgumentException e) {
            mostrarError(e,"Se creará el alumno Alicia 18 12345679B");
            a2 = new Alumno("Alicia", 18, "12345679B");
        }

        try {
            a2.setEdad(-5);
        } catch (IllegalArgumentException e) {
            mostrarError(e,"");
        }

        try {
            a2.hacerUnaGracia();
        } catch (OperationNotSupportedException e) {
            mostrarError(e,"");
        }

        System.out.println("Son iguales a1 y a2?: " + a1.equals(a2));

        AlumnoPelota a3;
        try {
            a3 = new AlumnoPelota("Alberto", 23, null);
        } catch (IllegalArgumentException e) {
            mostrarError(e,"Se creará el alumno Alberto 23 12345678A");
            a3 = new AlumnoPelota("Alberto", 23, "12345678A");
        }

        try {
            a3.setDni("12345678");
        } catch (IllegalArgumentException e) {
            mostrarError(e,"");
        }

        try {
            a3.setDni("ABCDEFGH1");
        } catch (IllegalArgumentException e) {
            mostrarError(e,"");
        }

        try {
            a3.setDni("123456789");
        } catch (IllegalArgumentException e) {
            mostrarError(e,"");
        }

        a3.preguntarSinHaberLeido();
        a3.pelotear();

	try {
            a3.hacerUnaGracia();
        } catch (OperationNotSupportedException e) {
            mostrarError(e,"");
        }

        Alumno a4;
        try {
            a4 = (Alumno) a1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Tienen la misma referencia a1 y a4?: " + (a1 == a4));
        System.out.println("Son iguales a1 y a4? (Tienen mismo DNI?): " + a1.equals(a4));

        Alumno[] alumnos = {a1,a2,a3};

        System.out.println("---------------------------------");
        System.out.println("Orden tal y como se ha creado:");
        imprimirArray(alumnos);
        System.out.println("---------------------------------");
        System.out.println("Orden del compareTo:");
        Arrays.sort(alumnos);
        imprimirArray(alumnos);
        System.out.println("---------------------------------");
        System.out.println("Tiene sentido ya que a3.compareTo(a2): " + a3.compareTo(a2));
        System.out.println("---------------------------------");
        System.out.println("Orden del compare:");
        ComparadorDeAlumnos comp = new ComparadorDeAlumnos();
        Arrays.sort(alumnos, comp);
        imprimirArray(alumnos);
        System.out.println("---------------------------------");
        System.out.println("Tiene sentido ya que comp.compare(a2,a3): " + comp.compare(a2,a3));
        System.out.println("---------------------------------");
    }

    public static void imprimirArray(Object[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("indice " + i + ": " + array[i]);
        }
    }

    public static void mostrarError(Exception e, String mensaje) {
        System.out.println("\u001B[31m" + e.toString() + " " + mensaje + "\u001B[0m");
    }
}