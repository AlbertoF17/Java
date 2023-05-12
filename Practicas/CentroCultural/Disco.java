package Practicas.CentroCultural;

public class Disco extends Material{
    String discografica;

    public Disco(int id, String titulo, String autor, String discografica) {
        super(id, titulo, autor);
        this.discografica = discografica;
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
                ", discografica='" + discografica + '\'' +'}';
    }
}