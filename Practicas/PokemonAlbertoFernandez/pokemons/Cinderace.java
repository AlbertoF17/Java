package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoFuego;

import javax.naming.OperationNotSupportedException;

public class Cinderace extends Pokemon implements TipoFuego {
    public Cinderace(){
        super("Cinderace", 815, 6, -1, 80, 116, 75,
                65, 75, 119, 50);
        movimientos[0] = new BalonIgneo();
        movimientos[1] = new IdaYVuleta();
        movimientos[2] = new Lanzamugre();
        movimientos[3] = new CabezazoZen();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Cinderace(int nivel){
        super("Cinderace", 815, 6, -1, 80, 116, 75,
                65, 75, 119, 50);
        movimientos[0] = new BalonIgneo();
        movimientos[1] = new IdaYVuleta();
        movimientos[2] = new Lanzamugre();
        movimientos[3] = new CabezazoZen();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Cinderace(String mote, int nivel){
        super(mote, 815, 6, -1, 80, 116, 75,
                65, 75, 119, nivel);
        movimientos[0] = new BalonIgneo();
        movimientos[1] = new IdaYVuleta();
        movimientos[2] = new Lanzamugre();
        movimientos[3] = new CabezazoZen();
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
