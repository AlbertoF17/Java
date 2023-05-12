package Practicas.CentroCultural;

import java.time.LocalDateTime;
import java.util.List;

public class Prestamo {
    Cliente cliente;
    LocalDateTime fechaInicio;
    LocalDateTime fechaFin;
    Material material;
    //List<Prestamo> prestamos;

    public Prestamo(Cliente cliente, LocalDateTime fechaInicio, LocalDateTime fechaFin, Material material) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.material = material;
    }
}
