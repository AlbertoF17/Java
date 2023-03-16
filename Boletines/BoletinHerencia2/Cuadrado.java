package Boletines.BoletinHerencia2;

public class Cuadrado extends Rectangulo{
    //3. Cree una clase Cuadrado, teniendo en cuenta que un cuadrado es un caso de
    //rectángulo especializado en el que la base es igual a la altura. Piense en el método
    //calcularArea y modifíquelo si lo estima conveniente.
    public Cuadrado(){
        super();
    }
    public Cuadrado(double lado){
        super();
        altura = lado;
    }
}
