package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoNormal;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVolador;

import javax.naming.OperationNotSupportedException;

public class Braviary extends Pokemon implements TipoNormal, TipoVolador {
    public Braviary(){
        super("Braviary", 628, 10, 17, 100, 123, 75,
                57, 75, 80, 1);
        movimientos[0] = new PajaroOsado();
        movimientos[1] = new ABocajarro();
        movimientos[2] = new PicoTaladro();
        movimientos[3] = new Acrobata();
    }
    public Braviary(int nivel){
        super("Braviary", 628, 10, 17, 100, 123, 75,
                57, 75, 80, nivel);
        movimientos[0] = new PajaroOsado();
        movimientos[1] = new ABocajarro();
        movimientos[2] = new PicoTaladro();
        movimientos[3] = new Acrobata();
    }
    public Braviary(String mote, int nivel){
        super(mote, 628, 10, 17, 100, 123, 75,
                57, 75, 80, nivel);
        movimientos[0] = new PajaroOsado();
        movimientos[1] = new ABocajarro();
        movimientos[2] = new PicoTaladro();
        movimientos[3] = new Acrobata();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
