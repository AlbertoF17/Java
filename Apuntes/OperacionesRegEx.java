package Apuntes;

public class OperacionesRegEx {
    public static void main(String[] args){

        String[] prueba = {"Uno", "Dos", "Tres", "Cuatro"};
        for(String cadena:prueba){
            //No se pueden introducir condicionales
            System.out.println(cadena);
        }

        String cadena = "Hola   Mundo";
        // 1. Pensar una expresión regular para sustituir dos o más espacios en blanco
        String regex = "\s+";
        String regex2 = "( ){2,}";

        // 2. Sustituir por un único espacio en blanco
        //String resultado = cadena.replaceAll(regex, " ");
        String resultado = cadena.replaceAll(regex2, " ");

        // 3. Partir usando el espacio con split
        String[] arrayStr = resultado.split(" ");

        // 4. Contar las palabras.
        System.out.println("Cantidad de palabras: " + arrayStr.length);
        String cadenaEnorme = "En un lugar de la mancha de cuyo nombre no quiero acordarme";

        System.out.println(justificar(cadenaEnorme, 7));
        contar("hola___hola_", "hola");
        System.out.println(contar("hola___hola_", "hola"));

    }
    public static String justificar(String cadena, int longitud){
        StringBuilder resultado = new StringBuilder();
        int cont = 0;
        for (int i = 0; i < cadena.length();i++) {
            if (i%longitud+1 == 0) {
                resultado.append("\n");
            } else{
                resultado.append(cadena.charAt(cont));
                //MEJOR QUE CONCATENAR CON EL OPERADOR "+"
                //CON STRINGBUILDER SE GUARDA AUTOMÁTICAMENTE EN LA VARIABLE, POR LO QUE NO HACE FALTA
                //EL OPERADOR DE ASIGNACIÓN
                cont++;
            }
        }
        return resultado.toString();
        //Convierte de StringBuilder a String
    }

    public static int contar(String cadena, String busqueda){
        int long1 = cadena.length();
        int longbusq = busqueda.length();
        String cadena2 = cadena.replaceAll(busqueda, "");
        int long2 = cadena2.length();
        return (long1-long2)/longbusq;
    }
}
