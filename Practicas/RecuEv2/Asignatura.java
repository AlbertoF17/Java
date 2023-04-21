package Practicas.RecuEv2;

public class Asignatura {
    private int codigo;
    private String nombre;
    private int creditos;
    private Alumno[] alumnos;
    private int ultValida;

    public Asignatura(int codigo, String nombre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        alumnos = new Alumno[30];
        ultValida = 0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public boolean addAlumno(Alumno al){
        for (int i = 0; i < alumnos.length; i++) {
            if (al == alumnos[i]){
                return false;
            }
        }
        alumnos[ultValida] = al;
        ultValida++;
        return true;
    }
}
