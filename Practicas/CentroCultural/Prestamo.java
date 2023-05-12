package Practicas.CentroCultural;

import java.time.LocalDateTime;
import java.util.List;

public class Prestamo {
    Cliente cliente;
    LocalDateTime fechaInicio;
    LocalDateTime fechaFin;
    Material material;
    //List<Prestamo> prestamos; LA TIENE QUE TENER EL CLIENTE??

    public Prestamo(Cliente cliente, LocalDateTime fechaInicio, LocalDateTime fechaFin, Material material) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.material = material;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "material=" + material +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                '}' + '\n' + '\t';
    }
}