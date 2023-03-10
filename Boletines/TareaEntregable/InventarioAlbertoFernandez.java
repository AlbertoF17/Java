package Boletines.TareaEntregable;

public class InventarioAlbertoFernandez{
    public ArmaAlbertoFernandez[] coleccionArmas = new ArmaAlbertoFernandez[5];

    public ArmaAlbertoFernandez[] getColeccionArmas() {
        return coleccionArmas;
    }

    public void setColeccionArmas(ArmaAlbertoFernandez[] coleccionArmas) {
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
        return "";
    }

}
