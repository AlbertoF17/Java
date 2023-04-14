package Practicas.Naipes;

public class Carta {
    private int numero;
    private Palo palo;

    public Carta(int numero, Palo palo) {
        validarNumero(numero);
        this.numero = numero;
        validarPalo(palo);
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public Palo getPalo() {
        return palo;
    }

    public void validarNumero(int numero){
        if (numero<1 || numero>12){
            throw new IllegalArgumentException("No puedes meter un número menor que 1 ni mayor que 12");
        }
    }

    public void validarPalo(Palo palo){
        if (palo == null){
            throw new NullPointerException("El palo de la carta no puede ser nulo");
        }
    }

    @Override
    public String toString() {
        return "Carta{" +
                "numero=" + numero +
                ", palo=" + palo +
                '}';
    }
}
