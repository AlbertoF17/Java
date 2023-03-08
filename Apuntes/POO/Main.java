package Apuntes.POO;

//import static Apuntes.POO.Utilidades.*;

import Apuntes.POO.Herencias.Profesor;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*Television tele1 = new Television();
        System.out.println(tele1);
        //No funciona por no usar getter
        //System.out.println(tele1.canal);
        //System.out.println(tele1.marca);
        tele1.setCanal(1);
        tele1.setMarca("Samsung");
        tele1.setModelo("Smartv");
        tele1.setBrillo(50);
        tele1.setContraste(20);
        tele1.setVolumen(20);
        System.out.println(tele1.getCanal());
        System.out.println(tele1.getMarca());
        Television tele2 = new Television("Mitsubishi","M983A");
        System.out.println("Marca de la tele 1: " + tele1.getMarca());
        System.out.println("Marca de la tele 2: " + tele2.getMarca());
        System.out.println("Modelo de la tele 1: " + tele1.getModelo());
        System.out.println("Modelo de la tele 2: " + tele2.getModelo());
        /*
        System.out.println(tele1.precio);
        System.out.println(tele2.precio);
        tele1.precio = 3;
        System.out.println(tele1.precio);
        System.out.println(tele2.precio);
        Al ser precio atributo estático, se cambia en ambos
         */
        //CONSTRUCTOR
        /*Television tele3 = new Television("HP","ER720", 50,70,50,4);
        System.out.println("Marca de la tele 3: " + tele3.getMarca());
        System.out.println("Modelo de la tele 3: " + tele3.getModelo());
        System.out.println(tele3);
        System.out.println(tele3.getMarca());
        tele3.setMarca("Panasonic");
        System.out.println(tele3.getMarca());
        System.out.println(tele3);
        tele3.imprimirReferencia();
        */
        //writeFile1();
        /*
        System.out.println("Método imprimirSaludo");
        System.out.print("Escribe tu nombre: ");
        Utilidades.imprimirSaludo(scan.next());

        //System.out.println("Método sumaEnteros");
        //Prueba con cambios en variables
        int valor = 2;
        Utilidades.sumaEnteros(valor, 6);
        //Con return
        //int suma = Utilidades.sumaEnteros(3,5);
        //System.out.println(suma);

        System.out.println(Utilidades.sumaEnteros(3, 5));
        System.out.println(Utilidades.restaEnteros(5.4f, 3.3f));
        System.out.println(Utilidades.multiplicarEnteros(3, 5));
        System.out.println(Utilidades.divisionEnteros(10f, 5f));

        if (Utilidades.esPar(4)) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        System.out.println(CalculadoraDeMano.sumar(3, 4));
        System.out.println(CalculadoraDeMano.restar(3, 1));
        System.out.println(CalculadoraDeMano.multiplicar(7, 3));
        System.out.println(CalculadoraDeMano.dividir(6, 2));
        System.out.println(CalculadoraDeMano.calcularPorcentaje(25, 200));
        System.out.println(CalculadoraDeMano.calcularPorcentaje(25));
        System.out.println(CalculadoraDeMano.cambiarSigno(4));
        System.out.println(CalculadoraDeMano.calcularRaizCuadrada(25));
        System.out.println(CalculadoraDeMano.calcularPotencia(2, 5));

        int[] array1D = {2, 3};
        imprimirArray(array1D);

        int[][] array2D = {{3, 2}, {2, 3}};
        imprimirArray(array2D);


         */
        //TRY-CATCH
        //imprimirDivision();
    }
    /*public static void writeFile1(){
        File fout = new File("out.txt");
        try{
            FileOutputStream fos = new FileOutputStream(fout);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            for (int i = 0; i < 10; i++) {
                bw.write("something".concat(String.valueOf(i)));
                bw.newLine();
            }
            bw.close();
        }catch (IOException e){
            System.out.println("Excepcion al ejecutar");
        }
    }
    public static void imprimirArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void imprimirArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            imprimirArray(array[i]);
            System.out.println();
        }
    }

    public static void imprimirDivision() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Intrduce los dos números que quieres dividir: ");
        try{
            System.out.println(scan.nextInt() / scan.nextInt());
        } catch(ArithmeticException e) {
            System.out.println("Excepcion de tipo aritmético");
            e.printStackTrace();//Se imprime en la salida de error (orden diferente a la salida estándar)
        } catch (InputMismatchException e){
            System.out.println("Excepcion de tipo input mismatch");
        } catch (Exception e){
            System.out.println("Excepcion generica (clase padre)");
        } finally {
            System.out.println("Me ejecuto haya o no excepcion");
        }
        //LANZAMIENTO DE EXCEPCION (comentado para que el código funcione)
        //throw new ArithmeticException("Lanzando excepción genérica");
        System.out.println("FIN");
    }
     */

}
