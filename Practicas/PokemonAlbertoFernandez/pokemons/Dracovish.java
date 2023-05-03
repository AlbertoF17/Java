package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAgua;
import Practicas.PokemonAlbertoFernandez.tipos.TipoDragon;

import javax.naming.OperationNotSupportedException;

public class Dracovish extends Pokemon implements TipoAgua, TipoDragon {
    public Dracovish(){
        super("Dracovish", 888, 1, 3, 92, 120, 115,
                80, 115, 138, 1);
        movimientos[0] = new Branquibocado();
        movimientos[1] = new Psicocolmillo();
        movimientos[2] = new Triturar();
        movimientos[3] = new Enfado();
    }
    public Dracovish(int nivel){
        super("Dracovish", 888, 1, 3, 92, 120, 115,
                80, 115, 138, nivel);
        movimientos[0] = new Branquibocado();
        movimientos[1] = new Psicocolmillo();
        movimientos[2] = new Triturar();
        movimientos[3] = new Enfado();
    }
    public Dracovish(String mote, int nivel){
        super(mote, 888, 1, 3, 92, 120, 115,
                80, 115, 138, nivel);
        movimientos[0] = new Branquibocado();
        movimientos[1] = new Psicocolmillo();
        movimientos[2] = new Triturar();
        movimientos[3] = new Enfado();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
