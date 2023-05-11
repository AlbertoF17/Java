package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.io.IOException;

public class Main {
    static final EmpresaTransporte EMPRESA = new EmpresaTransporte();
    public static void main(String[] args){
        try {
            EMPRESA.iniciar();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
