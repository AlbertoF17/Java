package Practicas.RecuEv2;

import java.util.Scanner;

public class CentroAcademico {
    Scanner sc = new Scanner(System.in);
    private Alumno[] alumnos;
    private Asignatura[] asignaturas;
    int ultimaValida;
    int ultimaValida2;

    public CentroAcademico() {
        alumnos = new Alumno[100];
        asignaturas = new Asignatura[100];
        ultimaValida = 0;
        ultimaValida2 = 0;
    }

    public boolean crearAlumno(){
        System.out.print("Introduce el DNI: ");
        String dni = sc.nextLine();
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getDni().equals(dni)){
                System.out.println("Ya existe un alumno con ese DNI");
                return false;
            }
        }
        System.out.println("Nombre");
        String nombre = sc.nextLine();
        System.out.println("Apellido");
        String apellido = sc.nextLine();
        Alumno al = new Alumno(dni, nombre, apellido);
        alumnos[ultimaValida] = al;
        ultimaValida++;
        return true;
    }
}
