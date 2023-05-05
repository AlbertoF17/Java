package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.LatigoCepa;
import Practicas.PokemonAlbertoFernandez.movimientos.Movimiento;
import Practicas.PokemonAlbertoFernandez.tipos.TipoPlanta;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVeneno;

import javax.naming.OperationNotSupportedException;

public class Ivysaur extends Pokemon implements TipoPlanta, TipoVeneno {
    public Ivysaur(){
        super("Ivysaur", 2, 11, 16, 60, 62, 63,
                80 ,80, 61, 1);
        movimientos[0] = new LatigoCepa();
    }
    public Ivysaur(int nivel){
        super("Ivysaur", 2, 11, 16, 60, 62, 63,
                80 ,80, 61, nivel);
        movimientos[0] = new LatigoCepa();
    }
    public Ivysaur(String mote, int nivel){
        super(mote, 2, 11, 16, 60, 62, 63,
                80 ,80, 61, nivel);
        movimientos[0] = new LatigoCepa();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        if (nivel < 32){
            throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                    " aún no está preparado para evolucionar");
        } else {
            Pokemon pokemonEvolucionado = new Venusaur(nivel);
            return pokemonEvolucionado;
        }
    }
}
