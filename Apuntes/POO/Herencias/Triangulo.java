package Apuntes.POO.Herencias;

public class Triangulo extends Poligono{
    public Triangulo() {
        super();
    }

    public Triangulo(int anchura, int altura) {
        super(anchura, altura);
    }

    public int calcularArea(){
        return (anchura*altura)/2;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "anchura=" + anchura +
                ", altura=" + altura +
                '}';
    }
}
