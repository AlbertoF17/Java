package Boletines.BoletinHerencia1;

public class Enano extends SerTierraMedia{
    //Ejercicio 3: los siguientes fueron los enanos, raza hermana de los elfos. Cree la clase
    //Enano y añádala a la jerarquía como estime conveniente. Los enanos se caracterizan
    //porque pueden golpear con el hacha (usarHacha) y hacer armaduras (crearArmadura).
    //Éstos métodos no devuelven nada, y reciben una cadena.
    public Enano() {
        super();
    }
    public Enano(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    @Override
    public String toString() {
        return "Enanos{" + super.toString() + "}";
    }
    void usarHacha(String objetivo){

    }
    void crearArmadura(String armadura){

    }
}
