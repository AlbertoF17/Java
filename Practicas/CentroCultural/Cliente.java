package Practicas.CentroCultural;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String dni;
    String nombre;
    List<Disco> discosActuales = new ArrayList<>(3);
    List<Libro> librosActuales = new ArrayList<>(3);
}
