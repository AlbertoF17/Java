package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoRoca;
import Practicas.PokemonAlbertoFernandez.tipos.TipoSiniestro;

import javax.naming.OperationNotSupportedException;

public class Tyranitar extends Pokemon implements TipoRoca, TipoSiniestro {
    public Tyranitar(){
        super("Tyranitar", 248, 13, 14, 100, 134, 110,
                95, 100, 61, 1);
        movimientos[0] = new RocaAfilada();
        movimientos[1] = new Terremoto();
        movimientos[2] = new Triturar();
        movimientos[3] = new TierraViva();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Tyranitar(int nivel){
        super("Tyranitar", 248, 13, 14, 100, 134, 110,
                95, 100, 61, nivel);
        movimientos[0] = new RocaAfilada();
        movimientos[1] = new Terremoto();
        movimientos[2] = new Triturar();
        movimientos[3] = new TierraViva();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Tyranitar(String mote, int nivel){
        super(mote, 248, 13, 14, 100, 134, 110,
                95, 100, 61, nivel);
        movimientos[0] = new RocaAfilada();
        movimientos[1] = new Terremoto();
        movimientos[2] = new Triturar();
        movimientos[3] = new TierraViva();
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
