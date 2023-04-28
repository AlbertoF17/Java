package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoTierra;

import javax.naming.OperationNotSupportedException;

public class Groudon extends Pokemon implements TipoTierra {
    public Groudon(){
        super("Groudon", 383, 15, -1, 100, 150, 140,
                100, 90, 90, 1);
        movimientos[0] = new FiloDelAbismo();
        movimientos[1] = new RocaAfilada();
        movimientos[2] = new Terremoto();
        movimientos[3] = new TierraViva();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Groudon(int nivel){
        super("Groudon", 383, 15, -1, 100, 150, 140,
                100, 90, 90, nivel);
        movimientos[0] = new FiloDelAbismo();
        movimientos[1] = new RocaAfilada();
        movimientos[2] = new Terremoto();
        movimientos[3] = new TierraViva();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Groudon(String mote, int nivel){
        super(mote, 383, 15, -1, 100, 150, 140,
                100, 90, 90, nivel);
        movimientos[0] = new FiloDelAbismo();
        movimientos[1] = new RocaAfilada();
        movimientos[2] = new Terremoto();
        movimientos[3] = new TierraViva();
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
