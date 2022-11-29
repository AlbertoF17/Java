package Practicas;

import java.util.Random;
import java.util.Scanner;

public class Adivina {
    public static void main(String[] args) {
        /*Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a 'ADIVINA'");
        System.out.print("Estoy pensando en un número del 1 al 100, ¿cuál crees que es? ");
        int numR = rand.nextInt(0,101);
        int num;
        int cont = 0;
        do{
            num = sc.nextInt();
            System.out.println();
            if (num > numR) {
                System.out.print("El número tiene que ser menor, inténtalo de nuevo: ");
            } else if (num < numR) {
                System.out.print("El número tiene que ser mayor, inténtalo de nuevo: ");
            }
            cont++;

        }while(num!=numR);

        System.out.println("\nHAS ACERTADO!! Y sólo has necesitado " + cont + " intentos!");
        //Expresión utilizada de manera sarcástica cuando se hayan necesitado muchos intentos*/
        int edad=38, peso = 75;
        float altura=1.8f;

        System.out.printf("El usuario tiene %d anos de edad, mide %f metros y pesa %d kilos", edad, altura, peso);
        System.out.println();
        System.out.printf("%.2f", 3.4856394);
        System.out.println();
        System.out.printf("%.4f", 3.24502450);
    }

}