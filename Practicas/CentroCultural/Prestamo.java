package Practicas.CentroCultural;

import java.time.LocalDate;
import java.util.List;

public class Prestamo {

    Cliente cliente;
    LocalDate fechaInicio;
    LocalDate fechaFin;
    Material material;
    boolean devuelto;

    public Prestamo(Cliente cliente, LocalDate fechaInicio, LocalDate fechaFin,
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

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
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