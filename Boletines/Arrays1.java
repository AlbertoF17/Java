package Boletines;

import java.util.Random;
import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

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
        System.out.println("\n");

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
        System.out.println("\n");

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
        System.out.println("\n");

        //4. Escribe un programa que cree un array de 5 posiciones e imprima el valor de cada
        //posición. Elija el tipo que desee y los valores iniciales que desee.
        System.out.println("EJERCICIO 4");
        String[] arrayEj4 = {"Hola", "mi", "nombre", "es", "Alberto"};
        for (int i = 0; i < arrayEj4.length; i++){
            System.out.print(arrayEj4[i] + " ");
        }
        System.out.println("\n");

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
        System.out.println("\n");

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
        System.out.println("\n");

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
        System.out.println("\n");

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
        System.out.println("\n");

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
        System.out.println("\n");

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
        String arrayLetras2 = "";
        int cont = 0;

        for (int i = 0; i < arrayLetras.length; i++) {
            arrayLetras[i] = (char)((int)'A'+i);
        }

        do{
            System.out.println("¿Qué letra del abecedario vas a añadir? (introduzca el número de letra siendo " +
                    "0 la letra A y 25 la letra Z)");
            letraAbecedario = sc.nextInt();
            if (letraAbecedario<0){
                System.out.println("FIN");
            }else if(letraAbecedario>25){
                System.out.println("Número fuera de rango");
            }else {
                arrayLetras2 += arrayLetras[letraAbecedario];
                cont++;
            }
        }while (letraAbecedario >= 0);
        System.out.println();
        System.out.println("Las letras introducidas son: " + arrayLetras2);
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
            if (arrayNombres[i].equalsIgnoreCase(nombre)){
                posicion = i;
            }
        }
        if (nombreEncontrado){
            System.out.println("El nombre " + nombre + " se encuentra en el array en la posición "+ posicion);
        } else {
            System.out.println("El nombre " + nombre + " NO se encuentra en el array");
        }
        System.out.println();

        //12. Repetir escribiendo un mensaje de tipo: Juan está en el array en la posición 2.
        System.out.println("EJERCICIO 12: Hecho en el propio ejercicio anterior");
        System.out.println();

        //13. Leer por pantalla un numero entero y crear un array de ese tamaño, con valores
        //aleatorios entre 1 y 300. A continuación, pedir un número entero entre 0 y 9, e
        //imprimir todas las posiciones del array que tengan un número acabado en ese dígito.
        //Esos números, además de imprimirlos, almacenarlos en un array de salida con el
        //tamaño adecuado.
        System.out.println("EJERCICIO 13");
        System.out.print("Introduzca el tamaño del array: ");
        int[] arrayEj13 = new int[sc.nextInt()];
        int num;
        int tamNuevoArray = 0;
        String cadenaNumeros = "";

        for (int i = 0; i < arrayEj13.length; i++) {
            arrayEj13[i] = rand.nextInt(1,301);
        }

        for (int i = 0; i < arrayEj13.length; i++) {
            System.out.print(arrayEj13[i] + " ");
        }
        System.out.println("\n");
        do{
            System.out.print("Introduzca un número entre el 0 y el 9: ");
            num = sc.nextInt();
        }while(num<0||num>9 );

        for (int i = 0; i < arrayEj13.length; i++) {
            if (arrayEj13[i]%10 == num){
                cadenaNumeros += arrayEj13[i] + " ";
                tamNuevoArray++;
            }
        }
        int[] nuevoArray = new int[tamNuevoArray];
        int numeros = 0;
        for (int i = 0; i<arrayEj13.length; i++){
            if (arrayEj13[i]%10 == num){
                nuevoArray[numeros] = arrayEj13[i];
                numeros++;
            }
        }
        for (int i = 0; i<nuevoArray.length; i++){
            System.out.print(nuevoArray[i] + " ");
        }
        System.out.println("\n");

        //14. Crear dos arrays de enteros del mismo tamaño (4). Inicializarlos con números
        //aleatorios de una cifra. Comparar si el contenido de ambos es exactamente el
        //mismo, imprimiendo un mensaje al respecto.
        System.out.println("EJERCICIO 14");
        int[] array14A = new int[4];
        int[] array14B = new int[4];
        boolean iguales = true;
        for (int i = 0; i < array14A.length; i++) {
            array14A[i] = rand.nextInt(1,10);
        }
        System.out.print("Array 1: ");
        for (int i = 0; i < array14A.length; i++) {
            System.out.print(array14A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array14B.length; i++) {
            array14B[i] = rand.nextInt(1,10);
        }
        System.out.print("Array 2: ");
        for (int i = 0; i < array14A.length; i++) {
            System.out.print(array14A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array14A.length; i++) {
            if (array14B[i]!=array14A[i]){
                iguales = false;
            }
        }
        System.out.print("¿Son iguales? ");
        if (iguales){
            System.out.println("Sí");
        }else {
            System.out.println("No");
        }
        System.out.println();

        //15. Repetir el ejercicio anterior, sumando ambos arrays y guardando el resultado en un
        //tercer array que deberá imprimirse por pantalla.
        System.out.println("EJERCICIO 15");
        int[] array15A = new int[4];
        int[] array15B = new int[4];
        int[] array15C = new int[4];

        for (int i = 0; i < array15A.length; i++) {
            array15A[i] = rand.nextInt(1,10);
        }
        System.out.print("Array 1: ");
        for (int i = 0; i < array15A.length; i++) {
            System.out.print(array15A[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < array15B.length; i++) {
            array15B[i] = rand.nextInt(1,10);
        }
        System.out.print("Array 2: ");
        for (int i = 0; i < array15B.length; i++) {
            System.out.print(array15B[i] + " ");
        }
        System.out.println();
        System.out.print("Array resultante: ");
        for (int i = 0; i < array15C.length; i++) {
            array15C[i] = array15A[i] + array15B[i];
            System.out.print(array15C[i]);
        }
        System.out.println("\n");

        //16. Crear un array de enteros de 5 posiciones. Leer por pantalla una cadena y
        //almacenar en cada posición del array el número de ocurrencias de cada vocal: en la
        //posición 0 la cantidad de a, en la 1 la de e, y así sucesivamente, mostrando al final
        //el contenido del array.
        System.out.println("EJERCICIO 16");
        int[] arrayVocales = new int[5];
        System.out.print("Introduzca una frase: ");
        sc.nextLine();
        System.out.println();
        String fraseVocales = sc.nextLine();

        for (int i = 0; i < fraseVocales.length(); i++) {
            if(fraseVocales.charAt(i) == 'a' || fraseVocales.charAt(i) == 'A'){
                arrayVocales[0]++;
            } else if (fraseVocales.charAt(i) == 'e' || fraseVocales.charAt(i) == 'E'){
                arrayVocales[1]++;
            } else if (fraseVocales.charAt(i) == 'i' || fraseVocales.charAt(i) == 'I'){
                arrayVocales[2]++;
            } else if (fraseVocales.charAt(i) == 'o' || fraseVocales.charAt(i) == 'O'){
                arrayVocales[3]++;
            } else if (fraseVocales.charAt(i) == 'u' || fraseVocales.charAt(i) == 'U'){
                arrayVocales[4]++;
            }
        }
        System.out.println("a e i o u");
        for (int i = 0; i < arrayVocales.length; i++) {
            System.out.print(arrayVocales[i] + " ");
        }
        System.out.println("\n");

        //17. Repetir, pero contando todas las letras del abecedario.
        System.out.println("EJERCICIO 17");
        int[] arrayAbecedario = new int[26];
        System.out.print("Introduzca una frase: ");
        String fraseLetras = sc.nextLine();
        fraseLetras = fraseLetras.toLowerCase();
        for (int i = 0; i < arrayAbecedario.length; i++) {
            for (int j = 0; j < fraseLetras.length(); j++) {
                if (fraseLetras.charAt(j) == 'a'+i){
                    arrayAbecedario[i]++;
                }
            }
        }
        for (int i = 0; i < arrayAbecedario.length; i++) {
            System.out.print((char)('a'+i) + " ");
        }
        System.out.println();
        for (int i = 0; i < arrayAbecedario.length; i++) {
            System.out.print(arrayAbecedario[i] + " ");
        }
        System.out.println("\n");

        //18. Leer una cadena que contenga varias palabras separadas por espacios. Buscar
        //información del método split de la clase String, y utilizarlo para dividir la cadena en
        //las distintas palabras.
        System.out.println("EJERCICIO 18");
        System.out.print("Introduce una frase: ");
        String cadenaLarga = sc.nextLine();
        String[] partes = cadenaLarga.split(" ");
        for (int i = 0; i < partes.length; i++) {
            System.out.print(partes[i]);
        }
        System.out.println("\n");

        //19. Introduce por pantalla el número de tu DNI, y vuelve a imprimirlo seguido de la letra.
        //Para calcular la letra, cogeremos el resto de dividir nuestro dni entre 23, el resultado
        //debe estar entre 0 y 22. Tendrás que crear un array que contenga:
        //POSICIÓN LETRA
        //0 T
        //1 R
        //2 W
        //3 A
        //4 G
        //5 M
        //6 Y
        //7 F
        //8 P
        //9 D
        //10 X
        //11 B
        //12 N
        //13 J
        //14 Z
        //15 S
        //16 Q
        //17 V
        //18 H
        //19 L
        //20 C
        //21 K
        //22 E
        System.out.println("EJERCICIO 19");
        String[] arrayLetraDNI = {"T" , "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
                                  "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        System.out.print("Introduce la parte numérica de tu DNI: ");
        int numDNI = sc.nextInt();
        System.out.println("Su DNI es: " + numDNI + arrayLetraDNI[numDNI%23]);
    }
}
