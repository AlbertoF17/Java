package Practicas.CodigoCuentaCorriente;

public class OperacionesBanco {
    public static void main(String[] args){
        CCC CCC_1 = new CCC("Alberto", 300);
        CCC CCC_2 = new CCC("Antonio", 400);
        System.out.println(CCC_1.getDatosCuenta());
        System.out.println(CCC_2.getDatosCuenta());
        System.out.println(CCC_1.setIngresos(100));
        System.out.println(CCC_2.setReintegros(100));
        System.out.println(CCC_1.getSaldoDeCuenta());
        CCC.realizarTransferenciaEntreCuentas(CCC_1, CCC_2, 50);
    }
}
