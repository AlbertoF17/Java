package Practicas.ejerciciosEscritos;

public class Ejercicio2 {
    public static boolean[][] ejercicio2 (int[][] matrizEnteros, String[][] matrizStrings){
        boolean iguales = false;
        if(matrizEnteros.length==matrizStrings.length){
            for (int i = 0; i < matrizEnteros.length; i++) {
                if(matrizEnteros[i].length == matrizStrings[i].length){
                    iguales = true;
                }else{
                    return null;
                }
            }
        }
        if(iguales){
            boolean [][] matrizBooleans = new boolean[matrizEnteros.length][];
            for (int i = 0; i < matrizBooleans.length; i++) {
                for (int j = 0; j < matrizEnteros[i].length; j++) {
                    matrizBooleans[i] = new boolean[matrizEnteros[i].length];
                }
            }
            for (int i = 0; i < matrizBooleans.length; i++) {
                for (int j = 0; j < matrizBooleans[i].length; j++) {
                    matrizBooleans[i][j] = (matrizEnteros[i][j] == matrizStrings[i][j].charAt(0));
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
        imprimirMatriz(ejercicio2(new int[][]{{3,2}}, new String[][]{{"Hola", "Mundo"}}));
    }
}
