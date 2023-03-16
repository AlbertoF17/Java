package Boletines.BoletinHerencia2;

public class Rectangulo extends Poligono{
    //2. Cree una clase Rectángulo, teniendo en cuenta que un rectángulo es un caso de
    //polígono especializado de cuatro vértices (y sólo cuatro vertices). Añada atributos
    //adicionales si lo estima conveniente, e implemente el método abstracto calcularArea.
    final int VERTICESRECTANGULO = 4;
    double base;
    double altura;

    public Rectangulo(){
        this.vertices = VERTICESRECTANGULO;
        this.base = 1;
        this.altura = 1;
    }
    public Rectangulo(double base, double altura){
        this.vertices = VERTICESRECTANGULO;
        this.base = base;
        this.altura = altura;
    }
    public int getVERTICESRECTANGULO() {
        return VERTICESRECTANGULO;
    }
    public double getBase() {
        return base;
    }
    public void setBase(int base) {
        validarLongitud(base);
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        validarLongitud(altura);
        this.altura = altura;
    }
    @Override
    double calcularArea(double base, double altura) {
        return base*altura;
    }
}
