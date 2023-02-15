package Practicas.Gamer;

import java.util.Random;

public class Enemigo {
    static Random rand = new Random();
    static String nombre;
    static int edad;
    static int altura;
    static int saludMaxima;
    static int saludActual;
    //atributos SPECIAL
    static int strength = rand.nextInt(1, 11);
    static int perception = rand.nextInt(1, 11);
    static int endurance = rand.nextInt(1, 11);
    static int charisma = rand.nextInt(1, 11);
    static int intelligence = rand.nextInt(1, 11);
    static int agility = rand.nextInt(1, 11);
    static int luck = rand.nextInt(1, 11);

    public static void recibirDanyo(int damage){
        saludActual = saludActual-damage;
    }
    public static boolean comprobarMuerte(){
        return saludActual<=0;
    }
    public static void curar(int cura){
        saludActual = saludActual + cura;
    }
}
