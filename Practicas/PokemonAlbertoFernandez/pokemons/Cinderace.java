package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoFuego;

import javax.naming.OperationNotSupportedException;

public class Cinderace extends Pokemon implements TipoFuego {
    public Cinderace(){
        super("Cinderace", 815, 6, -1, 80, 116, 75,
                65, 75, 119, 1);
        movimientos[0] = new BalonIgneo();
        movimientos[1] = new IdaYVuelta();
        movimientos[2] = new Lanzamugre();
        movimientos[3] = new CabezazoZen();
    }
    public Cinderace(int nivel){
        super("Cinderace", 815, 6, -1, 80, 116, 75,
                65, 75, 119, nivel);
        movimientos[0] = new BalonIgneo();
        movimientos[1] = new IdaYVuelta();
        movimientos[2] = new Lanzamugre();
        movimientos[3] = new CabezazoZen();
    }
    public Cinderace(String mote, int nivel){
        super(mote, 815, 6, -1, 80, 116, 75,
                65, 75, 119, nivel);
        movimientos[0] = new BalonIgneo();
        movimientos[1] = new IdaYVuelta();
        movimientos[2] = new Lanzamugre();
        movimientos[3] = new CabezazoZen();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
