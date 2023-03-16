package Boletines.BoletinHerencia2;

public class Rectangulo extends Poligono{
    //2. Cree una clase Rectángulo, teniendo en cuenta que un rectángulo es un caso de
    //polígono especializado de cuatro vértices (y sólo cuatro vertices). Añada atributos
    //adicionales si lo estima conveniente, e implemente el método abstracto calcularArea.
    double base;
    double altura;

    public Rectangulo(){
        super(4);
        this.base = 1;
        this.altura = 1;
    }
    public Rectangulo(double base, double altura){
        super(4);
        this.base = base;
        this.altura = altura;
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
