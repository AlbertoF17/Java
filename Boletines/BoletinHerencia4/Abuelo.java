package Boletines.BoletinHerencia4;

import javax.naming.OperationNotSupportedException;

public class Abuelo {
    String nombre;
    String apellido;
    String fechaNacimiento;
    int edad;
    char sexo;
    public Abuelo() {
        nombre = "";
        apellido = "";
        fechaNacimiento = "";
        edad = 0;
        sexo = 'h';
    }
    public Abuelo(String nombre, String apellido, String fechaNacimiento, int edad, char sexo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.sexo = sexo;
    }
    void contarBatallitas() throws OperationNotSupportedException {
        System.out.println("El abuelo " + nombre + " cuenta una batallita.");
    }
    public void validaNombre(String nombre){
        if (nombre == null || nombre == ""){
            throw new IllegalArgumentException("El nombre no debe ser nulo o vacío");
        }
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        validaNombre(nombre);
        this.nombre = nombre;
    }
    public void validaApellido(String apellido){
        if (apellido == null || apellido == ""){
            throw new IllegalArgumentException("El apellido no debe ser nulo o vacío");
        }
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        validaApellido(apellido);
        this.apellido = apellido;
    }
    public void validaFechaNacimiento(String fechaNacimiento){
        String regex = "^(?:3[01]|[12][0-9]|0?[1-9])([\\-/])(0?[1-9]|1[1-2])\\1\\d{4}$";
        if (!fechaNacimiento.matches(regex)){
            throw new IllegalArgumentException("La fecha no contiene el formato correcto");
        }
    }
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(String fechaNacimiento) {
        validaFechaNacimiento(fechaNacimiento);
        this.fechaNacimiento = fechaNacimiento;
    }
    public void validaEdad(int edad){
        if (edad < 0){
            throw new IllegalArgumentException("La edad no puede ser negativa");
        }
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        validaEdad(edad);
        this.edad = edad;
    }
    public void validaSexo(char sexo){
        if (sexo != 'h' || sexo != 'm'){
            throw new IllegalArgumentException("El sexo debe ser hombre (\'h\') o mujer (\'m\')");
        }
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        validaSexo(sexo);
        this.sexo = sexo;
    }
}
