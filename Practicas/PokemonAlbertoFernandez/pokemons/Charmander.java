package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.Ascuas;
import Practicas.PokemonAlbertoFernandez.tipos.TipoFuego;

import javax.naming.OperationNotSupportedException;

public class Charmander extends Pokemon implements TipoFuego {
    public Charmander(){
        super("Charmander", 4, 6, -1, 39,
                52, 43, 60, 50, 65, 1);
        movimientos[0] = new Ascuas();
    }
    public Charmander(int nivel){
        super("Charmander", 4, 6, -1, 39,
                52, 43, 60, 50, 65, nivel);
        movimientos[0] = new Ascuas();
    }
    public Charmander(String mote, int nivel){
        super(mote, 4, 6, -1, 39,
                52, 43, 60, 50, 65, nivel);
        movimientos[0] = new Ascuas();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        if (nivel < 16){
            throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                    " aún no está preparado para evolucionar");
        } else {
            Pokemon pokemonEvolucionado = new Charmeleon(mote, nivel);
            return pokemonEvolucionado;
        }
    }
}
