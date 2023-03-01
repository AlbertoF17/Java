package Practicas.ExamenEvaluacion2;

public class Main {
    public static void main(String[] args) {
        //TEST EJERCICIO 1
        System.out.println("TEST EJERCICIO 1");
        //Creación de objetos (1 por cada constructor declarado)
        Libro libro1 = new Libro();
        Libro libro2 = new Libro("2452356124", "Hola", "Mundo");
        Libro libro3 = new Libro("1422376538", "Hola", "Mundo", 3, "A");
        //Llamada a cada uno de los métodos
        //Voy a llamar a cada método desde "libro1", probando los "getters" y los "setters" ir comprobando como cambian
        //los valores de los atributos gracias a su "setter" correspondiente, y así poder hacer una comprobación final
        //llamando al método "toString". Tanto "libro2" como "libro3" no dan error en su declaración/inicialización,
        //por lo que los siguientes métodos también podrían valer para cualquiera de los mismos.
        System.out.println("ISBN");
        System.out.println(libro1.getISBN());
        libro1.setISBN("2322222222");
        System.out.println("ISBN después de \"settear\" un nuevo ISBN");
        System.out.println(libro1.getISBN());
        /////////
        System.out.println();
        /////////
        System.out.println("Título:");
        System.out.println(libro1.getTitulo());
        libro1.setTitulo("El libro de programación");
        System.out.println("Título después de \"settear\" un nuevo título:");
        System.out.println(libro1.getTitulo());
        /////////
        System.out.println();
        /////////
        System.out.println("Autor:");
        System.out.println(libro1.getAutor());
        libro1.setAutor("Alberto Fernández");
        System.out.println("Autor después de \"settear\" un nuevo autor:");
        System.out.println(libro1.getAutor());
        /////////
        System.out.println();
        /////////
        System.out.println("Número de páginas:");
        System.out.println(libro1.getNumPaginas());
        libro1.setNumPaginas(21);
        System.out.println("Número de páginas después de \"settear\" un nuevo número de páginas:");
        System.out.println(libro1.getNumPaginas());
        /////////
        System.out.println();
        /////////
        System.out.println("Editorial:");
        System.out.println(libro1.getEditorial());
        libro1.setEditorial("Editoriales RegalosMiguel");
        System.out.println("Editorial después de \"settear\" una nueva editorial:");
        System.out.println(libro1.getEditorial());
        /////////
        System.out.println();
        /////////
        System.out.println("Resultado final con \"toString\":");
        System.out.println(libro1.toString());

        //TEST EJERCICIO 3
        //He almacenado cada array en una variable para que sea más cómodo cambiar sus valores y
        //el código sea más visual.
        System.out.println("\nTEST EJERCICIO 3");
        int[][] array1 = {{7,9},{2,1}};
        int[][] array2 = {{3,4},{2,0}};
        int[][] nuevoArray = concatenar(array1, array2, 'V');
        for (int i = 0; i < nuevoArray.length; i++) {
            for (int j = 0; j < nuevoArray[i].length; j++) {
                System.out.print(nuevoArray[i][j] + " ");
            }
            System.out.println();
        }

        //TEST EJERCICIO 4
        System.out.println("\nTEST EJERCICIO 4");
        ejercicio4(new String[]{"Hola", "Mundo"});
    }

    public static int[][] concatenar (int[][] array1, int[][] array2, char caracter){
        if (caracter == 'H'){
            int[][] nuevoArray = new int[array1.length][array1[0].length+array2[0].length];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    nuevoArray[i][j] = array1[i][j];
                }
            }
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    nuevoArray[i][j+array1[i].length] = array2[i][j];
                    //Al ser el doble de "largo", el array2 pondrá sus valores a partir de donde se dejaron de
                    //poner los valores del array1
                }
            }
            return nuevoArray;
        } else if (caracter == 'V'){
            int[][] nuevoArray = new int[array1.length+array2.length][array1[0].length];
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1[i].length; j++) {
                    nuevoArray[i][j] = array1[i][j];
                }
            }
            for (int i = 0; i < array2.length; i++) {
                for (int j = 0; j < array2[i].length; j++) {
                    nuevoArray[i+array1.length][j] = array2[i][j];
                    //Al ser el doble de "alto", el array2 pondrá sus valores a partir de donde se dejaron de
                    //poner los valores del array1
                }
            }
            return nuevoArray;
        } else {
            throw new IllegalArgumentException("Carácter no válido, por favor introduzca \'V\' o \'H\' en mayúscula.");
        }
    }
    public static void ejercicio4(String[] cadenas){
        int[] arrayAbecedario = new int[26];
        //Letras del abecedario excluyendo "ch", "ñ" y "ll".
        for (int i = 0; i < cadenas.length; i++) {
            cadenas[i] = cadenas[i].toLowerCase();
            //Se pasa a minúscula para evitar confusiones
            for (int j = 0; j < cadenas[i].length(); j++) {
                arrayAbecedario[cadenas[i].charAt(j)-'a']++;
                //Si encuentra la letra, se añade al contador en su posición correspondiente (código ascii de la letra
                //que haya leído menos el código ascii de la "a", ya que el contador de las "aes" estaría en la posición 0 del
                //"arrayAbecedario").
            }
        }
        for (int i = 0; i < arrayAbecedario.length; i++) {
            System.out.println((char)('a'+i) + ": " + arrayAbecedario[i]);
            //Se imprime la letra y su contador resultante correspondiente.
        }
        System.out.println();
    }
}
