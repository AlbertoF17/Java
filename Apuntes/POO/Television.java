package Apuntes.POO;

public class Television {
    private static int precio = 350;
    private String marca;
    private String modelo;
    private int volumen;
    private int brillo;
    private int contraste;
    private int canal;

    public Television(){
    }
    public Television(String marca1, String modelo1){
        marca = marca1;
        modelo = modelo1;
    }
    //SE USA THIS PARA NO TENER QUE CAMBIARLE LOS NOMBRES A LOS ATRIBUTOS
    public Television(String marca, String modelo, int volumen, int brillo, int contraste, int canal) {
        this.marca = marca;
        this.modelo = modelo;
        this.volumen = volumen;
        this.brillo = brillo;
        this.contraste = contraste;
        this.canal = canal;
    }

    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVolumen(){
        return volumen;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public int getBrillo(){
        return brillo;
    }
    public void setBrillo(int brillo){
        this.brillo = brillo;
    }

    public int getContraste(){
        return contraste;
    }
    public void setContraste(int contraste){
        this.contraste = contraste;
    }

    public int getCanal() {
        return canal;
    }
    public void setCanal(int canal) {
        this.canal = canal;
    }

    /*public String toString(){
        String cad = "Television " + marca + " " + modelo + " " +
                volumen + " " + brillo + " " + contraste + " " + canal;
        return cad;
    }*/

    public void imprimirReferencia(){
        System.out.print("La referencia de este objeto es: ");
        System.out.println(this);
    }

}
