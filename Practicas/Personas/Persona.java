package Practicas.Personas;

import java.util.Random;

public class Persona {
    Random rand = new Random();
    //EJERCICIO 2: Haz una clase llamada Persona que siga las siguientes
    //condiciones:
    // Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer),
    //peso y altura. No queremos que se accedan directamente a ellos.
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private static final char HOMBRE = 'H';
    private static final char MUJER = 'M';
    // Por defecto, todos los atributos menos el DNI serán valores por
    //defecto según su tipo. Sexo será hombre por defecto, usa una
    //constante para ello.

    // Se implantarán varios constructores:
    //o Un constructor por defecto.
    //o Un constructor con el nombre, edad y sexo, el resto por
    //defecto.
    //o Un constructor con todos los atributos como parámetro.
    public Persona(){
        nombre = "DefaultName";
        dni = generaDNI();
        sexo = HOMBRE;
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = generaDNI();
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    // Los métodos que se implementaran son:
    //o calcularIMC(): calculara si la persona está en su peso ideal
    //(peso en kg/(altura^2  en m)), si esta fórmula devuelve un
    //valor menor que 20, el método devuelve un -1, si devuelve un
    //número entre 20 y 25 (incluidos), significa que está por
    //debajo de su peso ideal el método devuelve un 0 y si
    //devuelve un valor mayor que 25 significa que tiene
    //sobrepeso, el método devuelve un 1. Te recomiendo que uses
    //constantes para devolver estos valores.
    public int calcularIMC(){
        double indiceIMC = peso/(Math.pow(altura,2));
        if (indiceIMC<20){
            return -1;
        } else if (indiceIMC<=25) {
            return 0;
        } else {
            return 1;
        }
    }
    // esMayorDeEdad(): indica si es mayor de edad,
    //devuelve un booleano.
    public boolean esMayorDeEdad(){
        if (edad>=18){
            return true;
        } else {
            return false;
        }
    }
    // comprobarSexo(char sexo): comprueba que el sexo
    //introducido es correcto. Si no es correcto, será H. No
    //será visible al exterior.
    private void comprobarSexo(char sexo){
        if (sexo != HOMBRE || sexo != MUJER){
            sexo = HOMBRE;
        }
    }
    // toString(): devuelve toda la información del objeto.
    @Override
    public String toString() {
        return ("Nombre: " + nombre + "; edad: " + edad + "; dni: " + dni + "; sexo: " + sexo + "; peso: " + peso
        + "; altura: " + altura + ".");
    }
    // generaDNI(): genera un número aleatorio de 8 cifras,
    //genera a partir de este su número su letra
    //correspondiente. Este método será invocado cuando
    //se construya el objeto. Puedes dividir el método para
    //que te sea más fácil. No será visible al exterior.
    private String generaDNI(){
        String dniGenerado="";
        dniGenerado+= rand.nextInt(99999999) + 1;
        int numero = Integer.parseInt(dniGenerado)%23;
        String[] letrasDNI = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q",
        "V", "H", "L", "C", "K", "E"};
        return dniGenerado+letrasDNI[numero];
    }
    // Métodos set de cada parámetro, excepto de DNI.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
