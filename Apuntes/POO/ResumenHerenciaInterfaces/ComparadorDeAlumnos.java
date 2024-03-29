package Apuntes.POO.ResumenHerenciaInterfaces;

import java.util.Comparator;

public class ComparadorDeAlumnos implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Alumno a1 = (Alumno) o1;
        Alumno a2 = (Alumno) o2;
        return a1.getEdad() - a2.getEdad();
    }
}
