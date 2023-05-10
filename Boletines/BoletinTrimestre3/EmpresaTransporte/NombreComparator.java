package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.util.Comparator;

public class NombreComparator implements Comparator<Camionero> {
    @Override
    public int compare(Camionero o1, Camionero o2) {
        return o1.getNombre().compareTo(o2.getNombre());
    }
}