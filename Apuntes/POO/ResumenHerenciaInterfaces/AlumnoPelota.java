public final class AlumnoPelota extends Alumno implements Pelota{

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
}
