package Practicas;

import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ahorcado");
        System.out.print("Nombre del jugador 1: ");
        String jugador1 = sc.nextLine();
        System.out.print("Nombre del jugador 2: ");
        String jugador2 = sc.nextLine();
        System.out.println(jugador1 + ", escriba una palabra/frase (no la puedes ver " + jugador2 + "): ");
        String palabra = sc.nextLine();
        System.out.print("Escribe el número de fallos que permites que " + jugador2 + " pueda tener para intentar" +
                " adivinar la palabra: ");
        int fallos = sc.nextInt();

        System.out.println();
        System.out.println("QUE EMPIECE EL JUEGO");

        String palabraFinal = "";
        String palabraNueva = "";
        for (int i = 0; i<palabra.length(); i++){
            if (String.valueOf(palabra.charAt(i)).equals(" ")){
                palabraFinal += "  ";
            } else {
                palabraFinal += "_ ";
            }
        }
        System.out.println(palabraFinal);
        for(int i = 0; i< palabra.length(); i++){
            palabraNueva += palabra.charAt(i) + " ";
        }
        sc.nextLine();

        do{
            System.out.println("¿Qué letra vas a escojer?");
            String respuesta = sc.nextLine();

            while (respuesta.length()!=1){
                System.out.print("La respuesta debe ser 1 solo carácter, introdúzcalo de nuevo: ");
                respuesta = sc.nextLine();
            }

            for (int i = 0; i<palabraNueva.length(); i+=2){
                if (respuesta.charAt(0)==(palabraNueva.charAt(i))){
                    //palabraFinal = palabraFinal.replace(palabraFinal.charAt(i), respuesta.charAt(0));
                    //ME CAMBIA TODAS, HAY ALGUNA FORMA DE SUSTITUIR SOLO EL DE UN INDICE DETERMINADO?
                }
            }
            System.out.println(palabraFinal);

        }while (palabraFinal.indexOf("_")>=0 && fallos>0);

        if (palabraFinal.indexOf("_")<0) {
            System.out.println("GANASTE " + jugador2.toUpperCase() + "!");
        }else {
            System.out.println("Has perdido, otra vez será...");
        }

    }
}
