package Practicas.Gamer;

public class Main {
    public static void main(String[] args){
        //Parte 1
        Personaje.nombre = "Alberto";
        Personaje.edad = 30;
        Personaje.altura = 10;
        Personaje.saludMaxima = 32;
        Personaje.saludActual = 1;
        System.out.println(Personaje.nombre);
        System.out.println(Personaje.edad);
        System.out.println(Personaje.altura);
        System.out.println(Personaje.saludMaxima);
        System.out.println(Personaje.saludActual);
        Personaje.recibirDanyo(1);
        Personaje.curar(1);
        System.out.println(Personaje.comprobarMuerte());
        System.out.println();
        //Parte 2
        Enemigo.nombre = "Alberto Enemigo";
        Enemigo.edad = 30;
        Enemigo.altura = 10;
        Enemigo.saludMaxima = 32;
        Enemigo.saludActual = 1;
        System.out.println(Enemigo.nombre);
        System.out.println(Enemigo.edad);
        System.out.println(Enemigo.altura);
        System.out.println(Enemigo.saludMaxima);
        System.out.println(Enemigo.saludActual);
        Enemigo.recibirDanyo(1);
        Enemigo.curar(0);
        System.out.println(Enemigo.comprobarMuerte());
        if (Personaje.comprobarMuerte()){
            System.out.println("GAME OVER");
        }
        //Parte 3
        //Puede tener infinitos enemigos pero no es viable ya que habría que escribir infinitas líneas de código,
        //porque hay que definir otra vez todos los atributos (una vez por cada personaje/enemigo).
        //Por lo que de forma aleatoria, es imposible e inviable realizarlo de esta forma.
    }
}
