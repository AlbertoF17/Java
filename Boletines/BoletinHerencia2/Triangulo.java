package Boletines.BoletinHerencia2;

public class Triangulo extends Poligono{
    double base;
    double altura;
    double lado1;
    double lado2;
    public Triangulo(){
        super(3);
        this.base = 1;
        this.altura = 1;
        this.lado1 = 1;
        this.lado2 = 1;
    }
    public Triangulo(double base, double altura, double lado1, double lado2){
        super(3);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
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

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        validarLongitud(lado1);
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        validarLongitud(lado2);
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return this.getClass() + "{" +
                "base=" + base +
                ", altura=" + altura +
                ", vertices=" + vertices +
                '}';
    }
    @Override
    double calcularArea(double base, double altura) {
        return (base*altura)/2;
    }
}
