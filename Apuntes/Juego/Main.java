package Apuntes.Juego;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Hombre hombre = new Hombre();
        Animal animal = new Animal();
        Orco orco = new Orco();
        NPC npc = new NPC();
        hombre.luchar(animal);
        System.out.println(animal instanceof Luchador);
        System.out.println("*****************");
        System.out.println("Jorge".compareTo("Zara"));
        Persona persona1 = new Persona("32497773M");
        Persona persona2 = new Persona("23498463R");
        Persona persona3 = new Persona("03498463R");
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
    }
}
