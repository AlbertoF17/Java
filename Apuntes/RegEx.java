package Apuntes;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String input;

        explicar();

        do {
            System.out.println("\nIntroduce tu expresion regular: ");
            String regex = sc.nextLine();

            System.out.println("Introduce frase: ");
            input = sc.nextLine();

            menu(regex, input);
        } while(!input.equals("salir"));

    }

    public static void explicar() {
        System.out.println("Bienvenido al programa de Expresiones Regulares.");
        System.out.println("Las reglas de las expresiones regulares son las siguientes:");
        System.out.println("\t*\t Lo que precede a * puede aparecer 0 o n veces.");
        System.out.println("\t+\t Lo que precede a + debe aparecer al menos una vez.");
        System.out.println("\t?\t Lo que precede a ? puede aparecer 0 o 1 vez, pero no mas.");
        System.out.println("\t{n,m}\t Lo que precede a {n,m} puede aparecer entre n y m veces, pero ni mas ni menos.");
        System.out.println("\t{n,}\t Lo que precede a {n,} debe aparecer minimo n veces.");
        System.out.println("\t{n}\t Lo que precede a {,} debe aparecer exactamente n veces. Ni mas ni menos.");
        System.out.println("\t()\t Los parentesis permiten definir grupos para aplicarle un operador o para extraer la " +
                "parte del input compatible");
        System.out.println("\t[]\t Los corchetes especifican conjuntos de letras o simbolos, sin importar el orden." +
                "incluso permiten rangos con - como por ejemplo cualquier caracter de la a a la z [a-z]. También se" +
                " puede negar un rango con ^, como por ejemplo que no tenga ningun numero [^0-9]");
        System.out.println("\t\\w\t Cualquier simbolo alfanumerico. Es un alias de  [a-zA-Z_0-9]");
        System.out.println("\t\\W\t En mayusculas es la negación del anterior, es decir, el resto de caracteres no " +
                "contemplados por \\w");
        System.out.println("\t\\d\t Indica digito. Sinonimo de [0-9]");
        System.out.println("\t\\D\t Indica no digito. Sinonimo de [^0-9]");
        System.out.println("\t\\s\t Indica caracteres como espacios en blanco, tabuladores, saltos de linea o retorno " +
                "de carro.");
        System.out.println("\t\\S\t Lo contrario al anterior");
        System.out.println("\t.\t Comodin, pero solo 1");
        System.out.println("\t\\.\t Literalmente el punto");
        System.out.println("\t|\t Indica alternación, es decir, le vale que se cumpla el lado izquierdo o el derecho." +
                " Ejemplo: hola|buenas");
        System.out.println("\t^\t Indica que tiene que ser el inicio del String");
        System.out.println("\t$\t Indica que tiene que ser el final del String");
    }

    private static void usarMetodosString(String regex, String input) {
        System.out.println("Cumple EXACTAMENTE el patron?: " + input.matches(regex));

        String[] array = input.split("regex");
        System.out.println("Split por regex:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static void usarClasesEspecificas(String regex, String input) {
        Pattern pat = Pattern.compile(regex);
        Matcher mat = pat.matcher(input);

        System.out.println(mat);

        System.out.println("-------------------- matches --------------------");
        System.out.println("Cumple EXACTAMENTE el patrón?: " + mat.matches());

        System.out.println("-------------------- find --------------------");
        while (mat.find()) {
            System.out.println(mat);
            System.out.println(mat.start() + " to " + mat.end() + ": " + mat.group());
        }


    }

    static void menu(String regex, String input) {
        System.out.println("Selecciona una opcion:");
        System.out.println("\t1) Metodos Strings.");
        System.out.println("\t2) Clases Pattern, Matcher y MarchResult.");
        int res = sc.nextInt();
        sc.nextLine();
        switch (res) {
            case 1: usarMetodosString(regex, input);break;
            case 2: usarClasesEspecificas(regex, input);break;
            default:
                System.out.println("Error, selecciona un numero valido");break;
        }
    }
}