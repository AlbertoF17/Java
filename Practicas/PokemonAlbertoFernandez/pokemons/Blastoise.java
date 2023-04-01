package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.Burbuja;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAgua;

import javax.naming.OperationNotSupportedException;

public class Blastoise extends Pokemon implements TipoAgua {
    public Blastoise(){
        super("Blastoise", 8, 1, -1, 79, 83, 100,
                85, 105, 78, 1);
        movimientos[0] = new Burbuja();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Blastoise(int nivel){
        super("Blastoise", 8, 1, -1, 79, 83, 100,
                85, 105, 78, nivel);
        movimientos[0] = new Burbuja();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Blastoise(String mote, int nivel){
        super(mote, 8, 1, -1, 79, 83, 100,
                85, 105, 78, nivel);
        movimientos[0] = new Burbuja();
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
