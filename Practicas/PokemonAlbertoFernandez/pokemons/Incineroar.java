package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.*;
import Practicas.PokemonAlbertoFernandez.tipos.TipoFuego;
import Practicas.PokemonAlbertoFernandez.tipos.TipoSiniestro;

import javax.naming.OperationNotSupportedException;

public class Incineroar extends Pokemon implements TipoFuego, TipoSiniestro {
    public Incineroar(){
        super("Incineroar", 727, 6, 14, 95, 115, 90,
                80, 90, 60, 1);
        movimientos[0] = new ColmilloIgneo();
        movimientos[1] = new EnviteIgneo();
        movimientos[2] = new IdaYVuelta();
        movimientos[3] = new Desarme();
    }
    public Incineroar(int nivel){
        super("Incineroar", 727, 6, 14, 95, 115, 90,
                80, 90, 60, nivel);
        movimientos[0] = new ColmilloIgneo();
        movimientos[1] = new EnviteIgneo();
        movimientos[2] = new IdaYVuelta();
        movimientos[3] = new Desarme();
    }
    public Incineroar(String mote, int nivel){
        super(mote, 727, 6, 14, 95, 115, 90,
                80, 90, 60, nivel);
        movimientos[0] = new ColmilloIgneo();
        movimientos[1] = new EnviteIgneo();
        movimientos[2] = new IdaYVuelta();
        movimientos[3] = new Desarme();
    }
    @Override
    public Pokemon evolucionar() throws OperationNotSupportedException {
        throw new OperationNotSupportedException(this.getClass().getSimpleName() +
                " está en su evolución final y no puede evolucionar");
    }
}
