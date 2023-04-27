package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVolador;

import javax.naming.OperationNotSupportedException;

public class Tornadus extends Pokemon implements TipoVolador {
    public Tornadus(){
        super("Tornadus", 641, 17, -1, 79, 115, 70,
                125, 80, 111, 50);
        movimientos[0] = new Acrobata();
        movimientos[1] = new IdaYVuleta();
        movimientos[2] = new Desarme();
        movimientos[3] = new OndaIgnea();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Tornadus(int nivel){
        super("Tornadus", 641, 17, -1, 79, 115, 70,
                125, 80, 111, nivel);
        movimientos[0] = new Acrobata();
        movimientos[1] = new IdaYVuleta();
        movimientos[2] = new Desarme();
        movimientos[3] = new OndaIgnea();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Tornadus(String mote, int nivel){
        super(mote, 641, 17, -1, 79, 115, 70,
                125, 80, 111, nivel);
        movimientos[0] = new Acrobata();
        movimientos[1] = new IdaYVuleta();
        movimientos[2] = new Desarme();
        movimientos[3] = new OndaIgnea();
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
