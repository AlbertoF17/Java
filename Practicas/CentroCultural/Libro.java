package Practicas.CentroCultural;

import java.util.Objects;

public class Libro extends Material{
    int numPaginas;

    public Libro(int id, String titulo, String autor, int numPaginas) {
        super(id, titulo, autor);
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Libro libro)) return false;
        return (numPaginas == libro.numPaginas && titulo.equals(libro.titulo));
    }

    @Override
    public int hashCode() {
        return Objects.hash(numPaginas);
    }
}
