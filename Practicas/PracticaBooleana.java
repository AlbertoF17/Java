package Practicas;
import java.util.Scanner;
public class PracticaBooleana {
    public static void main(String[] args) {
        //Paso 1
        boolean predicado0, predicado1;

        //Paso 2
        predicado0 = false;
        predicado1 = true;

        //Paso 3
        System.out.println(	"Operador ! (NOT):"
                +"\n----------------------------------------"
                + "\nVerdadero: " + predicado1
                +"\nNo verdadero: " + !predicado1
                +"\nFalso: " + predicado0
                +"\nNo Falso: " + !predicado0
                +"\n----------------------------------------"
                +"\n\nOperador && (AND):"
                +"\n----------------------------------------"
                +"\nVerdadero y Falso: " + (predicado1 && predicado0)
                +"\nVerdadero y Verdadero: " + (predicado1 && predicado1)
                +"\nFalso y Falso: " + (predicado0 && predicado0)
                +"\nFalso y Verdadero: " + (predicado0 && predicado1)
                +"\n----------------------------------------"
                +"\n\nOperador || (OR):"
                +"\n----------------------------------------"
                +"\nVerdadero o Falso: " + (predicado1 || predicado0)
                +"\nVerdadero o Verdadero: " + (predicado1 || predicado1)
                +"\nFalso o Falso: " + (predicado0 || predicado0)
                +"\nFalso o Verdadero: " + (predicado0 || predicado1)
                +"\n\nOperador == (equal):"
                +"\n----------------------------------------"
                +"\n¿Verdadero = Falso?: " + (predicado1 == predicado0)
                +"\n¿Verdadero = Verdadero?: " + (predicado1 == predicado1)
                +"\n¿Falso = Falso?: " + (predicado0 == predicado0)
                +"\n¿Falso = Verdadero?: " + (predicado0 == predicado1)
                +"\n----------------------------------------"
                +"\n\nOperador != (not equal):"
                +"\n----------------------------------------"
                +"\n¿Verdadero distinto de Falso?: " + (predicado1 != predicado0)
                +"\n¿Verdadero distinto de Verdadero?: " + (predicado1 != predicado1)
                +"\n¿Falso distinto de Falso?: " + (predicado0 != predicado0)
                +"\n¿Falso distinto de Verdadero?: " + (predicado0 != predicado1)
                +"\n----------------------------------------");

        //Paso 4
        System.out.println(	"Operador && (AND):"
                +"\n----------------------------------------"
                +"\nNO( Verdadero y Falso ): " + !(predicado1 && predicado0)
                +"\nNO( Verdadero y Verdadero ): " + !(predicado1 && predicado1)
                +"\nNO( Falso y Falso ): " + !(predicado0 && predicado0)
                +"\nNO( Falso y Verdadero ): " + !(predicado0 && predicado1)
                +"\n----------------------------------------"
                +"\n\nOperador || (OR):"
                +"\n----------------------------------------"
                +"\nNO( Verdadero o Falso ): " + !(predicado1 || predicado0)
                +"\nNO( Verdadero o Verdadero ): " + !(predicado1 || predicado1)
                +"\nNO( Falso o Falso ): " + !(predicado0 || predicado0)
                +"\nNO( Falso o Verdadero ): " + !(predicado0 || predicado1)
                +"\n\nOperador == (equal):"
                +"\n----------------------------------------"
                +"\nNO( ¿Verdadero = Falso? ): " + !(predicado1 == predicado0)
                +"\nNO( ¿Verdadero = Verdadero? ): " + !(predicado1 == predicado1)
                +"\nNO( ¿Falso = Falso? ): " + !(predicado0 == predicado0)
                +"\nNO( ¿Falso = Verdadero? ): " + !(predicado0 == predicado1)
                +"\n----------------------------------------"
                +"\n\nOperador != (not equal):"
                +"\n----------------------------------------"
                +"\nNO( ¿Verdadero distinto de Falso? ): " + !(predicado1 != predicado0)
                +"\nNO( ¿Verdadero distinto de Verdadero? ): " + !(predicado1 != predicado1)
                +"\nNO( ¿Falso distinto de Falso? ): " + !(predicado0 != predicado0)
                +"\nNO( ¿Falso distinto de Verdadero? ): " + !(predicado0 != predicado1)
                +"\n----------------------------------------");

        //Paso 5
        System.out.println(	"Operador && (AND):"
                +"\n----------------------------------------"
                +"\nVerdadero y No Falso: " + (predicado1 && !predicado0)
                +"\nVerdadero y No Verdadero: " + (predicado1 && !predicado1)
                +"\nFalso y No Falso: " + (predicado0 && !predicado0)
                +"\nFalso y No Verdadero: " + (predicado0 && !predicado1)
                +"\n----------------------------------------"
                +"\n\nOperador || (OR):"
                +"\n----------------------------------------"
                +"\nVerdadero o No Falso: " + (predicado1 || !predicado0)
                +"\nVerdadero o No Verdadero: " + (predicado1 || !predicado1)
                +"\nFalso o No Falso: " + (predicado0 || !predicado0)
                +"\nFalso o No Verdadero: " + (predicado0 || !predicado1)
                +"\n\nOperador == (equal):"
                +"\n----------------------------------------"
                +"\n¿Verdadero = No Falso?: " + (predicado1 == !predicado0)
                +"\n¿Verdadero = No Verdadero?: " + (predicado1 == !predicado1)
                +"\n¿Falso = No Falso?: " + (predicado0 == !predicado0)
                +"\n¿Falso = No Verdadero?: " + (predicado0 == !predicado1)
                +"\n----------------------------------------"
                +"\n\nOperador != (not equal):"
                +"\n----------------------------------------"
                +"\n¿Verdadero distinto de No Falso?: " + (predicado1 != !predicado0)
                +"\n¿Verdadero distinto de No Verdadero?: " + (predicado1 != !predicado1)
                +"\n¿Falso distinto de No Falso?: " + (predicado0 != !predicado0)
                +"\n¿Falso distinto de No Verdadero?: " + (predicado0 != !predicado1)
                +"\n----------------------------------------");

        //Ejercicio Práctico:

        Scanner sc = new Scanner(System.in);
        boolean lloviendo, tareasTerminadas, irBiblioteca;

        System.out.print("Esta lloviendo?: ");
        lloviendo = sc.nextBoolean();
        System.out.print("Los deberes están terminados?: ");
        tareasTerminadas = sc.nextBoolean();
        System.out.print("Tienes que ir a la biblioteca?: ");
        irBiblioteca = sc.nextBoolean();

        System.out.println("\n\nPuedo salir a la calle?: " + ((!lloviendo && tareasTerminadas) || irBiblioteca) );
    }
}
