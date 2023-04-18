package Apuntes.ColeccionesRecursividad;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibo(5));

        System.out.println("----------------------------------------------------------------------------------------");

        Collection coleccion; //Representan grupos de objetos, llamados elementos

        //Listas

        List lista; //Las listas son colecciones en la que los elementos tienen un orden (posicion en lista)
        lista = new ArrayList<>();
        coleccion = lista; //La interfaz List hereda de Collection!

        //Tipos de listas:
        ArrayList arrayList = new ArrayList<>(); //No sincronizado
        Vector vector = new Vector<>(); //Sincronizado
        LinkedList linkedlist = new LinkedList<>(); //Lista doblemente enlazada. Util para simular pilas o colas

        //Se recomienda inicializar la capacidad del ArrayList, aunque el tamaño pueda variar (por defecto es 10)
        ArrayList arrayList2 = new ArrayList<>(20);

        //En el caso de LinkedList la capacidad es exactamente igual al tamaño de la lista y no se puede especificar capacidad

        //Añadir elementos a la lista
        arrayList2.add("Hello");
        Integer entero = Integer.valueOf(1);
        arrayList2.add(entero); //Los tipos primitivos no pueden incluirse en colecciones! requieren objetos.
        arrayList2.add(1); //Automaticamente lo convierte, pero es importante entender que es un objeto Integer y no un int
        arrayList2.add(new Object());
        arrayList2.add(new Alumno("EvilEdu"));

        System.out.println(arrayList2);

        //Si queremos que nuestra lista tenga un tipo concreto de datos, podemos definir un tipo genérico
        ArrayList<Alumno> arrayList3 = new ArrayList<Alumno>(5);
        arrayList3.add(new Alumno("EvilEdu"));
        System.out.println(arrayList3);

        //Borrar elementos de la lista
        arrayList2.remove(0);
        System.out.println(arrayList2);
        arrayList2.remove(1);
        System.out.println(arrayList2);
        arrayList2.remove(new Alumno("EvilEdu")); //Importante el equals
        System.out.println(arrayList2);

        //Longitud lista
        System.out.println(arrayList2.size());

        ArrayList<Alumno> alumnoList = new ArrayList<Alumno>(List.of(
                new Alumno("EvilEdu"),
                new Alumno("Carlos Ivan"),
                new Alumno("Emilio")
        ));
        System.out.println(alumnoList);

        //Ordenar lista
        Collections.sort(alumnoList);
        System.out.println(alumnoList);

        //Otras funciones
        System.out.println(alumnoList.contains(new Alumno("EvilEdu")));
        System.out.println(alumnoList.isEmpty());

        ArrayList<Alumno> alumnoList2 = new ArrayList<Alumno>(List.of(
                new Alumno("Alejandro"),
                new Alumno("Eric"),
                new Alumno("Antonio")
        ));
        //for
        for(Alumno a: alumnoList2) {
            System.out.println(a);
        }

        System.out.println("----------------------------------------------------------------------------------------");
        //Conjuntos
        Set s; //Grupo de elementos donde NO hay repetidos (lo verifica usando equals)
        s = new HashSet<>();
        coleccion = s; ////La interfaz Set hereda de Collection!

        //Tipos de conjuntos
        HashSet hashSet = new HashSet<>(); /*Se almacenan en una tabla hash. El coste de inserción borrado y modificación
                                             suele ser constante. La iteración es mas costosa y el orden difiere del orden
                                             de inserción*/
        LinkedHashSet linkedHashSet = new LinkedHashSet<>(); /*Como lo anterior pero la tabla hash tiene los elementos
                                                               enlazados lo que facilita la iteración*/
        TreeSet treeSet = new TreeSet<>(); //Guarda los elementos en un arbol

        //Operaciones
        HashSet<Alumno> alumnosSet = new HashSet<Alumno>();
        Alumno evilEdu = new Alumno("EvilEdu");
        alumnosSet.add(evilEdu);
        alumnosSet.add(evilEdu);
        alumnosSet.add(new Alumno("Ricardo"));
        alumnosSet.add(new Alumno("Nicolas"));
        alumnosSet.add(new Alumno("Solano"));
        System.out.println(alumnosSet);

        System.out.println(alumnosSet.contains(evilEdu));

        alumnosSet.remove(evilEdu);
        System.out.println(alumnosSet);

        System.out.println(alumnosSet.contains(evilEdu));

        System.out.println(alumnosSet.size());

        //for
        for(Alumno a: alumnosSet) {
            System.out.println(a);
        }

        System.out.println("----------------------------------------------------------------------------------------");

        //Mapas (Diccionarios)
        Map m;
        m = new HashMap();
        // coleccion = m; //NO ES COLECCION

        //Tipos de mapas
        HashMap hashMap = new HashMap<>(); //Almacena el par clave-valor en una tabla hash. No sincronizada. Iteracion costosa.
        Hashtable hashtable = new Hashtable<>();
        TreeMap treeMap = new TreeMap<>(); //Coste operaciones logaritmico. Ordenados ascendentemente por clave.

        //Operaciones con mapas
        HashMap<Integer, Alumno> dic = new HashMap<Integer, Alumno>();
        dic.put(1, new Alumno("Maria"));
        dic.put(2, new Alumno("Alberto"));
        dic.put(2, evilEdu); //Las claves no se pueden repetir! se sobreescribe el valor!
        System.out.println(dic);

        System.out.println(dic.get(2));
        System.out.println(dic.size());
        System.out.println(dic.remove(2));
        System.out.println(dic);
        System.out.println(dic.containsKey(1));
        System.out.println(dic.containsValue(evilEdu));
        Collection c = dic.values(); //Coleccion de valores

        dic.put(2, evilEdu);
        dic.put(3, new Alumno("Alberto"));
        dic.put(4, new Alumno("Alicia"));

        //for
        for(Map.Entry<Integer, Alumno> entry : dic.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        Vector<Integer> vec = new Vector<>();
        for (int i = 1; i < 11; i++) {
            vec.add(i);
        }
        System.out.println(vec);

        //Las enumeraciones y los iteradores son objetos útiles a la hora de recorrer diferentes tipos de colecciones

        //Interfaz Enumeration. Permite consultar secuencialmente los elementos de una coleccion.
        Enumeration enu = vec.elements();

        //Para consultar uno a uno los elementos
        while (enu.hasMoreElements()) {
            Object o = enu.nextElement();
            Integer n = (Integer) o;
            System.out.println(n);
        }

        /*
            Interfaz Iterator. Permite iterar sobre los elementos de una colección secuencialmente para, además de
            consultar, eliminar elementos.
        */
        Iterator iter = vec.iterator();

        //Para iterar uno a uno los elementos
        while(iter.hasNext()) {
            Object o = iter.next();
            Integer n = (Integer) o;
            if (n > 3 && n <7) {
                iter.remove();
            }
        }
        System.out.println(vec);

        /*
            Interfaz ListIterator. Permite iterar sobre los elementos de una lista secuencialmente para consultar,
            eliminar y setear elementos. Tambien permite iterar hacia atras.
        */
        for (int i = 3; i < 6; i++) {
            vec.add(i,i+1);
        }
        System.out.println(vec);

        ListIterator listIt = vec.listIterator();

        //Para iterar uno a uno los elementos
        while(listIt.hasNext()) {
            Object o = listIt.next();
            Integer n = (Integer) o;
            if (n > 3 && n <7) {
                listIt.set(Integer.valueOf(0));
            }
        }
        System.out.println(vec);

        //Se puede iterar al reves
        ListIterator listIt2 = vec.listIterator(vec.size());
        while(listIt2.hasPrevious()) {
            Object o = listIt2.previous();
            Integer n = (Integer) o;
            if (n == 0) {
                System.out.println("Añadiendo 5s delante de 0s");
                listIt2.add(Integer.valueOf(5));
            }
        }
        System.out.println(vec);

    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return factorial(n-1) * n;
        }
    }

    public static int fibo(int n) {
        if (n == 0) {
            return 0;
        }else if (n == 1) {
            return 1;
        } else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
