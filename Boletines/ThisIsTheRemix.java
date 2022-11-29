package Boletines;

import java.util.Scanner;

public class ThisIsTheRemix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Elegir dos ejercicios de los tres siguientes:

        //Ejercicio 1: Leer por pantalla el año de nacimiento de una persona, forzando
        //al usuario que introduzca un año entre 1930 y 2010.
        //Tras ello imprima a qué generación pertenece el usuario:
        //Niños de la postguerra (1930-1948)
        //Baby boom (1949-1968)
        //Generación X (1969-1980)
        //Millennials (1981-1993)
        //Generación Z (1994-2010)
        System.out.println("Ejercicio 1: ");

        int nacimiento;
        do{
            System.out.print("Introduce tu año de nacimiento: ");
            nacimiento = sc.nextInt();
        }while(nacimiento<1930 && nacimiento>2010);
        if(nacimiento>=1930 && nacimiento<=1948){
            System.out.println("Perteneces a la generación de los Niños de la postguerra");
        } else if (nacimiento>=1949 && nacimiento<=1968){
            System.out.println("Perteneces a la generación del Baby boom");
        } else if (nacimiento>=1969 && nacimiento<=1980){
            System.out.println("Perteneces a la Generación X");
        } else if (nacimiento>=1969 && nacimiento<=1980) {
            System.out.println("Perteneces a la generación Millennial");
        } else {
            System.out.println("Perteneces a la Generación Z");
        }
        System.out.println();

        //Ejercicio 2: Leer por pantalla un número entero entre 1 y 21, forzando
        //al usuario que introduzca un número en ese rango. Dicho número representa un
        //siglo, por lo que tras comprobar lo anterior, debe pasarlo al número de
        //años correspondiente e imprimirlo por pantalla.
        //Por ejemplo, para el siglo 1 debe imprimirse año 0,
        //para el siglo 2 debe imprimirse: año 100,
        //para el siglo 3 debe imprimirse: año 200,
        //...,
        //para el siglo 19 debe imprimirse: año 1800,
        //para el siglo 20 debe imprimirse: año 1900,
        //para el siglo 21 debe imprimirse: año 2000.
        System.out.println("Ejercicio 2: ");

        int siglo;
        do{
            System.out.print("Introduce tu siglo de nacimiento: ");
            siglo = sc.nextInt();
        }while(siglo<1 && siglo>21);

        System.out.println("Año " + ((siglo-1)*100));

        //Ejercicio 3: leer por pantalla un número entero positivo mayor que 1
        //(suponga que el usuario mete un número válido de estas características)
        //y compruebe si es una potencia de 2, es decir si el número puede expresarse
        //como un producto del número 2 únicamente.
        //Por ejemplo:
        //16 es una potencia de 2 porque 2*2*2*2=16
        //64 es una potencia de 2 porque 2*2*2*2*2*2=64
        //6 no es una potencia de 2 porque 2*3=6 no cumple debido al 3
        System.out.println("Ejercicio 3: ");
        int num;
        int pot = 2;
        int veces = 0;

        do{
            System.out.print("Introduce un numero: ");
            num = sc.nextInt();
        }while(num<1);

        while (num>pot){
            pot *= 2;
            veces++;
        }
        if (num==pot){
            System.out.print("Es una potencia de 2, porque ");
            for (int i = 0; i<=(veces - 1); i++) {
                System.out.print("2*");
            }
            System.out.println("2=" + num);
        } else {
            System.out.println("NO es una potencia de 2");
        }
    }
}
