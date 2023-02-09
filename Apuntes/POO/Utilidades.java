package Apuntes.POO;

public class Utilidades {
    public static void imprimirSaludo(){ //FIRMA DEL MÉTODO (METHOD SIGNATURE)
        System.out.println("HOLA");
    }

    public static void imprimirSaludo(String saludo){ //OVERLOAD (misma firma, pero con argumentos)
        System.out.println("Hola " + saludo);
    }
    /*public static void sumaEnteros(int n1, int n2){
        n2 = 8;
        System.out.println(n1+n2);
    }*/
    public static int sumaEnteros(int n1, int n2){
        return n1+n2;
    }
    public static float restaEnteros(float n1, float n2){
        return n1-n2;
    }public static double multiplicarEnteros(double n1, double n2){
        return n1*n2;
    }public static float divisionEnteros(float n1, float n2){
        return n1/n2;
    }

    public static boolean esPar(int n1){
        return n1%2==0;
    }

    public static int busquedaBinaria2 (int[] array, int elemento){
        array = new int[]{1,3,3,3,4,7,9,10,12,12,16,23};
        elemento = 16;
        int pos = -1, inicio = 0, fin = array.length-1, centro;
        while (inicio<=fin){
            centro = (fin+inicio)/2;
            if(array[centro]==elemento){
                return centro;
            }else if(array[centro]<elemento){
                inicio = centro+1;
            } else{
                fin = centro-1;
            }
        }
        return pos;
    }
    public static int[] odenarBurbuja (int[] array){
        int cont = 0;
        boolean ordenado = false;
        while(!ordenado) {
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i + 1]) {
                    int aux = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = aux;
                    cont++;
                }
            }
            if (cont == 0) {
                ordenado = true;
            }
            cont = 0;
        }
        return array;
    }


}
