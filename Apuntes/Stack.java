package Apuntes;

import java.util.Stack;

class Main {
    //La clase Stack representa una pila de objetos “last-in-first-out” (LIFO).
    //Extiende la clase “Vector” con cinco operaciones que permiten tratar un vector como una pila.
    //Se proporcionan las operaciones habituales de push y pop, así como un método para mirar el elemento
    //superior de la pila, un método para probar si la pila está vacía y un método para buscar un elemento
    //en la pila y descubrir qué tan lejos está.
    //La pila inicialmente está vacía.
    //
    //Métodos:
    //empty(): comprueba si la pila está vacía, devuelve un boolean con el resultado.
    //pop(): elimina el objeto que está almacenado encima de la pila, retornándolo y convirtiendo la pila en la misma
    //sin ese objeto.
    //push(Tipo objetoDelTipo): añade a la parte superior de la pita el dato introducido por parámetro.
    //peek(): retorna el objeto que está almacenado encima de la pila sin eliminarlo.
    //search(Object objeto): devuelve la posición en la que se encuentra el objeto que se ha introducido
    //como parámetro en la pila.

    public static void main(String[] args) {
        Stack<String> stack = new Stack<String>();

        stack.push("A"); // Inserta "A" en la pila
        stack.push("B"); // Inserta "B" en la pila
        stack.push("C"); // Inserta "C" en la pila
        stack.push("D"); // Inserta "D" en la pila

        System.out.println("The top element is " + stack.peek()); // Imprime "D" ya que es la última letra insertada

        stack.pop(); // Elimina "D", ya que es la última letra insertada y, por tanto, está arriba en la pila
        stack.pop(); // Elimina "C" ya que es la letra que está más arriba en la pila

        System.out.println("The stack size is " + stack.size());

        if (stack.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }

        // Vaciamos la pila para volver a hacer el if para ver si ahora nos dice si está vacío
        for (int i = 0; i <= stack.size(); i++) {
            stack.pop();
        }

        if (stack.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}