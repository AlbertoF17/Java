public class Alumno extends Persona implements Cloneable, Comparable {

    public Alumno() {
        super();
    }

    public Alumno(String nombre, int edad, String dni) {
        super(nombre, edad, dni);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                super.toString() + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Alumno(nombre, edad, dni);
    }

    @Override
    public int compareTo(Object o) {
        if (o == null) {
            return -1;
        }
        Alumno a = (Alumno) o;
        return this.nombre.compareTo(a.getNombre());
        /*
        if (this.nombre.equals(a.getNombre())){
            return 0;
        } else if (this.nombre.compareTo(a.getNombre()) > 0) {
            return 1;
        } else {
            return -1;
        }*/
    }

    public final void preguntarSinHaberLeido() {
        System.out.println(this.nombre + ": Que tengo que hacer en el ejercicio?");
    }
}
