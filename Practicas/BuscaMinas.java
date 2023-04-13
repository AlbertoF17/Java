package Practicas;

import java.util.Random;

public class BuscaMinas {
    public static void main(String[] args){
        imprimirArray(generarTablero(3));
    }
    public static char[][] generarTablero(int numMinas){
        Random rand = new Random();
        char[][] tablero = new char[8][8];
        do {
            for (int i = 0; i < numMinas; i++) {
                int colocacionMinai = rand.nextInt(0, 8);
                int colocacionMinaj = rand.nextInt(0, 8);
                tablero[colocacionMinai][colocacionMinaj] = 'B';
            }
            int cont = numMinas;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    if (tablero[i][j] == 'B') {
                        numMinas--;
                    } else{
                        int alrededor = 0;
                        try{
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
                        }catch (Exception e){

                        }
                        tablero[i][j] = Character.forDigit(alrededor,10);
                    }
                }
            }
        }while(numMinas>0);
        return tablero;
    }
    public static void imprimirArray(char[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
