package Practicas.Gamer;

public class Personaje {
    static String nombre;
    static int edad;
    static int altura;
    static int saludMaxima;
    static int saludActual;

    public static void recibirDanyo(int damage){
        saludActual = saludActual-damage;
    }
    public static boolean comprobarMuerte(){
        if (saludActual<=0){
            return true;
        }else{
            return false;
        }
    }
    public static void curar(int cura){
        saludActual = saludActual + cura;
    }
}
