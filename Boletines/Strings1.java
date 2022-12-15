package Boletines;

import java.util.Scanner;

public class Strings1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //1. Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida
        //por consola. Por ejemplo: si introduzco “Fernando”, me aparezca “Bienvenido Fernando”.
        System.out.println("EJERCICIO 1");
        String nombre = "Alberto";
        System.out.println("Bienvenido " + nombre);
        System.out.println();

        //2. Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir.
        System.out.println("EJERCICIO 2");
        System.out.print("Introduce tu nombre: ");
        String nombre2 = sc.next();
        System.out.println("Bienvenido " + nombre2);
        System.out.println();


        //3. Escribe una aplicación con un String que contenga una contraseña cualquiera. Después
        //se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá
        //más la contraseña y mostrará un mensaje diciendo “Enhorabuena”. Piensa bien en la
        //condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
        System.out.println("EJERCICIO 3");
        String contrasenya = "Alberto1234";
        String intento = "";
        int numIntentos = 3;
        do{
            System.out.print("Introduce la contrasenya (quedan " + numIntentos + " intentos): ");
            intento = sc.next();
            numIntentos--;
        }while(!(contrasenya.equals(intento)) && numIntentos > 0);
        if (numIntentos>0){
            System.out.println("Acertaste");
        } else {
            System.out.println("Fallaste");
        }
        System.out.println();


        //4. Del siguiente String “La lluvia en Sevilla es una maravilla” cuenta cuántas vocales hay en
        //total (recorre el String con un bucle y charAt).
        System.out.println("EJERCICIO 4");
        String frase = "La lluvia en Sevilla es una maravilla";
        int cuentaVocales = 0;
        for (int i=0; i<frase.length(); i++){
            if (frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i' ||
                    frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'A' ||
                    frase.charAt(i) == 'E' || frase.charAt(i) == 'I' || frase.charAt(i) == 'O' ||
                    frase.charAt(i) == 'U'){
                cuentaVocales++;
            }
        }
        System.out.println("Nº vocales: " + cuentaVocales);
        System.out.println();

        //5. Reemplaza todas las a del String anterior por una e.
        System.out.println("EJERCICIO 5");
        System.out.println(frase.replace('a', 'e'));
        System.out.println();

        //6. Dada una cadena mostrar por pantalla la cantidad de vocales que tiene. Ejemplo:
        //Entrada: cad = "Hola tu";
        //Salida: La cantidad de vocales es 3
        System.out.println("EJERCICIO 6");
        System.out.print("Introduzca una cadena: ");
        sc.nextLine();
        String cad = sc.nextLine();
        int numVocales = 0;
        for (int i=0; i<cad.length(); i++){
            if (cad.charAt(i) == 'a' || cad.charAt(i) == 'e' || cad.charAt(i) == 'i' ||
                    cad.charAt(i) == 'o' || cad.charAt(i) == 'u'){
                numVocales++;
            }
        }
        System.out.println("La cantidad de vocales es: " + numVocales);
        System.out.println();

        //7. Dada una cadena invertir la misma y mostrar por pantalla. Ejemplo:
        //Entrada: "casa blanca";
        //Salida: "acnalb asac";
        System.out.println("EJERCICIO 7");
        System.out.print("Introduzca una cadena: ");
        String cad1 = sc.nextLine();
        for (int i = cad1.length()-1; i>=0; i--){
            System.out.print(cad1.charAt(i));
        }
        System.out.println();

        //8. Dada una cadena cad, y un carácter car, verificar cuántas veces se repite el carácter car
        //en la cadena cad, por ejemplo:
        //Entrada: cad = "casa blanca", car = 'a';
        //Salida: El carácter 'a' se repite 4 veces
        System.out.println("EJERCICIO 8");
        System.out.print("Escriba algo: ");
        String cad2 = sc.nextLine();
        System.out.print("Escoja un carácter: ");
        String car = sc.next();
        int numCaracter = 0;
        String fin;
        char car2 = car.charAt(0);
        for (int i = 0; i<cad2.length(); i++){
            if (car2 == cad2.charAt(i)) {
                numCaracter++;
            }
        }
        if (numCaracter==1){
            fin = " vez";
        } else {
            fin = " veces";
        }
        System.out.println("El carácter " + car2 + " se repite " + numCaracter + fin);
        System.out.println();

        //9. Lee un número por teclado y muestra por consola, el carácter al que pertenece en la
        //tabla ASCII. Por ejemplo: si introduzco un 97, me muestre una a.
        System.out.println("EJERCICIO 9");
        System.out.print("Introduzca un numero: ");
        int num = sc.nextInt();
        String caracter = "";
        System.out.println("El número " + num + " es el código ASCII del carácter \'" + (char) num + "\'");
        System.out.println();

        //10. Modifica el ejercicio anterior para que, en lugar de pedir un número, pida un carácter y
        //muestre su código en la tabla ASCII.
        System.out.println("EJERCICIO 10");
        String carac = "";
        do{
            System.out.print("Introduzca un carácter: ");
            carac = sc.next();
        }while (carac.length()!=1);
        char carac2 = carac.charAt(0);
        System.out.println("El código ASCII del carácter \'" + carac + "\' es: " + (int) carac2);
        System.out.println();

        //11. Recorre el String del ejercicio anterior y transforma cada carácter a su código ASCII.
        //Muéstralos en línea recta, separados por un espacio entre cada carácter.
        System.out.println("EJERCICIO 11");
        for (int i = 0; i<cad1.length(); i++){
            System.out.print((int) cad1.charAt(i) + " ");
        }
        System.out.println();
        System.out.println();

        //12. Crea una aplicación llamada CalculadoraPolacaInversaApp, nos pedirá 2 operandos (int,
        //pero se leerán como String y luego se convertirán) y un signo aritmético (String), según
        //este último se realizará la operación correspondiente. Al final mostrará el resultado en
        //consola. Los signos aritméticos disponibles son:
        //+: suma los dos operandos.
        //
        //-: resta los operandos.
        //
        //*: multiplica los operandos.
        ///: divide los operandos, este debe dar un resultado con decimales (double)
        //^: 1º operando como base y 2º como exponente.
        //%: módulo, resto de la división entre operando1 y operando2.
        System.out.println("EJERCICIO 12");
        System.out.println("CalculadoraPolacaInversaApp");
        System.out.print("Introduzca el primer operando: ");
        String n1 = sc.nextLine();
        System.out.print("Introduzca el segundo operando: ");
        String n2 = sc.nextLine();
        System.out.print("Introduzca el signo aritmético: ");
        String op = sc.next();
        char op2 = op.charAt(0);
        switch (op2){
            case '+':
                System.out.println(n1 + op + n2 + " = " + (Integer.parseInt(n1)+Integer.parseInt(n2)));
                break;
            case '-':
                System.out.println(n1 + op + n2 + " = " + (Integer.parseInt(n1)-Integer.parseInt(n2)));
                break;
            case '*':
                System.out.println(n1 + op + n2 + " = " + (Integer.parseInt(n1)*Integer.parseInt(n2)));
                break;
            case '/':
                System.out.println(n1 + op + n2 + " = " + (Double.parseDouble(n1)/Double.parseDouble(n2)));
                break;
            case '^':
                System.out.println(n1 + op + n2 + " = " + (Math.pow(Integer.parseInt(n1), Integer.parseInt(n2))));
                break;
            case '%':
                System.out.println(n1 + op + n2 + " = " + (Integer.parseInt(n1)%Integer.parseInt(n2)));
                break;
            default:
                System.out.println("Operación no disponible");
                break;
        }
        System.out.println("FIN");
    }

}
