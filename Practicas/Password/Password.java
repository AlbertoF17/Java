package Practicas.Password;

import java.util.Random;

public class Password {
    Random rand = new Random();
    //EJERCICIO 3: Haz una clase llamada Password que siga las siguientes
    //condiciones:
    // Que tenga los atributos longitud y contraseña. Por defecto, la
    //longitud será de 8.
    private int longitud;
    private String pass;


    // Los constructores serán los siguiente:
    //o Un constructor por defecto.
    // Un constructor con la longitud que nosotros le pasemos. Generará
    //una contraseña aleatoria con esa longitud.
    public Password(){
        this.longitud = 8;
        this.pass = generarPassword();
    }

    public Password(int longitud){
        this.longitud = longitud;
        this.pass = generarPassword();
    }
    // Los métodos que implementa serán:
    //o esFuerte(): devuelve un booleano si es fuerte o no, para que
    //sea fuerte debe tener más de 2 mayúsculas, más de 1
    //minúscula y más de 5 números.
    public boolean esFuerte(){
        boolean fuerte = false;
        int mayus = 0;
        int minus = 0;
        int nums = 0;

        for (int i = 0; i < longitud; i++) {
            if(Character.isUpperCase(pass.charAt(i))){
                mayus++;
            } else if (Character.isLowerCase(pass.charAt(i))){
                minus++;
            } else if (Character.isDigit(pass.charAt(i))) {
                nums++;
            }
        }
        if (mayus>2 && minus>1 && nums>5){
            fuerte = true;
        }
        return fuerte;
    }
    //o generarPassword():  genera la contraseña del objeto con la
    //longitud que tenga.
    public String generarPassword(){
        String caracteres = "abcdefghijklmnopqrstuvwxyz" + "abcdefghijklmnopqrstuvwxyz".toUpperCase() + "0123456789";
        String pass = "";
        for (int i = 0; i < longitud; i++) {
            pass+= caracteres.charAt(rand.nextInt(caracteres.length()));
        }
        return pass;
    }
    //o Método get para contraseña y longitud.
    //o Método set para longitud.
    public int getLongitud() {
        return longitud;
    }

    public String getPass() {
        return pass;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
}
