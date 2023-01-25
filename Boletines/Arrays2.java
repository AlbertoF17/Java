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
                if (j == (array.length-1)-i){
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
        System.out.print("Introduzca la dimensión de la matriz: ");
        int dimension2 = sc.nextInt();
        int[][] array2 = new int[dimension2][dimension2];
        for (int i = 0; i < dimension2; i++) {
            for (int j = 0; j < dimension2; j++) {
                array2[i][j] = rand.nextInt(0, 10);
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Dimensión: " + dimension2);
        System.out.println();

        //3. Modificar el ejercicio anterior para que las dimensiones sean nxm.
        System.out.println("EJERCICIO 3");
        System.out.print("Introduzca las filas de la matriz: ");
        int filas = sc.nextInt();
        System.out.print("Introduzca las columnas de la matriz: ");
        int columnas = sc.nextInt();
        int[][] array3 = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array3[i][j] = rand.nextInt(0, 10);
                System.out.print(array3[i][j] + " ");
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
        int dimension4 = sc.nextInt();
        String caracter4;
        do{
            System.out.print("Introduzca un caracter: ");
            caracter4 = sc.next();
        }while(caracter4.length()!=1);

        for (int i = 0; i < dimension4; i++) {
            for (int j = 0; j < dimension4; j++) {
                if(i == 0 || j == 0){
                    System.out.print(caracter4 + " ");
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
        System.out.println("EJERCICIO 5");
        System.out.print("Introduzca las dimension de la matriz: ");
        int dimension5 = sc.nextInt();
        String caracter5;
        do{
            System.out.print("Introduzca un caracter: ");
            caracter5 = sc.next();
        }while(caracter5.length()!=1);

        for (int i = 0; i < dimension5; i++) {
            for (int j = 0; j < dimension5; j++) {
                if(i == dimension5-1 || j == dimension5-1){
                    System.out.print(caracter5 + " ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
        System.out.println();

        //6. Leer por pantalla un carácter y un número n, e imprimir por pantalla una matriz
        //cuadrada como la siguiente. Ejemplo para ‘a’ y 4:
        //a a a a
        //a 0 0 a
        //a 0 0 a
        //a a a a
        System.out.println("EJERCICIO 6");
        System.out.print("Introduzca las dimension de la matriz: ");
        int dimension6 = sc.nextInt();
        String caracter6;
        do{
            System.out.print("Introduzca un caracter: ");
            caracter6 = sc.next();
        }while(caracter6.length()!=1);

        for (int i = 0; i < dimension6; i++) {
            for (int j = 0; j < dimension6; j++) {
                if(i == dimension6-1 || j == dimension6-1 || i == 0 || j == 0){
                    System.out.print(caracter5 + " ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
        System.out.println();

        //7. Leer por pantalla un número entero n, y crear una matriz de dimensiones nxn como
        //la que se muestra a continuación. Imprimir la matriz por pantalla.
        //Ejemplo para n = 4:
        //0 1 0 1
        //1 0 1 0
        //0 1 0 1
        //1 0 1 0
        System.out.println("EJERCICIO 6");
        System.out.print("Introduzca las dimension de la matriz: ");
        int dimension7 = sc.nextInt();
        for (int i = 0; i < dimension7; i++) {
            for (int j = 0; j < dimension7; j++) {
                if((i+j)%2!= 0){
                    System.out.print("1 ");
                }else {
                    System.out.print("0 ");
                }

            }
            System.out.println();
        }
        System.out.println();

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
        System.out.println("EJERCICIO 8");
        System.out.print("Introduzca la dimensión de la matriz: ");
        int dimension8 = sc.nextInt();
        int[][] array8A = new int [dimension8][dimension8];
        for (int i = 0; i < dimension8; i++) {
            for (int j = 0; j < dimension8; j++) {
                array8A[i][j] = rand.nextInt(0, 10);
                System.out.print(array8A[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nNUEVO ARRAY\n");
        float[][] array8B = new float[dimension8][dimension8];
        for (int i = 0; i < dimension8; i++) {
            for (int j = 0; j < dimension8; j++) {
                if(j-1<0) {
                    if (i-1<0){
                        array8B[i][j] = (array8A[i+1][j] + array8A[i][j+1] + array8A[i+1][j+1])/3f;
                    }else if (i+1>=array8A.length){
                        array8B[i][j] = (array8A[i][j+1] + array8A[i-1][j] + array8A[i-1][j+1])/3f;
                    }else {
                        array8B[i][j] = (array8A[i+1][j] + array8A[i][j+1] + array8A[i+1][j+1] + array8A[i-1][j+1]
                                + array8A[i-1][j])/5f;
                    }
                }else if (j+1>=array8A.length){
                    if (i-1<0){
                        array8B[i][j] = (array8A[i][j-1] + array8A[i+1][j] + array8A[i+1][j-1])/3f;
                    }else if (i+1>=array8A.length){
                        array8B[i][j] = (array8A[i-1][j-1] + array8A[i-1][j] + array8A[i][j-1])/3f;
                    }else {
                        array8B[i][j] = (array8A[i-1][j] + array8A[i+1][j] + array8A[i+1][j-1] + array8A[i][j-1]
                                + array8A[i-1][j-1])/5f;
                    }
                }else {
                    if (i-1<0){
                        array8B[i][j] = (array8A[i][j+1] + array8A[i+1][j] + array8A[i+1][j-1] + array8A[i+1][j+1]
                                + array8A[i][j-1])/5f;
                    } else if (i+1>=array8A.length) {
                        array8B[i][j] = (array8A[i][j+1] + array8A[i-1][j] + array8A[i-1][j-1] + array8A[i-1][j+1]
                                + array8A[i][j-1])/5f;
                    }else {
                        array8B[i][j] = (array8A[i-1][j-1] + array8A[i+1][j+1] + array8A[i][j+1] + array8A[i+1][j]
                                + array8A[i][j-1] + array8A[i-1][j] + array8A[i-1][j+1] + array8A[i+1][j-1])/8f;
                    }
                }
                System.out.printf("%1.2f ", array8B[i][j]);
            }
            System.out.println();
        }
    }
}
