package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.Burbuja;
import Practicas.PokemonAlbertoFernandez.movimientos.Escaldar;
import Practicas.PokemonAlbertoFernandez.movimientos.FuerzaLunar;
import Practicas.PokemonAlbertoFernandez.movimientos.Gigaimpacto;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAgua;
import Practicas.PokemonAlbertoFernandez.tipos.TipoHada;

import javax.naming.OperationNotSupportedException;

public class TapuFini extends Pokemon implements TipoAgua, TipoHada {
    public TapuFini(){
        super("TapuFini", 788, 1, 7, 70, 75, 115,
                95, 130, 85, 1);
        movimientos[0] = new Escaldar();
        movimientos[1] = new FuerzaLunar();
        movimientos[2] = new Burbuja();
        movimientos[3] = new Gigaimpacto();
    }
    public TapuFini(int nivel){
        super("TapuFini", 788, 1, 7, 70, 75, 115,
                95, 130, 85, nivel);
        movimientos[0] = new Escaldar();
        movimientos[1] = new FuerzaLunar();
        movimientos[2] = new Burbuja();
        movimientos[3] = new Gigaimpacto();
    }
    public TapuFini(String mote, int nivel){
        super(mote, 788, 1, 7, 70, 75, 115,
                95, 130, 85, nivel);
        movimientos[0] = new Escaldar();
        movimientos[1] = new FuerzaLunar();
        movimientos[2] = new Burbuja();
        movimientos[3] = new Gigaimpacto();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
