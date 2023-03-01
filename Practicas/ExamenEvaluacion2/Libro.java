package Practicas.ExamenEvaluacion2;

public class Libro {
    private String ISBN;
    //ISBN es declarado como String ya que ni long, ni int, ni double pueden almacenar un dato numérico de 10 cifras
    //o más.
    private String titulo;
    private String autor;
    private int numPaginas;
    private String editorial;


    public Libro(){
        this.ISBN = "0";
        this.titulo = "NombreVacio";
        this.autor = "AutorVacio";
        this.numPaginas = 0;
        this.editorial = "EditorialVacia";
    }
    public Libro(String ISBN, String titulo, String autor){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = 0;
        this.editorial = "EditorialVacia";
    }
    public Libro(String ISBN, String titulo, String autor, int numPaginas, String editorial){
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        boolean digitos = true;
        for (int i = 0; i < ISBN.length(); i++) {
            if (!Character.isDigit(ISBN.charAt(i))){
                digitos = false;
            }
        }
        if(!digitos){
            throw new IllegalArgumentException("El dato introducido contiene caracteres no numéricos.");
        } else if (ISBN.length() != 10 || ISBN.length() != 13){
            throw new IllegalArgumentException("El ISBN debe tener diez o trece dígitos. No puede tener más o menos.");
        } else {
            this.ISBN = ISBN;
        }
        //Este setter lanza una excepción al declarar un ISBN cuyo array no sea
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo == ""){
            throw new IllegalArgumentException("El título del libro no debe ser nulo o vacío.");
        } else {
            this.titulo = titulo;
        }
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor == ""){
            throw new IllegalArgumentException("El autor del libro no debe ser nulo o vacío.");
        } else {
            this.autor = autor;
        }
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        if (numPaginas<=0){
            throw new IllegalArgumentException("El número de páginas debe ser un entero estricamente mayot que 0.");
        } else {
            this.numPaginas = numPaginas;
        }
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        if (editorial == null || editorial == ""){
            throw new IllegalArgumentException("La editorial del libro no debe ser nulo o vacío.");
        } else {
            this.editorial = editorial;
        }
    }

    @Override
    public String toString() {
        return "TÍTULO: " + getTitulo() + " - ISBN: " + getISBN() + " - AUTOR: " + getAutor() + " - PÁGINAS: " +
                getNumPaginas();
    }
}
