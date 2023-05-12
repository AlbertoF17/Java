package Practicas.CentroCultural;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String dni;
    String nombre;
    List<Disco> discosActuales;
    List<Libro> librosActuales;
    List<Prestamo> prestamos;

    public Cliente(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
        discosActuales = new ArrayList<>(0);
        librosActuales = new ArrayList<>(0);
        prestamos = new ArrayList<>(0);
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Disco> getDiscosActuales() {
        return discosActuales;
    }


    public List<Libro> getLibrosActuales() {
        return librosActuales;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }
}