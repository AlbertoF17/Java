package Apuntes;

import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Array: secuencia de datos del mismo tipo
        //Declaración: tipo array, abre y cierra corchetes y nombre de la variable (entre corchetes va el contenido)
        int[] arrayDePrueba; //NULL, aún no inicializado
        int[] arrayDeEnteros = new int[3]; //Número de datos de la secuencia establecidos antes de guardar los datos
        System.out.println("Longitud antes de la declaración del array: " + arrayDeEnteros.length);
        int[] arrayDeEnteros2 = {1, 2, 4, 5, 7, 6, 7, 3};
        System.out.println("Código de referencia (dirección en memoria): " + arrayDeEnteros2);
        System.out.println("Longitud después de la declaración del array: " + arrayDeEnteros2.length);
        for(int i = 0; i<arrayDeEnteros2.length; i++){
            System.out.print(arrayDeEnteros2[i] + " ");
        }
        System.out.println();
        arrayDeEnteros2[arrayDeEnteros2.length-1] = 20;
        for(int i = 0; i<arrayDeEnteros2.length; i++){ //Modificación del for anterior para que no
            // incluya un espacio al final
            if (i<arrayDeEnteros2.length-1){
                System.out.print(arrayDeEnteros2[i] + " ");
            }else {
                System.out.print(arrayDeEnteros2[i]);
            }
        }
        System.out.println();
        //Ejercicio de ejemplo: introducir por pantalla el tamaño del Array de Strings que se va a crear, para luego
        //ir rellenándolo de nombres e imprimirlos todos al finalizar.
        System.out.print("Introduzca la cantidad de nombres que vayas a leer: ");
        String[] arrayDeStrings = new String[sc.nextInt()];
        for(int i = 0; i<arrayDeStrings.length; i++){
            System.out.println("Introduzca el nombre " + (i+1) + " (no puede ser compuesto): ");
            arrayDeStrings[i] = sc.next();
        }
        for(int i = 0; i<arrayDeStrings.length; i++){
            if (i<arrayDeStrings.length-1){
                System.out.print(arrayDeStrings[i] + " ");
            }else {
                System.out.print(arrayDeStrings[i]);
            }
        }
        System.out.println();
        //Ejercicio de ejemplo 2: Crear un array de float de tamaño 10 mediante un inicializador
        //(dando valores iniciales a su gusto). Imprimir el contenido del array por consola. Una vez impreso,
        //modificar el array para que en cada posición se almacene el índice que le corresponde. Una vez que el array
        //esté completamente modificado, volver a imprimir el array y comprobar que ha hecho el ejercicio
        //de forma correcta.
        float[] arrayDeFloats = {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f};
        for(int i = 0; i<arrayDeFloats.length; i++){
            if (i<arrayDeFloats.length-1){
                System.out.print(arrayDeFloats[i] + " ");
            }else {
                System.out.print(arrayDeFloats[i]);
            }
        }
        System.out.println();
        for(int i=0; i<arrayDeFloats.length; i++){
            arrayDeFloats[i] = i;
        }
        for(int i = 0; i<arrayDeFloats.length; i++){
            if (i<arrayDeFloats.length-1){
                System.out.print(arrayDeFloats[i] + " ");
            }else {
                System.out.print(arrayDeFloats[i]);
            }
        }
        System.out.println();


        String[] array1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for(int i = 0; i<array1.length; i++){
            if (i<array1.length-1){
                System.out.print(array1[i] + " ");
            }else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();
        for(int i=0; i<array1.length; i++){
            array1[i] = String.valueOf(i);
            //array1[i] = Integer.toString(i); Mejor opción para ints
            //array1[i] = String.valueOf(i);  Mejor opción cuando no se sabe de qué tipo es el número
            //array1[i] = i+""; Peor opción
        }
        for(int i = 0; i<array1.length; i++){
            if (i<array1.length-1){
                System.out.print(array1[i] + " ");
            }else {
                System.out.print(array1[i]);
            }
        }
        System.out.println();

        // EJERCICIOS CLASE
        // imprimir cada posicion junto con el contenido
        System.out.println("----------EJ1----------");
        int [] arr = {40, 20, 5, 7, 8};
        for (int i= 0; i <arr.length; i++) {
            System.out.println(i + "," + arr[i]);
        }

        // Imprimir la posición central del array junto a su contenido
        System.out.println("----------EJ2----------");
        System.out.println(arr.length/2 + "," + arr[arr.length/2]);

        // Duplicar el contenido
        System.out.println("----------EJ3----------");
        for (int i= 0; i <arr.length; i++) {
            arr[i] *=  2;
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // imprimir array de al final al principio con i++
        System.out.println("----------EJ4----------");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[arr.length-(i+1)] + " ");
        }
        System.out.println();

        //ARRAYS BIDIMENSIONALES
        int[] array1D = {3, 22, 34, 1};
        int[] array1Dbis = new int[4];
        //Comparación declaración arrays 1 dimensión y 2 dimensiones
        int[][] array2D = new int[5][3];
        int[][] array2Dbis = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("Num filas array2Dbis: " + array2D.length);



    }
}
