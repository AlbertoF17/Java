package Practicas;
import java.util.Scanner;
import java.util.Random;

public class CorreTimmyParte2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int positionX = 1;
        int positionY = 1;

        int bombaX = rand.nextInt(2,19);
        int bombaY = rand.nextInt(2,19);
        int bombPosition;

        String paso;

        boolean fin = false;

        int dificultad;

        System.out.println("\n--- AYUDA A TIMMY A ESCAPAR DE LA MAZMORRA ---\n");

        do {
            System.out.print("Escoja un nivel de dificultad (Fácil -> 0  |  Medio -> 1  |  Dificil -> 2): ");
            dificultad = sc.nextInt();

        }while (dificultad<0 || dificultad>2);

        if (dificultad==0) {
            System.out.println("\nDificultad escogida: Fácil");
            do{
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (i == 0 || j == 0 || i == 20-1 || j == 20-1) {
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
            }while ((positionY!=19 && positionX!=19) && (positionY!=0 && positionX!=0) &&
                    (positionY!=18 || positionX!=18) && !fin);

        } else if (dificultad==1) {
            System.out.println("\nDificultad escogida: Medio");
            //En esta dificultad se añade una bomba estática en el mapa en una posición aleatoria
            bombaX = rand.nextInt(1,18);
            bombaY = rand.nextInt(1,18);
            do{
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (i == 0 || j == 0 || i == 20 - 1 || j == 20 - 1) {
                            System.out.print("* ");
                        } else if (i == bombaX && j == bombaY) {
                            System.out.print("0 ");
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
            }while ((positionY!=19 && positionX!=19) && (positionY!=0 && positionX!=0) && (positionY!=18 || positionX!=18)
                    && (positionX!=bombaX || positionY!=bombaY) && !fin);
        } else {
            System.out.println("\nDificultad escogida: Difícil");
            //En esta dificultad, la bomba se mueve siempre 1 movimiento alrededor de Timmy en cualquier dirección,
            //para que gran parte de las veces, esta misma le corte el paso (puede ser que la posición de la bomba
            //coincida con la posición de una de las trampas y, por tanto, la bomba se oculte en esta)
            do {
                bombPosition = rand.nextInt(1, 5);
                if (bombPosition == 1) {
                    bombaX = positionX - 1;
                    bombaY = positionY;
                } else if (bombPosition == 2) {
                    bombaX = positionX + 1;
                    bombaY = positionY;
                } else if (bombPosition == 3) {
                    bombaX = positionX;
                    bombaY = positionY - 1;
                } else {
                    bombaX = positionX;
                    bombaY = positionY + 1;
                }
                for (int i = 0; i < 20; i++) {
                    for (int j = 0; j < 20; j++) {
                        if (i == 0 || j == 0 || i == 20 - 1 || j == 20 - 1) {
                            System.out.print("* ");
                        } else if (i == bombaX && j == bombaY) {
                            System.out.print("0 ");
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
            } while ((positionY != 19 && positionX != 19) && (positionY != 0 && positionX != 0) &&
                    (positionY != 18 || positionX != 18) && (positionX != bombaX || positionY != bombaY) && !fin);
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
            } else if (positionY==bombaY && positionX==bombaX) {
                System.out.println("\n0-----------------------------------------0");
                System.out.println("|-----------------------------------------|");
                System.out.println("|------[  Timmy voló en pedacitos  ]------|");
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