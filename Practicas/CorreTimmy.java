package Practicas;
import java.util.Scanner;
public class CorreTimmy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positionX = 1;
        int positionY = 1;
        String paso;
        boolean fin = false;
        System.out.println("\n--- AYUDA A TIMMY A ESCAPAR DEL LABERINTO ---\n");

        while((positionY!=19 && positionX!=19) && (positionY!=0 && positionX!=0) &&
                (positionY!=18 || positionX!=18) && !fin){
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < 20; j++) {
                    if (i == 0 || j == 0 || i == 20 - 1 || j == 20 - 1) {
                        System.out.print("* ");
                    } else if (i == positionX && j == positionY) {
                        System.out.print("T ");
                    } else if (i == 18 && j == 18) {
                        System.out.print("H ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }

            System.out.print("¿Siguiente paso? ");
            paso = sc.next();
            switch (paso) {
                case "w":
                    positionX--;
                    break;
                case "d":
                    positionY++;
                    break;
                case "s":
                    positionX++;
                    break;
                case "STOP":
                case "stop":
                case "Stop":
                    fin = true;
                    break;
                default:
                    positionY--;
                    break;
            }
        }

        System.out.println("\n* * * *   RESULTADO DE LA PARTIDA   * * * *");
        if (fin) {
            System.out.println("\n0-----------------------------------------------------------------------------0");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("|-----[  Has finalizado el juego y Timmy quedará atrapado para siempre  ]-----|");
            System.out.println("|-----------------------------------------------------------------------------|");
            System.out.println("0-----------------------------------------------------------------------------0");
        } else {
            if (positionY==18 && positionX==18) {
                System.out.println("\n0-----------------------------------------0");
                System.out.println("|-----------------------------------------|");
                System.out.println("|------[  ¡¡HAS SALVADO A TIMMY!!  ]------|");
                System.out.println("|-----------------------------------------|");
                System.out.println("0-----------------------------------------0");
            } else {
                System.out.println("\n0-----------------------------------------0");
                System.out.println("|-----------------------------------------|");
                System.out.println("|--------[  Timmy ha muerto...  ]---------|");
                System.out.println("|-----------------------------------------|");
                System.out.println("0-----------------------------------------0");
            }
            System.out.println();
        }
    }
}