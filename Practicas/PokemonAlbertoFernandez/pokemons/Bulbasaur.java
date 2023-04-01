package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.LatigoCepa;
import Practicas.PokemonAlbertoFernandez.movimientos.Movimiento;
import Practicas.PokemonAlbertoFernandez.tipos.TipoPlanta;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVeneno;

import javax.naming.OperationNotSupportedException;

public class Bulbasaur extends Pokemon implements TipoPlanta, TipoVeneno {
    public Bulbasaur(){
        super("Bulbasaur", 1, 11, 16, 45, 49, 49,
                65 ,65, 45, 1);
        movimientos[0] = new LatigoCepa();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Bulbasaur(int nivel){
        super("Bulbasaur", 1, 11, 16, 45, 49, 49,
                65 ,65, 45, nivel);
        movimientos[0] = new LatigoCepa();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Bulbasaur(String mote, int nivel){
        super(mote, 1, 11, 16, 45, 49, 49,
                65 ,65, 45, nivel);
        movimientos[0] = new LatigoCepa();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        if (nivel < 16){
            throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                    " aún no está preparado para evolucionar");
        } else {
            Pokemon pokemonEvolucionado = new Ivysaur(mote, nivel);
            return pokemonEvolucionado;
        }
    }
}
