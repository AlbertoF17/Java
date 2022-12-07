package Practicas;

import java.util.Scanner;

public class Ejercicio2Examen1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("EJERCICIO 2");

        System.out.print("x: ");
        int x = sc.nextInt();
        System.out.print("y: ");
        int y = sc.nextInt();

        int contador = 0;

        for (int i = 0; i <= x; i++) {
            for (int j = 0; j <= y; j++) {
                System.out.printf("(%d, %d) \n", i, j);
                contador++;
            }
            System.out.println("\n");
        }

        System.out.println("Se ha ejecutado " + contador + " veces");

    }


}
