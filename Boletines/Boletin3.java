package Boletines;
import java.util.Scanner;
public class Boletin3 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        //1. Lee por pantalla un nombre y almacénalo en una variable. Imprime la variable por pantalla.
        System.out.print("Introduzca su nombre: ");
        String nombre = lector.nextLine();
        System.out.println("Su nombre es: " + nombre);

        //2. Lee por pantalla una edad y almacénalo en una variable. Imprime la variable por pantalla.
        System.out.print("Introduzca su edad: ");
        int edad = lector.nextInt();
        System.out.println("Su edad es: " + edad);

        //3. ¿Pueden modificarse los ejercicios anteriores para ahorrarse la variable?
        //Sí, pero no se almacena el dato en ninguna variable.

        //4.a Lee por pantalla una temperatura en grados Celsius e imprímela por pantalla.
        System.out.println("Introduzca una temperatura en Celsius");
        float temp = lector.nextFloat();
        System.out.println(temp);

        //4.b Repite, pero imprimiendo por pantalla en grados Kelvin (hay que convertir).
        System.out.println(temp + " grados Celsius son " + (temp + 273.15f) + " grados Kelvin");

        //5. Crea un programa que calcule el área de un rectángulo (base x altura),
        //pidiendo por pantalla los datos necesarios.
        System.out.print("Introduzca la base del rectángulo: ");
        int base = lector.nextInt();
        System.out.print("Introduzca la altura del rectángulo: ");
        int altura = lector.nextInt();
        System.out.println("El area del rectángulo es: " + base * altura + " metros cuadrados");

        //6. Crea un programa que calcule el Índice de Masa Corporal (IMC), pidiendo
        //por pantalla los datos necesarios.
        System.out.print("Introduzca su peso en kilos: ");
        float peso = lector.nextFloat();
        System.out.print("Introduzca su altura en metros: ");
        float alto = lector.nextFloat();
        float IMC = peso / (alto * alto);
        System.out.println("Su IMC es: " + IMC);
        if (IMC < 18.5) {
            System.out.println("Usted es calificada como persona de bajo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("Usted es calificada como persona con peso normal");
        } else if (IMC >= 25 && IMC <= 29.9) {
            System.out.println("Usted es calificada como persona con sobrepeso");
        } else {
            System.out.println("Usted es calificada como persona con obesidad");
        }


        //7. Crea un programa que lea el precio sin IVA de un producto e imprima
        //el valor final con IVA del mismo.
        System.out.print("Introduzca el precio sin IVA: ");
        float precio = lector.nextFloat();
        System.out.println("El precio con IVA es: " + (precio * 1.21));

        //8. Crea un programa que lea el precio sin IVA de tres productos e imprima
        //el valor total con IVA que paga el comprador, así como el valor medio con y sin IVA.
        System.out.print("Introduzca el precio sin IVA del producto 1: ");
        float prod1 = lector.nextFloat();
        System.out.print("Introduzca el precio sin IVA del producto 2: ");
        float prod2 = lector.nextFloat();
        System.out.print("Introduzca el precio sin IVA del producto 3: ");
        float prod3 = lector.nextFloat();
        float precioSinIVA = prod1 + prod2 + prod3;
        float precioConIVA = precioSinIVA * 1.21f;
        System.out.println("El valor total de la compra (IVA incluido) es: " + precioConIVA + "euros");
        System.out.println("El valor medio del precio con/sin IVA es: " + (precioSinIVA + precioConIVA) / 2 + "euros");

        //9. Crea un programa que lea el nombre de una persona, y a continuación su edad
        //y altura, e imprima todo por pantalla en una misma línea. ¿Funciona?
        System.out.print("Introduzca su nombre: ");
        lector.nextLine();
        String nombre1 = lector.nextLine();
        System.out.print("Introduzca su edad: ");
        int edad1 = lector.nextInt();
        System.out.print("Introduzca su altura: ");
        float altura1 = lector.nextFloat();
        System.out.println("Nombre: " + nombre1 + "; Edad: " + edad1 + "; Altura: " + altura1);

        //10. Repita el ejercicio anterior pero leyendo primero los números y después el nombre. ¿Funciona?
        System.out.print("Introduzca su edad: ");
        int edad2 = lector.nextInt();
        System.out.print("Introduzca su altura: ");
        float altura2 = lector.nextFloat();
        System.out.print("Introduzca su nombre: ");
        lector.nextLine();
        String nombre2 = lector.nextLine();
        System.out.println("Edad: " + edad2 + "; Altura: " + altura2 + "; Nombre: " + nombre2);

    }
}