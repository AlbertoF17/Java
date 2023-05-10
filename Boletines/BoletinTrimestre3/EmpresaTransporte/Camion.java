package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.util.TreeSet;

public final class Camion extends Vehiculo implements Cloneable, Comparable<Camion>{
    TreeSet<Camionero> camioneros;
    public Camion(String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.camioneros = new TreeSet<>();
    }
    @Override
    public int compareTo(Camion o) {
        if(o == null){
            throw new IllegalArgumentException("No se pueden comparar ya que el parámetro introducido es nulo");
        }
        return this.matricula.compareTo(o.matricula);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public boolean haSidoUsado(Camionero c){
        return camioneros.contains(c);
    }
    public void concudirCamion(Camionero c){
        camioneros.add(c);
    }

    @Override
    public String toString() {
        String str = "Camionero{ ";
        for (Camionero c: camioneros) {
            str += c.getIdEmpleado() + ", ";
        }
        return str + ", matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
