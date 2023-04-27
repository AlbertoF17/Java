package Practicas.PokemonAlbertoFernandez.movimientos;

import Practicas.PokemonAlbertoFernandez.movimientos.Movimiento;
import Practicas.PokemonAlbertoFernandez.tipos.TipoLucha;

public class FuerzaBruta extends Movimiento implements TipoLucha {
    public FuerzaBruta(){
        super(120,100,5,5,9,1);
    }
}
