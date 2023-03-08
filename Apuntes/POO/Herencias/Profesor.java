package Apuntes.POO.Herencias;

public class Profesor extends Persona{
    public String credencialProfesor;

    public Profesor(){
        super();
        credencialProfesor = "";
    }

    public Profesor(String nombre, int edad, String credencialProfesor){
        super(nombre, edad);
        this.credencialProfesor = credencialProfesor;
    }

    public String getCredencialProfesor() {
        return credencialProfesor;
    }

    public void setCredencialProfesor(String credencialProfesor) {
        this.credencialProfesor = credencialProfesor;
    }

    @Override
    public String toString() {
        return super.toString() +
                "credencialProfesor='" + credencialProfesor +
                '}';
    }
    @Override //Sobrescribe "decirQueEres()" de la clase persona
    public void decirQueEres(){
        System.out.println("Yo soy un profesor");
    }
    public void metodoProfesor() {
        System.out.println("Este es un método de la clase profesor");
    }
}
