package Practicas.Naipes;

import java.util.Random;

public class Baraja {
    private Carta[] cartas;
    private int ultimoIndiceCartas;
    private Carta[] monton;
    private int ultimoIndiceMonton;

    public Baraja() {
        this.cartas = new Carta[48];
        this.monton = new Carta[48];
        ultimoIndiceCartas = 47;
        ultimoIndiceMonton = -1;
        generarCartas();
        barajar();
    }

    private void barajar() {
        Random rand = new Random();
        for (int i = 0; i <= ultimoIndiceCartas; i++) {
            int indiceRandom = rand.nextInt(0, ultimoIndiceCartas+1);
            Carta temp = cartas[i];
            cartas[i] = cartas[indiceRandom];
            cartas[indiceRandom] = temp;
        }
    }

    private void generarCartas() {
        int indice = 0;
        for (int i = 1; i <=12 ; i++) {
            Carta c = new Carta(i, Palo.ESPADAS);
            cartas[indice] = c;
            indice++;
        }
        for (int i = 1; i <=12 ; i++) {
            Carta c = new Carta(i, Palo.OROS);
            cartas[indice] = c;
            indice++;
        }
        for (int i = 1; i <=12 ; i++) {
            Carta c = new Carta(i, Palo.COPAS);
            cartas[indice] = c;
            indice++;
        }
        for (int i = 1; i <=12 ; i++) {
            Carta c = new Carta(i, Palo.BASTOS);
            cartas[indice] = c;
            indice++;
        }
    }

    void imprimirCartas(){
        for (int i = 0; i < cartas.length; i++) {
            System.out.println(cartas[i]);
        }
    }

    void imprimirMonton(){
        for (int i = 0; i < monton.length; i++) {
            System.out.println(monton[i]);
        }
    }

    public int getCartasDisponibles(){
        return ultimoIndiceCartas+1;
    }

    public Carta darCarta() throws CartaException {
        if (ultimoIndiceCartas<0){
            throw new CartaException("No hay más cartas para repartir");
        }
        Carta c = cartas[ultimoIndiceCartas];
        cartas[ultimoIndiceCartas] = null;
        ultimoIndiceCartas--;
        ultimoIndiceMonton++;
        monton[ultimoIndiceMonton] = c;
        return c;
    }

    public Carta[] darCartas(int numCartas) throws CartaException {
        if (numCartas > getCartasDisponibles()){
            throw new CartaException("No hay tantas cartas para repartir");
        }
        Carta[] arrayCartas = new Carta[numCartas];
        for (int i = 0; i < arrayCartas.length; i++) {
            arrayCartas[i] = darCarta();
        }
        return arrayCartas;
    }
}
