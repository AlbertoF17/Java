package Boletines;

import java.util.Scanner;

public class TareaRelampago2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        /*
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
        System.out.println();*/

        int dia1 = 0;
        int dia2 = 0;
        int hora1 = -1;
        int hora2 = -1;
        do{
            System.out.println("Dame el primer dia");
            dia1 = sc.nextInt();
            System.out.println("Dame el segundo dia");
            dia2 = sc.nextInt();
        }while(dia1<1||dia1>7 && dia2<1||dia2>7);

        do{
            System.out.println("Dame una primera hora");
            hora1 = sc.nextInt();
            System.out.println("Dame una segunda hora");
            hora2 = sc.nextInt();
        }while(hora1<0||hora1>23 && hora2<0||hora2>23);

        int dias = (dia2-dia1)*24;
        int horas = (hora2 - hora1);
        int tiempo = dias+horas;
        int numDias = 0;
        while(tiempo>24){
            numDias++;
            tiempo-=24;
        }
        System.out.println(numDias + ":" + tiempo);





    }
}
