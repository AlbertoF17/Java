package Practicas.ejerciciosEscritos;

public class Ejercicio2 {
    public static boolean[][] ejercicio2 (int[][] matrizEnteros, String[][] matrizStrings){
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
                    //matrizBooleans[i][j] = (Integer.toHexString(matrizEnteros[i][j]).equals(Integer.toHexString(matrizStrings[i][j].charAt(0))));
                    // hay que meter el ascii y lo traduce a unicode (el ejercicio pide que sea a unicode)
                    matrizBooleans[i][j] = (""+matrizEnteros[i][j]).equals(Integer.toHexString(matrizStrings[i][j].charAt(0)));
                    //hay que meter el unicode (no se traga letras al ser tipo int)
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
                System.out.println(matrizBooleans[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        imprimirMatriz(ejercicio2(new int[][]{{48,77}}, new String[][]{{"Hola", "Mundo"}}));
        //
    }
}
