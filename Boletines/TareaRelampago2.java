package Boletines;

import java.util.Scanner;

public class TareaRelampago2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("EJERCICIO 13");
        System.out.print("Introduzca la primera cadena: ");
        String primera = sc.nextLine();
        System.out.print("Introduzca la segunda cadena: ");
        String segunda = sc.nextLine();
        int orden = primera.compareTo(segunda);
        if (orden>0){
            System.out.println("La segunda va antes");
        } else if (orden<0) {
            System.out.println("La primera va antes");
        } else {
            System.out.println("Son iguales");
        }
        System.out.println();
    }
}
