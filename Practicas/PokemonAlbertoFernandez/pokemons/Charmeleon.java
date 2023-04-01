package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.Ascuas;
import Practicas.PokemonAlbertoFernandez.tipos.TipoFuego;

import javax.naming.OperationNotSupportedException;

public class Charmeleon extends Pokemon implements TipoFuego {
    public Charmeleon(){
        super("Charmeleon", 5, 6, -1, 58,
                64, 58, 80, 65, 80, 1);
        movimientos[0] = new Ascuas();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Charmeleon(int nivel){
        super("Charmeleon", 5, 6, -1, 58,
                64, 58, 80, 65, 80, nivel);
        movimientos[0] = new Ascuas();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Charmeleon(String mote, int nivel){
        super(mote, 5, 6, -1, 58,
                64, 58, 80, 65, 80, nivel);
        movimientos[0] = new Ascuas();
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
            Pokemon pokemonEvolucionado = new Charizard(mote, nivel);
            return pokemonEvolucionado;
        }
    }
}
