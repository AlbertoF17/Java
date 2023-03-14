package Boletines.TareaEntregable;

public class AlbertoFernandezGomez {
    public static void main(String[] args){
        /* EJERCICIO 4 */
        ArmaAlbertoFernandez arma1;
        try{
            arma1 = new ArmaAlbertoFernandez(null,-2,-3,7);
        } catch (IllegalArgumentException e){
            arma1 = new ArmaAlbertoFernandez();
        }


        arma1.setRareza(4);
        System.out.println(arma1);

        FusilDeAsaltoAlbertoFernandez fusil1;
        fusil1 = new FusilDeAsaltoAlbertoFernandez(null,-10,-2,7,false);
        fusil1 = new FusilDeAsaltoAlbertoFernandez();
        fusil1.setRareza(3);
        fusil1.setSilenciador(true);

        EscopetaAlbertoFernandez escopeta1;
        try{
            escopeta1 = new EscopetaAlbertoFernandez(null,-2,-2,7,true);
        }catch(IllegalArgumentException e){
            e.getStackTrace();
            escopeta1 = new EscopetaAlbertoFernandez();
        }


        escopeta1.setRareza(2);
        ArmaAlbertoFernandez[] coleccionArmas = {new EscopetaAlbertoFernandez(), new ArmaAlbertoFernandez(),
                new ArmaAlbertoFernandez(), new FusilDeAsaltoAlbertoFernandez()};
        InventarioAlbertoFernandez inventario = new InventarioAlbertoFernandez(coleccionArmas);
        MetodosEstaticosDeAlbertoFernandez.imprimirInventario(inventario);
    }
}
