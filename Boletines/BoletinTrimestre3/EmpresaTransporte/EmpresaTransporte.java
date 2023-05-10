package Boletines.BoletinTrimestre3.EmpresaTransporte;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
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
        System.out.println("\t 1. Contratar camionero.");
        System.out.println("\t 2. Añadir camión.");
        System.out.println("\t 3. Registrar uso de camion.");
        System.out.println("\t 4. Imprimir un camionero.");
        System.out.println("\t 5. Imprimir camioneros.");
        System.out.println("\t 6. Imprimir un camion.");
        System.out.println("\t 7. Imprimir todos los camiones.");
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
        camioneros.add(new Camionero(idEmpleado, nombre, salario));
    }
    public void addCamion(String matricula, String marca, String modelo){
        camiones.add(new Camion(matricula, marca, modelo));
    }
    Camionero buscarCamionero(int idEmpleado){
        for (Camionero c: camioneros) {
            if (c.getIdEmpleado() == idEmpleado){
                return c;
            }
        }
        return null;
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
    public void iniciar() throws FileNotFoundException {
        cargarCamioneros();
        cargarCamiones();
        cargarRegistros();
        int n;
        do{
            n = menu();
            switch (n) {
                case 1:
                    System.out.println("Introduce ID:");
                    int idEmpleado = SC.nextInt();
                    System.out.println("Introduce nombre:");
                    String nombre = SC.nextLine();
                    System.out.println("Introduce salario:");
                    float salario = SC.nextFloat();
                    addCamionero(idEmpleado, nombre, salario);
                    break;
                case 2:
                    System.out.println("Introduce matrícula:");
                    String matricula = SC.nextLine();
                    System.out.println("Introduce marca:");
                    String marca = SC.nextLine();
                    System.out.println("Introduce modelo:");
                    String modelo = SC.nextLine();
                    SC.nextLine();
                    addCamion(matricula, marca, modelo);
                    break;
                case 3:
                    System.out.println("Introduce el ID del camionero:");
                    int camioneroId = SC.nextInt();
                    System.out.println("Introduce la matrícula del camiñon que va a usar:");
                    String mat = SC.nextLine();
                    buscarCamionero(camioneroId).camiones.add(buscarCamion(mat));
                    buscarCamion(mat).camioneros.add(buscarCamionero(camioneroId));
                    break;
                case 4:
                    System.out.println("Introduce DNI del alumno a mostrar:");
                    String dniAl1 = SC.nextLine();
                    //this.imprimirAlumno(dniAl1);
                    break;
                case 5:
                    //this.imprimirAlumnos();
                    break;
                case 6: System.out.println("Introduce codigo de la asignatura a mostrar:");
                    String dniAs1 = SC.nextLine();
                    //this.imprimirAsignatura(dniAs1);
                    break;
                case 7:
                    //this.imprimirAsignaturas();
                    break;
                default:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (n>0 && n<9);
        this.cargarCamioneros();
        this.cargarCamiones();
        this.cargarRegistros();
    }
    private void cargarCamiones() throws FileNotFoundException {
        File file = new File("Camiones.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
    }
    private void cargarCamioneros() throws FileNotFoundException {
        File file = new File("Camioneros.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
    }
    private void cargarRegistros() throws FileNotFoundException {
        File file = new File("Registros.csv");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
    }
}
