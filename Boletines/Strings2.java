package Boletines;

import java.util.Scanner;

public class Strings2 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //1. Lee por pantalla una cadena de caracteres e imprime su longitud.
        System.out.println("EJERCICIO 1");
        System.out.print("Escriba una cadena: ");
        String cad1 = sc.nextLine();
        System.out.printf("La cadena tiene %d caracteres", cad1.length());
        System.out.println();
        System.out.println();

        //2. Lee por pantalla una cadena de caracteres e imprime su primera letra.
        System.out.println("EJERCICIO 2");
        System.out.print("Escriba una cadena: ");
        String cad2 = sc.nextLine();
        System.out.println("La primera letra de la cadena es: " + cad2.charAt(0) + " (Unicode: " +
                String.format("U+%04x", (int)cad2.charAt(0)) + ")");
        System.out.println();

        //3. Lee por pantalla una cadena de caracteres e imprime su última letra. Ten en
        //cuenta que la cadena introducida puede cambiar en cada ejecución.
        System.out.println("EJERCICIO 3");
        System.out.print("Escriba una cadena: ");
        String cad3 = sc.nextLine();
        System.out.println("La última letra de la cadena es: " + cad3.charAt(cad3.length()-1) + " (Unicode: " +
                String.format("U+%04x", (int)cad3.charAt(cad3.length()-1)) + ")");
        System.out.println();

        //4. Lee por pantalla una cadena de caracteres e imprime la letra central o su
        //aproximada.
        System.out.println("EJERCICIO 4");
        System.out.print("Escriba una cadena: ");
        String cad4 = sc.nextLine();
        System.out.println("La letra central de la cadena es: " + cad4.charAt(cad4.length()/2) + " (Unicode: " +
                String.format("U+%04x", (int)cad4.charAt(cad4.length()/2)) + ")");
        System.out.println();

        //5. Repite los tres ejercicios anteriores imprimiendo junto a la letra su código
        //UNICODE, separados por un espacio.

        //REALIZADO EN LOS EJERCICIOS CORRESPONDIENTES

        //6. Lee por pantalla una cadena de caracteres, y vuelve a imprimirla en mayúsculas.
        System.out.println("EJERCICIO 6");
        System.out.print("Escriba una cadena: ");
        String cad5 = sc.nextLine();
        System.out.println("La cadena en mayúscula es: " + cad5.toUpperCase());
        System.out.println();

        //7. Lee por pantalla una cadena de caracteres, e imprímela en minúsculas.
        System.out.println("EJERCICIO 7");
        System.out.print("Escriba una cadena: ");
        String cad6 = sc.nextLine();
        System.out.println("La cadena en mayúscula es: " + cad6.toLowerCase());
        System.out.println();

        //8. Lee por pantalla una cadena de caracteres y reemplaza todas las aes por espacios
        //en blanco.
        System.out.println("EJERCICIO 8");
        System.out.print("Escriba una cadena: ");
        String cad7 = sc.nextLine();
        cad7 = cad7.replace('a', ' ');
        System.out.println(cad7.replace('A', ' '));
        System.out.println();

        //9. Lee por pantalla una cadena de caracteres y elimina todas las aes.
        System.out.println("EJERCICIO 9");
        System.out.print("Escriba una cadena: ");
        String cad8 = sc.nextLine();
        cad8 = cad8.replace("a", "");
        System.out.println(cad8.replace("A", ""));
        System.out.println();

        //10. Lee por pantalla una cadena de caracteres y reemplaza las vocales por espacios
        //en blanco.
        System.out.println("EJERCICIO 10");
        System.out.print("Escriba una cadena: ");
        String cad9 = sc.nextLine();
        for (int i = 0; i<cad9.length(); i++) {
            if (cad9.charAt(i) == 'a' || cad9.charAt(i) == 'e' || cad9.charAt(i) == 'i' ||
                    cad9.charAt(i) == 'o' || cad9.charAt(i) == 'u' || cad9.charAt(i) == 'A' ||
                    cad9.charAt(i) == 'E' || cad9.charAt(i) == 'I' || cad9.charAt(i) == 'O' ||
                    cad9.charAt(i) == 'U'){
                cad9 = cad9.replace(cad9.charAt(i), ' ');
            }
        }
        System.out.println(cad9);
        System.out.println();

        //11. Lee por pantalla una cadena de caracteres y elimina todas las vocales.
        System.out.println("EJERCICIO 11");
        System.out.print("Escriba una cadena: ");
        String cad10 = sc.nextLine();
        for (int i = 0; i<cad10.length(); i++) {
            if (cad10.charAt(i) == 'a' || cad10.charAt(i) == 'e' || cad10.charAt(i) == 'i' ||
                    cad10.charAt(i) == 'o' || cad10.charAt(i) == 'u' || cad10.charAt(i) == 'A' ||
                    cad10.charAt(i) == 'E' || cad10.charAt(i) == 'I' || cad10.charAt(i) == 'O' ||
                    cad10.charAt(i) == 'U'){
                cad10 = cad10.replace(cad10.charAt(i), 'a');
            }
        }
        System.out.println(cad10.replace("a", ""));
        System.out.println();

        //12. Lee por pantalla la cadena “Supermercado” y comprueba si tiene la letra m. Repite
        //introduciendo la misma cadena y comprueba si tiene la letra M.
        System.out.println("EJERCICIO 12");
        String cad11;
        do{
            System.out.println("Introduzca \"Supermercado\"");
            cad11 = sc.nextLine();
        }while (!(cad11.equalsIgnoreCase("Supermercado")));
        int existe = cad11.indexOf('m');
        if (existe>0) {
            System.out.println("Existe el caracter \'m\'");
        } else {
            System.out.println("No existe el caracter \'m\'");
        }
        String cad12;
        do{
            System.out.println("Vuelva a introducir \"Supermercado\"");
            cad12 = sc.nextLine();
        }while (!(cad12.equalsIgnoreCase("Supermercado")));
        int existe2 = cad12.indexOf('M');
        if (existe2>0) {
            System.out.println("Existe el caracter \'M\'");
        } else {
            System.out.println("No existe el caracter \'M\'");
        }
        System.out.println();

        //13. Lee por pantalla dos cadenas y compáralas. Debes imprimir ‘La primera va antes’,
        //‘La segunda va antes’ o ‘Son iguales’, dependiendo del resultado de la
        //comparación.
        System.out.println("EJERCICIO 13");
        System.out.print("Introduzca la primera cadena: ");
        String primera = sc.nextLine();
        System.out.print("Introduzca la segunda cadena: ");
        String segunda = sc.nextLine();
        int orden = primera.compareTo(segunda);
        if (orden>0){
            System.out.println("La segunda va antes");
        } else if (orden<0) {
            System.out.println("La primera va antes");
        } else {
            System.out.println("Son iguales");
        }
        System.out.println();

        //14. Repite ignorando mayúsculas.
        System.out.println("EJERCICIO 14");
        System.out.print("Introduzca la primera cadena: ");
        String primera2 = sc.nextLine();
        System.out.print("Introduzca la segunda cadena: ");
        String segunda2 = sc.nextLine();
        int orden2 = primera2.compareToIgnoreCase(segunda2);
        if (orden2>0){
            System.out.println("La segunda va antes");
        } else if (orden2<0) {
            System.out.println("La primera va antes");
        } else {
            System.out.println("Son iguales");
        }
        System.out.println();

        //15. Lee por pantalla dos cadenas y comprueba si son iguales.
        System.out.println("EJERCICIO 15");
        System.out.print("Introduzca la primera cadena: ");
        String primera3 = sc.nextLine();
        System.out.print("Introduzca la segunda cadena: ");
        String segunda3 = sc.nextLine();
        boolean igualdad = primera3.equals(segunda3);
        if (!igualdad){
            System.out.println("No son iguales");
        } else {
            System.out.println("Son iguales");
        }
        System.out.println();

        //16. Repite ignorando mayúsculas.
        System.out.println("EJERCICIO 16");
        System.out.print("Introduzca la primera cadena: ");
        String primera4 = sc.nextLine();
        System.out.print("Introduzca la segunda cadena: ");
        String segunda4 = sc.nextLine();
        boolean igualdad2 = primera4.equalsIgnoreCase(segunda4);
        if (!igualdad2){
            System.out.println("No son iguales");
        } else {
            System.out.println("Son iguales");
        }
        System.out.println();

        //17. Lee un carácter por teclado y muestra por consola el código ASCII al que
        //pertenece. Por ejemplo: si introduzco una a, debe mostrar 97.
        System.out.println("EJERCICIO 17");
        System.out.print("Introduzca un caracter: ");
        String carac = sc.next();
        char carac2 = carac.charAt(0);
        System.out.println("El código ASCII del carácter \'" + carac2 + "\' es: " + (int) carac2);
        System.out.println();


        //18. Lee una cadena de caracteres por teclado que represente un número de dos
        //cifras, e imprime por pantalla el carácter que representa.
        System.out.println("EJERCICIO 18");
        String num2;
        do{
            sc.nextLine();
            System.out.print("Introduzca un numero de dos cifras: ");
            num2 = sc.nextLine();
        }while (num2.length()!=2);
        int numCaracter = Integer.parseInt(num2);
        System.out.println("El número " + num2 + " es el código ASCII del carácter \'" + (char) numCaracter + "\'");
        System.out.println();

        //19. Escribe una aplicación con un String que contenga una contraseña inventada.
        //Después se pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes
        //ya no pedirá más la contraseña y mostrará un mensaje diciendo “Logged in”.
        //Cuando falle, debe imprimir ‘Prueba otra vez…’ y volver a leer por teclado. En el
        //tercer fallo, debe imprimir Error’ y el programa termina.
        System.out.println("EJERCICIO 19");
        String pass = "inventada";
        String intento;
        int numIntentos = 3;
        System.out.print("Introduzca la contraseña: ");
        intento = sc.nextLine();
        numIntentos--;
        while(!(intento.equals(pass)) && numIntentos > 0){
            System.out.print("Prueba otra vez: ");
            intento = sc.nextLine();
            numIntentos--;
        }
        if (intento.equals(pass)){
            System.out.println("Logged in");
        } else {
            System.out.println("Error");
        }
        System.out.println();

        //22. Se pretende leer por pantalla una contraseña e indicarle al usuario si su seguridad es fuerte, media o
        //débil. Cree un algoritmo que lea una cadena e imprima por pantalla su nivel de
        //seguridad en base a los siguientes criterios:
        //- Si la longitud de la cadena es inferior a cinco, siempre es débil. Ejemplo: "hola"
        //es debil.
        //- Si la longitud es superior o igual a cinco y solo tiene letras o solo tiene números,
        //es media. Ejemplo: "holaholita" o "57213".
        //- Si la longitud es superior o igual a cinco y tiene tanto letras como números, es
        //alta. Ejemplo: "adios365"
        //
        //Nota: puede usar todo lo aprendido sobre Java. Suponga que la cadena solo tiene
        //letras y números, nunca caracteres especiales.
        System.out.println("EJERCICIO 22");
        System.out.print("Escriba su contraseña: ");
        String password = sc.nextLine();
        boolean letras = false;
        boolean numeros = false;
        if (password.length()<5){
            System.out.println("Nivel de seguridad débil");
        } else {
            for (int i = 0; i<password.length(); i++){
                String newPass = password.toUpperCase();
                char caracter = newPass.charAt(i);
                if ((int) caracter >=65  && (int) caracter <=90){
                    letras = true;
                }
                if ((int) caracter >= 48 && (int) caracter <=57){
                    numeros = true;
                }
            }
            if (letras && numeros) {
                System.out.println("Nivel de seguridad alta");
            } else {
                System.out.println("Nivel de seguridad media");
            }
        }
    }
}
