package Boletines;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Colecciones1 {
    public static void main(String[] args){
        //1. Crear una nueva colección sin especificar el tipo de elementos que va a
        //almacenar:
        //Collection coleccion = new ArrayList();
        //Introducir los siguientes tipos de elementos y en el siguiente orden:
        //Un String con el valor “Primero”, un Integer con el valor 2, un Float con el valor
        //3, un Double con el valor 4, un Character con la primera letra de tu nombre, un
        //Boolean con el valor false, y finalmente un array de 10 enteros del 0 al 9.
        //Imprimir por pantalla la colección anterior sin usar bucles, es decir, imprima
        //solo su referencia. ¿Se ve la referencia al usar println?
        System.out.println("EJERCICIO 1");
        Collection coleccion1 = new ArrayList();
        coleccion1.add("Primero");
        coleccion1.add(2);
        coleccion1.add(3f);
        coleccion1.add(4.0);
        coleccion1.add('A');
        coleccion1.add(false);
        coleccion1.add(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        System.out.println(coleccion1);
        //No se ve la referencia, se ve el contenido de la colección gracias al toString,
        //el array de int si imprime su referencia

        //2. Crear una nueva colección que acepte únicamente Strings:
        //Collection<String> coleccion = new ArrayList<>();
        //Llenarla con diez nombres e imprimirla por pantalla sin usar bucles.
        System.out.println("EJERCICIO 2");
        Collection<String> coleccion2 = new ArrayList<>();
        coleccion2.add("Alberto");
        coleccion2.add("Jouse");
        coleccion2.add("Ricardo");
        coleccion2.add("María");
        coleccion2.add("EvilEdu");
        coleccion2.add("Jurado");
        coleccion2.add("Dani");
        coleccion2.add("Rafa");
        coleccion2.add("Chemita");
        coleccion2.add("Marcelo");
        System.out.println(coleccion2);

        //Opcional
        List<String> l2 = (ArrayList<String>) coleccion2;
        System.out.println(l2.get(0));
        System.out.println(l2.get(1));
        System.out.println(l2.get(2));
        System.out.println(l2.get(3));
        System.out.println(l2.get(4));
        System.out.println(l2.get(5));
        System.out.println(l2.get(6));
        System.out.println(l2.get(7));
        System.out.println(l2.get(8));
        System.out.println(l2.get(9));

        //3. Pedir a un compañero su colección de nombres (copie en su código las
        //instrucciones de su compañero necesarias, o cree una nueva usando esos
        //nombres) y utilizarla llamando al método retainAll sobre su propia colección.
        //Imprima por pantalla la colección resultante. ¿Qué utilidad tiene retainAll?
        System.out.println("EJERCICIO 3");
        Collection<String> coleccion3 = new ArrayList<>();
        coleccion3.add("Alberto");
        coleccion3.add("Jose Antonio");
        coleccion3.add("Ricardo");
        coleccion3.add("María");
        coleccion3.add("EvilEdu");
        coleccion3.add("Antonio");
        coleccion3.add("Dani");
        coleccion3.add("Rafael");
        coleccion3.add("ChemaMartinezDJ");
        coleccion3.add("Marcelo");
        System.out.println(coleccion3.retainAll(coleccion2));
        System.out.println(coleccion3);
        //retainAll elimina los elementos no comunes de la coleccion3 comparado con la coleccion2
        //Devuelve true si la colección cambia tras haber llamado al método, sino, devuelve false

        //4. Repita el ejercicio anterior con el método removeAll, y explique qué utilidad
        //tiene.
        System.out.println("EJERCICIO 4");
        coleccion2.clear();
        coleccion3.clear();

        coleccion2.add("Alberto");
        coleccion2.add("Jouse");
        coleccion2.add("Ricardo");
        coleccion2.add("María");
        coleccion2.add("EvilEdu");
        coleccion2.add("Jurado");
        coleccion2.add("Dani");
        coleccion2.add("Rafa");
        coleccion2.add("Chemita");
        coleccion2.add("Marcelo");

        coleccion3.add("Alberto");
        coleccion3.add("Jose Antonio");
        coleccion3.add("Ricardo");
        coleccion3.add("María");
        coleccion3.add("EvilEdu");
        coleccion3.add("Antonio");
        coleccion3.add("Dani");
        coleccion3.add("Rafael");
        coleccion3.add("ChemaMartinezDJ");
        coleccion3.add("Marcelo");
        System.out.println(coleccion3.removeAll(coleccion2));
        System.out.println(coleccion3);
        //removeAll elimina todos los elementos

        //5. Repita el ejercicio con el método containsAll, y explique qué utilidad tiene.
        System.out.println("EJERCICIO 5");
        coleccion3.clear();
        coleccion3.add("Alberto");
        coleccion3.add("Jouse");
        coleccion3.add("Ricardo");
        coleccion3.add("María");
        coleccion3.add("EvilEdu");
        coleccion3.add("Jurado");
        coleccion3.add("Dani");
        coleccion3.add("Rafa");
        coleccion3.add("Chemita");
        coleccion3.add("Marcelo");
        coleccion3.add("Antonio");
        coleccion3.add("Alejandro");
        coleccion3.add("Eric");
        coleccion3.add("JoseMari");
        System.out.println(coleccion3.containsAll(coleccion2));

        //6. Obtener un array de la colección del ejercicio 3, recorrerlo e imprimir por
        //pantalla cada elemento, seguido del índice donde se encuentra. Tras la
        //impresión de cada elemento, borre dicho elemento de la colección. Finalice el
        //ejercicio imprimiendo la colección.
        System.out.println("EJERCICIO 6");
        String[] arrayStr = new String[coleccion3.size()];
        int i = 0;
        for(String element : coleccion3){
            arrayStr[i] = element;
            i++;
        }
        for (int j = 0; j < arrayStr.length; j++) {
            System.out.println("Indice: " + j + " continene el elemento: " + arrayStr[j]);
            coleccion3.remove(arrayStr[j]);
        }
        System.out.println(coleccion3);

        //7. Imprima el resultado de llamar al método isEmpty sobre la colección del
        //ejercicio anterior.
        System.out.println("EJERCICIO 7");
        System.out.println(coleccion3.isEmpty());

        //8. Imprima el resultado de llamar al método size sobre la colección del ejercicio
        //anterior.
        System.out.println("EJERCICIO 8");
        System.out.println(coleccion3.size());

    }
}
