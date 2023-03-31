package Practicas.PokemonAlbertoFernandez.movimientos;

import Practicas.PokemonAlbertoFernandez.tipos.Tipo;

public abstract class Movimiento implements Tipo {
    int potencia;
    int precision;
    int ppMax;
    int ppActual;
    int tipo;
    int clase;

    public Movimiento() {
        this.potencia = 1;
        this.precision = 1;
        this.ppMax = 1;
        this.ppActual = 1;
        this.tipo = 1;
        this.clase = 1;
    }

    public Movimiento(int potencia, int precision, int ppMax, int ppActual, int tipo, int clase) {
        validarPotencia(potencia);
        this.potencia = potencia;
        validarPrecision(precision);
        this.precision = precision;
        validarPpMax(ppMax);
        this.ppMax = ppMax;
        validarPpAcutal(ppActual);
        this.ppActual = ppActual;
        validarTipo(tipo);
        this.tipo = tipo;
        validarClase(clase);
        this.clase = clase;
    }

    public void setPpActual(int ppActual) {
        validarPpAcutal(ppActual);
        this.ppActual = ppActual;
    }

    protected void validarPotencia(int potencia) {
        if (potencia < 0) {
            throw new IllegalArgumentException("El valor de la potencia no puede ser menor que 0");
        }
    }

    protected void validarPrecision(int precision) {
        if (precision < 0) {
            throw new IllegalArgumentException("El valor de la precisión no puede ser menor que 0");
        }
        if (precision > 100) {
            throw new IllegalArgumentException("El valor de la precisión no puede ser mayor que 100");
        }
    }

    protected void validarPpMax(int ppMax) {
        if (ppMax < 0) {
            throw new IllegalArgumentException("El valor del PP máximo no puede ser menor que 0");
        }
    }

    protected void validarPpAcutal(int ppActual) {
        if (ppActual < 0) {
            throw new IllegalArgumentException("El valor del PP no puede ser menor que 0");
        }
        if (ppActual > ppMax) {
            throw new IllegalArgumentException("El valor del PP no puede ser mayor al PP máximo");
        }
    }

    protected void validarTipo(int tipo) {
        if (tipo < 0) {
            throw new IllegalArgumentException("El valor del tipo no puede ser menor que 0");
        }
        if (tipo > tipos.length) {
            throw new IllegalArgumentException("El valor del tipo no puede ser mayor al número de tipos existentes");
        }
    }

    protected void validarClase(int clase) {
        if (clase != 0 && clase != 1) {
            throw new IllegalArgumentException("El valor de la clase solo puede ser 0 (físico) ó 1 (especial)");
        }
    }

    public int getPotencia() {
        return potencia;
    }

    public int getPrecision() {
        return precision;
    }

    public int getPpMax() {
        return ppMax;
    }

    public int getPpActual() {
        return ppActual;
    }

    public int getTipo() {
        return tipo;
    }

    public int getClase() {
        return clase;
    }

    @Override
    public String toString() {
        String claseStr;
        if (clase == 0) {
            claseStr = "físico";
        } else {
            claseStr = "especial";
        }
        return getClass().getSimpleName() + "{" +
                "potencia=" + potencia +
                ", precision=" + precision +
                ", ppMax=" + ppMax +
                ", ppActual=" + ppActual +
                ", tipo=" + tipos[tipo] +
                ", clase=" + claseStr + '}';
    }
}
