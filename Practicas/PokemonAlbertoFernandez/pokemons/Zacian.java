package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoHada;

import javax.naming.OperationNotSupportedException;

public class Zacian extends Pokemon implements TipoHada {
    public Zacian(){
        super("Zacian", 888, 7, -1, 92, 120, 115,
                80, 115, 138, 50);
        movimientos[0] = new Carantona();
        movimientos[1] = new ABocajarro();
        movimientos[2] = new Triturar();
        movimientos[3] = new CuchillaSolar();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Zacian(int nivel){
        super("Zacian", 888, 7, -1, 92, 120, 115,
                80, 115, 138, 50);
        movimientos[0] = new Carantona();
        movimientos[1] = new ABocajarro();
        movimientos[2] = new Triturar();
        movimientos[3] = new CuchillaSolar();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Zacian(String mote, int nivel){
        super(mote, 888, 7, -1, 92, 120, 115,
                80, 115, 138, nivel);
        movimientos[0] = new Carantona();
        movimientos[1] = new ABocajarro();
        movimientos[2] = new Triturar();
        movimientos[3] = new CuchillaSolar();
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
