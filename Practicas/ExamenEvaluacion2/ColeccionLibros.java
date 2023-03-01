package Practicas.ExamenEvaluacion2;

public class ColeccionLibros {
    private int libroID;
    private Libro libro;

    public ColeccionLibros (Libro[] coleccionLibros){
        this.libroID = 0;
    }

    public int getLibroID() {
        return libroID;
    }

    public void setLibroID(int libroID) {
        this.libroID = libroID;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
}
