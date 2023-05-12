package Practicas.CentroCultural;

public interface CentroCultural {
    int maxLibros = 15;
    int maxDiscos = 15;
    int maxClientes = 5;
    int maxPrestamos = 6;

    void registrarCliente(Cliente cliente) throws RegistroClienteException;
    void registrarMaterial(Material material) throws RegistroMaterialException;
}
