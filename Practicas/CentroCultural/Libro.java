package Practicas.CentroCultural;

import java.util.Objects;

public final class Libro extends Material{
    int numPaginas;
    String isbn;

    public Libro(String titulo, String autor, int numPaginas, int numEstanteria, int numBalda, String isbn) {
        super(titulo, autor, numEstanteria, numBalda);
        this.numPaginas = numPaginas;
        this.isbn = isbn;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getIsbn() {
        return isbn;
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

    @Override
    public String toString() {
        return "Libro{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numero de paginas='" + numPaginas + '\'' +
                ", ISBN='" + isbn + '\'' +
                '}';
    }
}