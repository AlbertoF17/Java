package Practicas.CentroCultural;

import java.time.LocalDateTime;
import java.util.List;

public class Prestamo {

    Cliente cliente;
    LocalDateTime fechaInicio;
    LocalDateTime fechaFin;
    Material material;
    boolean devuelto;

    public Prestamo(Cliente cliente, LocalDateTime fechaInicio, LocalDateTime fechaFin,
                    Material material, boolean devuelto) {
        this.cliente = cliente;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.material = material;
        this.devuelto = devuelto;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public LocalDateTime getFechaFin() {
        return fechaFin;
    }

    public Material getMaterial() {
        return material;
    }

    public boolean isDevuelto() {
        return devuelto;
    }

    public void setDevuelto(boolean devuelto) {
        this.devuelto = devuelto;
    }

    @Override
    public String toString() {
        return "Prestamo{" +
                "material=" + material +
                ", fechaInicio=" + fechaInicio +
                ", fechaFin=" + fechaFin +
                ", devuelto=" + devuelto +
                '}' + '\n' + '\t';
    }


}