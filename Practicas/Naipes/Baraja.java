package Practicas.Naipes;

import java.util.Random;

public class Baraja {
    private Carta[] cartas;
    private Carta[] monton;

    public Baraja() {
        this.cartas = new Carta[48];
        this.monton = new Carta[48];
        generarCartas();
        barajar();
    }

    private void barajar() {
        Random rand = new Random();
        for (int i = 0; i < cartas.length; i++) {
            int indiceRandom = rand.nextInt(0, cartas.length-1);
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
}
