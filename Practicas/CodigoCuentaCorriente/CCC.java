package Practicas.CodigoCuentaCorriente;

import java.util.Random;

public class CCC {
    Random rand = new Random();
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    public CCC(String nombreDelTitular, double saldoDeCuenta){
        this.nombreDelTitular = nombreDelTitular;
        this.saldoDeCuenta = saldoDeCuenta;
        this.numeroDeCuenta = rand.nextLong();
    }

    public double setIngresos(double cantidadIngresada){
        return saldoDeCuenta+=cantidadIngresada;
    }

    public double setReintegros(double cantidadReintegrada){
        return saldoDeCuenta-=cantidadReintegrada;
    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public String getDatosCuenta() {
        return nombreDelTitular + ": " + numeroDeCuenta;
    }

    public static void realizarTransferenciaEntreCuentas(CCC cuenta1, CCC cuenta2, double cantidad){
        cuenta1.saldoDeCuenta -= cantidad;
        cuenta2.saldoDeCuenta += cantidad;
    }
}
