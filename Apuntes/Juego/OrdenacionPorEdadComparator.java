package Apuntes.Juego;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class OrdenacionPorEdadComparator implements Comparator<Persona>{
    @Override
    public int compare(Persona o1, Persona o2) {
        if (o1 == null || o2 == null){
            throw new IllegalArgumentException("Alguna de las personas son nulas");
        }
        return o1.edad - o2.edad;
    }
    @Override
    public Comparator<Persona> reversed() {
        return Comparator.super.reversed();
    }
}
