package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAgua;
import Practicas.PokemonAlbertoFernandez.tipos.TipoTierra;

import javax.naming.OperationNotSupportedException;

public class Gastrodon extends Pokemon implements TipoAgua, TipoTierra {
    public Gastrodon(){
        super("Gastrodon", 423, 1, 15, 111, 83, 68,
                92, 82, 39, 1);
        movimientos[0] = new TierraViva();
        movimientos[1] = new RayoHielo();
        movimientos[2] = new Escaldar();
        movimientos[3] = new PoderPasado();
    }
    public Gastrodon(int nivel){
        super("Gastrodon", 423, 1, 15, 111, 83, 68,
                92, 82, 39, nivel);
        movimientos[0] = new TierraViva();
        movimientos[1] = new RayoHielo();
        movimientos[2] = new Escaldar();
        movimientos[3] = new PoderPasado();;
    }
    public Gastrodon(String mote, int nivel){
        super(mote, 423, 1, 15, 111, 83, 68,
                92, 82, 39, nivel);
        movimientos[0] = new TierraViva();
        movimientos[1] = new RayoHielo();
        movimientos[2] = new Escaldar();
        movimientos[3] = new PoderPasado();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
