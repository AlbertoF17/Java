package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.util.TreeSet;

public final class Camionero extends Trabajador implements Cloneable, Comparable<Camionero>{
    TreeSet<Camion> camiones;
    public Camionero(int idEmpleado, String nombre, float salario) {
        super(idEmpleado, nombre, salario);
        this.camiones = new TreeSet<>();
    }
    public TreeSet<Camion> getCamiones() {
        return camiones;
    }
    @Override
    public int compareTo(Camionero o) {
        if(o == null){
            throw new IllegalArgumentException("No se pueden comparar ya que el parámetro introducido es nulo");
        }
        return this.idEmpleado - o.idEmpleado;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public boolean haUsadoCamion(Camion c){
        return camiones.contains(c);
    }
    public void concudirCamion(Camion c){
        camiones.add(c);
    }

    @Override
    public String toString() {
        String str = "Camionero{ ";
        for (Camion c: camiones) {
            str += c.getMatricula() + ", ";
        }
        return str + ", idEmpleado=" + idEmpleado +
                ", salario=" + salario +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
