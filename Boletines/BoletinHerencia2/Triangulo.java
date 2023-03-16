package Boletines.BoletinHerencia2;

public class Triangulo extends Poligono{
    double base;
    double altura;
    public Triangulo(){
        super(3);
        this.base = 1;
        this.altura = 1;
    }
    public Triangulo(double base, double altura){
        super(3);
        this.base = base;
        this.altura = altura;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        validarLongitud(base);
        this.base = base;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        validarLongitud(altura);
        this.altura = altura;
    }
    @Override
    double calcularArea(double base, double altura) {
        return (base*altura)/2;
    }
}
