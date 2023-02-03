package Boletines.BoletinMetodosEstaticos1;

import java.util.Scanner;

public class Metodos {
    static Scanner sc = new Scanner(System.in);
    //1. Crear un método estático que tenga la siguiente firma:
    //public static float duplicar(float num)
    //e implementarlo: el método debe devolver el valor num multiplicado por 2.
    public static float duplicar(float num){
        return num*2;
    }
    //2. Crear un método estático que tenga la siguiente firma:
    //public static void saludar(String nombre)
    //e implementarlo: el método debe imprimir por pantalla la cadena “Hola
    //nombre”, donde nombre será la cadena que se recibe como argumento.
    public static void saludar(String nombre){
        System.out.print("Introduzca su nombre: ");
        nombre = sc.next();
        System.out.println("Hola " + nombre);
    }
    //3. Observe la siguiente firma y responda antes de desarrollar cualquier código:
    //public static void saludar()
    //¿Le dará algún error si crea este método justo debajo del método del ejercicio
    //anterior? Piense que se llaman igual y que devuelven lo mismo. Desarrolle a
    //continuación el método dejando el cuerpo vacío. ¿Ocurre lo que pensó antes?
    //¿Por qué?
    //NO DA ERROR YA QUE NO TIENE LOS MISMOS ATRIBUTOS (ESTABA EN LO CIERTO)
    public static void saludar(){
        System.out.print("Introduzca su nombre: ");
        String nombre = sc.next();
        System.out.println("Hola " + nombre);
    }
    //4. Desarrolle el cuerpo del método anterior. El método únicamente imprime por
    //pantalla la palabra Hola, pero debe hacerlo mediante una llamada al método
    //del ejercicio 2.
    public static void saludar2(){
        saludar("");
    }
    //5. Crear un método que se utilice para poder separar con claridad el final de un
    //ejercicio del boletín y el comienzo del siguiente, de forma que cuando se llame
    //a este método de la siguiente forma:
    //imprimirCabecera(“ejercicio 5”);
    //se imprima por pantalla lo siguiente:
    //******************
    //EJERCICIO 5
    //******************
    public static void imprimirCabecera(String ejercicio){
        ejercicio = "ejercicio 5".toUpperCase();
        System.out.println("******************");
        System.out.println(ejercicio);
        System.out.println("******************");
    }
    //6. Modificar el ejercicio anterior, para que el método reciba un segundo
    //argumento de tipo int, que serán la cantidad de asteriscos que deben
    //imprimirse en cada una de las dos líneas. De esta forma, cuando se llame a este
    //método de la siguiente forma:
    //imprimirCabecera(“ejercicio 2”, 4);
    //se imprima por pantalla lo siguiente:
    //****
    //EJERCICIO 2
    //****
    public static void imprimirCabecera(String ejercicio, int asteriscos){
        ejercicio = "ejercicio 5".toUpperCase();
        for (int i = 0; i < asteriscos; i++) {
            System.out.print("*");
        }
        System.out.println();
        System.out.println(ejercicio);
        for (int i = 0; i < asteriscos; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
    //7. Crear un método estático que reciba un número e imprima la tabla de
    //multiplicar de dicho número con el siguiente formato (ejemplo para una
    //entrada de 2):
    //=========================
    //TABLA DE MULTIPLICAR DEL 2
    //=========================
    //2 x 0 = 0
    //2 x 1 = 2
    //2 x 2 = 4
    //…
    //2 x 10 = 20
    //=========================
    //Pruebe el método imprimiendo la tabla de multiplicar de todos los números del
    //1 al 10
    public static void tablaMultiplicar(int num){
        System.out.println("=========================");
        System.out.println("TABLA DE MULTIPLICAR DEL " + num);
        System.out.println("=========================");
        for (int i = 0; i < 11; i++) {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
        System.out.println("=========================");
    }
    //8. Crear un método estático de nombre esPositivo, que reciba un número entero
    //y devuelva un valor booleano indicando si el número es positivo (true) o no
    //(false).
    public static boolean esPositivo(int num){
        return num>=0;
    }
    //9. Crear un método estático de nombre contarPositivos. Este método lee por
    //pantalla números enteros continuamente, y para únicamente cuando el usuario
    //introduce un cero. Cuando esto ocurre, el método devuelve la cantidad de
    //números positivos que el usuario ha introducido por pantalla.
    public static int contarPositivos(int num){
        int cont = 0;
        do{
            System.out.print("Introduce un número: ");
            num = sc.nextInt();
            if (num>0){
                cont++;
            }
        }while(num!=0);
        return cont;
    }
    //10. Crear un método estático que reciba la base y la altura de un rectángulo y
    //devuelva su área.
    public static double areaRectangulo(int base, int altura){
        return base*altura;
    }
    //11. Crear un método estático que reciba el lado de un cuadrado y devuelva su área.
    public static double areaCuadrado(int lado){
        return lado*lado;
    }
    //12. Crear un método estático que reciba la base y la altura de un triángulo y
    //devuelva su área.
    public static double areaTriangulo(int base, int altura){
        return (base*altura)/2;
    }
    //13. Modificar el ejercicio anterior para que la base y altura del triángulo se lean por
    //teclado.
    public static double areaTriangulo2(int base, int altura){
        System.out.print("Introduzca la base del triángulo: ");
        base = sc.nextInt();
        System.out.print("Introduzca la altura del triángulo: ");
        altura = sc.nextInt();
        return (base*altura)/2;
    }
    //14. Crear un método estático que reciba un valor en euros y lo devuelva convertido
    //a dólares americanos.
    public static double conversorEurosDolares(double euros){
        return euros*1.08;
    }
    //15. Crear un método estático que haga lo contrario.
    public static double conversorDolaresEuros(double dolares){
        return dolares/1.08;
    }
    //16. Crear un método estático que reciba un valor en libras y lo devuelva convertido
    //a euros.
    public static double conversorLibrasEuros(double libras){
        return libras/0.9;
    }
    //17. Crear un método estático que reciba un número entero y una posición, y
    //devuelva el dígito que se encuentra en dicha posición.
    public static int mostrarDigito(double num, int posicion){
        int numCifras = 0;
        int digito = 0;
        double copia = num;
        while(copia>0) {
            numCifras++;
            copia/=10;
        }
        while(posicion<numCifras){
            //digito = num/Math.pow(10,numCifras);
        }
        return digito;
    }
    //18. Crear un método estático que reciba un String, y lo devuelva del revés.
    public static String invertirCadena(String cadena){
        String cadenaInvertida = "";
        for (int indice = cadena.length() - 1; indice >= 0; indice--) {
            cadenaInvertida += cadena.charAt(indice);
        }
        return cadenaInvertida;
    }
    //19. Crear un método estático que reciba un String, y compruebe si es un
    //palíndromo. Debe usar el método del ejercicio anterior.
    public static void palindromo(String cadena){
        if (cadena.equals(invertirCadena(cadena))){
            System.out.println("Es palíndormo");
        }else {
            System.out.println("NO es palíndromo");
        }
    }
    //20. Crear un método estático que reciba un número entero y devuelva el factorial
    //de dicho número.
    public static int factorial(int num){
        int resultado = 1;
        for (int i = num; i < 1; i--) {
            resultado *= i;
        }
        return resultado;
    }
    //21. Crear un método estático que reciba dos números enteros n y r, y devuelva el
    //número combinatorio n sobre r. Utilice para ello el método creado en el
    //ejercicio anterior.
    public static int numerosCombinatorios(int n, int r){
        int resultadoN = 1;
        for (int i = n; i < 1; i--) {
            resultadoN *= i;
        }
        int resultadoR = 1;
        for (int i = r; i < 1; i--) {
            resultadoR *= i;
        }
        int resultadoFinal = 1;
        for (int i = (n-r); i < 1; i--) {
            resultadoFinal *= i;
        }
        return (resultadoN)/(resultadoR*resultadoFinal);
    }
    //22. Crear un método estático que reciba dos String, y cuente la cantidad de veces
    //que el segundo se repite en el primero.
    public static int contarString (String cadena, String busqueda){
        int cont = 0;
        do{
            if (cadena.contains(busqueda)){
                cont++;
                cadena = cadena.substring(cadena.indexOf(busqueda)+busqueda.length());
            }
            else {
                cadena = cadena.substring(1);
            }
        }while(cadena.equals(""));
        return cont;
    }
    //23. Crear un método estático que reciba un array de algún tipo primitivo y lo
    //imprima por pantalla.
    public static void imprimirArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
    //24. Cree un método que reciba un array de enteros, y por cada entero del array
    //imprima su tabla de multiplicar.
    public static void imprimirTablaMultiplicarArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            tablaMultiplicar(array[i]);
        }
    }
    //25. Crear un método que reciba un array 1D de enteros y lo ordene.
    public static void ordenarEnteros(int[] array){

    }
    //26. Crear un método que reciba un array 1D de enteros y un número, y busque
    //dicho número en el array (búsqueda lineal).
    //
    //27. Repetir el anterior pero haciendo una búsqueda binaria. Tenga en cuenta los
    //requisitos de este tipo de búsqueda.
    //28. Crear un método que reciba un array de enteros, un número y una posición, y
    //devuelva un nuevo array que tenga los mismos contenidos del original, pero
    //con sus elementos desplazados a partir de la posición especificada, donde se
    //almacenará además el número pasado en el segundo argumento.
    //Por ejemplo, si el método recibe los siguientes datos:
    //[3, 8, 9]
    //Número: 13
    //Posición: 1
    //El nuevo array devuelto por el método debe ser el siguiente:
    //[3, 13, 8, 9]
    //29. Crear un método que reciba dos arrays y un entero, y copie tantos elementos
    //del segundo array en el primer array como diga el entero, comenzando desde
    //la posición cero en ambos. Suponga que no se saldrá de los límites.
    //Por ejemplo, si array1 = [7,2,1,0] y array2=[3,2,2,7,6] y entero=3, al acabar el
    //método el primer array se modificará y su contenido será array1=[3,2,2,0] (en
    //negrita están las posiciones que se han modificado).
    //30. Repetir lo anterior, pero añadiendo un cuarto argumento, que indique la
    //posición del segundo array a partir de la cual se empezará.
    //31. Repetir lo anterior, pero añadiendo un quinto argumento, que indique la
    //posición del primer array a partir de la cual se empezará
}
