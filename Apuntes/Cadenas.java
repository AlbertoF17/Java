package Apuntes;

import java.util.Scanner;

public class Cadenas {
    public static void main(String[] args) {

        int num = 4;
        String nombre = new String("Alberto");
        String apellido = "Fernández";

        Scanner scan = new Scanner(System.in);

        //Declaraciones de cadenas y cadenas nulas
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

        //length
        System.out.println(nombre.length());
        System.out.println("Pablo".charAt(2));
        System.out.println(nombre.charAt(0));
        System.out.println("Alberto " + "Fernández"); //3 objetos, "Alberto ", "Fernández" y la cadena resultante
        //"Alberto Fernández"
        //System.out.println(nombre.charAt(1000)); ERROR por ser un número más grande que la longitud de la cadena

        int longitud = nombre.length();
        System.out.println(nombre.charAt(longitud - 1)); // -1 ya que java empieza a contar desde 0 y el método length
        //desde 1

        //También se puede realizar sin guardarlo en una variable, que es una mejor forma
        System.out.println(apellido.charAt(apellido.length() - 1));
        System.out.println(nombre.charAt((nombre.length() - 1) / 2));
        System.out.println(apellido.charAt((apellido.length() - 1) / 2));


        String saludo = new String("HOLA");

        for (int i = 0; i <= (saludo.length() - 1); i++) {
            System.out.println(saludo.charAt(i));
        }

        //Substring
        String subcadena = "Alberto".substring(1, 5);
        System.out.println(subcadena);
        System.out.println("Alberto".substring(1));
        System.out.println("Alberto".substring(1, "Alberto".length()));

        String cadena1 = "Alcantarilla";
        System.out.println(cadena1.substring(0, cadena1.length() / 2));
        System.out.println(cadena1.substring(cadena1.length() / 2));

        String subcadena1 = cadena1.substring(0, cadena1.length() / 2);
        String subcadena2 = cadena1.substring(cadena1.length() / 2);
        String subcadena3 = "s";

        //Concatenación cadenas
        System.out.println(subcadena1 + subcadena2);
        String concatenado = subcadena1.concat(subcadena2);
        System.out.println(concatenado);
        System.out.println(concatenado += subcadena3 + " 32");

        System.out.println("44" + 1);
        System.out.println('a' + 1);
        System.out.println((char) ('a' + 1));

        //indexOf
        System.out.println(concatenado.indexOf("tarilla"));
        System.out.println(concatenado.indexOf("Alberto"));
        System.out.println(concatenado.indexOf("a"));
        System.out.println(concatenado.indexOf("a", 4));

        String cadena2 = "Hola Mundo";
        System.out.println("El espacio está en la posición: " + cadena2.indexOf(" "));
        System.out.println(cadena2.lastIndexOf(" "));
        System.out.println(cadena2.substring(0, cadena2.indexOf(" ")));
        System.out.println(cadena2.substring(cadena2.indexOf(" ")+1));

        //equals
        System.out.println("Alberto".equals("Alberto"));
        System.out.println("Alberto".equals("Jorge"));
        System.out.println("Alberto".equalsIgnoreCase("alberto"));
        System.out.println("Hola" == "mundo"); //ES ERRÓNEO, NO USAR

        //compareTo
        System.out.println("Alberto".compareTo("Hola"));
        System.out.println("Alberto".compareTo("Alberto"));
        System.out.println("Hola".compareTo("hola"));
        System.out.println("Alberto".compareToIgnoreCase("alberto"));

        //trim
        System.out.println("   Hola Mundo     ".trim());

        //replace
        String s = "Hola Mundo";
        System.out.println(s.replace("Hola", "Adiós"));

        //toUpper/LowerCase
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        //contains
        String a = "Hola";
        System.out.println(a.contains("a")); //imprime TRUE
        System.out.println(a.contains("b")); //imprime FALSE

        //Nº a String y viceversa
        int n = 1;
        int n2 = 2;
        String n3 = "3";
        String numero = Integer.toString(n);
        String nm = String.valueOf(n2);
        System.out.println(numero+1); //Da 11 porque "numero" es String
        int num3 = Integer.parseInt(n3);
        System.out.println(n3);
        System.out.println(num3);
    }
}
