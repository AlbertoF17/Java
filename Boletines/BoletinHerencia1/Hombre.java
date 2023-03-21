package Boletines.BoletinHerencia1;

import javax.naming.OperationNotSupportedException;

public class Hombre extends SerTierraMedia{
    //Ejercicio 4: los siguientes fueron los hombres mortales, raza hermana de los elfos y
    //enanos. Cree la clase Hombre y añádala a la jerarquía como estime conveniente. Los
    //hombres fueron bendecidos por el creador con el don de la mortalidad (muchas gracias,
    //máquina). Se caracterizan por tanto por el método morir, que no devuelve nada ni recibe
    //nada, e imprime por pantalla una frase indicando que el personaje muere. También saben
    //usar la espada.
    public Hombre() {
        super();
    }
    public Hombre(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    @Override
    public String toString() {
        return "Hombres{" + super.toString() + "}";
    }

    void morir(){
        System.out.println(nombre + "ha muerto. Sayonara, baby");
    }
    void usarEspada(String objetivo) throws OperationNotSupportedException {
        System.out.println(nombre + "le dió un espadazo a: " + objetivo);
    }
}
