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
        nombre = "Alberto";
        edad = 20;
        sexo = HOMBRE;
        peso = 52;
        altura = 1.63;
    }

    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
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
        if (sexo != 'H' && sexo != 'M'){
            sexo = 'H';
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
    public String generaDNI(){
        String dniGenerado="";
        for (int i = 0; i < 9; i++) {
            dniGenerado+=""+ rand.nextInt(0, 10);
        }
        int numero = Integer.parseInt(dniGenerado)%23;
        switch (numero){
            case 0:
                dniGenerado+="T";
                break;
            case 1:
                dniGenerado+="R";
                break;
            case 2:
                dniGenerado+="W";
                break;
            case 3:
                dniGenerado+="A";
                break;
            case 4:
                dniGenerado+="G";
                break;
            case 5:
                dniGenerado+="M";
                break;
            case 6:
                dniGenerado+="Y";
                break;
            case 7:
                dniGenerado+="F";
                break;
            case 8:
                dniGenerado+="P";
                break;
            case 9:
                dniGenerado+="D";
                break;
            case 10:
                dniGenerado+="X";
                break;
            case 11:
                dniGenerado+="B";
                break;
            case 12:
                dniGenerado+="N";
                break;
            case 13:
                dniGenerado+="J";
                break;
            case 14:
                dniGenerado+="Z";
                break;
            case 15:
                dniGenerado+="S";
                break;
            case 16:
                dniGenerado+="Q";
                break;
            case 17:
                dniGenerado+="V";
                break;
            case 18:
                dniGenerado+="H";
                break;
            case 19:
                dniGenerado+="L";
                break;
            case 20:
                dniGenerado+="C";
                break;
            case 21:
                dniGenerado+="K";
                break;
            case 22:
                dniGenerado+="E";
                break;
        }
        return dniGenerado;
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
