package Boletines.TareaEntregable;

public class InventarioAlbertoFernandez{
    private ArmaAlbertoFernandez[] coleccionArmas;

    public InventarioAlbertoFernandez(ArmaAlbertoFernandez[] coleccionArmas){
        this.coleccionArmas = validarColeccionArmas(coleccionArmas);
    }

    public ArmaAlbertoFernandez[] getColeccionArmas() {
        return coleccionArmas;
    }

    public void setColeccionArmas(ArmaAlbertoFernandez[] coleccionArmas) {
        this.coleccionArmas = validarColeccionArmas(coleccionArmas);
    }

    public ArmaAlbertoFernandez[] validarColeccionArmas(ArmaAlbertoFernandez[] coleccionArmas){
        for (int i = 0; i < coleccionArmas.length; i++) {
            if(coleccionArmas[i] == null){
                throw new IllegalArgumentException("No puede haber un arma nula");
            }
        }
        if (coleccionArmas.length>5) {
            ArmaAlbertoFernandez[] coleccionCopia = coleccionArmas;
            coleccionArmas = new ArmaAlbertoFernandez[5];
            for (int i = 0; i < coleccionArmas.length; i++) {
                coleccionArmas[i] = coleccionCopia[i];
            }
        }
        return coleccionArmas;
    }

    public String toString(){
        String inventarioStr = "";
        for (int i = 0; i < getColeccionArmas().length; i++) {
            inventarioStr += coleccionArmas[i].toString();
        }
        return inventarioStr;
    }

}
