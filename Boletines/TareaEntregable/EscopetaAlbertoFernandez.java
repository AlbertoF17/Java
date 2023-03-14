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
        super();
        validarCulata(culata);
        this.culata = culata;
    }
    public boolean isCulata() {
        return culata;
    }

    public void setCulata(boolean culata) {
         validarCulata(culata);
         this.culata = culata;
    }

    public void validarCulata(boolean culata){
        if (culata != true || culata != false){
            throw new IllegalArgumentException("Para indicar si el arma tiene culata," +
                    " se debe introducir un valor booleano");
        }
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
