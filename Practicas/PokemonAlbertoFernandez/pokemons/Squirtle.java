package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.Burbuja;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAgua;

import javax.naming.OperationNotSupportedException;

public class Squirtle extends Pokemon implements TipoAgua {
    public Squirtle(){
        super("Squirtle", 7, 1, -1, 44, 48, 65, 50,
                64, 43, 1);
        movimientos[0] = new Burbuja();
    }
    public Squirtle(int nivel){
        super("Squirtle", 7, 1, -1, 44, 48, 65, 50,
                64, 43, nivel);
        movimientos[0] = new Burbuja();
    }
    public Squirtle(String mote, int nivel){
        super(mote, 7, 1, -1, 44, 48, 65, 50,
                64, 43, nivel);
        movimientos[0] = new Burbuja();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        if (nivel < 16){
            throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                    " aún no está preparado para evolucionar");
        } else {
            Pokemon pokemonEvolucionado = new Wartortle(mote, nivel);
            return pokemonEvolucionado;
        }
    }
}
