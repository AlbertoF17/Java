package Apuntes.Juego;

import java.util.Comparator;

public class OrdenacionPorAlturaComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1 == null || o2 == null){
            throw new IllegalArgumentException("Alguna de las personas son nulas");
        }
        return o2.altura - o1.altura <= 0 ? (int) Math.floor(o2.altura - o1.altura) : (int) Math.ceil(o2.altura - o1.altura);
    }

    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
