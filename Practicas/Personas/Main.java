package Practicas.Personas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Ahora, crea una clase ejecutable que haga lo siguiente:
        // Pide por teclado el nombre, la edad, sexo, peso y altura
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
        // Crea 3 objetos de la clase anterior, el primer objeto obtendrá las
        //anteriores variables pedidas por teclado, el segundo objeto
        //obtendrá todos los anteriores menos el peso y la altura y el último
        //por defecto, para este último utiliza los métodos set para darle a
        //los atributos un valor.
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();
        // Para cada objeto, deberá comprobar si está en su peso ideal, tiene
        //sobrepeso o por debajo de su peso ideal con un mensaje.
        if (persona1.calcularIMC()<0){
            System.out.println("Persona 1: peso por debajo del ideal.");
        } else if (persona1.calcularIMC()==1) {
            System.out.println("Persona 1: peso ideal");
        } else {
            System.out.println("Persona 1: peso por encima del ideal.");
        }

        if (persona2.calcularIMC()<0){
            System.out.println("Persona 2: peso por debajo del ideal.");
        } else if (persona2.calcularIMC()==1) {
            System.out.println("Persona 2: peso ideal");
        } else {
            System.out.println("Persona 2: peso por encima del ideal.");
        }

        if (persona3.calcularIMC()<0){
            System.out.println("Persona 3: peso por debajo del ideal.");
        } else if (persona3.calcularIMC()==1) {
            System.out.println("Persona 3: peso ideal");
        } else {
            System.out.println("Persona 3: peso por encima del ideal.");
        }
        // Indicar para cada objeto si es mayor de edad.
        System.out.println("¿Son mayores de edad?");
        System.out.println("Persona 1: " + persona1.esMayorDeEdad());
        System.out.println("Persona 2: " + persona2.esMayorDeEdad());
        System.out.println("Persona 3: " + persona3.esMayorDeEdad());
        // Por último, mostrar la información de cada objeto.
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());
    }
}
