package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAcero;
import Practicas.PokemonAlbertoFernandez.tipos.TipoPsiquico;

import javax.naming.OperationNotSupportedException;

public class Metagross extends Pokemon implements TipoAcero, TipoPsiquico {
    public Metagross(){
        super("Metagross", 376, 0, 12, 80, 135, 130,
                95, 90, 70, 1);
        movimientos[0] = new PlanchaCorporal();
        movimientos[1] = new PunoMeteoro();
        movimientos[2] = new Terremoto();
        movimientos[3] = new CabezazoZen();
    }
    public Metagross(int nivel){
        super("Metagross", 376, 0, 12, 80, 135, 130,
                95, 90, 70, nivel);
        movimientos[0] = new PlanchaCorporal();
        movimientos[1] = new PunoMeteoro();
        movimientos[2] = new Terremoto();
        movimientos[3] = new CabezazoZen();
    }
    public Metagross(String mote, int nivel){
        super(mote, 376, 0, 12, 80, 135, 130,
                95, 90, 70, nivel);
        movimientos[0] = new PlanchaCorporal();
        movimientos[1] = new PunoMeteoro();
        movimientos[2] = new Terremoto();
        movimientos[3] = new CabezazoZen();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
