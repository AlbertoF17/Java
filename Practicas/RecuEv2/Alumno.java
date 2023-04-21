package Practicas.RecuEv2;

public class Alumno {
    private String dni;
    private String nombre;
    private String apellido;
    private Asignatura[] asignaturas;
    private int ultValida;

    public Alumno() {
    }

    public Alumno(String dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        asignaturas = new Asignatura[10];
        ultValida = 0;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public boolean matricular(Asignatura as){
        for (int i = 0; i < asignaturas.length; i++) {
            if (as == asignaturas[i]){
                return false;
            }
        }
        asignaturas[ultValida] = as;
        ultValida++;
        as.addAlumno(this);
        return true;
    }
}
