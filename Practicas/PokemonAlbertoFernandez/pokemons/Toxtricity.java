package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoElectrico;
import Practicas.PokemonAlbertoFernandez.tipos.TipoVeneno;

import javax.naming.OperationNotSupportedException;

public class Toxtricity extends Pokemon implements TipoElectrico, TipoVeneno {
    public Toxtricity(){
        super("Toxtricity", 849, 4, 16, 75, 98, 70,
                114, 70, 75, 50);
        movimientos[0] = new Estruendo();
        movimientos[1] = new Amplificador();
        movimientos[2] = new VoltioCambio();
        movimientos[3] = new Alarido();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Toxtricity(int nivel){
        super("Toxtricity", 849, 4, 16, 75, 98, 70,
                114, 70, 75, 50);
        movimientos[0] = new Estruendo();
        movimientos[1] = new Amplificador();
        movimientos[2] = new VoltioCambio();
        movimientos[3] = new Alarido();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Toxtricity(String mote, int nivel){
        super(mote, 849, 4, 16, 75, 98, 70,
                114, 70, 75, nivel);
        movimientos[0] = new Estruendo();
        movimientos[1] = new Amplificador();
        movimientos[2] = new VoltioCambio();
        movimientos[3] = new Alarido();
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
