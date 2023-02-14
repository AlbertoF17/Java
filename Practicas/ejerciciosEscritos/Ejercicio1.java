package Practicas.ejerciciosEscritos;
import java.util.Scanner;
public class Ejercicio1 {//Originalmente esta clase estaba nombrada como NombreApellidoApellido
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca num filas: ");
        int n = sc.nextInt();
        System.out.print("Introduzca num columnas: ");
        int m = sc.nextInt();
        System.out.print("Introduzca caracter: ");
        char c = sc.next().charAt(0);
        String[][] matrizStrings = new String[n][m];
        sc.nextLine();
        for (int i = 0; i < matrizStrings.length; i++) {
            for (int j = 0; j < matrizStrings[i].length; j++) {
                String cadena;
                do {
                    System.out.print("Introduce una cadena con el caracter " + c + ": ");
                    cadena = sc.nextLine();
                } while (!cadena.contains(Character.toString(c)));
                matrizStrings[i][j] = cadena;
            }
        }
        String[][] matrizUnicode = new String[n][m];
        for (int i = 0; i < matrizUnicode.length; i++) {
            for (int j = 0; j < matrizUnicode[i].length; j++) {
                matrizUnicode[i][j] = "U+00" +
                        Integer.toHexString(matrizStrings[i][j].charAt(matrizStrings[i][j].length()-1)).toUpperCase();
            }
        }

        //IMPLEMENTACION CODIGO ASCII (unicode pero en decimal en lugar de hexadecimal)
        /*
        int[][] matrizASCII = new int[n][m];
        for (int i = 0; i < matrizASCII.length; i++) {
            for (int j = 0; j < matrizASCII[i].length; j++) {
                matrizASCII[i][j] = (int) matrizStrings[i][j].charAt(0);
            }
        }
        */
    }
}
