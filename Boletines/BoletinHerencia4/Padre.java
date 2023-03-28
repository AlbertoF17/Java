package Boletines.BoletinHerencia4;

import javax.naming.OperationNotSupportedException;

public class Padre extends Abuelo{
    public Padre() {
        super();
    }
    public Padre(String nombre, String apellido, String fechaNacimiento, int edad, char sexo) {
        super(nombre, apellido, fechaNacimiento, edad, sexo);
    }
    void darSermones(){
        System.out.println("El padre " + nombre + " le da un sermón a su hijo.");
    }
    @Override
    void contarBatallitas() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Los padres no pueden contar batallitas.");
    }
}
