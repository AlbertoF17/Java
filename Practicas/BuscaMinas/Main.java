package Practicas.BuscaMinas;

public class Main {
    public static void main(String[] args){
        try {
            BuscaMinas buscaMinas1 = new BuscaMinas(9,9,8);
            buscaMinas1.imprimirTableroExt();
            System.out.println("******************************");
            buscaMinas1.imprimirTablero();
        } catch (TableroException e) {
            e.printStackTrace();
        } catch (MinaException e) {
            e.printStackTrace();
        }
    }
}
