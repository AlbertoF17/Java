package Apuntes.POO.Herencias;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*
        Persona pers = new Persona();
        Profesor prof = new Profesor();
        System.out.println(pers);
        System.out.println(prof);
        Profesor prof2 = new Profesor("Jorge", 32, "1267");
        System.out.println(prof2);
        pers.decirQueEres();
        prof2.decirQueEres();
        Persona pers2 = new Profesor();

        Persona personaA = prof2;
        //Profesor profesorA = pers; Error ya que no se puede hacer
        Object o = prof2;

        Persona[] array = {pers, prof, prof2};
        //Para crear un array de personas, guardar los objetos de clase profesor en una variable de clase persona,
        //que gracias a la herencia se puede hacer
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " // ");
        }
        System.out.println();

        pers2.decirQueEres();
        //aunque sea un profesor, al ser la clase persona, no se puede usar el getCredencial
        //pers2.getCredencial();
         */
        Poligono pol = new Rectangulo(5,4);
        Poligono pol2 = new Triangulo(5,4);

        System.out.println(pol.calcularArea());
        System.out.println(pol2.calcularArea());

        Persona[] arrayNew = new Persona[5];

        for (int i = 0; i < arrayNew.length; i++) {
            System.out.println("Qué tipo de persona vas a meter? (Persona/Profesor/Alumno)");
            String tipoPersona = sc.next();
            switch (tipoPersona) {
                case "Persona":
                    arrayNew[i] = new Persona();
                    break;
                case "Profesor":
                    arrayNew[i] = new Profesor();
                    break;
                case "Alumno":
                    arrayNew[i] = new Alumno();
                    break;
                default:
                    arrayNew[i] = null;
                    break;
            }
        }
        for (int i = 0; i < arrayNew.length; i++) {
            arrayNew[i].decirQueEres();
        }
    }
}
