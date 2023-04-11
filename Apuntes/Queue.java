package Apuntes;

import java.util.LinkedList;
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
        Queue<Integer> q1 = new LinkedList<Integer>();
        //Add elements to the Queue
        q1.add(10);
        q1.add(20);
        q1.add(30);
        q1.add(40);
        q1.add(50);
        System.out.println("Elements in Queue:"+q1);
        //remove () method =>removes first element from the queue
        System.out.println("Element removed from the queue: "+q1.remove());
        //element() => returns head of the queue
        System.out.println("Head of the queue: "+q1.element());
        //poll () => removes and returns the head
        System.out.println("Poll():Returned Head of the queue: "+q1.poll());
        //returns head of the queue
        System.out.println("peek():Head of the queue: "+q1.peek());
        //print the contents of the Queue
        System.out.println("Final Queue:"+q1);
    }
}