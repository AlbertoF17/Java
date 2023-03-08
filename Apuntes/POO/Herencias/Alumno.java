package Apuntes.POO.Herencias;

public class Alumno extends Persona{
    @Override //Sobrescribe "decirQueEres()" de la clase persona
    public void decirQueEres(){
        System.out.println("Yo soy un alumno");
    }
}
