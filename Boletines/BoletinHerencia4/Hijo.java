package Boletines.BoletinHerencia4;

import javax.naming.OperationNotSupportedException;

public class Hijo extends Padre{
    Padre padre1 = new Padre();
    Padre padre2 = new Padre();
    Abuelo abuelo1 = new Abuelo();
    Abuelo abuelo2 = new Abuelo();

    public Hijo() {
        super();
    }

    public Hijo(String nombre, String apellido, String fechaNacimiento, int edad, char sexo, Padre padre1, Padre padre2,
                Abuelo abuelo1, Abuelo abuelo2) {
        super(nombre, apellido, fechaNacimiento, edad, sexo);
        this.padre1 = padre1;
        this.padre2 = padre2;
        this.abuelo1 = abuelo1;
        this.abuelo2 = abuelo2;
    }

    void hacerElVago(){
        System.out.println(nombre + " está haciendo el vago.");
    }

    @Override
    void darSermones(){
        System.out.println("Los hijos no pueden dar sermones.");
    }

    @Override
    void contarBatallitas() throws OperationNotSupportedException {
        throw new OperationNotSupportedException("Los hijos no pueden contar batallitas.");
    }
}
