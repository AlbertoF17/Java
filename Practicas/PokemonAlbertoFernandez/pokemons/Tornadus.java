package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVolador;

import javax.naming.OperationNotSupportedException;

public class Tornadus extends Pokemon implements TipoVolador {
    public Tornadus(){
        super("Tornadus", 641, 17, -1, 79, 115, 70,
                125, 80, 111, 1);
        movimientos[0] = new Acrobata();
        movimientos[1] = new IdaYVuelta();
        movimientos[2] = new Desarme();
        movimientos[3] = new OndaIgnea();
    }
    public Tornadus(int nivel){
        super("Tornadus", 641, 17, -1, 79, 115, 70,
                125, 80, 111, nivel);
        movimientos[0] = new Acrobata();
        movimientos[1] = new IdaYVuelta();
        movimientos[2] = new Desarme();
        movimientos[3] = new OndaIgnea();
    }
    public Tornadus(String mote, int nivel){
        super(mote, 641, 17, -1, 79, 115, 70,
                125, 80, 111, nivel);
        movimientos[0] = new Acrobata();
        movimientos[1] = new IdaYVuelta();
        movimientos[2] = new Desarme();
        movimientos[3] = new OndaIgnea();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
