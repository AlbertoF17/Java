package Boletines.BoletinHerencia1;

public class Orco extends Elfo{
    //Ejercicio 5: los orcos fueron creados a partir de los elfos, mediante técnicas de tortura y
    //corrupción. Cree la clase Orco y añádala a la jerarquía como estime conveniente. Los orcos,
    //además de disparar con arco y hacer encantamientos, saben envenenar flechas.
    //Implemente dicho método como los anteriores.

    public Orco() {
        super();
    }

    public Orco(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    @Override
    public String toString() {
        return "Orco{" + super.toString() + "}";
    }

    void envenenarFlechas(){

    }
    void hablar(String frase) {

    }

    @Override
    void moverse(String lugar) {

    }
}
