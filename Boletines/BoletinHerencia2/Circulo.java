package Boletines.BoletinHerencia2;

public class Circulo extends Poligono{
    //5. Cree una clase Círculo, y añádala a la jerarquía en el nivel que estime conveniente.
    //Puede crear tantas clases nuevas como sea necesario. Tenga en cuenta que un círculo
    //no tiene vértices.
    final int VERTICESCIRCULO = 0;
    final double PI = 3.14159265359;
    double radio;
    public Circulo() {
        this.radio = 1;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
    public int getVERTICESCIRCULO() {
        return VERTICESCIRCULO;
    }
    public double getPI() {
        return PI;
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
