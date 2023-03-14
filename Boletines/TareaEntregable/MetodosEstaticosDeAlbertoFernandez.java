package Boletines.TareaEntregable;

public class MetodosEstaticosDeAlbertoFernandez {
    public static void imprimirStrings(String[] arrayStr){
        for (int i = 0; i < arrayStr.length; i++) {
            System.out.println(arrayStr[i]);
        }
    }

    public static String ampliar(String cadena, int numero){
        String cadenaNueva = cadena;
        int numEspacios = numero - cadena.length();
        for (int i = 0; i < numEspacios; i++) {
            cadenaNueva += " ";
        }
        return cadenaNueva;
    }

    public static String[] desplazar(String[] arrayStr, int numero){
        String[] arrayNuevo = new String[numero];
        for (int i = arrayStr.length; i > 0;i--) {
            arrayNuevo[i] = arrayStr[i];
        }
        for (int i = arrayNuevo.length - arrayStr.length; i > 0; i--) {
            arrayNuevo[i] = "";

        }
        return arrayNuevo;
    }

    public static void imprimirInventario(InventarioAlbertoFernandez inventario){
        for (int i = 0; i < inventario.getColeccionArmas().length; i++) {
            System.out.println(inventario.getColeccionArmas()[i].toString());
        }
    }
}
