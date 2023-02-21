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

    public void setIngresos(double cantidadIngresada){
        if (cantidadIngresada>0) {
            saldoDeCuenta += cantidadIngresada;
        } else {
            throw new IllegalArgumentException("No se puede ingresar una cantidad igual o inferior a 0  ");
        }
    }

    public double setReintegros(double cantidadReintegrada){
        return saldoDeCuenta-=cantidadReintegrada;
    }

    public void setSaldoDeCuenta(double saldoDeCuenta){
        if (saldoDeCuenta >= 0){
            this.saldoDeCuenta = saldoDeCuenta;
        } else {
            throw new IllegalArgumentException("No se pueden tener números negativos en la cuenta");
        }
    }

    public double getSaldoDeCuenta() {
        return saldoDeCuenta;
    }

    public String[] imprimirArray(String[] array){
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println(array[array.length-1]);
        return array;
    }

    public String[] getDatosCuenta() {
        String[] array = {String.valueOf(saldoDeCuenta), nombreDelTitular, String.valueOf(numeroDeCuenta)};
        return imprimirArray(array);
    }

    public static void realizarTransferenciaEntreCuentas(CCC cuenta1, CCC cuenta2, double cantidad){
        cuenta1.saldoDeCuenta -= cantidad;
        cuenta2.saldoDeCuenta += cantidad;
    }
    //@Override anotación no necesaria que indica que está "sobreescribiendo" un método ya creado
    public String toString(){
        return ("CCC{Nº de cuenta: " + numeroDeCuenta + ", titular de la cuenta: " + nombreDelTitular + ", saldo de" +
                " la cuenta: " + saldoDeCuenta + "}");
    }
}
