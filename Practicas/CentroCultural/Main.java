package Practicas.CentroCultural;

import java.io.IOException;

public class Main {
    //public static final CENTROCULTURAL = new Centro();
    public static void main(String[] args){
        Centro centro = new Centro();
        try {
            centro.iniciar();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}