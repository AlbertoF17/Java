package Boletines.TareaEntregable;

public class InventarioAlbertoFernandez{
    public ArmaAlbertoFernandez[] coleccionArmas = new ArmaAlbertoFernandez[5];

    public ArmaAlbertoFernandez[] getColeccionArmas() {
        return coleccionArmas;
    }

    public void setColeccionArmas(ArmaAlbertoFernandez[] coleccionArmas) {
        for (int i = 0; i < coleccionArmas.length; i++) {
            if(coleccionArmas[i] == null){
                throw new IllegalArgumentException("No puede haber un arma nula");
            }
        }
        if (coleccionArmas.length>5) {
            for (int i = 0; i < this.coleccionArmas.length; i++) {
                this.coleccionArmas[i] = coleccionArmas[i];
            }
        } else {
            this.coleccionArmas = coleccionArmas;
        }
    }

    public InventarioAlbertoFernandez(ArmaAlbertoFernandez[] coleccionArmas){
        this.coleccionArmas = coleccionArmas;
    }

    public String toString(){
        String inventarioStr = "";
        for (int i = 0; i < getColeccionArmas().length; i++) {
            inventarioStr += coleccionArmas[i].toString();
        }
        return inventarioStr;
    }

}
