package Boletines.BoletinHerencia1;

import javax.naming.OperationNotSupportedException;

public class Main {
    public static void main(String[] args){
        Elfo elfo1;
        try{
            elfo1 = new Elfo(null, "aaa", "aaaa");
        }catch (IllegalArgumentException e) {
            e.printStackTrace();
            elfo1 = new Elfo("Pablo", "López", "Pablete");
        }
        elfo1.dispararArco("Pablito");
        elfo1.encantar("Rafa");
        System.out.println(elfo1);

        Enano enano1;
        try{
            enano1 = new Enano("null", null, "aaa");
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            enano1 = new Enano("Pablo", "Ballesteros", "Pablito");
        }
        enano1.usarHacha("Pablete");
        enano1.crearArmadura("Armadura de cobre");

        Hombre hombre1;
        try{
            hombre1 = new Hombre("null", "null", null);
        }catch (IllegalArgumentException e){
            e.printStackTrace();
            hombre1 = new Hombre("Rafael", "Mancina", "Rafita");
        }
        hombre1.morir();
        try {
            hombre1.usarEspada("Alberto");
        }catch (OperationNotSupportedException e) {
            throw new RuntimeException(e);
        }

        Hobbit hobbit1 = new Hobbit("Alberto", "Fernández", "Albertito");
        try{
            hobbit1.usarEspada("Hola");
        }catch (OperationNotSupportedException e){
            e.printStackTrace();
        }

        Hobbit hobbit2 = new Hobbit("Alberto", "Fernández", "Albertito");
        System.out.println(hobbit1.equals(hobbit2));
    }
}
