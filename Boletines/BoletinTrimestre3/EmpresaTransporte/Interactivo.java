package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.io.FileNotFoundException;
import java.util.Scanner;

public interface Interactivo {
    Scanner SC = new Scanner(System.in);
    int menu();
    void iniciar() throws FileNotFoundException;
}
