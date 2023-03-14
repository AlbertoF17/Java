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
        try {
            fusil1 = new FusilDeAsaltoAlbertoFernandez(null,-10,-2,7,
                    false);
        } catch (IllegalArgumentException e){
            fusil1 = new FusilDeAsaltoAlbertoFernandez();
        }
        fusil1.setRareza(3);
        fusil1.setSilenciador(true);
        System.out.println(fusil1);

        EscopetaAlbertoFernandez escopeta1;
        try{
            escopeta1 = new EscopetaAlbertoFernandez(null,-2,-2,7,true);
        }catch(IllegalArgumentException e){
            escopeta1 = new EscopetaAlbertoFernandez();
        }
        escopeta1.setRareza(2);
        System.out.println(escopeta1);


        ArmaAlbertoFernandez[] coleccionArmas = {new EscopetaAlbertoFernandez(), new ArmaAlbertoFernandez(),
                new ArmaAlbertoFernandez(), new FusilDeAsaltoAlbertoFernandez()};
        //InventarioAlbertoFernandez inventario = new InventarioAlbertoFernandez(coleccionArmas);
        //MetodosEstaticosDeAlbertoFernandez.imprimirInventario(inventario);
    }
}
