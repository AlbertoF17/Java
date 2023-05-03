package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAcero;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVolador;

import javax.naming.OperationNotSupportedException;

public class Corviknight extends Pokemon implements TipoVolador, TipoAcero {
    public Corviknight(){
        super("Corviknight", 823, 17, 0, 98, 87, 105,
                53, 85, 67, 1);
        movimientos[0] = new PlanchaCorporal();
        movimientos[1] = new IdaYVuelta();
        movimientos[2] = new PajaroOsado();
        movimientos[3] = new PicoTaladro();
    }
    public Corviknight(int nivel){
        super("Corviknight", 823, 17, 0, 98, 87, 105,
                53, 85, 67, nivel);
        movimientos[0] = new PlanchaCorporal();
        movimientos[1] = new IdaYVuelta();
        movimientos[2] = new PajaroOsado();
        movimientos[3] = new PicoTaladro();
    }
    public Corviknight(String mote, int nivel){
        super(mote, 823, 17, 0, 98, 87, 105,
                53, 85, 67, nivel);
        movimientos[0] = new PlanchaCorporal();
        movimientos[1] = new IdaYVuelta();
        movimientos[2] = new PajaroOsado();
        movimientos[3] = new PicoTaladro();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
