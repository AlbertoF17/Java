package Practicas.Password;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Ahora, crea una clase clase ejecutable:
        // Crea un array de Passwords con el tamaño que tú le indiques por
        //teclado.
        System.out.print("Indica la longitud del array de Passwords: ");
        int longArray = sc.nextInt();
        Password[] arrayPass = new Password[longArray];
        // Indica también por teclado la longitud de los Passwords (antes de
        //bucle).
        System.out.print("Indica la longitud de los Passwords: ");
        int longitud = sc.nextInt();
        // Crea un bucle que cree un objeto para cada posición del array.
        for (int i = 0; i < arrayPass.length; i++) {
            Password p1 = new Password(longitud);
            arrayPass[i] = p1;
        }
        // Crea otro array de booleanos donde se almacene si el password
        //del array de Password es o no fuerte (usa el bucle anterior).
        boolean[] arrayFuertes = new boolean[longArray];
        for (int i = 0; i < arrayFuertes.length; i++) {
            arrayFuertes[i] = arrayPass[i].esFuerte();
        }
        // Al final, muestra la contraseña y si es o no fuerte (usa el bucle
        //anterior). Usa este simple formato:
        //contraseña1 valor_booleano1
        //contraseña2 valor_bololeano2
        for (int i = 0; i < arrayPass.length; i++) {
            System.out.println(arrayPass[i] + " " + arrayFuertes[i]);
        }
    }
}
