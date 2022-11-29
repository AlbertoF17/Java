package Boletines;

import java.util.Scanner;
public class Bucles2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Leer un nombre por pantalla, y escribir un saludo por pantalla que utilice ese nombre, repitiendo
        //dicho saludo hasta que se muestre un total de diez veces.
        System.out.println("Ejercicio 1:");
        System.out.print("Escriba su nombre: ");
        String nombre = sc.nextLine();
        for (int i = 0; i < 10; i++) {
            System.out.println("Buenas tardes " + nombre);
        }
        System.out.println();

        //2. Leer un número entero, y escribir un mensaje de error tantas veces como diga ese número.
        System.out.println("Ejercicio 2:");
        System.out.print("Escriba un numero: ");
        int num = sc.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println("Error grave, reinicie el equipo");
        }
        System.out.println();

        //3. Crear una contraseña numérica en una variable. Pedir por pantalla la contraseña de
        //inicio hasta que el usuario la acierte.
        System.out.println("Ejercicio 3:");
        int contrasena = 1234;
        System.out.print("Escriba la contraseña: ");
        int passTry = sc.nextInt();
        int cont = 0;
        while (passTry != contrasena) {
            System.out.println("Contraseña incorrecta, inténtelo de nuevo");
            System.out.print("Escriba de nuevo la contraseña: ");
            passTry = sc.nextInt();
            cont++;
        }
        System.out.println("Contraseña correcta accediendo al servidor...");
        System.out.println("Numero de errores: " + cont);
        System.out.println();

        //4. Leer por pantalla un entero y comprobar si es negativo o positivo, imprimiendo por
        //pantalla una frase al respecto. Si se mete un cero, volver a pedir un número.
        System.out.println("Ejercicio 4:");
        System.out.print("Escriba un numero: ");
        int num2 = sc.nextInt();
        int cont2 = 0;
        while (num2 == 0) {
            System.out.print("Numero no valido, introduce un numero distinto al 0: ");
            num2 = sc.nextInt();
            cont2++;
        }
        if (num2 < 0) {
            System.out.println("Este numero es negativo");
        } else {
            System.out.println("Este numero es positivo");
        }
        System.out.println("Veces que se ha introducido un numero no valido: " + cont2);
        System.out.println();

        //5. Leer por pantalla un entero y comprobar si es par o impar. Si se mete un numero
        //negativo o cero, volver a pedir un número.
        System.out.println("Ejercicio 5:");
        System.out.print("Escriba un número: ");
        int num3 = sc.nextInt();
        int cont3 = 0;
        while (num3 <= 0) {
            System.out.print("Número no valido, introduce un número positivo distinto a 0: ");
            num3 = sc.nextInt();
            cont3++;
        }
        if (num3 % 2 == 0) {
            System.out.println("Este número es par");
        } else {
            System.out.println("Este número es impar");
        }
        System.out.println("Veces que se ha introducido un número no valido: " + cont3);
        System.out.println();

        //6. Introducir una variable contadora en los dos ejercicios anteriores que almacene la cantidad total de
        //números incorrectos que ha introducido el usuario, y la muestre por pantalla antes de finalizar.
        System.out.println("Ejercicio 6: ya realizado");

        //7. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes
        //correspondiente. En caso de leer un número fuera de rango, volver a pedir un número entre 1 y 12.
        System.out.println("Ejercicio 7");
        System.out.print("Introduzca un número entre 1 y 12: ");
        int mes = sc.nextInt();
        do {
            switch (mes) {
                case 1:
                    System.out.println("Enero");
                    break;
                case 2:
                    System.out.println("Febrero");
                    break;
                case 3:
                    System.out.println("Marzo");
                    break;
                case 4:
                    System.out.println("Abril");
                    break;
                case 5:
                    System.out.println("Mayo");
                    break;
                case 6:
                    System.out.println("Junio");
                    break;
                case 7:
                    System.out.println("Julio");
                    break;
                case 8:
                    System.out.println("Agosto");
                    break;
                case 9:
                    System.out.println("Septiembre");
                    break;
                case 10:
                    System.out.println("Octubre");
                    break;
                case 11:
                    System.out.println("Noviembre");
                    break;
                case 12:
                    System.out.println("Diciembre");
                    break;
                default:
                    System.out.println("Número fuera del rango, inténtelo de nuevo: ");
                    mes = sc.nextInt();
            }
        } while (mes < 1 || mes > 12);
        System.out.println();

        //8. Leer por pantalla un entero e imprimirlo elevado a la quinta potencia. Utilizar un
        //bucle para realizar el cálculo.
        System.out.println("Ejercicio 8");
        System.out.print("Introduzca un número: ");
        int num4 = sc.nextInt();
        int res = 1;
        for (int cont1 = 1; cont1 <= 5; cont1++) {
            res *= num4;
        }
        System.out.println("El número " + num4 + " elevado a 5 es: " + res);
        System.out.println();

        //9. Repetir el ejercicio anterior para leer también por pantalla la potencia a la que debe
        //elevarse el número.
        System.out.println("Ejercicio 9");
        System.out.print("Introduzca la base: ");
        int base = sc.nextInt();
        System.out.print("Introduzca el exponente: ");
        int exp = sc.nextInt();
        int result = 1;
        for (int cont4 = 0; cont4 <= exp - 1; cont4++) {
            result *= base;
        }
        System.out.println("El número " + base + " elevado a " + exp + " es: " + result);
        System.out.println();

        //10. Leer por pantalla un número n, e imprimir por pantalla una fila de asteriscos con
        //tantas columnas como diga n.
        System.out.println("Ejercicio 10: ");
        System.out.print("Introduce un número: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();

        //11. Leer por pantalla un número n, e imprimir por pantalla un cuadrado cuya altura viene
        //dada por n.
        System.out.println("Ejercicio 11: ");
        System.out.print("Introduce un número: ");
        int n1 = sc.nextInt();
        for (int j = 1; j <= n1; j++) {
            for (int i = 1; i <= n1 - 1; i++) {
                System.out.print("* ");
            }
            System.out.println("*");
        }
        System.out.println();

        //12. Leer por pantalla un número n, e imprimir por pantalla un cuadrado cuya altura viene
        //dada por n.
        System.out.println("Ejercicio 12: ");
        System.out.print("Introduce un número: ");
        int n2 = sc.nextInt();
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                if (i == 0 || j == 0 || i == n2 - 1 || j == n2 - 1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //13. Leer por pantalla un número n, e imprimir por pantalla un triángulo cuya altura viene
        //dada por n.
        System.out.println("Ejercicio 13: ");
        System.out.print("Introduce un número: ");
        int n3 = sc.nextInt();
        for (int i = 0; i < n3; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //14. (MUY DIFICIL) Leer por pantalla un número n, e imprimir por pantalla un triángulo
        //cuyo número de niveles viene dado por n.
        System.out.println("Ejercicio 14: ");
        System.out.print("Introduce un número: ");
        int niveles = sc.nextInt();
        for (int i = 1; i <= niveles; i++) {
            for (int blancos = 1; blancos <= niveles - i; blancos++) {
                System.out.print("  ");
            }

            for (int asteriscos = 1; asteriscos < (i * 2); asteriscos++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        //15. (DIFICIL) Leer por pantalla un número n, e imprimir por pantalla un triángulo cuyo
        //número de niveles viene dado por n.
        System.out.println("Ejercicio 15: ");
        System.out.print("Introduce un número: ");
        int niveles2 = sc.nextInt();
        for (int i = 0; i < niveles2; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= 2 * (niveles2 - 1 - i); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();

        //A PARTIR DE AQUÍ SON MATEMÁTICOS, NO LOS HAGA SI NO QUIERE
        //16. (Difícil) Escriba un programa que compruebe si un número es cúbico, es decir, si
        //puede expresarse como un producto de tres factores iguales.
        System.out.println("Ejercicio 16: ");

        System.out.print("Introduzca un número: ");
        int n4 = sc.nextInt();
        int y = 0;
        for (; (y * y * y) < n4; y++) {
            if ((y * y * y) != n4) {
                System.out.println("NO es un número cubico");
            } else {
                System.out.println("Es un número cúbico, la raiz cúbica de " + n4 + " es: " + y);
            }
        }

        System.out.println();

        //17. (DIFÍCIL) Leer por pantalla un número entero e indicar si es primo.
        System.out.println("Ejercicio 17: ");
        System.out.print("Introduzca un número para comprobar si es primo: ");
        int p = sc.nextInt();
        int contador = 2;
        boolean primo = true;
        if (p < 2) {
        } else {
            while ((primo) && (contador != p)) {
                if (p % contador == 0) {
                    primo = false;
                }
                contador++;
            }
        }
        if (primo) {
            System.out.println("El número " + p + " es primo");
        } else {
            System.out.println("El número " + p + " NO es primo");
        }
        System.out.println();


        //18. (NO HACER) Imprimir por pantalla todos los números primos entre 0 y 100.
        System.out.println("Ejercicio 18: ");
        System.out.println("Imprimiendo todos los primos del 0 al 100...");
        for (int pr = 1; pr <= 100; pr++) {
            int count = 0;
            for (int j = 1; j <= pr; j++) {
                if (pr % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(pr + " ");
            }
        }
        System.out.println();

        //19. (MUY DIFÍCIL) Escribe un programa que lea por pantalla un número entero y
        //determine si es un palíndromo.
        System.out.println("Ejercicio 19, palíndromos: ");
        System.out.print("Introduce un número: ");
        sc.nextLine();
        String cadena = sc.nextLine();
        String invertida = "";
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            invertida += cadena.charAt(indice);
        }

        if (cadena.equals(invertida)) {
            System.out.println("Es un número palíndromo");
        } else {
            System.out.println("NO es un número palíndromo");
        }
        System.out.println();

        //20. (NO HACER) Leer por pantalla dos números, a y b, y calcular su máximo común
        //divisor.
        System.out.println("Ejercicio 20, mcd: ");
        System.out.print("Introduce el primer número: ");
        int mcd1 = sc.nextInt();
        int mcdA = mcd1;
        System.out.print("Introduce el segundo número: ");
        int mcd2 = sc.nextInt();
        int mcdB = mcd2;
        int temp = 0;
        while (mcd2 != 0) {
            temp = mcd2;
            mcd2 = mcd1 % mcd2;
            mcd1 = temp;
        }
        System.out.println("El máximo común divisor de " + mcdA + " y " + mcdB + " es: " + temp);
        System.out.println();

        //21. (NO HACER) Leer por pantalla dos números, a y b, y calcular su mínimo común
        //múltiplo.

        System.out.println("Ejercicio 21, mcm: ");
        System.out.print("Introduce el primer número: ");
        int mcm1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int mcm2 = sc.nextInt();
        int a = Math.max(mcm1, mcm2);
        int b = Math.min(mcm1, mcm2);
        int valor1 = b;
        int valor2 = a;
        int tmp = 0;
        while (valor2 != 0) {
            tmp = valor2;
            valor2 = valor1 % valor2;
            valor1 = tmp;
        }

        int resultado = ((a / tmp) * b);

        System.out.println("El mínimo común múltiplo de " + a + " y " + b + " es: " + resultado);
        System.out.println();

        //22. (NO HACER) Leer por pantalla dos números, a y b, y comprobar si son coprimos (los
        //números coprimos son aquellos que no tienen ningún factor primo en común).
        System.out.println("Ejercicio 22, coprimos: ");
        System.out.print("Introduzca un número: ");
        int primo1 = sc.nextInt();
        int res1 = primo1;
        System.out.print("Introduzca otro número: ");
        int primo2 = sc.nextInt();
        int res2 = primo2;
        int temporal = 0;
        while (primo2 != 0) {
            temporal = primo2;
            primo2 = primo1 % primo2;
            primo1 = temporal;
        }
        if (temporal == 1) {
            System.out.println("Los números " + res1 + " y " + res2 + " son coprimos");
        } else {
            System.out.println("Los números " + res1 + " y " + res2 + " NO son coprimos");
        }
        System.out.println();

        //--------- A partir de aquí, la idea es usar bucles para imprimir distintos términos de varias
        //sucesiones aritméticas famosas, para lo cual deberá buscar en wikipedia
        //información sobre las mismas. No es necesario que los haga, hay más boletines
        //disponibles.

        //23. Leer por pantalla un número n, e imprimir por pantalla los n primeros términos de la
        //sucesión de Fibonacci.

        System.out.println("Ejercicio 23, Fibonacci: ");
        System.out.print("Introduzca el número de términos: ");
        int terminos = sc.nextInt(), estadoPrevio = 0, estadoActual = 1, suma = 1;

        System.out.print(estadoPrevio + "   ");

        for (int i = 1; i < terminos; i++) {
            System.out.print(suma + "   ");
            suma = estadoPrevio + estadoActual;
            estadoPrevio = estadoActual;
            estadoActual = suma;
        }
        System.out.println();
        System.out.println();

        //24. Leer por pantalla un número n, e imprimir por pantalla los n primeros términos de la
        //sucesión de Pell.
        System.out.println("Ejercicio 24, Pell: ");
        System.out.print("Introduzca el número de términos: ");
        int terPell = sc.nextInt();
        int contador1 = 0;
        int numX = 1, numY = 0, pell;
        for (int i = 0; i < terPell; i++) {
            pell = numX + 2 * numY;
            System.out.print(pell + "   ");
            numX = numY;
            numY = pell;
            contador1++;
        }
        System.out.println();
        System.out.println();

        //25. Escriba un programa que lea por pantalla un número y determine si es un número de
        //Mersenne.
        System.out.println("Ejercicio 25, Mersenne: ");
        System.out.print("Imprimiendo los cuatro primeros primos de Mersenne...    ");
        int contador2 = 0;
        for (int pr2 = 1; pr2 <= 100; pr2++) {
            int cont4 = 0;
            for (int j = 1; j <= pr2; j++) {
                if (pr2 % j == 0) {
                    cont4++;
                }
            }
            if (cont4 == 2 && contador2 < 4) {
                System.out.print(((Math.pow(2, pr2)) - 1) + "   ");
                contador2++;
            }
        }

        System.out.println();
        System.out.println();

        //26. Escriba un programa que imprima los 10 primeros números de Fermat.
        System.out.println("Ejercicio 26, Fermat: ");
        System.out.println("Imprimiendo los 10 primeros números de Fermat...");
        for (int it = 0; it < 10; it++) {
            System.out.print(((Math.pow(2, Math.pow(2, it))) + 1) + "   ");
        }
    }
}
