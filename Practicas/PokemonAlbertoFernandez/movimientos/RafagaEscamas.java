package Practicas.PokemonAlbertoFernandez.movimientos;

import Practicas.PokemonAlbertoFernandez.tipos.TipoDragon;

import java.util.Random;

public class RafagaEscamas extends Movimiento implements TipoDragon {
    Random rand = new Random();
    public RafagaEscamas(){
        super(25,100,15,15,6,0);
        potencia = potencia*rand.nextInt(2,6);
    }
}
