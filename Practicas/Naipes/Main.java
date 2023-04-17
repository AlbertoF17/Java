package Practicas.Naipes;

public class Main {
    public static void main(String[] args){
        try{
            Baraja baraja = new Baraja();
            baraja.imprimirCartas();
            System.out.println("****************");
            baraja.imprimirMonton();
            System.out.println(baraja.getCartasDisponibles());
            System.out.println("-------------------");
            baraja.darCarta();
            baraja.darCarta();
            baraja.darCarta();
            baraja.imprimirCartas();
            System.out.println("****************");
            baraja.imprimirMonton();
            System.out.println(baraja.getCartasDisponibles());
            System.out.println("-------------------");
            Carta[] pedidas = baraja.darCartas(4);
            for (Carta c : pedidas) {
                System.out.println(c);
            }
            System.out.println("*****************");
            baraja.imprimirCartas();
        }catch (CartaException e){
            e.printStackTrace();
        }

    }
}
