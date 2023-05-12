package Practicas.CentroCultural;

import java.util.Objects;

public final class Disco extends Material{
    String discografica;
    String isrc;

    public Disco(String titulo, String autor, String discografica, String isrc) {
        super(titulo, autor);
        this.discografica = discografica;
        this.isrc = isrc;
    }

    public String getDiscografica() {
        return discografica;
    }

    public void setDiscografica(String discografica) {
        this.discografica = discografica;
    }

    @Override
    public String toString() {
        return "Disco{" +
                ", id=" + id +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", discografica='" + discografica + '\'' +
                ", ISRC='" + isrc + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Disco)) return false;
        Disco disco = (Disco) o;
        return isrc.equals(disco.isrc);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isrc);
    }
}