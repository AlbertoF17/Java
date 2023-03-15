package Boletines.BoletinHerencia1;

public class Hombres extends SerTierraMedia{
    //Ejercicio 4: los siguientes fueron los hombres mortales, raza hermana de los elfos y
    //enanos. Cree la clase Hombre y añádala a la jerarquía como estime conveniente. Los
    //hombres fueron bendecidos por el creador con el don de la mortalidad (muchas gracias,
    //máquina). Se caracterizan por tanto por el método morir, que no devuelve nada ni recibe
    //nada, e imprime por pantalla una frase indicando que el personaje muere. También saben
    //usar la espada.
    public void morir(){
        System.out.println("Sayonara, baby");
    }
    private void usarEspada(String objetivo){

    }
    @Override
    public void hablar(String frase) {

    }

    @Override
    public void moverse(String lugar) {

    }
}
