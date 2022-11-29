package Practicas;

import java.util.Random;
import java.util.Scanner;

public class Dados {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int cont=1;
        String juego;
        boolean juegoBool = false;
        do{
            System.out.print("Jugador 1, introduzca su nombre: ");
            String persona1 = sc.next();

            System.out.print("Jugador 2, introduzca su nombre: ");
            String persona2 = sc.next();

            int vida1 = rand.nextInt(1,31);
            int vida2 = rand.nextInt(1,31);

            while (vida1>0 && vida2>0){
                System.out.println();
                System.out.println("*******************************");
                System.out.println("RONDA " + cont);
                System.out.println("*******************************");
                System.out.println();
                Thread.sleep(2000);
                System.out.println("○○○○○○○○○○○○○○○○○○○○○○○○");
                System.out.println("Salud:");
                System.out.println();
                System.out.println(persona1 + ": ");
                for (int i = vida1; i>0; i--){
                    System.out.print("♥");
                }
                System.out.println();
                System.out.println("----------------------------");

                System.out.println(persona2 + ": ");
                for (int i = vida2; i>0; i--){
                    System.out.print("♥");
                }
                System.out.println();
                System.out.println("○○○○○○○○○○○○○○○○○○○○○○○○");
                Thread.sleep(2000);
                System.out.println();

                System.out.println("*******************************");
                int dado1 = rand.nextInt(1,7);
                System.out.println("El número del dado de " + persona1 + " es: " + dado1);

                int dado2 = rand.nextInt(1,7);
                System.out.println("El número del dado de " + persona2 + " es: " + dado2);
                System.out.println("*******************************");
                System.out.println();

                Thread.sleep(2000);
                System.out.println("↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓");
                if (dado1<dado2) {
                    vida1 = vida1-(dado2-dado1);
                    System.out.println(persona2 + " gana la ronda, " + persona1 + " ahora tiene " + vida1 + " puntos de vida");
                } else if(dado1>dado2) {
                    vida2 = vida2-(dado1-dado2);
                    System.out.println(persona1 + " gana la ronda, " + persona2 + " ahora tiene " + vida2 + " puntos de vida");
                } else {
                    System.out.println("Ha sido empate, ningún jugador pierde vida");
                }
                System.out.println("↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑");
                Thread.sleep(2000);
                cont++;
            }
            System.out.println();
            System.out.println("○------------------------------------○");
            if (vida1<=0){
                System.out.println("\uD83D\uDCA5 \uD83D\uDCA5" + persona1 + " ha muerto" + "\uD83D\uDCA5 \uD83D\uDCA5");
            } else if(vida2<=0) {
                System.out.println("\uD83D\uDCA5 \uD83D\uDCA5" + persona2 + " ha muerto" + "\uD83D\uDCA5 \uD83D\uDCA5");
            }
            System.out.println("○------------------------------------○");
            System.out.println();
            System.out.println("¿Deseas volver a jugar?");
            juego = sc.next();
            if (juego.equalsIgnoreCase("si")) {
                juegoBool = true;
                cont = 1;
            } else {
                juegoBool = false;
            }
        } while (juegoBool);


    }
}
