package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.util.Objects;

public abstract class Persona {
    String nombre;
    public Persona() {
        this.nombre = "";
    }
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        validarNombre(nombre);
        this.nombre = nombre;
    }
    public void validarNombre(String nombre){
        if (nombre == null){
            throw new IllegalArgumentException("El nombre no puede ser nulo");
        }
    }
}
