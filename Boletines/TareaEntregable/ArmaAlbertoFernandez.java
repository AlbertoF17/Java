package Boletines.TareaEntregable;

public class ArmaAlbertoFernandez {
    /* EJERCICIO 1 */
    public static final String[] RAREZAS = {"\033[0;37m", "\033[0;32m",
            "\033[0;36m", "\033[0;35m", "\033[0;33m"};
    public static final String RESET = "\033[0m";
    public String modelo;
    public int municionMaxima;
    public int municionActual;
    public int rareza;

    public ArmaAlbertoFernandez(){
        modelo = "Sig-Sauer P-226";
        municionMaxima = 20;
        municionActual = 20;
        rareza = 0;
    }
    public ArmaAlbertoFernandez(String modelo, int municionMaxima, int municionActual, int rareza){
        this.modelo = modelo;
        this.municionMaxima = municionMaxima;
        this.municionActual = municionActual;
        this.rareza = rareza;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        if (modelo == null){
            throw new IllegalArgumentException("No se permiten cadenas nulas.");
        } else {
            this.modelo = modelo;
        }
    }

    public int getMunicionMaxima() {
        return municionMaxima;
    }

    public void setMunicionMaxima(int municionMaxima) {
        if (municionMaxima < 0){
            throw new IllegalArgumentException("No se puede tener munición máxima negativa.");
        } else {
            this.municionMaxima = municionMaxima;
        }
    }

    public int getMunicionActual() {
        return municionActual;
    }

    public void setMunicionActual(int municionActual) {
        if (municionActual < 0){
            throw new IllegalArgumentException("No se puede tener munición negativa.");
        } else {
            this.municionActual = municionActual;
        }
    }

    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        if (rareza >= 0 && rareza <= 4){
            this.rareza = rareza;
        } else {
            throw new IllegalArgumentException("El tipo de rareza sólo se puede definir entre los números 0 y 4.");
        }
    }

    public String toString(){
        return RAREZAS[rareza] + " +--^----------,--------,-----,--------^-,\n" +
                " | |||||||||   `--------'     |          O\n" +
                " `+---------------------------^----------|\n" +
                "   `\\_,---------,---------,--------------'\n" +
                "     / XXXXXX /'|       /'\n" +
                "    / XXXXXX /  `\\    /'\n" +
                "   / XXXXXX /`-------'\n" +
                "  / XXXXXX /\n" +
                " / XXXXXX /\n" +
                "(________(                \n" +
                " `------'              \n" + RESET +
                modelo + "\t\t\t" + municionActual + " / " + municionMaxima + "\n";
    }

    public void disparar(){
        System.out.println("Pam");
    }

}

