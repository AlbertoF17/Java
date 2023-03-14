package Apuntes.POO.Interfaces;

public class Main {
    public static void main(String[] args){
        Cuadrilatero r = new Cuadrilatero();
        try{
            Cuadrilatero r2 = (Cuadrilatero) r.clone();
            System.out.println(r.lado);
            System.out.println(r2.lado);
        } catch (CloneNotSupportedException e){
            e.printStackTrace();
        }


    }
}
