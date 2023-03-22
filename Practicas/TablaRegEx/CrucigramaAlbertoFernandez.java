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
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                System.out.println("¿Qué carácter crees que va en la celda " + i+1 + "?");
                sol[i][j] = sc.next().charAt(0);
            }
        }
    }

    public void comprobarSolucion(){

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
