package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoDragon;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVolador;

import javax.naming.OperationNotSupportedException;

public class Salamence extends Pokemon implements TipoDragon, TipoVolador {
    public Salamence(){
        super("Salamence", 373, 3, 17, 95, 135, 80,
                110, 80, 100, 50);
        movimientos[0] = new CometaDraco();
        movimientos[1] = new Vendaval();
        movimientos[2] = new Lanzallamas();
        movimientos[3] = new Enfado();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Salamence(int nivel){
        super("Salamence", 373, 3, 17, 95, 135, 80,
                110, 80, 100, 50);
        movimientos[0] = new CometaDraco();
        movimientos[1] = new Vendaval();
        movimientos[2] = new Lanzallamas();
        movimientos[3] = new Enfado();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Salamence(String mote, int nivel){
        super(mote, 373, 3, 17, 95, 135, 80,
                110, 80, 100, nivel);
        movimientos[0] = new CometaDraco();
        movimientos[1] = new Vendaval();
        movimientos[2] = new Lanzallamas();
        movimientos[3] = new Enfado();
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
