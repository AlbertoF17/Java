package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoTierra;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVolador;

import javax.naming.OperationNotSupportedException;

public class Landorus extends Pokemon implements TipoTierra, TipoVolador {
    public Landorus(){
        super("Landorus", 645, 15, 17, 89, 125, 90,
                115, 80, 101, 1);
        movimientos[0] = new TierraViva();
        movimientos[1] = new RocaAfilada();
        movimientos[2] = new Desarme();
        movimientos[3] = new FuerzaBruta();
    }
    public Landorus(int nivel){
        super("Landorus", 645, 15, 17, 89, 125, 90,
                115, 80, 101, nivel);
        movimientos[0] = new TierraViva();
        movimientos[1] = new RocaAfilada();
        movimientos[2] = new Desarme();
        movimientos[3] = new FuerzaBruta();
    }
    public Landorus(String mote, int nivel){
        super(mote, 645, 15, 17, 89, 125, 90,
                115, 80, 101, nivel);
        movimientos[0] = new TierraViva();
        movimientos[1] = new RocaAfilada();
        movimientos[2] = new Desarme();
        movimientos[3] = new FuerzaBruta();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
