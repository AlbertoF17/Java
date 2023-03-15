package Boletines.TareaEntregable;

public class MetodosEstaticosDeAlbertoFernandez {
    public static void imprimirStrings(String[] sol) {
        if (sol == null) {
            throw new NullPointerException("No puede ser nulo");
        }
        for (int i = 0; i < sol.length; i++) {
            System.out.println(sol[i]);
        }
    }

    public static String ampliar(String str, int m) {
        if (str == null) {
            throw new NullPointerException("No puede ser nulo");
        }
        if (m < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        return str + " ".repeat(m-str.length());
    }

    public static String[] desplazar(String[] array, int n) {
        if (array == null) {
            throw new NullPointerException("No puede ser nulo");
        }
        if (n < 0) {
            throw new IllegalArgumentException("El numero no puede ser negativo");
        }
        String[] sol = new String[n];
        int diff = n - array.length;
        for (int i = 0; i < n; i++) {
            if (i>= diff) {
                sol[i] = array[i-diff];
            } else {
                sol[i] = "";
            }
        }
        return sol;
    }

    public static void imprimirInventario(InventarioAlbertoFernandez inventario){
        String[][] lineas = new String[inventario.getColeccionArmas().length][];
        int maxRows = 0;
        int maxColumns = 0;
        for (int i = 0; i < inventario.getColeccionArmas().length; i++) {
            lineas[i] = inventario.getColeccionArmas()[i].toString().split("\n");
            if (lineas[i].length > maxRows) {
                maxRows = lineas[i].length;
            }
            for (int j = 0; j < lineas[i].length; j++) {
                if (lineas[i][j].length() > maxColumns) {
                    maxColumns = lineas[i][j].length();
                }
            }
        }
        for (int i = 0; i < lineas.length; i++) {
            lineas[i] = MetodosEstaticosDeAlbertoFernandez.desplazar(lineas[i], maxRows);
            for (int j = 0; j < lineas[i].length; j++) {
                lineas[i][j] = MetodosEstaticosDeAlbertoFernandez.ampliar(lineas[i][j], maxColumns);
            }
        }
        String[] solucion = new String[maxRows];
        for (int i = 0; i < maxRows; i++) {
            solucion[i] = "";
            for (int j = 0; j < lineas.length; j++) {
                solucion[i] += lineas[j][i];
            }
        }
        imprimirStrings(solucion);
    }
}
