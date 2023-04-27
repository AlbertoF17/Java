package Practicas.PokemonAlbertoFernandez.pokemons;

import Practicas.PokemonAlbertoFernandez.movimientos.Burbuja;
import Practicas.PokemonAlbertoFernandez.movimientos.Escaldar;
import Practicas.PokemonAlbertoFernandez.movimientos.PulsoPrimigenio;
import Practicas.PokemonAlbertoFernandez.movimientos.RayoHielo;
import Practicas.PokemonAlbertoFernandez.tipos.TipoAgua;

import javax.naming.OperationNotSupportedException;

public class Kyogre extends Pokemon implements TipoAgua {
    public Kyogre(){
        super("Kyogre", 382, 1, -1, 100, 100, 90,
                150, 140, 90, 50);
        movimientos[0] = new Escaldar();
        movimientos[1] = new RayoHielo();
        movimientos[2] = new PulsoPrimigenio();
        movimientos[3] = new Burbuja();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Kyogre(int nivel){
        super("Kyogre", 382, 1, -1, 100, 100, 90,
                150, 140, 90, nivel);
        movimientos[0] = new Escaldar();
        movimientos[1] = new RayoHielo();
        movimientos[2] = new PulsoPrimigenio();
        movimientos[3] = new Burbuja();
        //VALORES EXTRA PORQUE SINO DA ERROR
        psMax = psBase;
        ps = psBase;
    }
    public Kyogre(String mote, int nivel){
        super(mote, 382, 1, -1, 100, 100, 90,
                150, 140, 90, nivel);
        movimientos[0] = new Escaldar();
        movimientos[1] = new RayoHielo();
        movimientos[2] = new PulsoPrimigenio();
        movimientos[3] = new Burbuja();
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