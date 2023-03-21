package Boletines.BoletinHerencia1;

import javax.naming.OperationNotSupportedException;

public class Hobbit extends Hombre{
    //Ejercicio 6: finalmente llegaron los hobbits. Los sabios creen que esta raza proviene de los
    //humanos, puesto que en sus comienzos hablaban la lengua común y no tenían idioma
    //propio. Cree la clase Hobbit y añádala a la jerarquía como estime conveniente. Los hobbits
    //se caracterizan por dos cosas: fumar hierba para pipa y comer como si no hubiera mañana.
    //Saben disparar el arco, tirar piedras pero no usar la espada.

    public Hobbit() {
        super();
    }

    public Hobbit(String nombre, String apellido, String apodo) {
        super(nombre, apellido, apodo);
    }

    @Override
    public String toString() {
        return "Hobbits{" + super.toString() + "}";
    }

    void fumarHierba(){
        System.out.println(nombre + " ha fumado pipa");
    }
    void comerMucho(){
        System.out.println(nombre + " está comiendo");
    }
    void dispararArco(String nombreObjetivo){
        System.out.println(nombre + " disparó una flecha a: " + nombreObjetivo);
    }
    void tirarPiedras(String nombreObjetivo){
        System.out.println(nombre + " le tiró una piedra a: " + nombreObjetivo);
    }

    @Override
    void usarEspada(String objetivo) throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Los hobbits no pueden usar la espada");
    }
}
