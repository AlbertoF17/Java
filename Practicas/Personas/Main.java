package Practicas.Personas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Ahora, crea una clase ejecutable que haga lo siguiente:
        // Pide por teclado el nombre, la edad, sexo, peso y altura.
        // Crea 3 objetos de la clase anterior, el primer objeto obtendrá las
        //anteriores variables pedidas por teclado, el segundo objeto
        //obtendrá todos los anteriores menos el peso y la altura y el último
        //por defecto, para este último utiliza los métodos set para darle a
        //los atributos un valor.
        // Para cada objeto, deberá comprobar si está en su peso ideal, tiene
        //sobrepeso o por debajo de su peso ideal con un mensaje.
        // Indicar para cada objeto si es mayor de edad.
        // Por último, mostrar la información de cada objeto.
        System.out.print("Introduce tu nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce tu sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.print("Introduce tu peso: ");
        double peso = sc.nextDouble();
        System.out.print("Introduce tu altura: ");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
    }
}
