package Boletines;

import java.util.Random;
import java.util.Scanner;

public class Boletin7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1. Leer dos números enteros e imprimir el mayor de ellos.
        System.out.println("Ejercicio 1: Numero mayor");
        System.out.print("Primer numero: ");
        int a = sc.nextInt();
        System.out.print("Segundo numero: ");
        int b = sc.nextInt();
        if (a>b) {
            System.out.println("El mayor es el primer numero: " + a);
        } else if (a<b) {
            System.out.println("El mayor es el segundo numero: " + b);
        } else {
            System.out.println("Son iguales: " + a);
        }

        //2. Leer un entero y comprobar si es negativo o positivo, imprimiendo por pantalla una
        //frase al respecto. Considere el cero como positivo.
        System.out.println("Ejercicio 2: Comprobación Positivo/Negativo");
        System.out.print("Escribe un numero: ");
        int num = sc.nextInt();
        String posNeg = (num>=0) ? "Número positivo" : "Número negativo";
        System.out.println(posNeg);
        //if (num>=0) {
        //    System.out.println("Numero positivo");
        //} else {
        //    System.out.println("Numero negativo");
        //}

        //3. Modifique el ejercicio anterior para que, en caso de introducir un cero, se imprima
        //por pantalla un mensaje específico.
        System.out.println("Ejercicio 3: Comprobación Positivo/Negativo + Comprobación =0");
        System.out.print("Escribe un número: ");
        int n1 = sc.nextInt();
        if (n1>0) {
            System.out.println("Numero positivo");
        } else if (n1==0){
            System.out.println("El numero es cero");
        } else {
            System.out.println("Numero negativo");
        }

        //4. Leer una edad y comprobar si la persona es mayor de edad, imprimiendo una frase
        //al respecto. Si es menor, imprimir también un mensaje.
        System.out.println("Ejercicio 4: mayoría de edad");
        System.out.println("Escriba su edad: ");
        int edadA = sc.nextInt();
        String mayorMenor = (edadA>=18) ? "Es mayor de edad" : "Es menor de edad";
        System.out.println(mayorMenor);
        //if (edad>=18) {
        //    System.out.println("Es mayor de edad");
        //} else {
        //    System.out.println("Es menor de edad");
        //}

        //5. Modificar el ejercicio anterior para que además se compruebe si es jubilado (tiene
        //más de 67 años), imprimiendo un mensaje al respecto.
        System.out.println("Ejercicio 5: mayoría de edad + jubilado");
        System.out.println("Escriba su edad: ");
        int edadB = sc.nextInt();
        System.out.println("Comprobación con jubilado");
        if (edadB>=67) {
            System.out.println("Es jubilado");
        } else if (edadB>=18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        //6. Modificar el ejercicio anterior para que solo se permita una edad válida (0 a 120). En
        //caso de ser válida hará todo lo implementado anteriormente. En caso de ser
        //inválida, se imprimirá un mensaje de error y el programa acabará.
        System.out.println("Ejercicio 6: Comprobación con limites de edad");
        System.out.println("Escriba su edad: ");
        int edadC = sc.nextInt();
        if (edadC>=0 && edadC<=120) {
            if (edadC>=67) {
                System.out.println("Es jubilado");
            } else if (edadC>=18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("Es menor de edad");
            }
        } else {
            System.out.println("Error: edad no valida");
        }

        //7. Leer seis números y comprobar si coinciden con la combinación ganadora de la
        //primitiva (1, 3, 10, 20, 33, 40), imprimiendo un mensaje al respecto.
        System.out.println("Ejercicio 7: PRIMITIVA");
        System.out.println("Introduce los 6 números de la primitiva: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        int num4 = sc.nextInt();
        int num5 = sc.nextInt();
        int num6 = sc.nextInt();
        boolean boolPrimitiva = (num1==1 && num2==3 && num3==10 && num4==20 && num5==33 && num6==40);
        String primitiva = (boolPrimitiva) ? "GANASTE LA PRIMITIVA" : "Intentalo otro dia";
        System.out.println(primitiva);

        //if (num1==1 && num2==3 && num3==10 && num4==20 && num5==33 && num6==40) {
        //    System.out.println("GANASTE LA PRIMITIVA");
        //} else {
        //    System.out.println("Intentalo otro dia");
        //}

        //8. Modificar el ejercicio anterior para que, al leerlos, se compruebe si todos los
        //números leídos tienen el rango apropiado (entre 1 y 49). Si no lo tienen, imprimir un
        //mensaje de error y el programa acabará.
        System.out.println("Ejercicio 8: Comprobación 2");
        if (num1>=1 && num1<=49 && num2>=1 && num2<=49 && num3>=1 && num3<=49 && num4>=1 && num4<=49 && num5>=1 && num5<=49  && num6>=1 && num6<=49) {
            if (boolPrimitiva) {
                System.out.println("GANASTE LA PRIMITIVA");
            } else {
                System.out.println("Intentalo otro dia");
            }

        } else {
            System.out.println("Error: numero fuera del rango admitido");
        }

        //9. Leer por pantalla un entero y comprobar si es par o impar (use el operador módulo %).
        System.out.println("Ejercicio 9: Comprobación Par/Impar");
        System.out.print("Introduzca un numero: ");
        int parImpar = sc.nextInt();
        String resul = (parImpar%2==0) ? "El numero es par" : "El numero es impar";
        System.out.println(resul);

        //if (parImpar%2==0) {
        //    System.out.println("El numero es par");
        //} else {
        //    System.out.println("El numero es impar");
        //}



        //10. Crear un programa que calcule el índice de masa corporal. Lea los datos que sean
        //necesarios, imprima por pantalla el índice, y dependiendo de su valor imprima al
        //usuario un mensaje informativo. Por ejemplo: está por debajo de lo normal, está
        //normal o está por encima de lo normal.
        System.out.println("Ejercicio 10: IMC");
        System.out.print("Introduzca su peso en kilogramos: ");
        float peso = sc.nextFloat();
        System.out.print("Introduzca su altura en metros: ");
        float altura = sc.nextFloat();
        float IMC = (peso/(altura*altura));
        if (IMC<18.5) {
            System.out.println("Usted tiene bajo peso");
        } else if (IMC<25) {
            System.out.println("Usted tiene peso normal");
        } else if (IMC<30) {
            System.out.println("Usted tiene sobrepeso");
        } else {
            System.out.println("Usted tiene obesidad");
        }

        //11. Leer por pantalla un número entre 1 y 12 e imprimir por pantalla el nombre del mes
        //correspondiente. En caso de leer un número fuera de rango, imprimir por pantalla un
        //mensaje de error.
        System.out.println("Ejercicio 11: Meses");
        System.out.print("Introduzca un numero entre el 1 y el 12: ");
        int mes = sc.nextInt();
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
                System.out.println("Numero no valido");
                break;

        }

        //12. Establezca un número entre 0 y 9999, que servirá como contraseña. Puede elegir el
        //que desee. Pida por pantalla un número y si coincide escriba “Contraseña correcta,
        //accediendo al sistema”, en caso contrario escriba “Contraseña incorrecta, cerrando sesión”.
        System.out.println("Ejercicio 12: Contraseña");
        int pass = 9412;
        System.out.print("Introduzca la contraseña: ");
        String passCorrecta = (sc.nextInt()==pass) ? "Contraseña correcta, accediendo al sistema..." : "Contraseña incorrecta, cerrando sesión...";
        System.out.println(passCorrecta);
        //if (sc.nextInt()==contraseña) {
        //    System.out.println("Contrasena correcta, accediendo al sistema");
        //} else {
        //    System.out.println("Contrasena incorrecta, cerrando sesión");
        //}

        //13. Desarrolle un sistema de cálculo de descuentos para una farmacia. Cuando el
        //usuario introduzca un precio, usted deberá aplicar un descuento del 15% a ese
        //valor, e imprimir por pantalla el precio final. Recuerde que debe imprimir el precio
        //final tras aplicar el descuento, no la cantidad que se descuenta.
        System.out.println("Ejercicio 13: Descuento 15%");
        System.out.println("Introduzca el precio del producto: ");
        float precio = sc.nextFloat();
        System.out.println("El precio con descuento es: " + precio*0.85f);

        //14. Modifique el anterior para que además se imprima la cantidad que se descuenta.
        System.out.println("Ejercicio 14: Cantidad descuentada");
        System.out.println("Descuento del 15% = -" + precio*0.15);

        //15. Diseñe un programa que lea la temperatura en centígrados del día e imprima el tipo
        //de clima de acuerdo a la siguiente tabla.
        System.out.println("Ejercicio 15: Clima");
        System.out.print("Introduzca la temperatura en grados centígrados: ");
        int temp = sc.nextInt();
        if (temp<=10) {
            System.out.println("El clima es frio");
        } else if (temp>10 && temp<=20) { // (temp<=20)
            System.out.println("El clima es nublado");
        } else if (temp>20 && temp<=30){ // (temp<=30)
            System.out.println("El clima es caluroso");
        } else {
            System.out.println("El clima es tropical");
        }

        //16. Pedir un número entre 0 y 99999 y decir cuántas cifras tiene.
        System.out.println("Ejercicio 16: 0-99999");
        System.out.print("Introduzca un numero entre 0 y 99999: ");
        int numero = sc.nextInt();

        if (numero>=0 && numero<10) {
            System.out.println("Numero de 1 cifra detectado");
        } else if (numero>=10 && numero<100) { //(numero<100)
            System.out.println("Numero de 2 cifras detectado");
        } else if (numero>=100 && numero<1000) { // (numero<1000)
            System.out.println("Numero de 3 cifras detectado");
        } else if (numero>=1000 && numero<10000) { // (numero<10000)
            System.out.println("Numero de 4 cifras detectado");
        } else if (numero>=10000 && numero<100000) { // (numero<100000)
            System.out.println("Numero de 5 cifras detectado");
        } else {
            System.out.println("Numero fuera del rango");
        }

        int cont = 1;
        if (numero>0 && numero<=99999) {
            while (numero>=10) {
                numero = numero / 10;
                cont++;
            }
            System.out.println("Numero de "+ cont +" cifras detectado");
        } else {
            System.out.println("Numero fuera del rango");
        }


        //17. La universidad ha categorizado las matrículas de acuerdo a la facultad que va a
        //estudiar el postulante. Ingrese por teclado el nombre de la facultad donde va a
        //estudiar, y muestre el importe y la mensualidad. (Use el control switch-case, y
        //recuerde que el nombre que introduzca debe coincidir exactamente con el nombre de universidad).
        System.out.println("Ejercicio 17: Universidades");
        System.out.print("Introduzca la universidad: ");
        sc.nextLine();
        String uni = sc.nextLine();
        switch (uni) {
            case "Ing. de Sistemas":
                System.out.println("Importe: 350 | Mensualidad: 650");
                break;
            case "Derecho":
                System.out.println("Importe: 300 | Mensualidad: 550");
                break;
            case "Ing. Naviera":
                System.out.println("Importe: 300 | Mensualidad: 500");
                break;
            case "Ing. Pesquera":
                System.out.println("Importe: 310 | Mensualidad: 460");
                break;
            case "Contabilidad":
                System.out.println("Importe: 280 | Mensualidad: 490");
                break;
            case "Administración":
                System.out.println("Importe: 360 | Mensualidad: 520");
                break;
            default:
                System.out.println("Esta universidad no consta en nuestra base de datos");
        }

        //18. Escriba programa para ingresar 4 notas de un alumno, calcular y mostrar su
        //promedio, sabiendo que la primera y segunda tiene 20% de peso cada una, la
        //tercera y cuarta tienen 30% de peso cada una.
        System.out.println("Ejercicio 18: Notas");
        System.out.println("Teclee las notas del alumno: ");
        float nota1 = sc.nextFloat();
        float nota2 = sc.nextFloat();
        float nota3 = sc.nextFloat();
        float nota4 = sc.nextFloat();
        System.out.println("Su nota promedio es: " + (nota1*0.2 + nota2*0.2 + nota3*0.3 + nota4*0.3));

        //19. Desarrolle un programa que pida cuantos hombres y mujeres hay en un aula y
        //permita calcular el porcentaje de hombres y mujeres.
        System.out.println("Ejercicio 19: %hombres vs %mujeres");
        System.out.print("Indique numero de hombres: ");
        int hombres = sc.nextInt();
        System.out.print("Indique numero de mujeres: ");
        int mujeres = sc.nextInt();
        int total = hombres + mujeres;
        System.out.println("El porcentaje de hombres es del " + (hombres*100f/total) + "%");
        System.out.println("El porcentaje de mujeres es del " + (mujeres*100f/total) + "%");

        //20. A partir de aquí, los ejercicios son complicados. No se frustre si no le salen.
        System.out.println("Ejercicio 20: consejo (no ejercicio)");
        //Vale, gracias por el consejo.

        //20b (swap)
        System.out.println("Ejercicio 20: swapping");
        System.out.print("Introduzca el primer numero: ");
        int swapA = sc.nextInt();
        System.out.print("Introduzca el segundo numero: ");
        int swapB = sc.nextInt();
        int swapC;
        System.out.println("valores originales: A=" + swapA + " | B=" + swapB);
        swapC=swapA;
        swapA=swapB;
        swapB=swapC;
        System.out.println("valores finales: A=" + swapA + " | B=" + swapB);

        //21. Leer por pantalla dos números enteros, e imprimirlos por pantalla en orden creciente.
        System.out.println("Ejercicio 21: ordenación 2 números");
        System.out.println("Introduzca 2 números a ordenar: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>y) {
            System.out.println("Números en orden creciente: " + y + ", " + x);
        } else if (x<y) {
            System.out.println("Números en orden creciente: " + x + ", " + y);
        } else {
            System.out.println("Son iguales " + x + " y " + y);
        }

        //22. Leer por pantalla tres números enteros, e imprimirlos por pantalla en orden
        //creciente.
        System.out.println("Ejercicio 22: ordenación 3 números");
        System.out.println("Introduzca 3 números a ordenar (parte 1): ");
        int numA = sc.nextInt();
        int numB = sc.nextInt();
        int numC = sc.nextInt();
        int numD;
        if (numA>numC) {
            numD=numA;
            numA=numC;
            numC=numD;
        }
        if (numA>numB) {
            numD=numA;
            numA=numB;
            numB=numD;
        }
        if (numB>numC) {
            numD=numB;
            numB=numC;
            numC=numD;
        }
        System.out.println("Números en orden creciente: " + numA + ", " + numB + ", " + numC);

        /*if (numA>numB) {
            // c > a; b > c; a>c&&c>b
            if (numC>numA){
                System.out.println("Números en orden creciente: " + numB + ", " + numA + ", " + numC);
            } else if (numB>numC) {
                System.out.println("Números en orden creciente: " + numC + ", " + numB + ", " + numA);
            } else {
                System.out.println("Números en orden creciente: " + numB + ", " + numC + ", " + numA);
            }
        } else if (numB>numA) {
            //c>b; a>c; b>c&&c>a
            if (numC>numB){
                System.out.println("Números en orden creciente: " + numA + ", " + numB + ", " + numC);
            } else if (numA>numC) {
                System.out.println("Números en orden creciente: " + numC + ", " + numA + ", " + numB);
            } else {
                System.out.println("Números en orden creciente: " + numA + ", " + numC + ", " + numB);
            }
        } else {
            System.out.println("Algunos de los números introducidos son equivalentes");
        }
        */

        //23. Repetir el ejercicio anterior, e imprimirlos en orden decreciente.
        System.out.println("Ejercicio 23: ordenación 3 números inversamente");
        System.out.println("Introduzca 3 números a ordenar (parte 2): ");
    /*    int numA2 = sc.nextInt();
        int numB2 = sc.nextInt();
        int numC2 = sc.nextInt();
        if (numA2>numB2) {
           // c > a; b > c; a>c&&c>b
            if (numC2>numA2){
                System.out.println("Números en orden decreciente: " + numC2 + ", " + numA2 + ", " + numB2);
            } else if (numB2>numC2) {
                System.out.println("Números en orden decreciente: " + numA2 + ", " + numB2 + ", " + numC2);
            } else {
                System.out.println("Números en orden decreciente: " + numA2 + ", " + numC2 + ", " + numB2);
            }
        } else if (numB2>numA2) {
            //c>b; a>c; b>c&&c>a
            if (numC2>numB2){
                System.out.println("Números en orden decreciente: " + numC2 + ", " + numB2 + ", " + numA2);
            } else if (numA>numC) {
                System.out.println("Números en orden decreciente: " + numB2 + ", " + numA2 + ", " + numC2);
            } else {
                System.out.println("Números en orden decreciente: " + numB2 + ", " + numC2 + ", " + numA2);
            }
        } else {
            System.out.println("Algunos de los números introducidos son equivalentes");
        }

        System.out.println("Números en orden decreciente: " + numC + ", " + numB + ", " + numA);
*/
        //24. Lea un número por pantalla y determine si es múltiplo de 10 (use el operador módulo).
        System.out.println("Ejercicio 24: Prueba múltiplo de 10");
        System.out.print("Introduzca un número: ");
        int multDiez = sc.nextInt();
        String esMul = (multDiez%10==0) ?  ("Es múltiplo de 10: " + multDiez/10) : "No es múltiplo de 10";
        System.out.println(esMul);

        //if (multDiez%10==0) {
        //    System.out.println("Es múltiplo de 10: " + multDiez/10);
        //} else {
        //    System.out.println("No es múltiplo de 10");
        //}


        //25. Leer por pantalla un número de tres cifras, e imprimir cada una de sus cifras en una línea.
        System.out.println("Ejercicio 25: 3 cifras en 3 lineas");
        System.out.print("Introduzca un numero de 3 cifras: ");
        int tresCifras = sc.nextInt();
        if (tresCifras>=100 && tresCifras<999) {
            int cifra1 = tresCifras / 100;
            int cifra2 = (tresCifras - cifra1 * 100) / 10;
            int cifra3 = (tresCifras - cifra1 * 100 - cifra2 * 10);
            System.out.println(cifra1 + "\n" + cifra2 + "\n" + cifra3);
        } else {
            System.out.println("Número no valido");
        }

        //26. Crea una aplicación llamada CalculadoraInversa, que lea por pantalla dos operandos
        //(String) y un signo aritmético (String), y según este último se realizará la operación
        //correspondiente. Al final mostrará el resultado en consola. Los signos aritméticos
        //disponibles son:
        //+: suma los dos operandos.
        //-: resta los operandos.
        //*: multiplica los operandos.
        ///: divide los operandos, este debe dar un resultado con decimales (double)
        //%: módulo, resto de la división entre operando1 y operando2.
        //Para leer por pantalla usar únicamente nextLine.
        System.out.println("Ejercicio 26: Calculadora Inversa");
        System.out.println("Introduzca el primer operando");
        float op1 = sc.nextInt();
        System.out.println("Introduzca el segundo operando");
        float op2 = sc.nextInt();
        System.out.println("Introduzca la operación que desee realizar:");
        String operacion = sc.next();
        switch (operacion) {
            case "suma" -> System.out.println("El resultado de la suma de ambos números es: " + (op1 + op2));
            case "resta" -> System.out.println("El resultado de la resta de ambos números es: " + (op1 - op2));
            case "multiplicacion" -> System.out.println("El resultado de la multiplicacion de ambos números es: " + (op1 * op2));
            case "division" -> System.out.println("El resultado de la division de ambos números es: " + (op1 / op2));
            case "resto" -> System.out.println("El resto de dividir" + op1 + " entre " + op2 + "es: " + op1%op2);
            default -> System.out.println("Operación no disponible");
        }
        System.out.println("------------FIN------------");
        System.out.println();

        //27. En un casino de juegos se desea mostrar los mensajes respectivos por el puntaje
        //obtenido en el lanzamiento de tres dados de un cliente, de acuerdo a los siguientes
        //resultados:
        //Si los tres dados son seis, mostrar el mensaje “Muy buena suerte”
        //Si dos dados son seis, mostrar el mensaje “Buena suerte”
        //Si un dado es seis, mostrar el mensaje “Mala Suerte”
        //Si ningún dado se obtiene seis, mostrar el mensaje “Muy mala suerte”
        //Simule los lanzamientos con tres números aleatorios, usando instrucciones Java que los genere.
        System.out.println("Ejercicio 27: Dados");
        Random rand = new Random();
        System.out.println("Lanzando los dados...");
        int dado1 = rand.nextInt(1,7);
        int dado2 = rand.nextInt(1,7);
        int dado3 = rand.nextInt(1,7);
        System.out.println("La combinación de los dados es: " + dado1 + ", " + dado2 + ", " + dado3);
        if (dado1==6 && dado2==6 && dado3==6) {
            System.out.println("Muy buena suerte");
        } else if (dado1==6 && dado2==6 || dado1==6 && dado3==6 || dado2==6 && dado3==6) {
            System.out.println("Buena suerte");
        } else if (dado1==6 || dado2==6 || dado3==6) {
            System.out.println("Mala suerte");
        } else {
            System.out.println("Muy mala suerte");
        }
    }
}
