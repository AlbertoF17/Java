package Practicas.PokemonAlbertoFernandez;

import Practicas.PokemonAlbertoFernandez.entrenadores.Entrenador;
import Practicas.PokemonAlbertoFernandez.movimientos.Movimiento;
import Practicas.PokemonAlbertoFernandez.pokemons.*;

import java.util.Random;
import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        Random rand = new Random();
        Pokemon[] arrayRandom = {new Arcanine(), new Braviary(), new Cinderace(), new Corviknight(), new Dracovish(),
        new Dragapult(), new Duraludon(), new Ferrothorn(), new Garchomp(), new Gastrodon(), new Groudon(),
        new Incineroar(), new Kyogre(), new Landorus(), new Metagross(), new Salamence(), new TapuFini(),
        new Thundurus(), new Tornadus(), new Toxtricity(), new Tyranitar(), new Zacian()};

        Scanner sc = new Scanner(System.in);
        System.out.println("Hola a todos! Bienvenidos al mundo de Pokemon! Me " +
                "llamo Joaquin! Pero la gente me llama el PROFESOR  POKEMON!\nEste mundo está habitado por unas" +
                "criaturas llamadas POKEMON! Para algunos, los POKEMON son  mascotas. Pero otros los usan para " +
                "pelear.\nEn cuanto a mi... Estudio a los pokemon como profesion. Pero primero dime como te llamas: ");
        Entrenador entrenador = new Entrenador(sc.nextLine());
        System.out.println("Bien! Tu nombre es " + entrenador.getNombre() + "\nEste es mi nieto." +
                        " El ha sido tu rival desde que eras un niño... mmm podrias decirme como se llama?: ");
        Entrenador npc = new Entrenador(sc.nextLine());
        System.out.println("Ah si! Ahora lo recuerdo! Se llama " + npc.getNombre() + "\n" +
                entrenador.getNombre() + "! Tu propia leyenda pokemon está a punto de comenzar!" +
                " Te espera un mundo de sueños y aventuras con los pokemon!\nAdelante! " + entrenador.getNombre() +
                ", elije un modo de juego:\nCombate de starters -> 0 | Batalla aleatoria -> 1");
        int modoJuego = sc.nextInt();
        if (modoJuego == 1){
            System.out.println("Ambos os batiréis en un duelo épico con equipos totalmente aleatorios...\n" +
                    "QUE COMIENCE EL COMBATE!!!");
            int[] numerosGenerados = new int[entrenador.getPokemons().length];
            for (int i = 0; i < entrenador.getPokemons().length; i++) {
                int numero;
                boolean existe;
                do {
                    numero = rand.nextInt(0, arrayRandom.length);
                    existe = false;
                    for (int j = 0; j < i; j++) {
                        if (numerosGenerados[j] == numero) {
                            existe = true;
                            break;
                        }
                    }
                } while (existe);
                numerosGenerados[i] = numero;
                entrenador.nuevoPokemon(arrayRandom[numero].clone());
            }
            numerosGenerados = new int[npc.getPokemons().length];
            for (int i = 0; i < npc.getPokemons().length; i++) {
                int numero;
                boolean existe;
                do {
                    numero = rand.nextInt(0, arrayRandom.length);
                    existe = false;
                    for (int j = 0; j < i; j++) {
                        if (numerosGenerados[j] == numero) {
                            existe = true;
                            break;
                        }
                    }
                } while (existe);
                numerosGenerados[i] = numero;
                npc.nuevoPokemon(arrayRandom[numero].clone());
            }
        } else {
            System.out.println("toma! Aqui hay 3 Pokemon! Bien! Estan dentro de las Pokeball! Cuando yo era joven," +
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
        }
        batalla(entrenador, npc);
    }
    public static int elegirAtaque(Pokemon pok) {
        Scanner sc = new Scanner(System.in);
        Movimiento ataque = null;
        int ataqueNum = 0;

        while (ataqueNum < 1 || ataqueNum > 4 || ataque == null || ataque.getPpActual() <= 0) {
            for (int i = 0; i < pok.getMovimientos().length; i++) {
                System.out.println(i + 1 + " -> " + pok.getMovimientos()[i]);
            }
            System.out.print("Selecciona un ataque (1-4): ");
            ataqueNum = sc.nextInt();
            if (ataqueNum >= 1 && ataqueNum <= 4) {
                ataque = pok.getMovimientos()[ataqueNum-1];
            }
        }
        return ataqueNum-1;
    }
    public static void batalla(Entrenador entrenador1, Entrenador entrenador2){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int numPokE1 = 0;
        int numPokE2 = 0;
        for (int i = 0; i < entrenador1.getPokemons().length; i++) {
            if (entrenador1.getPokemons()[i] != null){
                numPokE1++;
            }
            if (entrenador2.getPokemons()[i] != null){
                numPokE2++;
            }
        }
        System.out.print("Lista de Pokemons: ");
        for (int i = 0; i < entrenador1.getPokemons().length; i++) {
            if (entrenador1.getPokemons()[i] == null){
                System.out.print("null ");
            } else {
                System.out.print(entrenador1.getPokemons()[i].getClass().getSimpleName() + " ");
            }
        }
        System.out.println();
        System.out.print("Lista de Pokemons rivales: ");
        for (int i = 0; i < entrenador2.getPokemons().length; i++) {
            if (entrenador2.getPokemons()[i] == null){
                System.out.print("null ");
            } else {
                System.out.print(entrenador2.getPokemons()[i].getClass().getSimpleName() + " ");
            }
        }
        System.out.println();
        Pokemon primerPokemonE1 = entrenador1.getPokemons()[0];
        Pokemon primerPokemonE2 = entrenador2.getPokemons()[0];
        while ((primerPokemonE1 != null && primerPokemonE2 != null)){
            while(primerPokemonE1.getPs() <= 0){
                System.out.println("Este pokemon está debilitado y no puede combatir, seleccione otro:");
                primerPokemonE1 = entrenador1.getPokemons()[sc.nextInt()-1];
            }
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
                        primerPokemonE2.atacar(primerPokemonE1, rand.nextInt(0, 4));
                    }
                } else {
                    int ataque = elegirAtaque(primerPokemonE1);
                    primerPokemonE2.atacar(primerPokemonE1, rand.nextInt(0, 4));
                    if(primerPokemonE1.getPs() > 0){
                        primerPokemonE1.atacar(primerPokemonE2, ataque);
                    }
                }
            }
            if (primerPokemonE1.getPs()<=0){
                System.out.println("Tu pokemon " + primerPokemonE1.getMote() + " se debilitó");
                numPokE1--;
                if (numPokE1 > 0){
                    System.out.println("Selecciona el pokemon que quieres sacar: ");
                    do {
                        for (int i = 0; i < entrenador1.getPokemons().length; i++) {
                            if (entrenador1.getPokemons()[i] == null){
                                System.out.println(i+1 + " -> " + "null ");
                            } else {
                                System.out.println(i+1 + " -> "
                                        + entrenador1.getPokemons()[i].getClass().getSimpleName() + " ");
                            }
                        }
                        boolean pokNoValido = false;
                        try {
                            primerPokemonE1 = entrenador1.getPokemons()[sc.nextInt()-1];
                        } catch (ArrayIndexOutOfBoundsException e){
                            System.out.println("Esta posición no existe en tu lista de pokemons, debe ser un número" +
                                    " comprendido entre 1 y 6 (ambos incluidos)");
                            pokNoValido = true;
                        }
                        if (!pokNoValido){
                            if (primerPokemonE1 == null) {
                                System.out.println("Este espacio está vacío y no hay ningún pokemon," +
                                        " seleccione otro:");
                            } else if (primerPokemonE1.getPs() <= 0) {
                                System.out.println("Este pokemon está debilitado y no puede combatir," +
                                        " seleccione otro:");
                                primerPokemonE1 = null;
                            }
                        }
                    } while (primerPokemonE1 == null);
                } else {
                    System.out.println("HAS PERDIDO");
                    primerPokemonE1 = null;
                }
            } else if (primerPokemonE2.getPs()<=0){
                System.out.println("El pokemon del rival " + primerPokemonE2.getMote() + " se debilitó");
                numPokE2--;
                if (numPokE2 > 0){
                    do{
                        primerPokemonE2 =
                                entrenador2.getPokemons()[rand.nextInt(0,entrenador2.getPokemons().length)];
                    } while (primerPokemonE2 == null || primerPokemonE2.getPs() <= 0);
                    System.out.println(entrenador2.getNombre() + " sacará a " + primerPokemonE2.getMote() +
                            " ¿quieres cambiar de pokemon? (true -> si; false -> no)");
                    if (sc.nextBoolean()){
                        System.out.println("Selecciona el pokemon que quieres sacar: ");
                        do {
                            for (int i = 0; i < entrenador1.getPokemons().length; i++) {
                                if (entrenador1.getPokemons()[i] == null){
                                    System.out.println(i+1 + " -> " + "null ");
                                } else {
                                    System.out.println(i+1 + " -> "
                                            + entrenador1.getPokemons()[i].getClass().getSimpleName() + " ");
                                }
                            }
                            boolean pokNoValido = false;
                            try {
                                primerPokemonE1 = entrenador1.getPokemons()[sc.nextInt()-1];
                            } catch (ArrayIndexOutOfBoundsException e){
                                System.out.println("Esta posición no existe en tu lista de pokemons, debe ser un" +
                                        " número comprendido entre 1 y 6 (ambos incluidos)");
                                pokNoValido = true;
                            }
                            if (!pokNoValido){
                                if (primerPokemonE1 == null) {
                                    System.out.println("Este espacio está vacío y no hay ningún pokemon," +
                                            " seleccione otro:");
                                } else if (primerPokemonE1.getPs() <= 0) {
                                    System.out.println("Este pokemon está debilitado y no puede combatir," +
                                            " seleccione otro:");
                                    primerPokemonE1 = null;
                                }
                            }
                        } while (primerPokemonE1 == null || primerPokemonE1.getPs() <= 0);
                    }
                } else {
                    System.out.println("HAS GANADO!!");
                    primerPokemonE2 = null;
                }
            }
        }
    }
}