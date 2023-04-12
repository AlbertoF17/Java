package Boletines;

import java.util.ArrayList;
import java.util.List;

public class Recursividad1 {

    //Hacer con métodos recursivos.
    //1. Crear un método estático que devuelva el factorial.
    public static int fact(int n){
        if (n==0){
            return 1;
        } else {
            return n*fact(n-1);
        }
    }

    //2. Crear un método estático que devuelva la suma de los n primeros números positivos.
    public static int sum(int n){
        if (n==0){
            return 0;
        } else {
            return n+sum(n-1);
        }
    }

    //3. Crear un método estático que devuelva la suma de los n primeros cuadrados.
    public static int sumCuadrados(int n){
        if (n==0){
            return 0;
        } else {
            return (n*n)+sumCuadrados(n-1);
        }
    }

    //4. Crear un método estático que, dado un entero n, devuelva el término n de la sucesión
    //de Fibonacci. Hacer también iterativo.
    public static int fibonacciRecursivo(int n){
        if (n<=1){
            return n;
        } else {
            return fibonacciRecursivo(n-1)+fibonacciRecursivo(n-2);
        }
    }

    //5. Crear un método recursivo para imprimir cada carácter de un String en una línea.
    public static void imprimirCaracteres(String cadena){
        if (cadena.isEmpty()){
            return;
        } else{
            System.out.println(cadena.charAt(0));
            imprimirCaracteres(cadena.substring(1));
        }
    }
    //6. Crear un método estático que imprima un array de enteros de una dimensión.
    public static void imprimirArrayAux(int[] arrayEnteros, int n){
        if (n==arrayEnteros.length){
            System.out.println();
        } else{
            System.out.print(arrayEnteros[n]+ " ");
            imprimirArrayAux(arrayEnteros, n+1);
        }
    }
    public static void imprimirArray(int[] arrayEnteros){
        imprimirArrayAux(arrayEnteros, 0);
    }

    public static void imprimirArrayListAux(ArrayList<Integer> arrayEnteros){
        if (arrayEnteros.size()==0){
            System.out.println();
        } else{
            System.out.print(arrayEnteros.get(0) + " ");
            arrayEnteros.remove(0);
            imprimirArrayList(arrayEnteros);
        }
    }
    public static void imprimirArrayList(ArrayList<Integer> arrayEnteros){
        ArrayList<Integer> arrayEnterosClonado = (ArrayList<Integer>) arrayEnteros.clone();
        imprimirArrayListAux(arrayEnterosClonado);
    }

    public static void main(String[] args){
        //TESTS
        System.out.println(fact(5));
        System.out.println(sum(3));
        System.out.println(sumCuadrados(3));
        imprimirCaracteres("Hola");
        imprimirArrayAux(new int[]{1, 3, 4, 8 ,7},0);
        ArrayList<Integer> arrayEnteros = new ArrayList<Integer>(List.of(1,2,3,4,5));
        imprimirArrayList(arrayEnteros);
        System.out.println(arrayEnteros);
    }
}
