package Practicas.Password;

public class Password {
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
    }

    public Password(int longitud){
        this.longitud = longitud;
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

        for (int i = 0; i < pass.length(); i++) {
            if(pass.charAt(i) >= 65 && pass.charAt(i) <= 90){
                mayus++;
            } else if (pass.charAt(i) >= 97 && pass.charAt(i) <= 122){
                minus++;
            } else if (pass.charAt(i) >= 48 && pass.charAt(i) <= 57) {
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
        String cont = "";
        for (int i = 0; i < longitud; i++) {
            cont+="";
        }
        return cont;
    }
    //o Método get para contraseña y longitud.
    //o Método set para longitud.


}
