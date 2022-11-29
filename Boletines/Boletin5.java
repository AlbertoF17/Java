package Boletines;

import java.util.Scanner;

public class Boletin5 {
    public static void main(String[] args) {
        //1. Lea por pantalla dos números enteros y almacene en una variable el resultado
        //de comprobar si el primero es superior al segundo multiplicado por dos.
        Scanner lector = new Scanner(System.in);
        System.out.println("***Ejercicio 1***");
        System.out.print("Introduzca un numero: ");
        int x = lector.nextInt();
        System.out.print("Introduzca un segundo numero: ");
        int y = lector.nextInt();
        boolean resultado = x>(y*2);
        System.out.println("El primero es superior al segundo multiplicado por dos? " + resultado);
        System.out.println();

        //2. Lea por pantalla una edad y almacene en una variable el resultado de comprobar
        //si es mayor de edad.
        System.out.println("***Ejercicio 2***");
        System.out.print("Introduzca un numero: ");
        int edad = lector.nextInt();
        boolean mayoria = edad>=18;
        System.out.println("Es mayor de edad? " + mayoria);
        System.out.println();

        //3. Repita pero comprobando si es menor de edad.
        System.out.println("***Ejercicio 3***");
        boolean minoria = edad<18;
        System.out.println("Es menor de edad? " + minoria);
        System.out.println();

        //4. Lea por pantalla un número entero y almacene en una variable el resultado
        //de comprobar si es par.
        System.out.println("***Ejercicio 4***");
        System.out.print("Introduzca un numero: ");
        int par = lector.nextInt();
        boolean esPar = par%2==0;
        System.out.println("Es par? " + esPar);
        System.out.println();

        //5. Repita pero comprobando si es impar.
        System.out.println("***Ejercicio 5***");
        boolean esImpar = par%2!=0;
        System.out.println("Es impar? " + esImpar);
        System.out.println();

        //6. Lea por pantalla un número y compruebe si está comprendido entre 0 y 100,
        //ambos incluidos.
        System.out.println("***Ejercicio 6***");
        System.out.print("Introduzca un numero: ");
        int numero1 = lector.nextInt();
        boolean comp1 = numero1>=0 && numero1<=100;
        System.out.println("Esta comprendido entre 0 y 100? " + comp1);
        System.out.println();

        //7. Lea por pantalla un número y compruebe si es positivo y además impar.
        System.out.println("***Ejercicio 7***");
        System.out.print("Introduzca un numero: ");
        int numero2 = lector.nextInt();
        boolean comp2 = numero2>0 && numero2%2!=0;
        System.out.println("Es positivo e impar? " + comp2);
        System.out.println();

        //8. Lea por pantalla un número entero y compruebe si es el 3, el 7 o el 9.
        System.out.println("***Ejercicio 8***");
        System.out.print("Introduzca un numero: ");
        int numero3 = lector.nextInt();
        boolean comp3 = numero3==3 || numero3==7 || numero3==9;
        System.out.println("Es 3, 7 o 9? " + comp3 + " (es " + numero3 + ")");

    }
}
