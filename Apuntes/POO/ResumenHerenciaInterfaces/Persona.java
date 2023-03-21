public abstract class Persona {
    String nombre;
    int edad;
    String dni;

    public Persona() {
        nombre = "";
        dni = "";
    }

    public Persona(String nombre, int edad, String dni) {
        validateNombre(nombre);
        this.nombre = nombre;
        validateEdad(edad);
        this.edad = edad;
        validateDNI(dni);
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        validateNombre(nombre);
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        validateEdad(edad);
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        validateDNI(dni);
        this.dni = dni;
    }

    void validateNombre(String nombre) {
        if (nombre == null) {
            throw new IllegalArgumentException("No se admiten nombres nulos.");
        }
    }

    void validateEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("No se admiten edades nulas.");
        }
    }

    void validateDNI(String dni) {
        if (dni == null) {
            throw new IllegalArgumentException("No se admiten DNIs nulos.");
        }
        /*
        if (dni.length() != 9) {
            throw new IllegalArgumentException("El DNI debe contener 9 caracteres.");
        }*/

        if (!dni.matches("^[0-9]{8}[A-HJ-NP-TV-Z]$")) {
            throw new IllegalArgumentException("El DNI debe contener 9 caracteres, los 8 primeros numeros " +
                    "y el ultimo letra.");
        }
        /*
        if (!dni.substring(0,8).chars().allMatch(Character::isDigit)) {
            throw new IllegalArgumentException("Los 8 primeros caracteres del DNI deben ser numeros.");
        }

        if (!Character.isLetter(dni.charAt(8))){
            throw new IllegalArgumentException("El ultimo caracter del DNI debe ser una letra.");
        }*/
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni;
    }

    @Override
    public boolean equals(Object obj) {
        Persona a = (Persona) obj;
        return this.dni.equals(a.getDni());
    }

    public abstract void preguntarSinHaberLeido();
}
