package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.util.Objects;

public class Trabajador extends Persona{
    int idEmpleado;
    float salario;
    public Trabajador() {
        super();
        this.idEmpleado = 0;
        this.salario = 0;
    }
    public Trabajador(int idEmpleado, String nombre, float salario) {
        super(nombre);
        this.idEmpleado = idEmpleado;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        validarSalario(salario);
        this.salario = salario;
    }

    public void validarSalario(float salario){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trabajador that)) return false;
        if (!super.equals(o)) return false;
        return idEmpleado == that.idEmpleado;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), idEmpleado, salario);
    }
}
