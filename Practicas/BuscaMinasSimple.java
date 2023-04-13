package Practicas;

import java.util.Random;

public class BuscaMinasSimple {
    public static void main(String[] args){
        imprimirArray(generarTablero(3));
    }
    public static char[][] generarTablero(int numMinas){
        Random rand = new Random();
        char[][] tablero = new char[10][10];
        do {
            for (int i = 0; i < numMinas; i++) {
                int colocacionMinai = rand.nextInt(1,9);
                int colocacionMinaj = rand.nextInt(1,9);
                tablero[colocacionMinai][colocacionMinaj] = 'B';
            }
            int cont = numMinas;
            for (int i = 1; i < tablero.length-1; i++) {
                for (int j = 1; j < tablero[i].length-1; j++) {
                    if (tablero[i][j] == 'B') {
                        numMinas--;
                    } else{
                        int alrededor = 0;
                        if(tablero[i-1][j-1]=='B'){
                            alrededor++;
                        }
                        if(tablero[i-1][j]=='B'){
                            alrededor++;
                        }
                        if(tablero[i-1][j+1]=='B'){
                            alrededor++;
                        }
                        if(tablero[i][j-1]=='B'){
                            alrededor++;
                        }
                        if(tablero[i][j+1]=='B'){
                            alrededor++;
                        }
                        if(tablero[i+1][j-1]=='B'){
                            alrededor++;
                        }
                        if(tablero[i+1][j]=='B'){
                            alrededor++;
                        }
                        if(tablero[i+1][j+1]=='B') {
                            alrededor++;
                        }
                        tablero[i][j] = Character.forDigit(alrededor,10);
                    }
                }
            }
        }while(numMinas>0);
        return tablero;
    }
    public static void imprimirArray(char[][] array){
        for (int i = 1; i < array.length-1; i++) {
            for (int j = 1; j < array[i].length-1; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
