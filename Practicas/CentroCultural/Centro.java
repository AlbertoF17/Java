package Practicas.CentroCultural;

import java.io.*;
import java.time.LocalDate;
import java.util.*;

public class Centro implements CentroCultural{
    List<Cliente> clientes;
    List<Disco> discos;
    List<Libro> libros;
    private final static Scanner sc = new Scanner(System.in);
    public Centro() {
        this.clientes = new ArrayList<>();
        this.discos = new ArrayList<>();
        this.libros = new ArrayList<>();
        try {
            cargarClientes();
            cargarMateriales();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (RegistroClienteException e) {
            e.printStackTrace();
        }
    }

    public List<Disco> getDiscos() {
        return discos;
    }

    public List<Libro> getLibros() {
        return libros;
    }

    Cliente buscarCliente(String clienteDni){
        for (Cliente c: clientes) {
            if (c.getDni().equals(clienteDni)){
                return c;
            }
        }
        return null;
    }
    Material buscarMaterial(int idMaterial){
        for (Libro li: libros) {
            if (li.getId() == idMaterial){
                return li;
            }
        }
        for (Disco dc: discos) {
            if (dc.getId() == idMaterial){
                return dc;
            }
        }
        return null;
    }
    public void registrarCliente(Cliente cliente) throws RegistroClienteException{
        try {
            clientes.add(cliente);
        } catch (Exception e){
            throw new RegistroClienteException("El cliente ya está registrado");
        }
    }
    public void registrarMaterial(Material material) throws RegistroMaterialException{
        if (material instanceof Disco){
            try {
                discos.add((Disco) material);
            } catch (Exception e){
                throw new RegistroMaterialException("El disco ya está registrado");
            }
        }
        if (material instanceof Libro){
            try {
                libros.add((Libro) material);
            } catch (Exception e){
                throw new RegistroMaterialException("El libro ya está registrado");
            }
        }
    }
    void consultarClientes(){
        System.out.println("******LISTA DE CLIENTES*******");
        for (Cliente c: clientes) {
            System.out.println(c);
        }
        System.out.println("******************************");
    }

    void realizarPrestamo(String clienteDni, int idMaterial){
        Cliente cl = buscarCliente(clienteDni);
        Material mat = buscarMaterial(idMaterial);
        if(cl != null && mat != null){
            if (mat instanceof Libro){
                if (cl.librosActuales.size()>=3){
                    System.out.println("No se puede realizar el préstamo ya que el cliente tiene el numero máximo de" +
                            " libros prestados");
                } else {
                    Libro libro = (Libro) mat;
                    cl.librosActuales.add(libro);
                    cl.prestamos.add(new Prestamo(cl, LocalDate.now(),
                            LocalDate.now().plusDays(CentroCultural.DURACION_PRESTAMO), libro, false));
                }
            } else {
                if (cl.discosActuales.size()>=3){
                    System.out.println("No se puede realizar el préstamo ya que el cliente tiene el numero máximo de" +
                            " discos prestados");
                } else {
                    Disco disco = (Disco) mat;
                    cl.discosActuales.add(disco);
                    cl.prestamos.add(new Prestamo(cl, LocalDate.now(), LocalDate.now(), disco, false));
                }
            }

        }
    }

    void consultarPrestamos(String clienteDni){
        Cliente cl = buscarCliente(clienteDni);
        if (cl == null){
            throw new NullPointerException("Este cliente no existe");
        }
        //System.out.println("El cliente tiene "+ cl.getDiscosActuales() + " " + cl.getLibrosActuales());
        System.out.println("El cliente tiene " + cl.getPrestamos());
    }

    boolean compararLibros(Libro l1, Libro l2){
        return l1.equals(l2);
    }

    void cargarClientes() throws IOException, RegistroClienteException {
        File file = new File("Clientes.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            String[] datosCliente = line.split(",");
            registrarCliente(new Cliente(datosCliente[0], datosCliente[1], datosCliente[2], datosCliente[3]));
        }
    }

    void cargarMateriales() throws IOException {
        File file = new File("Materiales.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            //Tengo que comprobar si es un Disco o Libro para cargarlo en su lista correspondiente
        }
    }
    public void guardarClientes() throws IOException {
        File file = new File("Clientes.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Cliente cl : clientes) {
            bw.write(cl.getDni() + "," + cl.getNombre());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public void guardarMateriales() throws IOException {
        File file = new File("Materiales.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Libro li : libros) {
            bw.write(li.getId() + "," + li.getTitulo() + "," + li.getAutor() + ","
                    + li.getNumEstanteria() + "," + li.getNumBalda() + "," + li.getNumPaginas());
            bw.newLine();
        }
        for (Disco dc : discos) {
            bw.write(dc.getId() + "," + dc.getTitulo() + "," + dc.getAutor() + ","
                    + dc.getNumEstanteria() + "," + dc.getNumBalda() + "," + dc.getDiscografica());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }

    public int menu() {
        int n;
        System.out.println("******************************************************************");
        System.out.println("Que deseas realizar?:");
        System.out.println("\t 1. Dar de alta a un cliente.");
        System.out.println("\t 2. Dar de alta a un material.");
        System.out.println("\t 3. Realizar préstamo.");
        System.out.println("\t 4. Consultar préstamos de un cliente.");
        System.out.println("\t 5. Comparar libros.");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("******************************************************************");
        return n;
    }

    public void iniciar() throws IOException, RegistroClienteException, RegistroMaterialException {
        int n;
        do{
            n = menu();
            switch (n) {
                case 1:
                    System.out.println("Introduce DNI del cliente:");
                    String dni = sc.nextLine();
                    if (clientes.contains(new Cliente(dni, "aaa", "bbb", "ccc"))){
                        throw new RegistroClienteException("El cliente ya está registrado");
                    } else {
                        System.out.println("Introduce nombre del cliente:");
                        String nombre = sc.nextLine();
                        System.out.println("Introduce su primer apellido:");
                        String apellido1 = sc.nextLine();
                        System.out.println("Introduce su primer apellido:");
                        String apellido2 = sc.nextLine();
                        registrarCliente(new Cliente(dni, nombre, apellido1, apellido2));
                    }
                    break;
                case 2:
                    System.out.println("Es un libro o un disco:");
                    String tipo = sc.nextLine();
                    System.out.println("Introduce ID del material:");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce titulo:");
                    String titulo = sc.nextLine();
                    System.out.println("Introduce autor:");
                    String autor = sc.nextLine();
                    System.out.println("Introduce el numero de Estanteria:");
                    int numEstanteria = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Introduce el numero de Balda:");
                    int numBalda = sc.nextInt();
                    sc.nextLine();
                    if(tipo.equalsIgnoreCase("Libro")){
                        System.out.println("Introduce el número de páginas:");
                        int numPaginas = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Introduce el ISBN:");
                        String isbn = sc.nextLine();
                        Libro libro = new Libro(titulo, autor, numPaginas, numEstanteria, numBalda, isbn);
                        registrarMaterial(libro);
                        libro.colocarMaterial();
                    } else if (tipo.equalsIgnoreCase("Disco")) {
                        System.out.println("Introduce la discográfica:");
                        String discografica = sc.nextLine();
                        System.out.println("Introduce el ISRC:");
                        String isrc = sc.nextLine();
                        Disco disco = new Disco(titulo, autor, numEstanteria, numBalda, discografica, isrc);
                        registrarMaterial(disco);
                        disco.colocarMaterial();
                    } else {
                        throw new IllegalArgumentException("El material debe ser un libro o un disco");
                    }
                    break;
                case 3:
                    System.out.println("Introduce DNI del cliente al que vas a prestar el material:");
                    String clienteDni = sc.nextLine();
                    System.out.println("Introduce el ID del material que se va a prestar:");
                    int materialId = sc.nextInt();
                    sc.nextLine();
                    realizarPrestamo(clienteDni, materialId);
                    break;
                case 4:
                    System.out.println("Introduce DNI del cliente para buscar sus préstamos:");
                    String clienteDni1 = sc.nextLine();
                    consultarPrestamos(clienteDni1);
                    break;
                case 5:
                    System.out.println("Introduce ID del primer libro a comparar:");
                    int idLibro1 = sc.nextInt();
                    System.out.println("Introduce ID del segundo libro a comparar:");
                    int idLibro2 = sc.nextInt();
                    Libro l1 = (Libro) buscarMaterial(idLibro1);
                    Libro l2 = (Libro) buscarMaterial(idLibro2);
                    if(compararLibros(l1, l2)){
                        System.out.println("Los libros son iguales");
                    } else {
                        System.out.println("Los libros no son iguales");
                    }
                    break;
                default:
                    System.out.println("Saliendo del programa...");
                    break;
            }
            guardarClientes();
            guardarMateriales();
        } while (n>0 && n<6);
    }
}