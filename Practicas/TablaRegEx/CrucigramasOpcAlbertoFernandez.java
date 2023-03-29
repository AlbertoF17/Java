package Practicas.TablaRegEx;

import java.util.Scanner;

public class CrucigramasOpcAlbertoFernandez {
    static final Scanner sc = new Scanner(System.in);
    String[] col1;
    String[] col2;
    String[] row1;
    String[] row2;
    char[][] sol;
    int maxLen;
    public CrucigramasOpcAlbertoFernandez() {
        this.col1 = new String[]{"."};
        this.col2 = new String[]{"."};
        this.row1 = new String[]{"."};
        this.row2 = new String[]{"."};
        this.sol = new char[1][1];
        this.maxLen = 1;
    }
    public CrucigramasOpcAlbertoFernandez(String[] col1, String[] col2, String[] row1, String[] row2) {
        validarCols(col1, col2);
        this.col1 = col1;
        this.col2 = col2;
        validarRows(row1, row2);
        this.row1 = row1;
        this.row2 = row2;
        sol = new char[col1.length][row1.length];
        this.maxLen = maxLong();
    }

    public void setSol(char[][] sol) {
        validarSol(sol);
        this.sol = sol;
    }
    private void validarRows(String[] row1, String[] row2){
        if (row1.length != row2.length){
            throw new IllegalArgumentException("Ambos arrays deben ser de la misma longitud");
        }
        if(row1 == null || row2 == null){
            throw new NullPointerException("Ningún array puede ser nulo");
        }
    }
    private void validarCols(String[] col1, String[] col2){
        if (col1.length != col2.length){
            throw new IllegalArgumentException("Ambos arrays deben ser de la misma longitud");
        }
        if(col1 == null || col2 == null){
            throw new NullPointerException("Ningún array puede ser nulo");
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
        for (int i = 0; i < col1.length; i++) {
            if (col1[i].length() > maxLong){
                maxLong = col1[i].length();
            }
            if (col2[i].length() > maxLong){
                maxLong = col2[i].length();
            }
            if (row1[i].length() > maxLong){
                maxLong = row1[i].length();
            }
            if (row2[i].length() > maxLong){
                maxLong = row2[i].length();
            }
        }
        return maxLong;
    }
    public String ampliar(String str){
        return " ".repeat(maxLen-str.length()) + str + " |";
    }
    public void introducirSol(){
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                System.out.println("Introduce el carácter en la posición (" + i + ", " + j + "):");
                sol[i][j] = sc.next().charAt(0);
            }
        }
    }

    public boolean comprobarSol(){
        boolean solucionCorrecta = true;
        String lineaSol = "";
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                lineaSol += sol[j][i];
            }
            if (!lineaSol.matches(row1[i]) || !lineaSol.matches(row2[i])){
                solucionCorrecta = false;
            }
            lineaSol = "";
        }
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol[i].length; j++) {
                lineaSol += sol[i][j];
            }
            if (!lineaSol.matches(col1[i]) || !lineaSol.matches(col2[i])){
                solucionCorrecta = false;
            }
            lineaSol = "";
        }

        if (solucionCorrecta){
            System.out.println("HAS ACERTADO");
        }else{
            System.out.println("Fallaste, inténtalo de nuevo");
        }
        return solucionCorrecta;
    }

    public void borrarSol(){
        sol = new char[row1.length][col1.length];
    }

    @Override
    public String toString() {
        String resultado = "";
        resultado += ampliar("");
        for (int i = 0; i < row1.length; i++) {
            resultado += ampliar(row1[i]);
        }
        resultado += "\n";
        for (int i = 0; i < col1.length; i++) {
            resultado += ampliar(col1[i]);
            for (int j = 0; j < sol[i].length; j++) {
                resultado += ampliar(sol[i][j] + "");
            }
            resultado += ampliar(col2[i]);
            resultado += "\n";
        }
        resultado += ampliar("");
        for (int i = 0; i < row2.length; i++) {
            resultado += ampliar(row2[i]);
        }
        return resultado;
    }
}
