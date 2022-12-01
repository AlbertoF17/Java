package Practicas;

import java.util.Random;

public class BarraDeCarga {
    public static void main(String [] args) throws InterruptedException {
        Random rand = new Random();
        System.out.println("Barra de carga");
        int num = rand.nextInt(400, 2100);
        int carga = 0;
        int numCarga = 0;
        int numBarras = 20;
        int barras;
        while (carga<=100) {
            System.out.print("\r|");
            for (;numCarga>0 ; numCarga--){
                System.out.print("#");
            }
            for (barras = numBarras; barras>0 ; barras--){
                System.out.print("-");
            }
            System.out.print(" " + carga + "%|");
            carga += (rand.nextInt(1,3)*5);
            numCarga = carga/5;
            numBarras = 20 - numCarga;
            Thread.sleep(num);
            num = rand.nextInt(400, 1200);

        }
        Thread.sleep(200);
        System.out.print("\r¡Completado!");
    }
}
