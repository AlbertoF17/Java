package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAcero;
import Practicas.PokemonAlbertoFernandez.tipos.TipoPlanta;

import javax.naming.OperationNotSupportedException;

public class Ferrothorn extends Pokemon implements TipoPlanta, TipoAcero {
    public Ferrothorn(){
        super("Ferrothorn", 598, 11, 0, 74, 94, 131,
                54, 116, 20, 1);
        movimientos[0] = new LatigoCepa();
        movimientos[1] = new Desarme();
        movimientos[2] = new Latigazo();
        movimientos[3] = new PlanchaCorporal();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Ferrothorn(int nivel){
        super("Ferrothorn", 598, 11, 0, 74, 94, 131,
                54, 116, 20, nivel);
        movimientos[0] = new LatigoCepa();
        movimientos[1] = new Desarme();
        movimientos[2] = new Latigazo();
        movimientos[3] = new PlanchaCorporal();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Ferrothorn(String mote, int nivel){
        super(mote, 598, 11, 0, 74, 94, 131,
                54, 116, 20, nivel);
        movimientos[0] = new LatigoCepa();
        movimientos[1] = new Desarme();
        movimientos[2] = new Latigazo();
        movimientos[3] = new PlanchaCorporal();
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
