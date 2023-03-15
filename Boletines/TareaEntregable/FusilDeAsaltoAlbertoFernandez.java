package Boletines.TareaEntregable;

public class FusilDeAsaltoAlbertoFernandez extends ArmaAlbertoFernandez{
    /* EJERCICIO 2 */
    public boolean silenciador;

    public FusilDeAsaltoAlbertoFernandez(){
        super();
        modelo = "Carabina M4";
        silenciador = false;
    }
    public FusilDeAsaltoAlbertoFernandez(String modelo, int municionMaxima, int municionActual, int rareza,
                                         boolean silenciador){
        super();
        validarSilenciador(silenciador);
        this.silenciador = silenciador;
    }

    public boolean isSilenciador() {
        return silenciador;
    }

    public void setSilenciador(boolean silenciador) {
        validarSilenciador(silenciador);
        this.silenciador = silenciador;
    }

    public void validarSilenciador(boolean silenciador){
        if(silenciador!=true && silenciador!=false){
            throw new IllegalArgumentException("El valor sólo puede ser \"true\" o \"false\"");
        }
    }

    public String toString(){
        return RAREZAS[rareza] + "        |\\_______________ (_____\\\\______________\n" +
                "HH======#H###############H#######################\n" +
                "        ' ~\"\"\"\"\"\"\"\"\"\"\"\"\"\"`##(_))#H\\\"\"\"\"\"Y########\n" +
                "                          ))    \\#H\\       `\"Y###\n" +
                "                          \"      }#H)" + "\n" + RESET +
                modelo + (silenciador ? "(Con" : "(Sin") + " Silenciador)\t\t\t" + municionActual + " / "
                + municionMaxima;
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
