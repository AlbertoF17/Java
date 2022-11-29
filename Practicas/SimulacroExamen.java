package Practicas;

import java.util.Scanner;

public class SimulacroExamen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ejercicio 1:
        //La Escuela Profesional Vedruna está desarrollando un nuevo juego de rol y debe desarrollar
        //parte del código de creación del personaje. Esta parte consiste en seleccionar el género y la
        //clase. El personaje admite solo dos géneros, por lo que debe pedir al usuario que introduzca su
        //género: 1 para mujer, 2 para hombre. Cualquier otro número provocará elegir Mujer por
        //defecto. Una vez introducido el género, debe mostrar al usuario un mensaje del tipo: ‘ha elegido mujer/hombre como género’.
        //Una vez establecido el género y dependiendo del mismo debe leer la clase del personaje y mostrar de nuevo al usuario un
        //mensaje del tipo: ‘ha elegido X como clase’. Para esto debe pedir al usuario de nuevo otro número que será
        //interpretado como sigue:
        //Si el género del personaje es mujer:
        //1 -> Clase Asesina.
        //2 -> Clase Druida.
        //3 -> Clase Amazona.
        //Si el género del personaje es hombre:
        //1 -> Clase Buscavidas.
        //2 -> Clase Guerrero.
        //3 -> Clase Mago.
        //Cualquier otro valor de clase introducido por el usuario hará que se elija una clase por defecto:
        //Asesina en caso de género femenino y Buscavidas en clase de género masculino.

        System.out.println("Ejercicio 1:");
        System.out.println("Introduzca el genero de su personaje: 1 = mujer, 2 = hombre");
        int genero = sc.nextInt();
        int rol;
        if (genero==2) {
            System.out.println("Ha elegido HOMBRE como genero");
            System.out.println();
            System.out.println("Introduzca el rol de su personaje: 1 = Buscavidas, 2 = Guerrero, 3 = Mago");
            rol = sc.nextInt();
            switch (rol) {
                case 2:
                    System.out.println("Ha elegido GUERRERO como clase");
                    break;
                case 3:
                    System.out.println("Ha elegido MAGO como clase");
                    break;
                default:
                    System.out.println("Ha elegido BUSCAVIDAS como clase");
                    break;
            }
        } else {
            System.out.println("Ha elegido MUJER como genero");
            System.out.println();
            System.out.println("Introduzca el rol de su personaje: 1 = Asesina, 2 = Druida, 3 = Amazona");
            rol = sc.nextInt();
            switch (rol) {
                case 2:
                    System.out.println("Ha elegido DRUIDA como clase");
                    break;
                case 3:
                    System.out.println("Ha elegido AMAZONA como clase");
                    break;
                default:
                    System.out.println("Ha elegido ASESINA como clase");
                    break;
            }
        }
        System.out.println();

        //Ejercicio 2:
        //Joaquín está pensando en qué ejercicios poner en el examen final de la primera evaluación.
        //Independientemente de los ejercicios que ponga, a él le gustan mucho los menús, y como
        //tiene alumnos a los que ya le ha explicado en clase como realizar menús, ha seleccionado al mejor
        //alumno de la clase y en el que más confía para realizarlo, y ese eres tú. Como Joaquín tiene una base de
        //programación, no quedará satisfecho si el menú usa cualquiera de las formas de realizar
        //bucles que hemos dado en clase. Quedará satisfecho con la más adecuada de las 3.
        //Los requerimientos del menú son los siguientes:
        //Hacer que el usuario meta por pantalla un número entre 0 y 4.
        //Según el caso, el programa realizará la siguiente impresión por
        //pantalla:
        //0 -> Examen finalizado con éxito!
        //1 -> Ejercicio 1 finalizado.
        //2 -> Ejercicio 2 finalizado.
        //3 -> Ejercicio 3 finalizado.
        //4 -> Ejercicio 4 finalizado.
        //Si el usuario introduce un número que no está en estos casos,
        //se deberá imprimir por pantalla el siguiente mensaje -> Error,
        //número fuera de rango.
        //Una vez se haga todo este proceso que hemos descrito desde
        //la línea “Hacer que el usuario…” hasta ahora, volver a repetir
        //todo esto mientras que el usuario no haya introducido el
        //número 0.
        System.out.println("Ejercicio 2: ");
        int examen;
        do{
            do{
                System.out.print("Selecciona un ejercicio entre 1 y 4 (Pulsar 0 para salir del programa): ");
                examen = sc.nextInt();
            } while (examen<0 || examen>4);
            if (examen == 0) {
                System.out.println("\n-------------------------------------------");
                System.out.println("Examen finalizado con éxito!");
                System.out.println("-------------------------------------------\n");
            } else {
                System.out.println("\n-------------------------------------------");
                System.out.println("Ejercicio " + examen + " finalizado.");
                System.out.println("-------------------------------------------\n");
            }
        } while (examen!=0);

        //Ejercicio 3:
        //Se acerca el mundial y Jorge y Joaquín están tristes porque no tienen banderas para animar
        //a la selección. Aun si las tuviesen, Qatar está un poco lejos de Vedruna, su lugar de
        //trabajo, así que de poco les serviría tenerla. No obstante sus alumnos, para subir un poco sus ánimos
        //y sabiendo que igualmente sus dos profesores van a tener que vivir el mundial de manera virtual,
        //han decidido hacer un programa Java que les deje seleccionar un tamaño y Java les obsequie con un
        //banderín virtual de la selección española. Por tanto, debes desarrollar un programa que pida al usuario
        //un tamaño 'n' y que dibuje el siguiente triángulo de altura 2*n y anchura 'n' con los siguientes colores:
        //Para imprimir por pantalla colores en java, el proceso es el siguiente. Cada color viene representado por
        //un String, siendo:
        String rojo = "\033[0;31m";
        String amarillo = "\033[0;33m";
        String reset = "\033[0m";

        System.out.println("Ejercicio 3: ");
        System.out.print("Introduce tamaño banderín: ");
        int niveles = sc.nextInt();
        int asteriscos = 1;
        for (int i = 1; i <= niveles; i++) {
            for (int j = 0; j <= asteriscos; j+=2) {
                if (j==0 || j == asteriscos-1){
                    System.out.print(rojo + "* " + reset);

                } else if (j > 0 && j <= asteriscos-1) {
                    System.out.print(amarillo + "* " + reset);

                } else {
                    System.out.print("");
                }
            }
            System.out.println();
            asteriscos +=2;
        }

        for (int i = 0; i <= niveles; i++) {
            for (int j = 0; j <= asteriscos; j+=2) {
                if (j==0 || j == asteriscos-1){
                    System.out.print(rojo + "* " + reset);
                } else if (j>0 && j < asteriscos -1) {
                    System.out.print(amarillo + "* " + reset);
                } else {
                    System.out.print("");
                }
            }
            System.out.println();
            asteriscos -=2;
        }

        System.out.println();


        //Extra:
        //A Joaquín le viene bien este banderín, puesto que Joaquín es
        //zurdo, pero para Jorge, que es diestro, le vendría mejor un
        //banderín adecuado a él. Cómo Joaquín explicó en clase una
        //forma muy sencilla de voltear un triángulo respecto de un eje,
        //para conseguir el 10+++ debéis voltear el banderín respecto
        //del eje Y.


        System.out.print("Introduce tamaño banderín: ");
        //SOLO SALE LA MITAD DE ABAJO
        int niveles2 = sc.nextInt();
        int espacios2 = 1;
        for (int i = 1; i <= niveles2; i++) {
            for (int j = niveles2; j>= 0; j--) {
                if (j > niveles2-espacios2){
                    System.out.print("  ");
                } else if (j==0 || j==niveles2-espacios2){
                    System.out.print(rojo + "* " + reset);

                } else {
                    System.out.print(amarillo + "* " + reset);
                }
            }
            System.out.println();
            espacios2++;
        }

        for (int i = 1; i <= niveles2; i++) {
            for (int j = niveles2; j>= 0; j--) {
                if (j > niveles2-espacios2){
                    System.out.print("  ");
                } else if (j==0 || j==niveles2-espacios2){
                    System.out.print("\033[0;31m"+"* "+"\033[0m");

                } else {
                    System.out.print("\033[0;33m"+"* "+"\033[0m");
                }
            }
            System.out.println();
            espacios2++;
        }

        System.out.println();


        //Ejercicio 4:
        //Para que un alumno se prepare bien durante este simulacro para el examen final y saber que va
        //en buen camino para aprobar el examen de evaluación, deben cumplirse las siguientes condiciones
        //(teniendo en cuenta que solo debéis entregar 3 ejercicios en este simulacro): haber hecho bien los
        //tres ejercicios que haría una persona cuerda Y no haber intentado el ejercicio 3 O que su locura
        //se justifique habiendo realizado con éxito el ejercicio 3 Y no haberse olvidado por terquedad de
        //los ejercicios1 y 2. Para comprobar si estamos bien preparados, y como no queremos pensar el caso
        //lógico particular de cada persona, se pide en este ejercicio desarrollar un programa que pida al usuario 4
        //variables booleanas, cada una de ellas asociada a las siguientes preguntas:
        //1) ¿Has hecho bien el ejercicio 1, 2 y 4?
        //2) ¿Has intentado el ejercicio 3?
        //3) ¿Has hecho bien el ejercicio 3?
        //4) ¿Te has olvidado de los ejercicios 1 y 2?
        //Una vez guardadas las respuestas True o False que el usuario ha introducido por pantalla,
        //inmediatamente y sin hacer otro tipo de instrucción intermedia entre las preguntas y lo que se
        //va a pedir a continuación, imprimir por pantalla el resultado de la proposición lógica descrita
        //anteriormente y que está en negrita

        System.out.println("Ejercicio 4:");

        System.out.print("Has hecho bien el ejercicio 1, 2 y 4? ");
        boolean p1 = sc.nextBoolean();
        System.out.print("Has intentado el ejercicio 3? ");
        boolean p2 = sc.nextBoolean();
        System.out.print("Has hecho bien el ejercicio 3? ");
        boolean p3 = sc.nextBoolean();
        System.out.print("Te has olvidado de los ejercicios 1 y 2? ");
        boolean p4 = sc.nextBoolean();

        if ((p1 && !p2) || (p3 && !p4)) {
            System.out.println("\nHAS APROBADO EL SIMULACRO!");
        } else {
            System.out.println("\nPreparate mejor para el examen");
        }

    }
}
