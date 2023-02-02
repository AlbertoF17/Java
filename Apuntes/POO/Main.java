package Apuntes.POO;

//import static Apuntes.POO.Utilidades.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Método imprimirSaludo");
        System.out.print("Escribe tu nombre: ");
        Utilidades.imprimirSaludo(scan.next());

        //System.out.println("Método sumaEnteros");
        //Prueba con cambios en variables
        int valor = 2;
        Utilidades.sumaEnteros(valor,6);
        //Con return
        //int suma = Utilidades.sumaEnteros(3,5);
        //System.out.println(suma);

        System.out.println(Utilidades.sumaEnteros(3,5));
        System.out.println(Utilidades.restaEnteros(5.4f,3.3f));
        System.out.println(Utilidades.multiplicarEnteros(3,5));
        System.out.println(Utilidades.divisionEnteros(10f,5f));

        if(Utilidades.esPar(4)){
            System.out.println("El número es par");
        }else{
            System.out.println("El número es impar");
        }

        System.out.println(CalculadoraDeMano.sumar(3,4));
        System.out.println(CalculadoraDeMano.restar(3,1));
        System.out.println(CalculadoraDeMano.multiplicar(7,3));
        System.out.println(CalculadoraDeMano.dividir(6,2));
        System.out.println(CalculadoraDeMano.calcularPorcentaje(25, 200));
        System.out.println(CalculadoraDeMano.calcularPorcentaje(25));
        System.out.println(CalculadoraDeMano.cambiarSigno(4));
        System.out.println(CalculadoraDeMano.calcularRaizCuadrada(25));
        System.out.println(CalculadoraDeMano.calcularPotencia(2,5));

        int[] array1D = {2,3};
        imprimirArray(array1D);

        int[][] array2D = {{3,2},{2,3}};
        imprimirArray(array2D);
    }
    public static void imprimirArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void imprimirArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            imprimirArray(array[i]);
            System.out.println();
        }
    }
}
