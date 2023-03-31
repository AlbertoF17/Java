package Practicas.PokemonAlbertoFernandez.entrenadores;

import Practicas.PokemonAlbertoFernandez.pokemons.Pokemon;

public class Entrenador {
    String nombre;
    Pokemon[] pokemons;

    public Entrenador() {
        nombre = "DefaultName";
        pokemons = new Pokemon[6];
    }
    public Entrenador(String nombre) {
        this.nombre = nombre;
        pokemons = new Pokemon[6];
    }
    public Entrenador(String nombre, Pokemon[] pokemons) {
        this.nombre = nombre;
        this.pokemons = pokemons;
    }

    public String getNombre() {
        return nombre;
    }

    public Pokemon[] getPokemons() {
        return pokemons;
    }

    public void setPokemons(Pokemon[] pokemons) {
        this.pokemons = pokemons;
    }
    public void validadorNombre(String nombre){
        if (nombre == null || nombre == ""){
            throw new IllegalArgumentException("El nombre no debe ser nulo ni estar vacío");
        }
    }
    public void validadorPokemons(Pokemon[] pokemons){
        if (pokemons.length != 6){
            throw new IllegalArgumentException("El número de pokémons debe ser 6, por lo que no puedes introducir" +
                    " un array de mayor o menor tamaño");
        }
    }
    public void nuevoPokemon(Pokemon newPokemon){
        boolean pokemonIntroducido = false;
        for (int i = 0; i < pokemons.length; i++) {
            if (pokemons[i] == null && !pokemonIntroducido){
                pokemons[i] = newPokemon;
                pokemonIntroducido = true;
            }
            if (!pokemonIntroducido){
                System.out.println("No tienes sitio para más pokemon! mote fue enviado a la Caja Pokemon 1 del PC");
            }
        }
    }
}
