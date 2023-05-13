package Practicas.CentroCultural;

import java.util.ArrayList;
import java.util.List;

public final class Cliente {
    String dni;
    String nombre;
    String apellido1;
    String apellido2;
    List<Disco> discosActuales;
    List<Libro> librosActuales;
    List<Prestamo> prestamos;

    public Cliente(String dni, String nombre, String apellido1, String apellido2) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
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

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
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