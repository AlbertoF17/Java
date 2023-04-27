package Practicas.PokemonAlbertoFernandez.movimientos;

import Practicas.PokemonAlbertoFernandez.tipos.TipoRoca;

import java.util.Random;

public class Pedrada extends Movimiento implements TipoRoca {
    Random rand = new Random();
    public Pedrada(){
        super(25,90,10,10,13,1);
        potencia = potencia * rand.nextInt(2,6);
    }
}
