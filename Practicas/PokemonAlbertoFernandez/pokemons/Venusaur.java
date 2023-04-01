package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.LatigoCepa;
import Practicas.PokemonAlbertoFernandez.tipos.TipoPlanta;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVeneno;

import javax.naming.OperationNotSupportedException;

public class Venusaur extends Pokemon implements TipoPlanta, TipoVeneno {
    public Venusaur(){
        super("Venusaur", 3, 11, 16, 80, 82, 83,
                100 ,100, 80, 1);
        movimientos[0] = new LatigoCepa();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Venusaur(int nivel){
        super("Venusaur", 3, 11, 16, 80, 82, 83,
                100 ,100, 80, nivel);
        movimientos[0] = new LatigoCepa();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Venusaur(String mote, int nivel){
        super(mote, 3, 11, 16, 80, 82, 83,
                100 ,100, 80, nivel);
        movimientos[0] = new LatigoCepa();
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
