package Practicas.CentroCultural;

import java.util.Scanner;

public interface CentroCultural {
    final int DURACION_PRESTAMO = 3;
    int maxLibros = 3;
    int maxDiscos = 3;

    void registrarCliente(Cliente cliente) throws RegistroClienteException;
    void registrarMaterial(Material material) throws RegistroMaterialException;
}
