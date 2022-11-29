package Boletines;

import java.util.Scanner;

public class Bucles4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Leer un número entero (suponemos que es mayor que cero) e imprimir por pantalla
        //los primeros números positivos empezando desde 1 y terminando en el número
        System.out.println("Ejercicio 1:");
        System.out.print("Introduce un numero: ");
        int num1 = sc.nextInt();
        for (int i=1; i<=num1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        //2. Leer un número entero (suponemos que es mayor que cero) e imprimir por pantalla
        //los primeros números pares positivos
        System.out.println("Ejercicio 2:");
        System.out.print("Introduce un numero: ");
        int num2 = sc.nextInt();
        for (int i=1, n = 2; i<=num2; i++, n+=2) {
            System.out.print(n + " ");
        }
        System.out.println();

        //3. Leer un número entero (suponemos que es mayor que cero) e imprimir por pantalla
        //los primeros números impares positivos
        System.out.println("Ejercicio 3:");
        System.out.print("Introduce un numero: ");
        int num3 = sc.nextInt();
        for (int i=1, n = 1; i<=num3; i++, n+=2) {
            System.out.print(n + " ");
        }
        System.out.println();

        //4. Leer un número positivo y generar los n primeros números de la sucesión 3n+2
        System.out.println("Ejercicio 4:");
        System.out.print("Introduce un numero: ");
        int num4 = sc.nextInt();
        for (int i=0; i<num4; i++) {
            System.out.print((3*i+2) + " ");
        }
        System.out.println();

        //5. Crear un programa que genere la sucesión 2,4,8,16,32,64,...
        System.out.println("Ejercicio 5:");
        System.out.print("Introduce un numero: ");
        int num5 = sc.nextInt();
        int suma1 = 0;
        for (int i=0, n=2; i<num5; i++, n*=2) {
            System.out.print(n + " ");
            suma1 = suma1 + n;
        }
        System.out.println("\nLa suma de la sucesión es: " + suma1);
        System.out.println();

        //6. Crear un programa que genere la sucesión 8,15,22,29,36,...
        System.out.println("Ejercicio 5:");
        System.out.print("Introduce un numero: ");
        int num6 = sc.nextInt();
        int suma2 = 0;
        for (int i=0, n=0; i<num6; i++, n++) {
            int formula2 = (7*n+8);
            System.out.print(formula2 + " ");
            suma2 = suma2 + formula2;
        }
        System.out.println("\nLa suma de la sucesión es: " + suma2);
        System.out.println();

        //7. Modificar los ejercicios anteriores para que en lugar de imprimir la sucesión de los
        //'n' primeros términos, imprima la suma de la sucesión de los 'n' primeros términos.
        System.out.println("Realizado e implementado en los ejercicios anteriores\n");
    }
}
