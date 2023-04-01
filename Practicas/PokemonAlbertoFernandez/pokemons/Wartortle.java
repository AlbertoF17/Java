package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.Burbuja;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAgua;

import javax.naming.OperationNotSupportedException;

public class Wartortle extends Pokemon implements TipoAgua {
    public Wartortle(){
        super("Wartortle", 8, 1, -1, 59, 63, 80,
                65, 80, 58, 1);
        movimientos[0] = new Burbuja();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Wartortle(int nivel){
        super("Wartortle", 8, 1, -1, 59, 63, 80,
                65, 80, 58, nivel);
        movimientos[0] = new Burbuja();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Wartortle(String mote, int nivel){
        super(mote, 8, 1, -1, 59, 63, 80,
                65, 80, 58, nivel);
        movimientos[0] = new Burbuja();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        if (nivel < 36){
            throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                    " aún no está preparado para evolucionar");
        } else {
            Pokemon pokemonEvolucionado = new Blastoise(mote, nivel);
            return pokemonEvolucionado;
        }
    }
}
