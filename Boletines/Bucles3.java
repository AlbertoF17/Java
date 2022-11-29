package Boletines;

import java.util.Scanner;

public class Bucles3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        //1. Escriba un programa que lea por pantalla un número entero 'n', e imprima los 'n'
        //primeros números positivos. Por ejemplo, para n=5 debe imprimir 1 2 3 4 5
        System.out.println("Ejercicio 1: ");
        System.out.print("Introduzca un numero: ");
        int n1 = sc.nextInt();
        for (int i=1; i<=n1; i++) {
            System.out.println(i + " ");
        }
        System.out.println();

        //2. Escriba un programa que lea por pantalla un número entero n, e imprima los n
        //primeros números pares. Por ejemplo, para n=5 debe imprimir 2 4 6 8 10
        System.out.println("Ejercicio 2: ");
        System.out.print("Introduzca un numero: ");
        int n2 = sc.nextInt();
        for (int i=0, num=0; i<n2; i++) {
            num+=2;
            System.out.println(num + " ");
        }
        System.out.println();

        //3. Escriba un programa que lea por pantalla un número entero n, e imprima los 'n'
        //primeros números impares. Por ejemplo, para n=5 debe imprimir 1 3 5 7 9
        System.out.println("Ejercicio 3: ");
        System.out.print("Introduzca un numero: ");
        int n3 = sc.nextInt();
        for (int i=0, num=1; i<n3; i++) {
            System.out.println(num + " ");
            num+=2;
        }
        System.out.println();

        //4. Escriba un programa que lea por pantalla un número entero n, e imprima los 'n'
        //primeros números cuadrados. Por ejemplo, para n=5 debe imprimir 1 4 9 16 25
        System.out.println("Ejercicio 4: ");
        System.out.print("Introduzca un numero: ");
        int n4 = sc.nextInt();
        for (int i=1; i<=n4; i++) {
            System.out.print((Math.pow(i,2)) + " ");
        }
        System.out.println();

        //5. Escriba un programa que lea por pantalla un número entero n, e imprima la suma de
        //los 'n' primeros números positivos. Por ejemplo, para n=5 debe imprimir
        //1+2+3+4+5=15
        System.out.println("Ejercicio 5: ");
        System.out.print("Escriba un numero: ");
        int n=1;
        int suma=0;
        for (int i=sc.nextInt();n<i; n++) {
            System.out.print(n + "+");
            suma=suma+n;
        }
        suma=suma+n;
        System.out.println(n + "=" + suma);
        System.out.println();


        //6. Escriba un programa que lea por pantalla dos números entero m y n, e imprima el
        //número 'm' repetido 'n' veces. Por ejemplo, para m=8 y n=5 debe imprimir 8 8 8 8 8
        System.out.println("Ejercicio 6: ");
        System.out.print("Escriba un numero: ");
        int n6 = sc.nextInt();
        System.out.print("Escriba el numero de veces que quieres que se repita: ");
        int num6 = sc.nextInt();
        for(int i=0; i<num6; i++){
            System.out.print(n6 + " ");
        }
        System.out.println();

        //7. Escriba un programa que lea por pantalla un número n, e imprima una cuenta atrás.
        //Por ejemplo, para n=5 debe imprimir
        //5
        //4
        //3
        //2
        //1
        //0
        System.out.println("Ejercicio 6: ");
        System.out.print("Escriba un numero: ");
        int n7 = sc.nextInt();
        for(int i=n7; i>=0; i--){
            System.out.println(n7);
            n7=n7-1;
        }
        System.out.println();

        //8. Escriba un programa que lea por pantalla dos números entero m y n, e imprima la
        //letra ‘M’ repetida m veces y la letra ‘N’ repetida n veces. Por ejemplo, para m=8 y
        //n=5 debe imprimir
        //M M M M M M M M N N N N N
        System.out.println("Ejercicio 8: ");
        sc.nextLine();
        System.out.print("Escriba una letra: ");
        String a = sc.nextLine();
        while (a.length()!=1){
            System.out.println("Cadena no valida, use un solo carácter");
            a = sc.nextLine();
        }
        System.out.print("Escriba el numero de veces que quieres que se repita: ");
        int n8 = sc.nextInt();

        for (int i=0; i<n8; i++){
            System.out.print(a + " ");
        }
        System.out.println();

        //9. Escriba un programa que lea por pantalla un número n, e imprima los 'n' primeros
        //términos (con n >= 0) de la sucesión 4n+3. Por ejemplo, para n=4 debe imprimir
        //3 7 11 15
        System.out.println("Ejercicio 9: ");
        System.out.print("Escriba un numero: ");
        int n9 = sc.nextInt();
        while (n9<0){
            System.out.println("Numero no valido, debe ser 0 o mayor que 0");
            n9 = sc.nextInt();
        }
        for(int i=0; i<n9; i++){
            System.out.print((4*i+3) + " ");
        }
    }
}
