package Practicas.CentroCultural;

public interface CentroCultural {

    int maxLibros = 3;
    int maxDiscos = 3;

    void registrarCliente(Cliente cliente) throws RegistroClienteException;
    void registrarMaterial(Material material) throws RegistroMaterialException;
}
