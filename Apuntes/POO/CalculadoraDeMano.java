package Apuntes.POO;

public class CalculadoraDeMano {
    public static double sumar(double primerSumando, double segundoSumando){
        return primerSumando+segundoSumando;
    }
    public static double restar(double minuendo, double sustraendo){
        return minuendo-sustraendo;
    }
    public static double multiplicar(double primerFactor, double segundoFactor){
        return primerFactor*segundoFactor;
    }
    public static double dividir(double dividendo, double divisor){
        return dividendo/divisor;
    }
    public static double calcularPorcentaje(double porcentaje, double cantidad){
        return cantidad*(porcentaje/100);
    }
    public static double calcularPorcentaje(double porcentaje){
        return dividir(porcentaje,100);
    }
    public static double cambiarSigno(double numero){
        return -numero;
    }
    public static double calcularRaizCuadrada(double radicando){
        return Math.sqrt(radicando);
    }
    public static double calcularPotencia(double base, double exponente){
        return Math.pow(base, exponente);
    }



}
