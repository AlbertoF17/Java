package Boletines.BoletinHerencia1;

public class Elfo extends SerTierraMedia {
    //Ejercicio 2: los elfos fueron los primeros en llegar, de entre todas las razas conocidas. Cree
    //la clase Elfo y añádala a la jerarquía como estime conveniente. Los elfos se caracterizan
    //porque pueden disparar con el arco (dispararArco) y hacer encantamientos (encantar).
    //Éstos métodos no devuelven nada, y reciben una cadena con el objetivo al que se quiere
    //disparar y el objetivo que se quiere encantar.
    public Elfo() {
    }
    public Elfo(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    @Override
    public String toString() {
        return "Elfo{" + super.toString() + "}";
    }
    void dispararArco(String nombreObjetivo){
        System.out.println(nombre + " disparó una flecha a: " + nombreObjetivo);
    }
    void encantar(String nombreObjetivo){
        System.out.println(nombre + " encantó a: " + nombreObjetivo);
    }
}
