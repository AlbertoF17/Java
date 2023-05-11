package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.util.Objects;

public abstract class Vehiculo {
    String matricula;
    String marca;
    String modelo;
    public Vehiculo(String matricula, String marca, String modelo) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
    }
    public String getMatricula() {
        return matricula;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
//TODO VALIDADORES
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehiculo)) return false;
        return matricula.equals(((Vehiculo) o).getMatricula());
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricula, marca, modelo);
    }
}
