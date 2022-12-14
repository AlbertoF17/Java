package Practicas;

import java.util.Scanner;

public class AlgoritmoLuhn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        long numero = sc.nextLong();
        long copia = numero, copia2 = numero, numNuevo = 0;
        int cont = 0, suma = 0;
        String tarjeta = "";
        for (int cifras=0; numero!=0; cont++, cifras++){
            numero = numero/10;
        }
        for (int cifraSuma, cifraCopia; cont>0; cont--) {
            int cifra = (int) (copia%10);
            if (cont%2==1) {
                cifraSuma = (cifra*2);
                if (cifraSuma>9) {
                    cifraCopia = cifraSuma;
                    cifraSuma = 0;
                    for (int j=0; j<2; j++) {
                        int cifraPar = cifraCopia % 10;
                        cifraSuma += cifraPar;
                        cifraCopia/=10;
                    }
                    suma += cifraSuma;
                }
                suma += cifra;
            }
            numNuevo += cifra * (Math.pow(10, cont-1));
            copia /=10;
        }
        int primeraCifra = (int) (numNuevo%10);
        if (suma%10==0){
            System.out.print("El número " + copia2 +" ES un número de Luhn: ");
            switch (primeraCifra) {
                case 3:
                    tarjeta = "American Express";
                    break;
                case 4:
                    tarjeta = "Visa";
                    break;
                case 5:
                    tarjeta = "Mastercard";
                    break;
                default:
                    System.out.println("Número de tarjeta NO válido");
            }
            System.out.println(" corresponde a una tarjeta " + tarjeta);
        } else {
            System.out.print("El número " + copia2 + " NO es un número de Luhn");
        }

    }
}