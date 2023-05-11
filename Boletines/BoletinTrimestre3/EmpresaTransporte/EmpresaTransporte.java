package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.io.*;
import java.util.TreeSet;
public class EmpresaTransporte implements Interactivo{
    TreeSet<Camion> camiones;
    TreeSet<Camionero> camioneros;

    public EmpresaTransporte() {
        this.camiones = new TreeSet<>();
        this.camioneros = new TreeSet<>();
    }

    @Override
    public int menu() {
        int n;
        System.out.println("******************************************************************");
        System.out.println("Que deseas realizar?:");
        System.out.println("\t 1. Dar de alta camionero.");
        System.out.println("\t 2. Dar de alta camión.");
        System.out.println("\t 3. Asignar camión a un camionero.");
        System.out.println("\t 4. Imprimir un camioneros.");
        System.out.println("\t 5. Imprimir camiones.");
        System.out.println("\t 6. Eliminar camionero.");
        System.out.println("\t 7. Eliminar camion.");
        System.out.println("\t 8. Editar camionero.");
        System.out.println("\t 9. Editar camion.");
        n = SC.nextInt();
        SC.nextLine();
        System.out.println("******************************************************************");
        return n;
    }
    public void imprimirCamioneros(){
        System.out.println(camioneros);
    }
    public void imprimirCamiones(){
        System.out.println(camiones);
    }
    public void addCamionero(int idEmpleado, String nombre, float salario){
        if(buscarCamionero(idEmpleado) != null){
            System.out.println("Ya está el empleado");
        } else {
            camioneros.add(new Camionero(idEmpleado, nombre, salario));
        }
    }
    public void addCamion(String matricula, String marca, String modelo){
        if(buscarCamion(matricula) != null){
            System.out.println("Ya está el camion");
        } else {
            camiones.add(new Camion(matricula, marca, modelo));
        }
    }
    Camionero buscarCamionero(int idEmpleado){
        for (Camionero c: camioneros) {
            if (c.getIdEmpleado() == idEmpleado){
                return c;
            }
        }
        return null;
    }
    void registrarConduccion(int idEmpleado, String matricula){
        Camionero camionero = buscarCamionero(idEmpleado);
        Camion camion = buscarCamion(matricula);
        if(camionero == null){
            throw new IllegalArgumentException("No existe el camionero");
        }
        if(buscarCamion(matricula) == null){
            throw new IllegalArgumentException("No existe el camion");
        }
        camionero.concudirCamion(camion);
        camion.haSidoUsado(camionero);
    }
    void borrarCamionero(int idEmpleado){
        Camionero camionero = buscarCamionero(idEmpleado);
        if (camionero == null){
            throw new IllegalArgumentException("No existe ese camionero");
        }
        for (Camion c: camiones) {
            if (c.getCamioneros().contains(camionero)){
                c.getCamioneros().remove(camionero);
            }
        }
        camioneros.remove(camionero);
    }
    void borrarCamion(String matricula){
        Camion camion = buscarCamion(matricula);
        if (camion == null){
            throw new IllegalArgumentException("No existe ese camion");
        }
        for (Camionero c: camioneros) {
            if (c.getCamiones().contains(camion)){
                c.getCamiones().remove(camion);
            }
        }
        camiones.remove(camion);
    }
    void editarCamionero(int idEmpleado, String nuevoNombre, float nuevoSalario){
        Camionero camionero = buscarCamionero(idEmpleado);
        if(camionero == null){
            throw new IllegalArgumentException("No existe ese camionero");
        }
        camionero.setNombre(nuevoNombre);
        camionero.setSalario(nuevoSalario);
    }
    //Se puede hacer sobrecarga
    void editarCamion(String matricula, String nuevaMarca, String nuevoModelo){
        Camion camion = buscarCamion(matricula);
        if(camion == null){
            throw new IllegalArgumentException("No existe ese camionero");
        }
        camion.setMarca(nuevaMarca);
        camion.setModelo(nuevoModelo);
    }
    Camion buscarCamion(String matricula){
        for (Camion c: camiones) {
            if (c.getMatricula().equals(matricula)){
                return c;
            }
        }
        return null;
    }
    @Override
    public void iniciar() throws IOException {
        cargarCamioneros();
        cargarCamiones();
        cargarRegistros();
        int n;
        do{
            n = menu();
            switch (n) {
                case 1:
                    System.out.println("\t 1. Dar de alta camionero.");
                    System.out.println("Introduce id de Empleado:");
                    int idEmpleado = SC.nextInt();
                    System.out.println("Introduce nombre:");
                    String nombre = SC.nextLine();
                    System.out.println("Introduce salario:");
                    float salario = SC.nextFloat();
                    addCamionero(idEmpleado, nombre, salario);
                    break;
                case 2:
                    System.out.println("\t 2. Dar de alta camión.");
                    System.out.println("Introduce matrícula:");
                    String matricula = SC.nextLine();
                    System.out.println("Introduce marca:");
                    String marca = SC.nextLine();
                    System.out.println("Introduce modelo:");
                    String modelo = SC.nextLine();
                    addCamion(matricula, marca, modelo);
                    break;
                case 3:
                    System.out.println("\t 3. Asignar camión a un camionero.");
                    System.out.println("Introduce idEmpleado:");
                    int idEmpleado1 = SC.nextInt();
                    System.out.println("Introduce matrícula:");
                    String matricula1 = SC.nextLine();
                    registrarConduccion(idEmpleado1, matricula1);
                    break;
                case 4:
                    System.out.println("\t 4. Imprimir camioneros.");

                    imprimirCamioneros();
                    break;
                case 5:
                    System.out.println("\t 5. Imprimir camiones.");

                    imprimirCamiones();
                    break;
                case 6:

                    System.out.println("\t 6. Eliminar camionero.");
                    System.out.println("Introduce el idEmpleado del camionero a eliminar:");
                    String idEmpleadoRemove = SC.nextLine();

                    // darBaraCamionero(idEmpleadoRemove);
                    break;
                case 7:
                    System.out.println("\t 7. Eliminar camión.");
                    System.out.println("Introduce la matrícula del camión:");
                    String matriculaRemove = SC.nextLine();

                    // darBaraCamion(matriculaRemove);
                    break;
                case 8:
                    System.out.println("\t 8. Editar camionero.");
                    cargarCamioneros();
                    break;
                case 9:
                    System.out.println("\t 9. Editar camion.");
                    cargarCamiones();
                    break;
                default:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (n>0 && n<9);
        this.guardarCamioneros();
        this.guardarCamiones();
        this.guardarRegistros();
    }
    private void cargarCamiones() throws IOException {
        File file = new File("Camiones.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            String[] atributos = line.split(",");
            addCamion(atributos[0], atributos[1], atributos[2]);
        }
        br.close();
        fr.close();
    }
    private void cargarCamioneros() throws IOException {
        File file = new File("Camioneros.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            String[] atributos = line.split(",");
            addCamionero(Integer.parseInt(atributos[0]), atributos[1], Float.parseFloat(atributos[2]));
        }
        br.close();
        fr.close();
    }
    private void cargarRegistros() throws IOException {
        File file = new File("Registros.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        while((line = br.readLine()) != null){
            String[] atributos = line.split(",");
            registrarConduccion(Integer.parseInt(atributos[0]), atributos[1]);
        }
        br.close();
        fr.close();
    }
    private void guardarCamiones() throws IOException {
        File file = new File("Camiones.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Camion c : camiones) {
            bw.write(c.getMatricula() + "," + c.getMarca() + "," + c.getModelo());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
    private void guardarCamioneros() throws IOException {
        File file = new File("Camioneros.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Camionero c : camioneros) {
            bw.write(c.getIdEmpleado() + "," + c.getNombre() + "," + c.getSalario());
            bw.newLine();
        }
        bw.close();
        fw.close();
    }
    private void guardarRegistros() throws IOException {
        File file = new File("Registros.csv");
        FileWriter fw = new FileWriter(file);
        BufferedWriter bw = new BufferedWriter(fw);
        for (Camionero c: camioneros) {
            for (Camion camion: c.getCamiones()) {
                bw.write(c.getIdEmpleado() + "," + camion.getMatricula());
                bw.newLine();
            }
        }
        bw.close();
        fw.close();
    }
    private void guardarFicheros() throws IOException {
        guardarCamioneros();
        guardarCamiones();
        guardarRegistros();
    }
}
