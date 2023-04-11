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

        stack.push("A");    // Insert `A` into the stack
        stack.push("B");    // Insert `B` into the stack
        stack.push("C");    // Insert `C` into the stack
        stack.push("D");    // Insert `D` into the stack

        // prints the top of the stack (`D`)
        System.out.println("The top element is " + stack.peek());

        stack.pop();        // removing the top element (`D`)
        stack.pop();        // removing the next top (`C)

        // returns the total number of elements present in the stack
        System.out.println("The stack size is " + stack.size());

        // check if the stack is empty
        if (stack.empty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}