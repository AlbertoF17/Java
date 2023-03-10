package Boletines.TareaEntregable;

public class FusilDeAsaltoAlbertoFernandez extends ArmaAlbertoFernandez{
    /* EJERCICIO 2 */
    public boolean silenciador;

    public FusilDeAsaltoAlbertoFernandez(){
        modelo = "Carabina M4";
        municionMaxima = 20;
        municionActual = 20;
        rareza = 0;
        silenciador = false;
    }
    public FusilDeAsaltoAlbertoFernandez(String modelo, int municionMaxima, int municionActual, int rareza,
                                         boolean silenciador){
        this.modelo = modelo;
        this.municionMaxima = municionMaxima;
        this.municionActual = municionActual;
        this.rareza = rareza;
        this.silenciador = silenciador;
    }

    public boolean isSilenciador() {
        return silenciador;
    }

    public void setSilenciador(boolean silenciador) {
        if(silenciador!=true && silenciador!=false){
            throw new IllegalArgumentException("El valor sólo puede ser \"true\" o \"false\"");
        } else {
            this.silenciador = silenciador;
        }
    }

    public String toString(){
        return RAREZAS[rareza] + " |\\_______________ (_____\\\\______________\n" +
        "HH======#H###############H#######################\n" +
                " ' ~\"\"\"\"\"\"\"\"\"\"\"\"\"\"`##(_))#H\\\"\"\"\"\"Y########\n" +
                " )) \\#H\\ `\"Y###\n" +
                " \" }#H)" + "\n" + RESET +
                modelo + (silenciador ? "(Con" : "(Sin") + " Silenciador)\t\t\t" +
                municionActual + " / " + municionMaxima;
    }

    @Override
    public void disparar() {
        if(silenciador){
            System.out.println("Rititititi rititititi");
        } else {
            System.out.println("Ratatatata ratatatata");
        }
    }
}
