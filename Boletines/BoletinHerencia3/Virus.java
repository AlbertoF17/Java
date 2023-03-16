package Boletines.BoletinHerencia3;

public class Virus {
    //5. Cree una clase para los virus, teniendo en cuenta que no son seres vivos.
    //1. Cree una clase SerVivo que tenga en sus atributos las tres dimensiones posibles (alto,
    //ancho y largo). Todo ser vivo se caracteriza porque puede realizar las siguientes tres
    //acciones: interactuar con el medio, nutrirse y reproducirse. La implementación de
    //estas acciones (y la del resto de ejercicios) no es relevante, vale con que al ejecutarse
    //se imprima un mensaje por pantalla con un texto relativo a la acción.
    double alto;
    double ancho;
    double largo;
    public void interactuar(){
        System.out.println("He interactuado con el entorno");
    }
    public void nutrirse(){
        System.out.println("He comido");
    }public void reproducirse() {
        System.out.println("Me reproduzco");
    }
}
