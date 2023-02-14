package Practicas.ejerciciosEscritos;

public class Ejercicio2 {
    public static boolean[][] ejercicio2A(int[][] matrizEnteros, String[][] matrizStrings){
        boolean iguales = false;
        if(matrizEnteros.length==matrizStrings.length){
            for (int i = 0; i < matrizEnteros.length; i++) {
                if(matrizEnteros[i].length == matrizStrings[i].length) {
                    iguales = true;
                }
            }
        }
        if(iguales){
            boolean[][] matrizBooleans = new boolean[matrizEnteros.length][];
            for (int i = 0; i < matrizBooleans.length; i++) {
                for (int j = 0; j < matrizEnteros[i].length; j++) {
                    matrizBooleans[i] = new boolean[matrizEnteros[i].length];
                }
            }
            for (int i = 0; i < matrizBooleans.length; i++) {
                for (int j = 0; j < matrizBooleans[i].length; j++) {
                    matrizBooleans[i][j] = ((int) matrizStrings[i][j].charAt(0)) == matrizEnteros[i][j];
                }

            }
            return matrizBooleans;
        }else {
            return null;
        }
    }


    public static boolean[][] ejercicio2B(String[][] matrizEnteros, String[][] matrizStrings){
        boolean iguales = false;
        if(matrizEnteros.length==matrizStrings.length){
            for (int i = 0; i < matrizEnteros.length; i++) {
                if(matrizEnteros[i].length == matrizStrings[i].length) {
                    iguales = true;
                }
            }
        }
        if(iguales){
            boolean[][] matrizBooleans = new boolean[matrizEnteros.length][];
            for (int i = 0; i < matrizBooleans.length; i++) {
                for (int j = 0; j < matrizEnteros[i].length; j++) {
                    matrizBooleans[i] = new boolean[matrizEnteros[i].length];
                }
            }
            for (int i = 0; i < matrizBooleans.length; i++) {
                for (int j = 0; j < matrizBooleans[i].length; j++) {
                    matrizBooleans[i][j] =
                            (matrizEnteros[i][j]).equalsIgnoreCase(Integer.toHexString(matrizStrings[i][j].charAt(0)));
                }

            }
            return matrizBooleans;
        }else {
            return null;
        }
    }

    public static void imprimirMatriz(boolean[][] matrizBooleans){
        for (int i = 0; i < matrizBooleans.length; i++) {
            for (int j = 0; j < matrizBooleans[i].length; j++) {
                System.out.print(matrizBooleans[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args){
        //VARIACION DEL EJERCICIO 2A: La entrada está en ASCII, no en UNICODE como el enunciado dicta,
        //ya que para ello, el array no puede ser de "integers", debido a que la notación hexadecimal contiene letras.
        imprimirMatriz(ejercicio2A(new int[][]{{48,77}, {32, 68}},
                new String[][]{{"Hola", "Mundo"}, {"Buenos", "Días"}}));
        //VARIACION DEL EJERCICIO 2B: La entrada está en UNICODE, tal y como dicta el enunciado, pero para cumplirlo,
        //se ha tenido que cambiar el tipo de array numérico a un array de "Strings"
        imprimirMatriz(ejercicio2B(new String[][]{{"48","4D"}, {"42","37"}},
                new String[][]{{"Hola", "Mundo"}, {"Buenos", "Días"}}));
    }
}
