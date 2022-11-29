package Practicas;
//TRABAJO REALIZADO POR: ALBERTO FERNÁNDEZ GÓMEZ

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Random;
import java.util.Scanner;

public class MathTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("***********  BIENVENIDO A MATH TRAINING  ***********");
        System.out.print("Desea jugar?  ");
        String juego = sc.nextLine();
        int aciertosRec = 0;
        double tiempoRec = 0;
        int aciertos = 0;

        while (juego.equalsIgnoreCase("Si")) {
            System.out.println();
            System.out.println("Ready, Steady... GO");
            System.out.println("\nGenerando operaciones...");
            long startTime, endTime;
            startTime = System.nanoTime();
            boolean resultado = true;
            while (resultado) {
                int a = rand.nextInt(0, 101);
                int b = rand.nextInt(1, 101);
                int op = rand.nextInt(0, 5);

                //Variable de un número con 2 decimales separado por punto:
                DecimalFormatSymbols separadoresPersonalizados1 = new DecimalFormatSymbols();
                separadoresPersonalizados1.setDecimalSeparator('.');
                DecimalFormat decimales1 = new DecimalFormat("#.##", separadoresPersonalizados1);

                //Variable de un número con 2 decimales separado por coma:
                DecimalFormatSymbols separadoresPersonalizados2 = new DecimalFormatSymbols();
                separadoresPersonalizados2.setDecimalSeparator(',');
                DecimalFormat decimales2 = new DecimalFormat("#.##", separadoresPersonalizados2);

                //Aproximación:
                double division = (double) a / b;
                division = Math.round(division * 100) / 100d;

                //Formateo del resultado a 2 decimales
                String divisionStr1 = decimales1.format(division);
                String divisionStr2 = decimales2.format(division);

                float res = 0.0f;
                float result = 0.0f;
                String resString = "";
                String operacion = "+-*/%";
                System.out.println("\nEscriba el resultado de la operacion: " + (a + " " + operacion.charAt(op) + " " + b));
                switch (operacion.charAt(op)) {
                    case '+': {
                        result = (a + b);
                        res = sc.nextFloat();
                        break;
                    }
                    case '-': {
                        result = (a - b);
                        res = sc.nextFloat();
                        break;
                    }
                    case '*': {
                        result = (a * b);
                        res = sc.nextFloat();
                        break;
                    }
                    case '/': {
                        System.out.println("Nota: usar un máximo de 2 decimales redondeando este ultimo según el valor del tercer decimal");
                        resString = sc.next();
                        break;
                    }
                    case '%': {
                        res = sc.nextFloat();
                        result = (a % b);
                        break;
                    }
                    default: {
                        System.out.println("Esta operación no esta disponible");
                        resultado = false;
                        break;
                    }
                }

                if (resString.equals(divisionStr1) || resString.equals(divisionStr2)) {
                    System.out.println("\nCORRECTO! Siguiente pregunta...\n");
                    aciertos++;
                    resultado = true;

                } else if (res == result && op!=3) {
                    System.out.println("\nCORRECTO! Siguiente pregunta...\n");
                    aciertos++;
                    resultado = true;

                } else {
                    resultado = false;
                    System.out.println("\nFALLASTE");
                }
            }
            System.out.println("\n*******************  GAME OVER  ********************");

            endTime = System.nanoTime();

            double segundos = (endTime - startTime) / (Math.pow(10, 9));
            segundos = Math.round(segundos * 100) / 100d;

            System.out.print("Tiempo: " + segundos + " segundos" + "  ||  ");

            System.out.println("Numero de aciertos: " + aciertos + "\n");

            System.out.println("---------------------  Record  ---------------------");

            System.out.print("Tiempo: " + tiempoRec + " segundos" + "  ||  ");

            System.out.println("Numero de aciertos: " + aciertosRec + "\n");
            if (aciertos > aciertosRec) {
                System.out.println("Has conseguido un nuevo record, registrando los datos..." + "\n");
                aciertosRec = aciertos;
                tiempoRec = segundos;
            } else if (aciertos == aciertosRec) {
                if (tiempoRec > segundos) {
                    System.out.println("Has conseguido un nuevo record, registrando los datos..." + "\n");
                    aciertosRec = aciertos;
                    tiempoRec = segundos;
                } else {
                    System.out.println("No has hecho ningún récord... Te deseo mas suerte para la próxima!!" + "\n");
                }
            } else {
                System.out.println("No has hecho ningún récord... Te deseo mas suerte para la próxima!!" + "\n");
            }
            System.out.print("Quieres volver a jugar? ");
            juego = sc.next();
        }

        System.out.println("\n****************  FIN DEL PROGRAMA  ****************\n");

        System.out.println("---------------------  Record  ---------------------");

        System.out.print("Tiempo: " + tiempoRec + " segundos" + "  ||  ");

        System.out.println("Numero de aciertos: " + aciertosRec);
    }
}
