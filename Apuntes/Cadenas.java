package Apuntes;

import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {
        int num = 4;
        String nombre = new String("Alberto");
        String apellido = "Fernández";
        Scanner scan = new Scanner(System.in);
        String vacia1 = "";
        String vacia2 = new String();
        String vacia3 = new String("");
        String vacia4;
        String vacia5 = null;
        System.out.println(vacia1);
        System.out.println(vacia2);
        System.out.println(vacia3);
        //System.out.println(vacia4); UN STRING DEBE SER INICIALIZADO SINO DA ERROR
        System.out.println(vacia5);
        System.out.println("null");
        System.out.println(nombre.length());
        System.out.println("Pablo".charAt(2));
        System.out.println(nombre.charAt(0));
        System.out.println("Alberto " + "Fernández"); //3 objetos, "Alberto ", "Fernández" y la cadena resultante
        //"Alberto Fernández"
        //System.out.println(nombre.charAt(1000)); ERROR por ser un número más grande que la longitud de la cadena

        int longitud = nombre.length();
        System.out.println(nombre.charAt(longitud-1)); // -1 ya que java empieza a contar desde 0 y el método length
        //desde 1



    }
}
