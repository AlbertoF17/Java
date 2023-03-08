package Apuntes.POO.Herencias;

public class Poligono {
    public int anchura;
    public int altura;

    public Poligono() {
        this.anchura = 0;
        this.altura = 0;
    }

    public Poligono(int anchura, int altura) {
        this.anchura = anchura;
        this.altura = altura;
    }

    public int getAnchura() {
        return anchura;
    }

    public void setAnchura(int anchura) {
        this.anchura = anchura;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int calcularArea(){
        return 0;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "anchura=" + anchura +
                ", altura=" + altura +
                '}';
    }
}
