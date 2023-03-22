package Apuntes.POO.ResumenHerenciaInterfaces;

public final class AlumnoPelota extends Alumno implements Pelota {

    public AlumnoPelota() {
    }

    public AlumnoPelota(String nombre, int edad, String dni) {
        super(nombre, edad, dni);
    }

    @Override
    public String toString() {
        return "AlumnoPelota{" +
                super.toString() + '\'' +
                '}';
    }

    @Override
    public void pelotear() {
        System.out.println(this.nombre + ": Jorge y Joaquin son mis profes favoritos");
    }

    //Puedo cambiarle el modificador de acceso, pero nunca para restringir mas.
    @Override
    public void hacerUnaGracia() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Los alumnos pelotas no hacen gracias.");
    }
}
