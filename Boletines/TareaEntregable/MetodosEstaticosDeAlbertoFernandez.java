package Boletines.TareaEntregable;

public class MetodosEstaticosDeAlbertoFernandez {
    public static void imprimirStrings(String[] arrayStr){
        if (arrayStr == null){
            throw new NullPointerException("El array no puede ser nulo.");
        } else{
            for (int i = 0; i < arrayStr.length; i++) {
                System.out.println(arrayStr[i]);
            }
        }
    }

    public static String ampliar(String cadena, int numero){
        if (cadena == null){
            throw new NullPointerException("La cadena no puede ser nula.");
        }
        if (numero < 0){
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        String cadenaNueva = cadena;
        int numEspacios = numero - cadena.length();
        cadenaNueva += " ".repeat(numEspacios);
        return cadenaNueva;
    }

    public static String[] desplazar(String[] arrayStr, int numero){
        if (arrayStr == null){
            throw new NullPointerException("El array no puede ser nulo.");
        } else if (numero < 0){
            throw new IllegalArgumentException("El número no puede ser negativo");
        }
        String[] arrayNuevo = new String[numero];
        for (int i = 0; i < arrayNuevo.length-arrayStr.length; i++) {
            arrayNuevo[i] = "";
        }
        for (int i = arrayNuevo.length-arrayStr.length, j = 0; i < arrayNuevo.length; i++, j++) {
            arrayNuevo[i] = arrayStr[j];
        }
        return arrayNuevo;
    }

    public static void imprimirInventario(InventarioAlbertoFernandez inventario){
        String[][] lineas = new String[inventario.getColeccionArmas().length][];
        int maxRows = 0;
        int maxColumns = 0;
        for (int i = 0; i < inventario.getColeccionArmas().length; i++) {
            lineas[i] = inventario.getColeccionArmas()[i].toString().split("\n");
            if (lineas[i].length>maxRows){
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
