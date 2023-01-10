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
        System.out.println("Código de referencia: " + arrayDeEnteros2);
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
    }
}
