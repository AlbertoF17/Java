package Practicas.RecuEv2;

public class Main {
    public static void main(String[] args){
        int[][] array1 = new int[][]{
                {3, 3, 3, 3},
                {3, 2, 4, 3},
                {3, 7, 0, 3},
                {3, 3, 3, 3}};
        int[][] array2 = new int[][]{
                {1, 1, 1, 1},
                {1, 3, 1, 1},
                {1, 2, 4, 1},
                {1, 1, 1, 1}};
        intercambiarCentro(array1, array2);

        System.out.println(formatearCadena(" Hola   Mundo.     que tal     "));
    }

    public static void intercambiarCentro(int[][] arr1, int[][] arr2){
        if (arr1.length != arr2.length){
            throw new IllegalArgumentException("Las matrices tienen distinto nº de filas");
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i].length != arr2[i].length){
                throw new IllegalArgumentException("Las matrices tienen distinto nº de filas");
            }
        }

        for (int i = 1; i < arr1.length-1; i++) {
            for (int j = 1; j < arr1[i].length-1; j++) {
                int temp = arr1[i][j];
                arr1[i][j] = arr2[i][j];
                arr2[i][j] = temp;
            }
        }

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static String formatearCadena(String cadena){
        String salida = cadena.trim();
        salida = salida.replaceAll("\s{2,}", "\s");
        //salida = salida.replaceAll("\\.", ".\n");
        String res = "";
        for (int i = 0; i < salida.length(); i++) {
            char c = salida.charAt(i);
            res += c;
            if (c == '.'){
                res += "\n";
                if (i+1 < salida.length()){
                    res += Character.toUpperCase(salida.charAt(i+1));
                    i++;
                }
            }
        }
        return salida;
    }
}
