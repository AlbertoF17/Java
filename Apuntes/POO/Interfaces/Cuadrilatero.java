package Apuntes.POO.Interfaces;

public class Cuadrilatero implements Figura{
    public int lado;
    public Cuadrilatero (){
        this.lado = 0;
    }
    public Cuadrilatero(int lado){
        this.lado = lado;
    }
    @Override
    public float area() {
        return lado*lado;
    }

    @Override
    public float perimetro() {
        return lado*4;
    }
    public float ladoPorPi(){
        return lado*pi;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
