package Boletines.BoletinHerencia1;

public abstract class SerTierraMedia {
    //Ejercicio 1: todas las razas humanoides de Tolkien (elfos, enanos, hombres, orcos y
    //hobbits) descienden de un ancestro común que llegó a la Tierra Media y era capaz de
    //hablar y moverse. Los seres de esta raza inicial tenían un nombre que los identificaba a
    //cada uno de ellos y los distinguía del resto. También tenían un apellido y un apodo. Cree
    //una clase SerTierraMedia que modele la raza inicial (y solo la raza inicial). Los métodos
    //para hablar y moverse no devuelven nada, y reciben una cadena de texto con la frase que
    //se quiere decir y el lugar al que se quiere mover.
    private String nombre;
    private String apellido;
    private String apodo;

    abstract void hablar(String frase);
    abstract void moverse(String lugar);
}
