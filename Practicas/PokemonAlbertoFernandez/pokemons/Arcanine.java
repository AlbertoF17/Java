package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoFuego;

import javax.naming.OperationNotSupportedException;

public class Arcanine extends Pokemon implements TipoFuego {
    public Arcanine(){
        super("Arcanine", 59, 6, -1, 90, 110, 80,
                100, 80, 95, 1);
        movimientos[0] = new Lanzallamas();
        movimientos[1] = new ABocajarro();
        movimientos[2] = new Ascuas();
        movimientos[3] = new GiroFuego();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Arcanine(int nivel){
        super("Arcanine", 59, 6, -1, 90, 110, 80,
                100, 80, 95, nivel);
        movimientos[0] = new Lanzallamas();
        movimientos[1] = new ABocajarro();
        movimientos[2] = new Ascuas();
        movimientos[3] = new GiroFuego();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Arcanine(String mote, int nivel){
        super(mote, 59, 6, -1, 90, 110, 80,
                100, 80, 95, nivel);
        movimientos[0] = new Lanzallamas();
        movimientos[1] = new ABocajarro();
        movimientos[2] = new Ascuas();
        movimientos[3] = new GiroFuego();
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