package Boletines.TareaEntregable;

public class AlbertoFernandezGomez {
    public static void main(String[] args){
        ArmaAlbertoFernandez arma1;
        arma1 = new ArmaAlbertoFernandez(null,-2,-3,7);
        System.out.println(arma1);
        arma1 = new ArmaAlbertoFernandez();
        arma1.setRareza(4);
        System.out.println(arma1);

        FusilDeAsaltoAlbertoFernandez fusil1;
        fusil1 = new FusilDeAsaltoAlbertoFernandez(null,-10,-2,7,false);
        fusil1 = new FusilDeAsaltoAlbertoFernandez();
        fusil1.setRareza(3);
        fusil1.setSilenciador(true);

        EscopetaAlbertoFernandez escopeta1;
        escopeta1 = new EscopetaAlbertoFernandez(null,-2,-2,7);
        escopeta1 = new EscopetaAlbertoFernandez();
        escopeta1.setRareza(2);
    }
}
