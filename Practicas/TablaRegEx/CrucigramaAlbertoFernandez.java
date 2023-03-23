package Practicas.TablaRegEx;

import java.util.Arrays;
import java.util.Scanner;

public class CrucigramaAlbertoFernandez {
    static final Scanner sc = new Scanner(System.in);
    String[] col;
    String[] row;
    char[][] sol;
    int maxLen;
    public CrucigramaAlbertoFernandez() {
        this.col = new String[]{"."};
        this.row = new String[]{"."};
        this.sol = new char[1][1];
        this.maxLen = 1;
    }
    public CrucigramaAlbertoFernandez(String[] col, String[] row) {
        validarCol(col);
        this.col = col;
        validarRow(row);
        this.row = row;
        sol = new char[row.length][col.length];
        this.maxLen = 1;
    }

    public void setSol(char[][] sol) {
        validarSol(sol);
        this.sol = sol;
    }
    private void validarRow(String[] row){
        for (int i = 0; i < row.length; i++) {
            if (row[i].length() != 1){
                throw new IllegalArgumentException("La fila debe tener un sólo carácter en cada espacio que ocupa");
            }
        }
        if(row == null){
            throw new NullPointerException("El array no puede ser nulo");
        }
    }
    private void validarCol(String[] col){
        for (int i = 0; i < col.length; i++) {
            if (col[i].length() != 1){
                throw new IllegalArgumentException("La columna debe tener un sólo carácter en cada espacio que ocupa");
            }
        }
        if(col == null){
            throw new NullPointerException("El array no puede ser nulo");
        }
    }
    private void validarSol(char[][] sol){
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                if ((sol[i][j]+"").length() != 1){
                    throw new IllegalArgumentException("La solución debe tener un sólo carácter en cada espacio" +
                            " de la matriz");
                }
            }
        }
        if(sol == null){
            throw new NullPointerException("La matriz no puede ser nula");
        }
    }
    public int maxLong(){
        int maxLong = 0;
        for (int i = 0; i < col.length; i++) {
            if (col[i].length() > maxLong){
                maxLong = col[i].length();
            }
            if (row[i].length() > maxLong){
                maxLong = row[i].length();
            }
        }
        return maxLong;
    }
    public String ampliar(String str){
        return " ".repeat(maxLen-str.length()) + str + " |";
    }
    public void introducirSol(){
        int numCelda = 1;
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                System.out.println("¿Qué carácter crees que va en la celda " + numCelda + "?");
                numCelda++;
                sol[i][j] = sc.next().charAt(0);
            }
        }
    }

    public boolean comprobarSol(){
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
        return solucionCorrecta;
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
