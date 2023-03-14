package Boletines.TareaEntregable;

public class EscopetaAlbertoFernandez extends ArmaAlbertoFernandez{
    /* EJERCICIO 3 */
    public boolean culata;
    public EscopetaAlbertoFernandez(){
        super();
        modelo = "Remington 870";
        culata = false;
    }
    public EscopetaAlbertoFernandez(String modelo, int municionMaxima, int municionActual, int rareza, boolean culata){
        this.modelo = modelo;
        this.municionMaxima = municionMaxima;
        this.municionActual = municionActual;
        this.rareza = rareza;
        this.culata = culata;
    }
    public boolean isCulata() {
        return culata;
    }

    public void setCulata(boolean culata) {
        this.culata = culata;
    }
    public String toString(){
        return RAREZAS[rareza] + " ,______________________________________       \n" +
                "|_________________,----------._ [____]  \"\"-,__  __....-----=====\n" +
                "               (_(||||||||||||)___________/   \"\"                |\n" +
                "                  `----------'        [ ))\"-,                   |\n" +
                "                                       \"\"    `,  _,--....___    |\n" +
                "                                               `/           \"\"\"\" \n" + RESET +
                modelo + (culata ? "(Con" : "(Sin") + " Culata)\t\t\t" + municionActual + " / " + municionMaxima + "\n";

    }
    @Override
    public void disparar() {
        System.out.println("Pump");
    }
}
