package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAcero;
import Practicas.PokemonAlbertoFernandez.tipos.TipoDragon;

import javax.naming.OperationNotSupportedException;

public class Duraludon extends Pokemon implements TipoAcero, TipoDragon {
    public Duraludon(){
        super("Duraludon", 884, 0, 3, 70, 95, 115,
                120, 50, 85, 1);
        movimientos[0] = new CometaDraco();
        movimientos[1] = new FocoResplandor();
        movimientos[2] = new PlanchaCorporal();
        movimientos[3] = new Rayo();
    }
    public Duraludon(int nivel){
        super("Duraludon", 884, 0, 3, 70, 95, 115,
                120, 50, 85, nivel);
        movimientos[0] = new CometaDraco();
        movimientos[1] = new FocoResplandor();
        movimientos[2] = new PlanchaCorporal();
        movimientos[3] = new Rayo();
    }
    public Duraludon(String mote, int nivel){
        super(mote, 884, 0, 3, 70, 95, 115,
                120, 50, 85, nivel);
        movimientos[0] = new CometaDraco();
        movimientos[1] = new FocoResplandor();
        movimientos[2] = new PlanchaCorporal();
        movimientos[3] = new Rayo();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
