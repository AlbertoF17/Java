package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoDragon;
import Practicas.PokemonAlbertoFernandez.tipos.TipoFantasma;

import javax.naming.OperationNotSupportedException;

public class Dragapult extends Pokemon implements TipoDragon, TipoFantasma {
    public Dragapult(){
        super("Dragapult", 887, 3, 5, 88, 120, 75,
                100, 75, 142, 1);
        movimientos[0] = new BolaSombra();
        movimientos[1] = new CometaDraco();
        movimientos[2] = new IdaYVuelta();
        movimientos[3] = new Trueno();
    }
    public Dragapult(int nivel){
        super("Dragapult", 887, 3, 5, 88, 120, 75,
                100, 75, 142, nivel);
        movimientos[0] = new BolaSombra();
        movimientos[1] = new CometaDraco();
        movimientos[2] = new IdaYVuelta();
        movimientos[3] = new Trueno();
    }
    public Dragapult(String mote, int nivel){
        super(mote, 887, 3, 5, 88, 120, 75,
                100, 75, 142, nivel);
        movimientos[0] = new BolaSombra();
        movimientos[1] = new CometaDraco();
        movimientos[2] = new IdaYVuelta();
        movimientos[3] = new Trueno();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
