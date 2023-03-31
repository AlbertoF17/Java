package Practicas.PokemonAlbertoFernandez;

import Practicas.PokemonAlbertoFernandez.entrenadores.Entrenador;
import Practicas.PokemonAlbertoFernandez.pokemons.Bulbasaur;
import Practicas.PokemonAlbertoFernandez.pokemons.Charmander;
import Practicas.PokemonAlbertoFernandez.pokemons.Pokemon;
import Practicas.PokemonAlbertoFernandez.pokemons.Squirtle;

import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola a todos! Bienvenidos al mundo de Pokemon! Me " +
                "llamo Joaquin! Pero la gente me llama el PROFESOR  POKEMON!\nEste mundo está habitado por unas" +
                "criaturas llamadas POKEMON! Para algunos, los POKEMON son  mascotas. Pero otros los usan para pelear.\n"+
                "En cuanto a mi... Estudio a los pokemon como profesion. Pero primero dime como te llamas: ");
        Entrenador entrenador = new Entrenador(sc.nextLine());
        System.out.println("Bien! Tu nombre es " + entrenador.getNombre() + "\nEste es mi nieto." +
                        " El ha sido tu rival desde que eras un niño... mmm podrias decirme como se llama?: ");
        Entrenador npc = new Entrenador(sc.nextLine());
        System.out.println("Ah si! Ahora lo recuerdo! Se llama " + npc.getNombre() + "\n" +
                entrenador.getNombre() + "! Tu propia leyenda pokemon está a punto de comenzar!" +
                " Te espera un mundo de sueños y aventuras con los pokemon!\nAdelante! " + entrenador.getNombre() +
                " toma! Aqui hay 3 Pokemon! Bien! Estan dentro de las Pokeball! Cuando yo era joven," +
                " era un buen entrenador de Main!\nPero ahora solo me quedan 3. Te daré uno. Cual quieres?\n" +
                "(1 -> Bulbasaur, 2 -> Charmander, 3 -> Squirtle):");
        int eleccionPokemon = sc.nextInt();
        if (eleccionPokemon == 1){
            entrenador.nuevoPokemon(new Bulbasaur(5));
            npc.nuevoPokemon(new Charmander(5));
        } else if (eleccionPokemon == 2){
            entrenador.nuevoPokemon(new Charmander(5));
            npc.nuevoPokemon(new Squirtle(5));
        } else {
            entrenador.nuevoPokemon(new Squirtle(5));
            npc.nuevoPokemon(new Bulbasaur(5));
        }
        batalla(entrenador, npc);
    }
    public static int elegirAtaque(Pokemon pok){
        Scanner sc = new Scanner(System.in);
        System.out.println("Selecciona un ataque (0-3): ");
        for (int i = 0; i < pok.getMovimientos().length; i++) {
            System.out.println(i + " " + pok.getMovimientos()[i]);
        }
        return sc.nextInt();
    }
    public static void batalla(Entrenador entrenador1, Entrenador entrenador2){
        Random rand = new Random();
        Pokemon primerPokemonE1 = entrenador1.getPokemons()[0];
        Pokemon primerPokemonE2 = entrenador2.getPokemons()[0];
        System.out.println(entrenador2.getNombre() + " envió a " + primerPokemonE2.getMote() + "!" +
                "\nVe " + primerPokemonE1.getMote() + "!");
        while (primerPokemonE1.getPs() > 0 && primerPokemonE2.getPs() > 0){
            System.out.println(primerPokemonE2.getMote() + ": " + primerPokemonE2.getPs() + "/"
                    + primerPokemonE2.getPsMax());
            System.out.println(primerPokemonE1.getMote() + ": " + primerPokemonE1.getPs() + "/"
                    + primerPokemonE1.getPsMax());
            if (primerPokemonE1.getVelocidad() >= primerPokemonE2.getVelocidad()){
                primerPokemonE1.atacar(primerPokemonE2, elegirAtaque(primerPokemonE1));
                if(primerPokemonE2.getPs() > 0){
                    //primerPokemonE2.atacar(primerPokemonE1, rand.nextInt(0, 4));
                    primerPokemonE2.atacar(primerPokemonE1,0);
                }
            } else {
                //primerPokemonE2.atacar(primerPokemonE1, rand.nextInt(0, 4));
                primerPokemonE2.atacar(primerPokemonE1,0);
                if(primerPokemonE1.getPs() > 0){
                    primerPokemonE1.atacar(primerPokemonE2, elegirAtaque(primerPokemonE1));
                }
            }
        }
        if (primerPokemonE1.getPs()<=0){
            System.out.println("Tu pokemon " + primerPokemonE1.getMote() + " se debilitó");
        } else if (primerPokemonE2.getPs()<=0){
            System.out.println("El pokemon del rival " + primerPokemonE2.getMote() + " se debilitó");
        }
    }
}
