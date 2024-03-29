package Apuntes.POO.Herencias;

public class Persona {
    public String nombre;
    public int edad;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void decirQueEres(){
        System.out.println("Yo soy una persona");
    }

    @Override
    public String toString() {
        return this.getClass() + "{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}
