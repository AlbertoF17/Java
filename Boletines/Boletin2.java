package Boletines;

import java.util.Scanner;

public class Boletin2 {

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        //1. Crear una variable entera e imprimirla por pantalla sin asignarle ningún valor.
        //¿Qué se ha impreso?
        int variableVacia;
        System.out.println(); //No imprime nada ya que da error al no haber inicializado la variable

        //2a. Crear una variable entera con el valor 0. Incrementar su valor en 3 unidades utilizando el operador
        //de suma + y asignación =, e imprimirla por pantalla.
        int valor0 = 0;
        valor0 += 3;
        System.out.println(valor0);

        //2b. Decrementar su valor en una unidad utilizando el operador de decremento --. Imprimirla por pantalla.
        valor0--;
        System.out.println(valor0);

        //3. Incrementar su valor en 4 unidades sin utilizar el operador de suma + y asignación =, e imprimirla por pantalla.
        valor0++;
        valor0++;
        valor0++;
        valor0++;
        System.out.println(valor0);

        //4. Crear otra variable entera y asignarle el valor 48.76.
        int var1 = 48; //Da error ya que es un entero con decimales

        //5. Modificarla dividiendo por 50 e imprimir el resultado por pantalla.
        var1 = var1/50;
        System.out.println(var1);

        //6. Modificarla sumándole 1 y multiplicando por 48 e imprimir el resto de dividirla entre 46.
        var1 = ((var1+1)*48);
        System.out.println(var1%46);

        //7. Sin modificar el valor de la variable, imprimir por pantalla el resultado de elevarla al cuadrado.
        System.out.println(var1*var1);
        System.out.println(Math.pow(var1, 2));

        //8. Crear dos variables de tipo float, dándoles un valor inicial e imprimiéndolas por pantalla.
        System.out.print("Introduzca el primer numero: ");
        float x = lector.nextFloat();
        System.out.print("Introduzca el segundo numero: ");
        float y = lector.nextFloat();
        System.out.println("El primer numero vale: "+ x +"\n" + "El segundo numero vale: " + y);


        //Los siguientes ejercicios quedarán más claros conforme avancemos en el temario,
        //no se preocupe si no sabe hacerlos o no los entiende:
        //
        //9. Imprimir por pantalla el resultado de comprobar si la primera es mayor que la segunda.
        System.out.println(x>y); //false significa q x es menor que y; true significa que y es menor que x

        //10. Cambiar la primera con el valor de la segunda multiplicado por dos, y volver a imprimir por pantalla
        //el resultado de la comprobación anterior.
        x = y*2;
        System.out.println(x>y);

        //11. Imprimir por pantalla el resultado de comprobar si la primera es menor o igual que la segunda.
        System.out.println(x<=y);

        //12. Repetir el ejercicio anterior pero almacenando el resultado de la comprobación
        //en una variable, e imprimiendo después por pantalla dicha variable.
        boolean menorIgual = x<=y;
        System.out.println(menorIgual);
    }
}