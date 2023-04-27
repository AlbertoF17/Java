package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoElectrico;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVolador;

import javax.naming.OperationNotSupportedException;

public class Thundurus extends Pokemon implements TipoElectrico, TipoVolador {
    public Thundurus(){
        super("Thundurus", 642, 4, 17, 79, 115, 70,
                125, 80, 111, 50);
        movimientos[0] = new Rayo();
        movimientos[1] = new Desarme();
        movimientos[2] = new IdaYVuleta();
        movimientos[3] = new Trueno();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Thundurus(int nivel){
        super("Thundurus", 642, 4, 17, 79, 115, 70,
                125, 80, 111, 50);
        movimientos[0] = new Rayo();
        movimientos[1] = new Desarme();
        movimientos[2] = new IdaYVuleta();
        movimientos[3] = new Trueno();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Thundurus(String mote, int nivel){
        super(mote, 642, 4, 17, 79, 115, 70,
                125, 80, 111, nivel);
        movimientos[0] = new Rayo();
        movimientos[1] = new Desarme();
        movimientos[2] = new IdaYVuleta();
        movimientos[3] = new Trueno();
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
