package Apuntes.Juego;

import java.util.ArrayList;
import java.util.Collections;
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
        Persona persona1 = new Persona("32497773M", 5, 1.30f);
        Persona persona2 = new Persona("23498463R", 6, 1.20f);
        Persona persona3 = new Persona("03498463R", 7, 1.70f);
        Alumno alumno = new Alumno("32497773M", "Maria", "Munoz Fernandez", 12, 1.6f);
        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        listaPersonas.add(persona3);
        OrdenacionPorEdadComparator ordEdad = new OrdenacionPorEdadComparator();
        OrdenacionPorAlturaComparator ordAltura = new OrdenacionPorAlturaComparator();
        System.out.println(ordEdad.compare(persona1, persona2));
        System.out.println(ordAltura.compare(persona2, persona2));
        Collections.sort(listaPersonas);
        System.out.println(listaPersonas);
        System.out.println(listaPersonas.contains(alumno));
    }
}
