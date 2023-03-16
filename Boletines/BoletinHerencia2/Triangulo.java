package Boletines.BoletinHerencia2;

public class Triangulo extends Poligono{
    final int VERTICESTRIANGULO = 3;
    double base;
    double altura;
    public Triangulo(){
        super();
        this.base = 1;
        this.altura = 1;
    }
    public Triangulo(double base, double altura){
        super();
        this.base = base;
        this.altura = altura;
    }

    public int getVERTICESTRIANGULO() {
        return VERTICESTRIANGULO;
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
