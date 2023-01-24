package Boletines;

import java.util.Random;
import java.util.Scanner;

public class Arrays2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("PARTE A");
        //PARTE A
        //
        //Partiendo de la siguiente matriz haga los siguientes ejercicios:
        //0 0 0
        //0 0 0
        //0 0 0
        int[][] array = new int[3][3];
        //1. Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        //modificarla completamente imprímela por pantalla sin utilizar bucles:
        //1 1 1
        //0 0 0
        //0 0 0
        System.out.println("EJERCICIO 1");
        array[0][0] = 1;
        array[0][1] = 1;
        array[0][2] = 1;
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);
        System.out.println(array[2][0] + " " + array[2][1] + " " + array[2][2]);
        System.out.println();

        //2. Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        //modificarla completamente imprímela por pantalla sin utilizar bucles:
        //1 0 0
        //1 0 0
        //1 0 0
        System.out.println("EJERCICIO 2");
        array[0][0] = 1;
        array[0][1] = 0;
        array[0][2] = 0;
        array[1][0] = 1;
        array[2][0] = 1;
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);
        System.out.println(array[2][0] + " " + array[2][1] + " " + array[2][2]);
        System.out.println();

        //3. Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        //modificarla completamente imprímela por pantalla sin utilizar bucles:
        //0 0 0
        //0 0 0
        //1 1 1
        System.out.println("EJERCICIO 3");
        array[2][0] = 1;
        array[2][1] = 1;
        array[2][2] = 1;
        array[1][0] = 0;
        array[0][0] = 0;
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);
        System.out.println(array[2][0] + " " + array[2][1] + " " + array[2][2]);
        System.out.println();

        //4. Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        //modificarla completamente imprímela por pantalla sin utilizar bucles:
        //0 0 1
        //0 0 1
        //0 0 1
        System.out.println("EJERCICIO 4");
        array[0][2] = 1;
        array[1][2] = 1;
        array[2][2] = 1;
        array[2][0] = 0;
        array[2][1] = 0;
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);
        System.out.println(array[2][0] + " " + array[2][1] + " " + array[2][2]);
        System.out.println();

        //5. Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        //modificarla completamente imprímela por pantalla sin utilizar bucles:
        //1 0 0
        //0 1 0
        //0 0 1
        System.out.println("EJERCICIO 5");
        array[0][2] = 0;
        array[1][2] = 0;
        array[2][2] = 1;
        array[1][1] = 1;
        array[0][0] = 1;
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);
        System.out.println(array[2][0] + " " + array[2][1] + " " + array[2][2]);
        System.out.println();
        //6. Modifica la matriz sin utilizar bucles para que tenga el siguiente contenido, y tras
        //modificarla completamente imprímela por pantalla sin utilizar bucles:
        //0 0 1
        //0 1 0
        //1 0 0
        System.out.println("EJERCICIO 6");
        array[0][0] = 0;
        array[2][2] = 0;
        array[2][0] = 1;
        array[1][1] = 1;
        array[0][2] = 1;
        System.out.println(array[0][0] + " " + array[0][1] + " " + array[0][2]);
        System.out.println(array[1][0] + " " + array[1][1] + " " + array[1][2]);
        System.out.println(array[2][0] + " " + array[2][1] + " " + array[2][2]);
        System.out.println();

        //7. Modifica todos los ejercicios anteriores para que la modificación y la impresión se
        //realicen mediante bucles.
        System.out.println("EJERCICIO 7");
        array[2][0] = 0;
        array[1][1] = 0;
        array[0][2] = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i==0){
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        //Reseteamos array
        array[0][0] = 0;
        array[0][1] = 0;
        array[0][2] = 0;
        System.out.println("------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j==0){
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        //Reseteamos array
        array[0][0] = 0;
        array[1][0] = 0;
        array[2][0] = 0;
        System.out.println("------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == array.length-1){
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        //Reseteamos array
        array[array.length-1][0] = 0;
        array[array.length-1][1] = 0;
        array[array.length-1][2] = 0;
        System.out.println("------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (j == array.length-1){
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        //Reseteamos array
        array[0][array.length-1] = 0;
        array[1][array.length-1] = 0;
        array[2][array.length-1] = 0;
        System.out.println("------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i == j){
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        //Reseteamos array
        array[0][0] = 0;
        array[1][1] = 0;
        array[2][2] = 0;
        System.out.println("------------------------");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((j == 0 && i == array.length-1) || (i == array.length/2 && j == array.length/2)
                        || (j == array.length-1 && i == 0)){
                    array[i][j] = 1;
                    System.out.print(array[i][j] + " ");
                } else {
                    System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
        //Reseteamos array
        array[array.length-1][0] = 0;
        array[array.length-1][0] = 0;
        array[array.length-1][0] = 0;
        System.out.println("------------------------");
        System.out.println();

        System.out.println("PARTE B");
        //PARTE B
        //
        //1. Leer por pantalla un número entero n, y generar una matriz de dimensiones nxn
        //como la que se muestra a continuación. Imprimir la matriz por pantalla tras haberla
        //generado completamente.
        //Ejemplo para n = 3:
        //1 1 1
        //1 1 1
        //1 1 1
        System.out.println("EJERCICIO 1");
        System.out.print("Introduzca la dimensión de la matriz: ");
        int dimension = sc.nextInt();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
        System.out.println();

        //2. Modificar el ejercicio anterior para que cada posición tenga un número aleatorio
        //entre 0 y 9.
        System.out.println("EJERCICIO 2");
        int dimensionAleatoria = rand.nextInt(0, 10);
        for (int i = 0; i < dimensionAleatoria; i++) {
            for (int j = 0; j < dimensionAleatoria; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
        System.out.println("Dimensión: " + dimensionAleatoria);
        System.out.println();

        //3. Modificar el ejercicio anterior para que las dimensiones sean nxm.
        System.out.println("EJERCICIO 3");
        System.out.print("Introduzca las filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Introduzca las columnas de la matriz: ");
        int columnas = sc.nextInt();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("1 ");
            }
            System.out.println();
        }
        System.out.println();

        //4. Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        //cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        //a a a a
        //a 0 0 0
        //a 0 0 0
        //a 0 0 0
        System.out.println("EJERCICIO 4");
        System.out.print("Introduzca las dimension de la matriz: ");
        int dimension1 = sc.nextInt();
        String caracter;
        do{
            System.out.print("Introduzca un caracter: ");
            caracter = sc.next();
        }while(caracter.length()!=1);

        for (int i = 0; i < dimension1; i++) {
            for (int j = 0; j < dimension1; j++) {
                if(i == 0 || j == 0){
                    System.out.print(caracter);
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
        System.out.println();

        //5. Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        //cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        //0 0 0 a
        //0 0 0 a
        //0 0 0 a
        //a a a a
        //6. Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        //cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        //a a a a
        //a 0 0 a
        //a 0 0 a
        //a a a a
        //7. Leer por pantalla un número entero n, y crear una matriz de dimensiones nxn como
        //la que se muestra a continuación. Imprimir la matriz por pantalla.
        //Ejemplo para n = 4:
        //0 1 0 1
        //1 0 1 0
        //
        //0 1 0 1
        //1 0 1 0
        //
        //8. (MUY DIFICIL) Modificar el ejercicio 2 para que una vez generada la matriz, se cree
        //otra nueva que contenga en cada posición la media aritmética de los elementos que
        //la rodean. Por ejemplo, para la siguiente matriz aleatoria:
        //3 4 0
        //1 0 2
        //7 6 2
        //Se debe generar la siguiente nueva:
        //1.67 1.2 2.0
        //4.0 3.125 2.4
        //2.33 2.4 2.67

    }
}
