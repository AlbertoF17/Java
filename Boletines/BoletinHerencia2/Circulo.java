package Boletines.BoletinHerencia2;

public class Circulo extends Poligono{
    //5. Cree una clase Círculo, y añádala a la jerarquía en el nivel que estime conveniente.
    //Puede crear tantas clases nuevas como sea necesario. Tenga en cuenta que un círculo
    //no tiene vértices.
    final double PI = Math.PI;
    double radio;
    public Circulo() {
        this.radio = 1;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        validarLongitud(radio);
        this.radio = radio;
    }
    @Override
    double calcularArea(double base, double altura) {
        return PI*(radio*radio);
    }
}
