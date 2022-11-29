package Practicas;

import java.util.Scanner;

public class Timer {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int minutos;
        int segundos;
        int horas;
        int dias;

            System.out.print("Introduce un numero (dias): ");
            dias = sc.nextInt();
            System.out.print("Introduce un numero (horas): ");
            horas = sc.nextInt();
            System.out.print("Introduce un numero (minutos): ");
            minutos = sc.nextInt();
            System.out.print("Introduce un numero entre 0 y 59 (segundos): ");
            segundos = sc.nextInt();

            if (segundos>59) {
                minutos += segundos/60;
                segundos = segundos%60;
            }
            if (minutos>59) {
                horas += horas/60;
                minutos = minutos%60;
            }
            if (horas>23) {
                dias += horas/24;
                horas = horas%24;
            }


        for (int i=segundos, j=minutos, k=horas, l=dias; i>=0; i--) {
            System.out.printf("\r%02d:%02d:%02d:%02d", l, k, j, i);
            //"\r" Sobreescribe lo que hay en la línea, borrando el número anteriormente impreso
            Thread.sleep(1000); //Duerme el programa durante un tiempo determinado, en este caso 1000 milisegundos (1 segundo)

            if (i==0 && j==0 && k==0 && l>0) {
                i = 60;
                j = 59;
                k = 23;
                l--;
            } else if (i==0 && j==0 && k>0) {
                i = 60;
                j = 59;
                k--;
            } else if (i == 0 && j > 0){
                i = 60; //Restablece la variable a 60 (ya que empieza un nuevo minuto)
                j--;
            }
        }
        System.out.println("\rFIN");
    }
}