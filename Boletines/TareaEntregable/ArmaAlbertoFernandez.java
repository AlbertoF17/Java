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

    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        validarModelo(modelo);
        this.modelo = modelo;
    }

    public void validarModelo(String modelo){
        if (modelo == null || modelo.isEmpty()) {
            throw new IllegalArgumentException("No se permiten cadenas nulas o vacias.");
        }
    }

    public int getMunicionMaxima() {
        return municionMaxima;
    }

    public void setMunicionMaxima(int municionMaxima) {
        validarMunicionMaxima(municionMaxima);
        this.municionMaxima = municionMaxima;
    }

    public void validarMunicionMaxima(int municionMaxima){
        if (municionMaxima < 0){
            throw new IllegalArgumentException("No se puede tener munición máxima negativa.");
        }
    }

    public int getMunicionActual() {
        return municionActual;
    }

    public void setMunicionActual(int municionActual) {
        validarMunicionActual(municionActual);
        this.municionActual = municionActual;
    }

    public void validarMunicionActual(int municionActual){
        if (municionActual < 0 || municionActual > getMunicionMaxima()){
            throw new IllegalArgumentException("No se puede tener munición negativa, ni una " +
                    "munición mayor a la máxima.");
        }
    }
    public int getRareza() {
        return rareza;
    }

    public void setRareza(int rareza) {
        validarRareza(rareza);
        this.rareza = rareza;
    }

    public void validarRareza(int rareza){
        if (rareza < 0 || rareza > 4){
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

