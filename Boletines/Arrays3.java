package Boletines;

import java.util.Random;
import java.util.Scanner;

public class Arrays3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        /*
        //1. Leer por pantalla un número entero n, y crear una matriz de String de dimensiones
        //nxn como la que se muestra a continuación. Imprimir la matriz por pantalla después
        //de haberla rellenado completamente.
        //Ejemplo para n = 4:
        //1.0 2.0 3.0 4.0
        //5.0 6.0 7.0 8.0
        //9.0 10.0 11.0 12.0
        //13.0 14.0 15.0 16.0
        System.out.println("EJERCICIO 1");
        System.out.print("Indique la dimensión de la matriz: ");
        int dimension1 = sc.nextInt();
        float cont=1;
        String[][] array1 = new String[dimension1][dimension1];
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                array1[i][j] = cont + " ";
                cont++;
            }
        }
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                System.out.print(array1[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //2. Crear una matriz de String de dimensiones 2x4 y rellenarla con nombres de
        //compañeros o familiares. El programa a continuación debe leer por pantalla una
        //posición de la matriz válida, leer un nuevo nombre por pantalla y sustituir el nombre
        //que exista en esa posición. Debe repetirse la operación hasta que el usuario
        //introduzca una posición inválida. Antes de finalizar, imprima la matriz.
        System.out.println("EJERCICIO 2");
        String[][] array2 = {{"Alberto", "Josemari", "Jouse", "Ale"},{"Antonio", "María", "Pablito", "Ricardo"}};
        int posicioni;
        int posicionj;
        boolean continuar = false;
        do{
            System.out.println("Introduzca una posición de la matriz válida: ");
            System.out.print("Posicion i (número entre 0 y 1): ");
            posicioni = sc.nextInt();
            System.out.print("Posicion j (número entre 0 y 3): ");
            posicionj = sc.nextInt();
            if (posicioni>=0 && posicioni<=1 && posicionj>=0 && posicionj<=3){
                continuar = true;
                System.out.print("Introduzca el nombre a insertar: ");
                String nuevoNombre = sc.next();
                array2[posicioni][posicionj] = nuevoNombre;
            }else {
                continuar = false;
            }
        }while(continuar);
        System.out.println("Posición no válida, programa finalizado\n");
        System.out.println("MATRIZ FINAL");
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //3. Repetir el ejercicio anterior para que durante el último paso (imprimir la matriz), se
        //lea por pantalla un String. En caso de ser “MAYUSCULAS”, pasar a mayúsculas el
        //contenido de la matriz. En caso de ser “minusculas”, pasar a minúsculas el
        //contenido de la matriz. En cualquier otro caso, no hacer nada. A continuación,
        //imprimir la matriz.
        System.out.println("EJERCICIO 3");
        String[][] array3 = {{"Alberto", "Josemari", "Jouse", "Ale"},{"Antonio", "María", "Pablito", "Ricardo"}};
        int posi;
        int posj;
        boolean continua = false;
        do{
            System.out.println("Introduzca una posición de la matriz válida: ");
            System.out.print("Posicion i (número entre 0 y 1): ");
            posi = sc.nextInt();
            System.out.print("Posicion j (número entre 0 y 3): ");
            posj = sc.nextInt();
            if (posi>=0 && posi<=1 && posj>=0 && posj<=3){
                continua = true;
                System.out.print("Introduzca el nombre a insertar: ");
                String nuevoNombre = sc.next();
                array3[posi][posj] = nuevoNombre;
            }else {
                continua = false;
            }
        }while(continua);
        System.out.println("Posición no válida, programa finalizado\n");
        System.out.println("MATRIZ FINAL");
        System.out.println("¿Quieres la matriz en mayúsculas o en minúsculas?");
        String tipoImpresion;
        do{
            tipoImpresion = sc.next();
            if (tipoImpresion.equals("minusculas")){
                for (int i = 0; i < array3.length; i++) {
                    for (int j = 0; j < array3[i].length; j++) {
                        array3[i][j] = array3[i][j].toLowerCase();
                    }
                }
            }else if (tipoImpresion.equals("MAYUSCULAS")){
                System.out.println("Imprimiendo la matriz en mayúsculas");
                for (int i = 0; i < array3.length; i++) {
                    for (int j = 0; j < array3[i].length; j++) {
                        array3[i][j] = array3[i][j].toUpperCase();
                    }
                }
            }else{
                System.out.print("Modo no disponible, introdúzcalo de nuevo: ");
            }
        }while(!(tipoImpresion.equals("minusculas") || tipoImpresion.equals("MAYUSCULAS")));
        for (int i = 0; i < array3.length; i++) {
            for (int j = 0; j < array3[i].length; j++) {
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //4. Crear las siguientes matrices de 3x3 y crear una nueva con el resultado de
        //sumarlas. Para sumar dos matrices, debe sumar las posiciones correspondientes y
        //almacenar el resultado en la nueva matriz. Imprima primero M1, a continuación, M2
        //y luego la matriz resultante.
        //M1= 6 8 9 M2= 2 4 1
        //    4 2 0     8 7 7
        //    3 1 1     6 6 2
        System.out.println("EJERCICIO 4");
        int[][] M1 = {{6,8,9},{4,2,0},{3,1,1}};
        int[][] M2 = {{2,4,1},{8,7,7},{6,6,2}};
        int[][] M3 = new int[3][3];
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[i].length; j++) {
                M3[i][j] = M1[i][j] + M2[i][j];
            }
        }
        for (int i = 0; i < M3.length; i++) {
            for (int j = 0; j < M3[i].length; j++) {
                System.out.print(M3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //5. Repetir el ejercicio anterior para que el contenido de M1 y M2 se genere de forma
        //aleatoria (números entre 0 y 9).
        System.out.println("EJERCICIO 5");
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[i].length; j++) {
                M1[i][j] = rn.nextInt(0, 9);
            }
        }
        for (int i = 0; i < M2.length; i++) {
            for (int j = 0; j < M2[i].length; j++) {
                M2[i][j] = rn.nextInt(0, 9);
            }
        }
        for (int i = 0; i < M3.length; i++) {
            for (int j = 0; j < M3[i].length; j++) {
                M3[i][j] = M1[i][j] + M2[i][j];
            }
        }
        System.out.println("ARRAY 1");
        for (int i = 0; i < M1.length; i++) {
            for (int j = 0; j < M1[i].length; j++) {
                System.out.print(M1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ARRAY 2");
        for (int i = 0; i < M2.length; i++) {
            for (int j = 0; j < M2[i].length; j++) {
                System.out.print(M2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ARRAY RESULTANTE");
        for (int i = 0; i < M3.length; i++) {
            for (int j = 0; j < M3[i].length; j++) {
                System.out.print(M3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        //6. Repetir el ejercicio 4 para que, además, el tamaño n de ambas matrices se genere
        //de forma aleatoria (ambas matrices serán de tamaño nxn).
        System.out.println("EJERCICIO 6");
        int tamano = rn.nextInt(0, 9);
        int[][] A1 = new int[tamano][tamano];
        int[][] A2 = new int[tamano][tamano];
        int[][] A3 = new int[tamano][tamano];
        for (int i = 0; i < A1.length; i++) {
            for (int j = 0; j < A1[i].length; j++) {
                A1[i][j] = rn.nextInt(0, 9);
            }
        }
        for (int i = 0; i < A2.length; i++) {
            for (int j = 0; j < A2[i].length; j++) {
                A2[i][j] = rn.nextInt(0, 9);
            }
        }
        for (int i = 0; i < A3.length; i++) {
            for (int j = 0; j < A3[i].length; j++) {
                A3[i][j] = A1[i][j] + A2[i][j];
            }
        }
        System.out.println("ARRAY 1");
        for (int i = 0; i < A1.length; i++) {
            for (int j = 0; j < A1[i].length; j++) {
                System.out.print(A1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nARRAY 2");
        for (int i = 0; i < A2.length; i++) {
            for (int j = 0; j < A2[i].length; j++) {
                System.out.print(A2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nARRAY RESULTANTE (SUMADO)");
        for (int i = 0; i < A3.length; i++) {
            for (int j = 0; j < A3[i].length; j++) {
                System.out.print(A3[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
*/
        //7. Dadas las matrices del ejercicio 4, desarrollar un programa para multiplicarlas.
        //Busque en internet como se multiplican dos matrices.
        System.out.println("EJERCICIO 7");
        int filasArray1 = rn.nextInt(1,5);
        int columnasArray1filasArray2 = rn.nextInt(1,5);
        int columnasArray2 = rn.nextInt(1,5);
        System.out.println("ARRAY 1");
        int[][] Matriz1 = new int[filasArray1][columnasArray1filasArray2];
        for (int i = 0; i < filasArray1; i++) {
            for (int j = 0; j < columnasArray1filasArray2; j++) {
                Matriz1[i][j] = rn.nextInt(-9,10);
            }
        }
        for (int i = 0; i < Matriz1.length; i++) {
            for (int j = 0; j < Matriz1[i].length; j++) {
                if(Matriz1[i][j]<0){
                    System.out.print(Matriz1[i][j] + " ");
                }else{
                    System.out.print(" " + Matriz1[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ARRAY 2");
        int[][] Matriz2 = new int[columnasArray1filasArray2][columnasArray2];
        for (int i = 0; i < columnasArray1filasArray2; i++) {
            for (int j = 0; j < columnasArray2; j++) {
                Matriz2[i][j] = rn.nextInt(-9,10);
            }
        }
        for (int i = 0; i < Matriz2.length; i++) {
            for (int j = 0; j < Matriz2[i].length; j++) {
                if(Matriz2[i][j]<0){
                    System.out.print(Matriz2[i][j] + " ");
                }else{
                    System.out.print(" " + Matriz2[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("ARRAY RESULTANTE (MULTIPLICADO)");
        int[][] Matriz3 = new int[filasArray1][columnasArray2];
        int columnasArray3;
        int filasArray3;
        int cont;
        if (columnasArray1filasArray2<columnasArray2){
            columnasArray3 = columnasArray1filasArray2;
        }else{
            columnasArray3 = columnasArray2;
        }
        if (filasArray1<columnasArray1filasArray2){
            filasArray3 = columnasArray1filasArray2;
        }else{
            filasArray3 = filasArray1;
        }
        if (filasArray3 > columnasArray3){
            cont = filasArray3;
        }else{
            cont = columnasArray3;
        }
        for (int i = 0; i < filasArray1; i++) {
            for (int j = 0; j < columnasArray2; j++) {
                for (int k = 0; k < cont; k++) {
                    Matriz3[i][j] += Matriz1[i][k] * Matriz2[k][j];
                }
            }
        }
        for (int i = 0; i < Matriz3.length; i++) {
            for (int j = 0; j < Matriz3[i].length; j++) {
                if(Matriz3[i][j]<0){
                    System.out.print(Matriz3[i][j] + " ");
                }else{
                    System.out.print(" " + Matriz3[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
