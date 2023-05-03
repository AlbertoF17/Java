package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.Ascuas;
import Practicas.PokemonAlbertoFernandez.tipos.TipoFuego;

import javax.naming.OperationNotSupportedException;

public class Charizard extends Pokemon implements TipoFuego {
    public Charizard(){
        super("Charizard", 6, 6, 17, 78, 84, 78,
                109, 85, 100, 1);
        movimientos[0] = new Ascuas();
    }
    public Charizard(int nivel){
        super("Charizard", 6, 6, 17, 78, 84, 78,
                109, 85, 100, nivel);
        movimientos[0] = new Ascuas();
    }
    public Charizard(String mote, int nivel){
        super(mote, 6, 6, 17, 78, 84, 78,
                109, 85, 100, nivel);
        movimientos[0] = new Ascuas();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
