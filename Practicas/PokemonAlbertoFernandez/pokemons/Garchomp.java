package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoDragon;
import Practicas.PokemonAlbertoFernandez.tipos.TipoTierra;

import javax.naming.OperationNotSupportedException;

public class Garchomp extends Pokemon implements TipoDragon, TipoTierra {
    public Garchomp(){
        super("Garchomp", 445, 3, 15, 108, 130, 95,
                80, 85, 102, 50);
        movimientos[0] = new Enfado();
        movimientos[1] = new Terremoto();
        movimientos[2] = new ColmilloIgneo();
        movimientos[3] = new RafagaEscamas();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Garchomp(int nivel){
        super("Garchomp", 445, 3, 15, 108, 130, 95,
                80, 85, 102, 50);
        movimientos[0] = new Enfado();
        movimientos[1] = new Terremoto();
        movimientos[2] = new ColmilloIgneo();
        movimientos[3] = new RafagaEscamas();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Garchomp(String mote, int nivel){
        super(mote, 445, 3, 15, 108, 130, 95,
                80, 85, 102, nivel);
        movimientos[0] = new Enfado();
        movimientos[1] = new Terremoto();
        movimientos[2] = new ColmilloIgneo();
        movimientos[3] = new RafagaEscamas();
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