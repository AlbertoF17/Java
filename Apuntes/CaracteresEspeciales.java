package Apuntes;

public class CaracteresEspeciales {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Hola\tMundo");
        System.out.println("\nHola    Mundo");
        System.out.print(" \"'comillas dobles'\" " + "a\\a");
        Thread.sleep(2000);
        System.out.println("\rRetorno de carro :D");
        System.out.println("Este retorno de carro no funciona porque no tiene nada a su derecha\r");
    }
}
