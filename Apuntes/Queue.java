package Apuntes;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class QueueClass {
    //Queue es una colección diseñada para contener elementos antes del procesamiento.
    //Además de las operaciones básicas de recopilación, las colas o queues proporcionan operaciones
    //adicionales de inserción, extracción e inspección. Cada uno de estos métodos existe en dos formas:
    //uno lanza una excepción si la operación falla, el otro devuelve un valor especial
    //(ya sea nulo o falso, dependiendo de la operación). La última forma de la operación de inserción está
    //diseñada específicamente para su uso con implementaciones de Queue con capacidad restringida;
    //en la mayoría de las implementaciones, las operaciones de inserción no pueden fallar.
    //
    //Métodos:
        //Inserción:
            //Lanza excepción:
                //add(Tipo objetoDelTipo): inserta el elemento especificado en esta cola si es posible hacerlo de
                //inmediato sin infringir las restricciones de capacidad, devolviendo verdadero en caso de éxito y
                //lanzando una IllegalStateException si no hay espacio disponible.
            //Retorna valor especial:
                //offer(Tipo objetoDelTipo): Inserta el elemento especificado en esta cola si es
                //posible hacerlo inmediatamente sin violar las restricciones de capacidad.
        //Eliminación:
            //Lanza excepción:
                //remove(): Recupera y elimina el encabezado de esta cola.
            //Retorna valor especial:
                //poll(): Recupera y elimina el encabezado de la cola, o devuelve un valor nulo si esta cola está vacía.
        //Examinación:
            //Lanza excepción:
                //element(): Recupera, pero no elimina, el encabezado de esta cola.
            //Retorna valor especial:
                //peek(): retorna el objeto que está almacenado encima de la pila sin eliminarlo.
    public static void main(String[] args) {
        //Declaramos la cola y le añadimos elementos
        Queue<Integer> q1 = new LinkedList<Integer>(List.of(10, 20, 30, 40, 50));
        //También se pueden agregar elementos de la siguiente manera (ya sea usando add u offer)
        q1.add(60);
        q1.add(70);
        q1.offer(80);
        q1.offer(90);
        q1.offer(100);
        //Imprimimos la cola inicial
        System.out.println("Elementos de la cola:" + q1);
        //Usamos remove para eliminar el primer elemento
        System.out.println("Elemento eliminado de la cola: " + q1.remove());
        //Usamos element para retornar el primer elemento SIN eliminarlo
        System.out.println("Cabeza de la cola: " + q1.element());
        //Usamos poll para retornar el primer elemento ELIMINÁNDOLO
        System.out.println("Cabeza de la cola (se eliminará): " + q1.poll());
        //Usamos peek para retornar la cabeza de la cola, de nuevo sin eliminar
        System.out.println("Cabeza de la cola actual: " + q1.peek());
        //Imprimimos la cola resultante
        System.out.println("Cola resultante:" + q1);
    }
}