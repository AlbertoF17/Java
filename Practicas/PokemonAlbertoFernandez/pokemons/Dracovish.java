package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAgua;
import Practicas.PokemonAlbertoFernandez.tipos.TipoDragon;

import javax.naming.OperationNotSupportedException;

public class Dracovish extends Pokemon implements TipoAgua, TipoDragon {
    public Dracovish(){
        super("Dracovish", 888, 7, -1, 92, 120, 115,
                80, 115, 138, 50);
        movimientos[0] = new Branquibocado();
        movimientos[1] = new Psicocolmillo();
        movimientos[2] = new Triturar();
        movimientos[3] = new Enfado();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Dracovish(int nivel){
        super("Dracovish", 888, 7, -1, 92, 120, 115,
                80, 115, 138, 50);
        movimientos[0] = new Branquibocado();
        movimientos[1] = new Psicocolmillo();
        movimientos[2] = new Triturar();
        movimientos[3] = new Enfado();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Dracovish(String mote, int nivel){
        super(mote, 888, 7, -1, 92, 120, 115,
                80, 115, 138, nivel);
        movimientos[0] = new Branquibocado();
        movimientos[1] = new Psicocolmillo();
        movimientos[2] = new Triturar();
        movimientos[3] = new Enfado();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
