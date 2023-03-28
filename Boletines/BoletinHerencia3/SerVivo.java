package Boletines.BoletinHerencia3;

public abstract class SerVivo {
    //1. Cree una clase SerVivo que tenga en sus atributos las tres dimensiones posibles (alto,
    //ancho y largo). Todo ser vivo se caracteriza porque puede realizar las siguientes tres
    //acciones: interactuar con el medio, nutrirse y reproducirse. La implementación de
    //estas acciones (y la del resto de ejercicios) no es relevante, vale con que al ejecutarse
    //se imprima un mensaje por pantalla con un texto relativo a la acción.
    double alto;
    double ancho;
    double largo;
    public SerVivo(){
        alto = 1;
        ancho = 1;
        largo = 1;
    }
    public SerVivo(double alto, double ancho, double largo){
        this.alto = alto;
        this.ancho = ancho;
        this.largo = largo;
    }
    public double getAlto() {
        return alto;
    }
    public void setAlto(double alto) {
        validarAltura(alto);
        this.alto = alto;
    }
    public void validarAltura(double alto){
        if (alto <= 0){
            throw new IllegalArgumentException("No puede tener una altura menor o igual a 0");
        }
    }
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        validarAnchura(ancho);
        this.ancho = ancho;
    }
    public void validarAnchura(double ancho){
        if (ancho <= 0){
            throw new IllegalArgumentException("No puede tener una anchura menor o igual a 0");
        }
    }
    public double getLargo() {
        return largo;
    }
    public void setLargo(double largo) {
        validarLongitud(largo);
        this.largo = largo;
    }
    public void validarLongitud(double largo){
        if (largo <= 0){
            throw new IllegalArgumentException("No puede tener una longitud menor o igual a 0");
        }
    }
    public void interactuar(){
        System.out.println("He interactuado con el entorno");
    }
    public void nutrirse(){
        System.out.println("He comido");
    }public void reproducirse() {
        System.out.println("Me reproduzco");
    }
}
