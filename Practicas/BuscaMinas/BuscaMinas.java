package Practicas.BuscaMinas;

import java.util.Random;

public class BuscaMinas {
    int[][] tablero;
    Mina[] minas;
    int ancho;
    int alto;
    int numMinas;

    public BuscaMinas(int ancho, int alto, int numMinas) throws TableroException, MinaException{
        validadorTablero(ancho,alto);
        this.alto = alto;
        this.ancho = ancho;
        tablero = new int[ancho+2][alto+2];
        validarNumMinas(numMinas);
        this.numMinas = numMinas;
        minas = new Mina[numMinas];
        generarMinas();
    }

    private void validadorTablero(int ancho, int alto) throws TableroException{
        if(ancho<1 || alto<1){
            throw new TableroException("Las dimensiones del tablero no pueden ser inferior a 1");
        }
    }

    private void validarNumMinas(int numMinas) throws MinaException {
        if(numMinas>=(ancho*alto)){
            throw new MinaException("El número de minas excede el máximo permitido: " + ((ancho*alto)-1));
        } else if(numMinas<1){
            throw new MinaException("Debe haber al menos una mina");
        }
    }

    public void imprimirTableroExt(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public void imprimirTablero(){
        for (int i = 1; i < tablero.length-1; i++) {
            for (int j = 1; j < tablero[i].length-1; j++) {
                System.out.print(tablero[i][j] + "  ");
            }
            System.out.println();
        }
    }

    private void generarMinas(){
        Random rand = new Random();
        int cont = numMinas;
        do {
            for (int i = 0; i < numMinas; i++) {
                int colocacionMinai = rand.nextInt(1, alto+1);
                int colocacionMinaj = rand.nextInt(1, ancho+1);
                if (tablero[colocacionMinai][colocacionMinaj] != 9){
                    cont--;
                }
            }
        }while(cont>0);
    }
}
