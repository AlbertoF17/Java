package Boletines;

import java.util.Random;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        /*
        //1. Crear un array de float de tamaño 10 mediante un inicializador (dando valores
        //iniciales a su gusto). Imprimir el contenido del array por consola. Una vez impreso,
        //modificar el array para que en cada posición se almacene el índice que le
        //corresponde. Una vez que el array esté completamente modificado, volver a imprimir
        //el array y comprobar que ha hecho el ejercicio de forma correcta. Siga las
        //instrucciones al pie de la letra (siempre).
        System.out.println("EJERCICIO 1");
        float[] arrayDeFloats = {1f, 2f, 3f, 4f, 5f, 6f, 7f, 8f, 9f, 10f};
        for(int i = 0; i<arrayDeFloats.length; i++){
            if (i<arrayDeFloats.length-1){
                System.out.print(arrayDeFloats[i] + " ");
            }else {
                System.out.print(arrayDeFloats[i]);
            }
        }
        System.out.println();
        for(int i=0; i<arrayDeFloats.length; i++){
            arrayDeFloats[i] = i;
        }
        for(int i = 0; i<arrayDeFloats.length; i++){
            if (i<arrayDeFloats.length-1){
                System.out.print(arrayDeFloats[i] + " ");
            }else {
                System.out.print(arrayDeFloats[i]);
            }
        }
        System.out.println();

        //2. Modificar el ejercicio anterior de forma que el array sea de String.
        System.out.println("EJERCICIO 2");
        String[] arrayDeStrings = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        for(int i = 0; i<arrayDeStrings.length; i++){
            if (i<arrayDeStrings.length-1){
                System.out.print(arrayDeStrings[i] + " ");
            }else {
                System.out.print(arrayDeStrings[i]);
            }
        }
        System.out.println();
        for(int i=0; i<arrayDeStrings.length; i++){
            arrayDeStrings[i] = String.valueOf(i);
        }
        for(int i = 0; i<arrayDeStrings.length; i++){
            if (i<arrayDeStrings.length-1){
                System.out.print(arrayDeStrings[i] + " ");
            }else {
                System.out.print(arrayDeStrings[i]);
            }
        }
        System.out.println();

        //3. Modificar el ejercicio anterior de forma que el array sea de char (utilice únicamente
        //números de una cifra en el inicializador).
        System.out.println("EJERCICIO 3");
        char[] arrayDeChars = {'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        for(int i = 0; i<arrayDeChars.length; i++){
            if (i<arrayDeChars.length-1){
                System.out.print(arrayDeChars[i] + " ");
            }else {
                System.out.print(arrayDeChars[i]);
            }
        }
        System.out.println();
        for(int i=0; i<arrayDeChars.length; i++){
            arrayDeChars[i] = String.valueOf(i).charAt(0);
        }
        for(int i = 0; i<arrayDeChars.length; i++){
            if (i<arrayDeChars.length-1){
                System.out.print(arrayDeChars[i] + " ");
            }else {
                System.out.print(arrayDeChars[i]);
            }
        }
        System.out.println();

        //4. Escribe un programa que cree un array de 5 posiciones e imprima el valor de cada
        //posición. Elija el tipo que desee y los valores iniciales que desee.
        System.out.println("EJERCICIO 4");
        String[] arrayEj4 = {"Hola", "mi", "nombre", "es", "Alberto"};
        for (int i = 0; i < arrayEj4.length; i++){
            System.out.print(arrayEj4[i] + " ");
        }
        System.out.println();

        //5. Modifica el ejercicio anterior para que, a continuación, pida por pantalla 5 nuevos
        //valores y rellene el array con ellos, volviéndolo a imprimir.
        System.out.println("EJERCICIO 5");
        for (int i = 0; i < arrayEj4.length; i++){
            System.out.println("Escriba el valor de la posición " + (i+1) + ": ");
            arrayEj4[i] = sc.next();
        }
        for (int i = 0; i < arrayEj4.length; i++){
            System.out.print(arrayEj4[i] + " ");
        }
        System.out.println();

        //6. Modifica el programa anterior para que el número de posiciones del array se lea por
        //pantalla.
        System.out.println("EJERCICIO 6");
        System.out.println("Introduzca el número de posiciones del array");
        String[] arrayEj6 = new String[sc.nextInt()];
        for (int i = 0; i < arrayEj6.length; i++){
            System.out.println("Escriba el valor de la posición " + (i+1) + ": ");
            arrayEj6[i] = sc.next();
        }
        for (int i = 0; i < arrayEj6.length; i++){
            System.out.print(arrayEj6[i] + " ");
        }
        System.out.println();

        //7. Si eligió un tipo numérico para el ejercicio anterior, repítalo usando un tipo no
        //numérico (boolean, char o String). Si eligió un tipo no numérico, repítalo usando float.
        System.out.println("EJERCICIO 7");
        System.out.println("Introduzca el número de posiciones del array");
        float[] arrayEj7 = new float[sc.nextInt()];
        for (int i = 0; i < arrayEj7.length; i++){
            System.out.println("Escriba el valor de la posición " + (i+1) + ": ");
            arrayEj7[i] = sc.nextFloat();
        }
        for (int i = 0; i < arrayEj7.length; i++){
            System.out.print(arrayEj7[i] + " ");
        }
        System.out.println();

        //8. Crear un array de enteros donde indicamos por teclado el tamaño del array,
        //rellenamos el array con números aleatorios entre 0 y 9, y mostramos por pantalla el
        //valor de cada posición y la suma de todos los valores.
        System.out.println("EJERCICIO 8");
        int suma = 0;
        System.out.println("Introduzca el tamaño del array");
        int[] arrayEj8 = new int[sc.nextInt()];
        for (int i = 0; i < arrayEj8.length; i++) {
            arrayEj8[i] = rand.nextInt(0, 10);
        }
        for (int i = 0; i < arrayEj8.length; i++){
            System.out.print(arrayEj8[i] + " ");
        }
        for (int i = 0; i < arrayEj8.length; i++) {
            suma += arrayEj8[i];
        }
        System.out.println();
        System.out.println("La suma da: " + suma);

        //9. Crea un array de números de 100 posiciones, que contendrá los números del 1 al
        //100. Partiendo del array ya creado y completamente relleno, obtener la suma de
        //todos ellos y la media.
        System.out.println("EJERCICIO 9");
        suma = 0;
        int[] arrayEj9 = new int[100];
        for (int i = 0; i < arrayEj9.length; i++) {
            arrayEj9[i] = i+1;
        }
        for (int i = 0; i < arrayEj9.length; i++) {
            suma+=arrayEj9[i];
        }
        int media = suma/100;
        System.out.println("La suma da: " + suma + " y la media es: " + media);
*/
        //10. Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las
        //mayúsculas). Después, ve pidiendo posiciones del array por teclado y si la posición
        //es correcta, se añadirá a una cadena inicialmente vacía que se mostrará al final del
        //ejercicio. Se dejará de pedir numeros cuando se introduzca un número negativo.
        //Por ejemplo, si escribo los siguientes números
        //0 // Añadirá la ‘A’
        //5 // Añadirá la ‘F’
        //25 // Añadirá la ‘Z’
        //50 // Error, inserte otro número
        //-1 // fin
        //Cadena resultante: AFZ
        System.out.println("EJERCICIO 10");
        char[] arrayLetras = new char[26];
        int letraAbecedario;
        for (int i = 0; i < arrayLetras.length; i++) {
            arrayLetras[i] = (char)((int)'A'+i);
        }
        int[] arrayLetras2;
        do{
            int cont = 0;
            System.out.println("¿Qué letra del abecedario vas a añadir? (introduzca el número de letra siendo" +
                    "0 la letra A y 26 la letra Z)");
            letraAbecedario = sc.nextInt();
            if (letraAbecedario<0){
                System.out.println("FIN");
            }else if(letraAbecedario>26){
                System.out.println("Número fuera de rango");
            }else {
                arrayLetras2[cont] = letraAbecedario;
                cont++;
            }
        }while (letraAbecedario >= 0);
        for (int i = 0; i < arrayLetras.length; i++){
            System.out.print(arrayLetras[i] + " ");
        }
        System.out.println();

        //11. Crear un array de String de tamaño 3, con los nombres de tres compañeros de
        //clase. A continuación, pedir por teclado un nombre, y comprobar si está en el array,
        //escribiendo un mensaje al respecto de tipo: Juan está en el array.
        System.out.println("EJERCICIO 11");
        boolean nombreEncontrado = false;
        int posicion = 0;
        String[] arrayNombres = {"Jouse", "Ricardo", "Pablito"};
        System.out.println("Escriba un nombre");
        String nombre = sc.next();
        for (int i = 0; i < arrayNombres.length; i++) {
            if (arrayNombres[i].contains(nombre)){
                nombreEncontrado = true;
            }
        }
        for (int i = 0; i < arrayNombres.length; i++) {
            if (arrayNombres[i] == nombre){
                posicion = i;
            }
        }
        if (nombreEncontrado){
            System.out.println("El nombre " + nombre + " se encuentra en el array en la posición "+ posicion);
        } else {
            System.out.println("El nombre " + nombre + " NO se encuentra en el array");
        }

        //12. Repetir escribiendo un mensaje de tipo: Juan está en el array en la posición 2.

        //13. Leer por pantalla un numero entero y crear un array de ese tamaño, con valores
        //aleatorios entre 1 y 300. A continuación, pedir un número entero entre 0 y 9, e
        //imprimir todas las posiciones del array que tengan un número acabado en ese dígito.
        //Esos números, además de imprimirlos, almacenarlos en un array de salida con el
        //tamaño adecuado.

        //14. Crear dos arrays de enteros del mismo tamaño (4). Inicializarlos con números
        //aleatorios de una cifra. Comparar si el contenido de ambos es exactamente el
        //mismo, imprimiendo un mensaje al respecto.

        //15. Repetir el ejercicio anterior, sumando ambos arrays y guardando el resultado en un
        //tercer array que deberá imprimirse por pantalla.

        //16. Crear un array de enteros de 5 posiciones. Leer por pantalla una cadena y
        //almacenar en cada posición del array el número de ocurrencias de cada vocal: en la
        //posición 0 la cantidad de a, en la 1 la de e, y así sucesivamente, mostrando al final
        //el contenido del array.

        //17. Repetir, pero contando todas las letras del abecedario.

        //18. Leer una cadena que contenga varias palabras separadas por espacios. Buscar
        //información del método split de la clase String, y utilizarlo para dividir la cadena en
        //las distintas palabras.

        //19. Introduce por pantalla el número de tu DNI, y vuelve a imprimirlo seguido de la letra.
        //Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado
        //debe estar entre 0 y 22. Tendrás que crear un array que contenga:
        //
        //POSICIÓN LETRA
        //
        //0 T
        //
        //1 R
        //
        //2 W
        //
        //3 A
        //
        //4 G
        //
        //5 M
        //
        //6 Y
        //
        //7 F
        //
        //8 P
        //
        //9 D
        //
        //10 X
        //
        //11 B
        //
        //12 N
        //
        //13 J
        //
        //14 Z
        //
        //15 S
        //
        //16 Q
        //
        //17 V
        //
        //18 H
        //
        //19 L
        //
        //20 C
        //
        //21 K
        //
        //22 E
    }
}
