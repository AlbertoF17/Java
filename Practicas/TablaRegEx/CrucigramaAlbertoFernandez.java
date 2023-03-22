package Practicas.TablaRegEx;

import java.util.Arrays;
import java.util.Scanner;

public class CrucigramaAlbertoFernandez {
    static final Scanner sc = new Scanner(System.in);
    String[] col;
    String[] row;
    char[][] sol;

    public CrucigramaAlbertoFernandez(String[] col, String[] row) {
        this.col = col;
        this.row = row;
        sol = new char[row.length][col.length];
    }

    public void introducirSolucion(){
        int numCelda = 1;
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                System.out.println("¿Qué carácter crees que va en la celda " + numCelda + "?");
                numCelda++;
                sol[i][j] = sc.next().charAt(0);
            }
        }
    }

    public void comprobarSolucion(){
        boolean solucionCorrecta = true;
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                if (!((sol[i][j]+"").matches(row[i])) || !((sol[i][j]+"").matches(col[j]))){
                    solucionCorrecta = false;
                }
            }
        }
        if (solucionCorrecta){
            System.out.println("HAS ACERTADO");
        }else{
            System.out.println("Fallaste, inténtalo de nuevo");
        }
    }

    public void borrarSol(){
        sol = new char[row.length][col.length];
    }

    @Override
    public String toString() {
        return "CrucigramaAlbertoFernandez{" +
                "col=" + Arrays.toString(col) +
                ", row=" + Arrays.toString(row) +
                ", sol=" + Arrays.toString(sol) +
                '}';
    }
}
