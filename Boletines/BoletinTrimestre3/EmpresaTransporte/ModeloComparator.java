package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.util.Comparator;

public class ModeloComparator implements Comparator<Camion> {
    @Override
    public int compare(Camion o1, Camion o2) {
        return o1.getModelo().compareTo(o2.getModelo());
    }
}
