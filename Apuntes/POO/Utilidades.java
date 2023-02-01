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


}
