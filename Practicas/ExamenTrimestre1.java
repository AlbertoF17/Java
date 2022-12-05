package Practicas;

import java.util.Scanner;

public class ExamenTrimestre1 {
    public static void main(String[] args) {
        //-----------------------------------------------------------------------------------------------------
        //-------------------------------------- EJERCICIO 1 --------------------------------------------------
        //-----------------------------------------------------------------------------------------------------
        System.out.println();
        System.out.println("EJERCICIO 1");

        //Declaramos las variables según lo que introduzca el usuario por pantalla, declarando también el escáner.

        Scanner sc = new Scanner(System.in);

        System.out.println("Vas a usar TODO el bote rojo para el primer color?");
        boolean rojo1 = sc.nextBoolean();
        System.out.println("Vas a usar TODO el bote verde para el primer color?");
        boolean verde1 = sc.nextBoolean();
        System.out.println("Vas a usar TODO el bote azul para el primer color?");
        boolean azul1 = sc.nextBoolean();

        //Aplicando la lógica, si alguna de las anteriores es true, la que equivale al mismo color
        //pero SOLO la mitad del bote no hará falta contestarla, ya que se utiliza el bote entero,
        //pero por seguridad realizaré todas las preguntas de todos modos, pero podría escribirse así:
        //(también hay que aclarar que para que no falle el código comentado, hay que inicializar las variables que
        //corresponden a las mitades de los botes)
        /*
        if (!rojo1) {
            System.out.println("Vas a usar MEDIO bote rojo para el primer color?");
            medioRojo1 = sc.nextBoolean();
        }
        if (!verde1) {
            System.out.println("Vas a usar MEDIO bote verde para el primer color?");
            medioVerde1 = sc.nextBoolean();
        }
        if (!azul1) {
            System.out.println("Vas a usar MEDIO bote azul para el primer color?");
            medioAzul1 = sc.nextBoolean();
        }
        */
        System.out.println("Vas a usar MEDIO bote rojo para el primer color?");
        boolean medioRojo1 = sc.nextBoolean();
        System.out.println("Vas a usar MEDIO bote verde para el primer color?");
        boolean medioVerde1 = sc.nextBoolean();
        System.out.println("Vas a usar MEDIO bote azul para el primer color?");
        boolean medioAzul1 = sc.nextBoolean();

        System.out.println("Vas a usar TODO el bote rojo para el segundo color?");
        boolean rojo2 = sc.nextBoolean();
        System.out.println("Vas a usar TODO el bote verde para el segundo color?");
        boolean  verde2 = sc.nextBoolean();
        System.out.println("Vas a usar TODO el bote azul para el segundo color?");
        boolean azul2 = sc.nextBoolean();

        //Aplicando la lógica, si alguna de las anteriores es true, la que equivale al mismo color
        //pero SOLO la mitad del bote no hará falta contestarla, ya que se utiliza el bote entero,
        //pero por seguridad realizaré todas las preguntas de todos modos, pero podría escribirse así:
        //(también hay que aclarar que para que no falle el código comentado, hay que inicializar las variables que
        //corresponden a las mitades de los botes)
        /*
        if (!rojo2) {
            System.out.println("Vas a usar MEDIO bote rojo para el segundo color?");
            medioRojo2 = sc.nextBoolean();
        }
        if (!verde2) {
            System.out.println("Vas a usar MEDIO bote verde para el segundo color?");
            medioVerde2 = sc.nextBoolean();
        }
        if (!azul2) {
            System.out.println("Vas a usar MEDIO bote azul para el segundo color?");
            medioAzul2 = sc.nextBoolean();
        }
        */

        System.out.println("Vas a usar MEDIO bote rojo para el segundo color?");
        boolean medioRojo2 = sc.nextBoolean();
        System.out.println("Vas a usar MEDIO bote verde para el segundo color?");
        boolean medioVerde2 = sc.nextBoolean();
        System.out.println("Vas a usar MEDIO bote azul para el segundo color?");
        boolean medioAzul2 = sc.nextBoolean();

        //Declaramos una variable "sentencia" que almacene el valor de la sentencia propuesta en el enunciado
        //(proposición lógica que se encuentra en negrita).

        boolean sentencia = ((((!rojo1 && medioRojo1) && verde1 && (!azul1 && !medioAzul1)) ||
                ((!rojo1 && !medioRojo1) && verde1 && (!azul1 && medioAzul1))) &&
                (((!rojo2 && !medioRojo2) && (!verde2 && medioVerde2) && azul2) ||
                        ((!rojo2 && !medioRojo2) && (!verde2 && medioVerde2) && (!azul2 && medioAzul2))));

        //El programa finaliza con una sentencia if-else para descubrir si esa sentencia acaba siendo "true"
        //o "false"

        if (sentencia) {
            System.out.println("El primer color es Verde lima o Verde clarito y el segundo color es Azul claro o" +
                    "Celeste oscuro, por tanto la sentencia es: " + sentencia);
        } else {
            System.out.println("Los colores no coinciden, la sentencia es: " + sentencia);
        }
        System.out.println();

        //-----------------------------------------------------------------------------------------------------
        //-------------------------------------- EJERCICIO 2 --------------------------------------------------
        //-----------------------------------------------------------------------------------------------------
        System.out.println("EJERCICIO 2");

        //Preguntamos los valores al usuario mediante el escáner.

        System.out.print("Indique un numero: ");
        int x = sc.nextInt();
        System.out.print("Indique otro numero: ");
        int y = sc.nextInt();

        //Creamos variable que copie el valor de Y para que no se pierda y la variable contadora (cont).

        int copiaY = y;
        int cont = 0;

        //Bucle que organiza los datos por filas y columnas como el enunciado pide.

        for (int numX=0; x>=0 && y>=0; x--,numX++){
            for (int numY=0; y>=0; y--, numY++, cont++){
                System.out.printf("(%d, %d) ", numX, numY);
            }
            System.out.println();

            //Uso de la variable copia para poder realizar de nuevo el bucle sin fallos
            //(ya que ña variable y decrementa).

            y = copiaY;
        }

        //Fin del programa con la impresión que indica el valor de la variable contadora, que como dato curioso,
        //su valor es el resultado de la operacion: (x+1)*(y+1).

        System.out.printf("El contador de iteraciones vale: %d", cont);

        //-----------------------------------------------------------------------------------------------------
        //-------------------------------------- EJERCICIO 3 --------------------------------------------------
        //-----------------------------------------------------------------------------------------------------

        System.out.println("EJERCICIO 3");

        //Inicializamos las variables declarando el escáner

        int mes;
        int anyo;
        int respuesta;

        //Bucle do-while padre que permite que el programa se repita (ver final).

        do{

            //Preguntamos por el día y el año imponiendo la condición por si se introducen valores no válidos de los
            //mismos, obligando a que el usuario introduzca valores válidos (bucle do-while).

            do{
                System.out.print("Introduzca un numero del 1 al 12 (mes): ");
                mes = sc.nextInt();
                System.out.println();
                System.out.print("Introduzca un numero mayor que 0 (anyo): ");
                anyo = sc.nextInt();
                System.out.println();
            }while (mes<1 || mes>12 || anyo<=0);

            //Sentencia switch-case para imprimir el nombre del mes según el número introducido.

            switch (mes){
                case 1:
                    System.out.println("\t\t \"Enero\"");
                    break;
                case 2:
                    System.out.println("\t\t \"Febrero\"");
                    break;
                case 3:
                    System.out.println("\t\t \"Marzo\"");
                    break;
                case 4:
                    System.out.println("\t\t \"Abril\"");
                    break;
                case 5:
                    System.out.println("\t\t \"Mayo\"");
                    break;
                case 6:
                    System.out.println("\t\t \"Junio\"");
                    break;
                case 7:
                    System.out.println("\t\t \"Julio\"");
                    break;
                case 8:
                    System.out.println("\t\t \"Agosto\"");
                    break;
                case 9:
                    System.out.println("\t\t \"Septiembre\"");
                    break;
                case 10:
                    System.out.println("\t\t \"Octubre\"");
                    break;
                case 11:
                    System.out.println("\t\t \"Noviembre\"");
                    break;
                case 12:
                    System.out.println("\t\t \"Diciembre\"");
                    break;
            }

            //Declaramos la variable días del mes y le damos un valor con una sentencia if-else según el número
            //del mes (y otro if-else anidado para el caso del año bisiesto).

            int diasDelMes;

            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasDelMes = 30;
            } else if (mes == 2){
                if ((anyo%4 == 0 && anyo%100 !=0) || (anyo%400 == 0)) {
                    diasDelMes = 29;
                } else {
                    diasDelMes = 28;
                }
            } else {
                diasDelMes = 31;
            }

            //Imprimimos las iniciales de los dias de la semana y creamos un bucle que crea filas de 7 días hasta que
            //el número de días impresos sea igual número que hemos declarado antes en la variable diasDelMes
            //según las condiciones anteriormente impuestas.

            System.out.println("Lu " + "Ma " + "Mi " + "Ju " + "Vi " + "Sa " + "Do");
            for (int i=0; i<=diasDelMes;) {
                for (int j=0;j<7 && i<=diasDelMes;j++, i++){
                    System.out.printf("%02d ", i);
                }
                System.out.println();
            }

            //Por último, preguntamos si desea comprobar otro mes (repetir el bucle do-while padre del programa).

            System.out.println();
            System.out.print("Desea consultar otro mes? (Pulse 1 en caso afirmativo, en otro caso, pulse un numero" +
                    "cualquiera que no sea el 1): ");
            respuesta = sc.nextInt();
            System.out.println();

        }while (respuesta == 1);

        //Si el usuario quiere dejar de repetir el bucle, acaba el programa con este mensaje, en caso contrario, el
        //programa se repite.

        System.out.println("Calendario revisado, tenga un buen dia!");
    }
}
