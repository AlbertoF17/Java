package Apuntes.POO.Herencias;

public class Rectangulo extends Poligono{
    public Rectangulo() {
        super();
    }

    public Rectangulo(int anchura, int altura) {
        super(anchura, altura);
    }

    public int calcularArea(){
        return (anchura*altura);
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "anchura=" + anchura +
                ", altura=" + altura +
                '}';
    }
}