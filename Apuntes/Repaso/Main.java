package Apuntes.Repaso;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        /*
        Alumno al1 = new Alumno("23498463R", "Juan", "Perez Gomez");
        Alumno al2 = new Alumno("32497773M", "Maria", "Munoz Fernandez");
        Alumno al3 = new Alumno("32497773M", "Maria", "Munoz Fernandez");
        System.out.println("***referencia***");
        System.out.println(al1); //imprime referencia al no tener toString
        System.out.println("***listas***");
        List<Alumno> listaAlumnos = new ArrayList<>();
        listaAlumnos.add(al1);
        listaAlumnos.add(al2);
        //listaAlumnos.add(al3);
        System.out.println("***contains***");
        System.out.println(listaAlumnos.contains(al1));
        System.out.println(listaAlumnos.contains(al3)); //da true pq al3 == al2
        System.out.println("***equals***");
        System.out.println(al1.equals(al2));
        System.out.println(al3.equals(al2));
        Scanner scan = new Scanner(System.in);
        System.out.println(al1.equals(scan));
        System.out.println("***instanceof***");
        Object obj1 = scan;
        Object obj2 = al1;
        System.out.println(obj1.equals(obj2));
        System.out.println(obj1 instanceof Alumno);
        System.out.println(obj1 instanceof Scanner);
        System.out.println(obj2 instanceof Alumno);
        System.out.println("***hashCode***");
        System.out.println(al2.hashCode());
        System.out.println(al3.hashCode());
        System.out.println("***clone***");
        try {
            System.out.println(al1.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        */
    }
    public static boolean esRectangular(int[][] matriz){
        if (matriz.length > 0){
            int anchura = matriz[0].length;
            for (int[]row : matriz) {
                if (row.length != anchura){
                    return false;
                }
            }
            return true;
        } else {
            throw new NullPointerException();
            //Podemos ignorar la validación y hacer que devuelva verdadero igual
        }
    }
    public static boolean esMatrizRectangular(int[][] matriz){
        if (matriz.length > 0){
            for (int i = 0; i < matriz.length-1; i++) {
                if (matriz[i].length != matriz[i+1].length){
                    return false;
                }
            }
            return true;
        } else {
            throw new NullPointerException();
            //Podemos ignorar la validación y hacer que devuelva verdadero igual
        }
    }
}
