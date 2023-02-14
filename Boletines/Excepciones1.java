package Boletines;

import java.util.InputMismatchException;
import java.util.Scanner;
import static java.lang.Character.isLetter;

public class Excepciones1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        //Ejercicio 1
        dividir();
        //Ejercicio 2
        imprimirArray();
        //Ejercicio 3
        leerNumero();
        //Ejercicio 4
        leerString();
        //Ejercicio 5
        imprimirString();
        //Ejercicio 6
        imprimirMayusculas("eo");
        //Ejercicio 7
        realizarEjercicios();
        //Ejercicio 8
        leerUsuarios("Alberto", "Alberto");

    }
    //1. Realice un programa que lea por pantalla dos números enteros, e imprima el resultado de
    //dividirlos. Observe la excepción que se lanza al dividir por cero, y tras ello modifique su código
    //para que capture dicha excepción.
    public static void dividir(){
        System.out.println("DIVISION");
        System.out.print("Dividendo: ");
        int num1 = sc.nextInt();
        System.out.print("Divisor: ");
        int num2 = sc.nextInt();
        try{
            System.out.println(num1/num2);
        } catch (ArithmeticException e){
            throw new ArithmeticException("\nExcepción Aritmética");
        }
    }

    //2. Realice un programa que cree un array de 10 posiciones inicializado con números crecientes
    //a partir de 1. Escriba un bucle que vaya desde i=0 hasta i<=longitud y los imprima por pantalla. Observe
    //la excepción que se lanza, y tras ello modifique su código para que capture dicha excepción.
    public static void imprimirArray(){
        int[] array = new int[10];
        try{
            for (int i = 0; i <= array.length; i++) {
                System.out.print(array[i] + " ");
            }
        }catch (IndexOutOfBoundsException e){
            throw new IndexOutOfBoundsException("\nExcepción \"Index Out Of Bounds\"");
        }
    }
    //3. Realice un programa que lea por pantalla un número entero mediante la clase Scanner y nextInt.
    //Observe la excepción que se lanza al introducir una palabra, y tras ello modifique su código
    //para que capture dicha excepción.
    public static void leerNumero(){
        System.out.print("Introduzca un numero: ");
        try{
            int num = sc.nextInt();
        }catch (InputMismatchException e){
            throw new InputMismatchException("\nExcepción \"Input Mismatch\"");
        }
    }
    //4. Realice un programa que lea por pantalla un número entero mediante la clase Scanner y nextLine.
    //Convierta el String a un número entero con la clase Integer y parseInt. Observe la excepción que se
    //lanza al introducir un número con decimales, y tras ello modifique su código para que capture dicha excepción.
    public static void leerString(){
        System.out.print("Introduzca un numero: ");
        try{
            int num = Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            throw new NumberFormatException("\nExcepción \"Number Format\"");
        }
    }
    //5. Realice un programa  que lea por pantalla una cadena mediante la clase Scanner y nextLine. Imprima
    //mediante charAt y un bucle que vaya desde i=0 hasta i<=longitud todas las posiciones de la cadena.
    //Observe la excepción que se lanza y tras ello modifique su código para que capture
    //dicha excepción.
    public static void imprimirString(){
        System.out.print("Introduzca un String: ");
        String cadena = sc.nextLine();
        try{
            for (int i = 0; i <= cadena.length(); i++) {
                System.out.println(cadena.charAt(i));
            }
        }catch (StringIndexOutOfBoundsException e){
            throw new StringIndexOutOfBoundsException("\nExcepción \"String Index Out Of Bounds\"");
        }
    }
    //6. Escriba un método que reciba un String y lo imprima por pantalla en mayúsculas. Pruebe a llamar al método
    //pasando como argumento el valor null, observe la excepción que se lanza y modifique el código para capturarla.
    public static void imprimirMayusculas(String cadena){
        try{
            System.out.println(cadena.toUpperCase());
        }catch (NullPointerException e){
            throw new NullPointerException("Excepción \"Null Pointer\"");
        }

    }
    //7. Realice un único programa que implemente todo lo anterior, y capture todas las excepciones que se puedan lanzar.
    public static void realizarEjercicios(){
        dividir();
        imprimirArray();
        leerNumero();
        leerString();
        imprimirString();
        imprimirMayusculas("asd");
    }
    //8. Realice un programa que lea dos nombres de usuario (dos cadenas que empiecen por una letra y tengan longitud
    //superior a 1). En caso de que alguno de los nombres de usuario no sea válido, lance usted una excepción
    //del tipo IllegalArgumentException proporcionando un mensaje de error.
    public static void leerUsuarios(String usuario1, String usuario2){
        if (usuario1.length()>1 && usuario2.length()>1){
            if(isLetter(usuario1.charAt(0))&&isLetter(usuario2.charAt(0))){
                System.out.println("Both usernames are correctly created");
            }else {
                throw new IllegalArgumentException("First character of the username has to be a letter");
            }
        }else{
            throw new IllegalArgumentException("Name is equals or shorter than 1 character");
        }
    }
}
