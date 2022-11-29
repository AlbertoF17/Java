package Practicas;

import java.util.Scanner;

public class RGBooleans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vas a usar TODO el bote rojo? ");
        boolean rojo = sc.nextBoolean();
        System.out.println("Vas a usar TODO el bote verde? ");
        boolean verde = sc.nextBoolean();
        System.out.println("Vas a usar TODO el bote azul? ");
        boolean azul = sc.nextBoolean();
        System.out.println("Vas a usar MEDIO bote rojo? ");
        boolean medioRojo = sc.nextBoolean();
        System.out.println("Vas a usar MEDIO bote verde? ");
        boolean medioVerde = sc.nextBoolean();
        System.out.println("Vas a usar MEDIO bote azul? ");
        boolean medioAzul = sc.nextBoolean();

        System.out.println("Se pintará el color rojo?: " + (rojo && !verde && !azul));
        System.out.println("Se pintará el color naranja?: " + (rojo && medioVerde && !azul));
        System.out.println("Se pintará el color violeta?: " + (rojo && !verde && azul && !medioRojo && medioVerde && !medioAzul));
/*
        S
        String color;
        if (rojo && verde && azul) {
            color = "blanco";
        } else if (!rojo && verde && azul) {
            color = "celeste";
        } else if (rojo && !verde && azul) {
            color = "fucsia";
        } else if (rojo && verde && !azul) {
            color = "amarillo";
        } else if (!rojo && !verde && azul) {
            color = "azul";
        } else if (!rojo && verde && !azul) {
            color = "verde";
        } else if (rojo && !verde && !azul) {
            color = "rojo";
        } else if (!rojo && !verde && !azul) {
            color = "negro";
        } else {
            color=null;
        }
        System.out.println("Has pintado de color " + color);*/


    }
}
