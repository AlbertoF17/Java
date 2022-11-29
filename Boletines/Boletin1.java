package Boletines;

public class Boletin1 {
    public static void main(String[] args) {
        //1. Imprime por pantalla tu nombre.
        System.out.println("Alberto");

        //2. Imprime por pantalla tu nombre y dos apellidos, cada uno en una línea.
        System.out.println("Alberto");
        System.out.println(" Fernández");
        System.out.println(" Gómez");

        //3.a Repite el ejercicio anterior pero imprimiendo todo en la misma línea.
        System.out.print("Alberto");
        System.out.println(" Fernández Gómez");

        //3.b Repite el ejercicio anterior imprimiendo todo en la misma línea, usando
        //tres instrucciones de impresión.
        System.out.print("Alberto");
        System.out.print(" Fernández ");
        System.out.print("Gómez");

        //4. Imprime tu edad.
        System.out.println(20);

        //5. Imprime el primer dígito de tu edad en una línea, y el segundo en otra.
        System.out.println(2);
        System.out.println(0);

        //6. Imprime el primer dígito de tu edad. Tras ello y con una nueva instrucción,
        //imprime el segundo. Tienen que aparecer ambos en la misma línea.
        System.out.print(2);
        System.out.println(0);

        //7. Imprime al revés tu nombre, de forma que cada letra aparezca en una línea.
        //Por ejemplo, en mi caso (Jorge) la salida del programa sería:
        //e
        //g
        //r
        //o
        //J
        System.out.println("o");
        System.out.println("t");
        System.out.println("r");
        System.out.println("e");
        System.out.println("b");
        System.out.println("l");
        System.out.println("A");

        //8. Repite lo anterior, pero entre cada letra debe aparecer una línea en blanco.
        //Por ejemplo, en mi caso (Jorge) la salida del programa sería:
        //e
        //
        //g
        //
        //r
        //
        //o
        //
        //J
        System.out.println("o");
        System.out.println();
        System.out.println("t");
        System.out.println();
        System.out.println("r");
        System.out.println();
        System.out.println("e");
        System.out.println();
        System.out.println("b");
        System.out.println();
        System.out.println("l");
        System.out.println();
        System.out.println("A");

        //9. Imprime por pantalla tu nombre concatenándolo con tu edad, de forma que quede
        //un espacio en blanco entre ambos.
        System.out.println("Alberto " + 19);

        //10. Imprime por pantalla el número 3 concatenándolo con el número 7. Comprueba
        //si tu compañero lo ha hecho igual que tú.
        System.out.println("3"+ "7");
        //11. Imprime por pantalla la cadena "Hola mundo" y a continuación, la cadena
        //"Hola\nmundo". ¿Para qué sirve el '\n'? ¿Puede utilizarse varias veces seguidas?
        System.out.println("Hola mundo" + " Hola\nmundo"); //El '\n' significa salto de linea
        //12. ¿Para qué sirve el operador '+'?
        System.out.println(3+8);//Para sumar datos numericos
        System.out.println("Hola, tengo " + 3 + " hermanos");//Para concatenar datos que contengan al menos un tipo String
    }
}
