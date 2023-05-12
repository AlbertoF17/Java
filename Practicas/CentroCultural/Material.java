package Practicas.CentroCultural;

import java.util.Objects;

public abstract class Material {
    private static int nextId = 1;
    int id;
    String titulo;
    String autor;
    int numEstanteria;
    int numBalda;

    public Material(String titulo, String autor, int numEstanteria, int numBalda) {
        this.id = nextId;
        nextId++;
        this.titulo = titulo;
        this.autor = autor;
        this.numEstanteria = numEstanteria;
        this.numBalda = numBalda;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumEstanteria() {
        return numEstanteria;
    }

    public void setNumEstanteria(int numEstanteria) {
        this.numEstanteria = numEstanteria;
    }

    public int getNumBalda() {
        return numBalda;
    }

    public void setNumBalda(int numBalda) {
        this.numBalda = numBalda;
    }

    final String colocarMaterial(){
        return "El material con código " + id + " debe colocarlo en la estantería " +
                numEstanteria + " y altura " + numBalda;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Material)) return false;
        Material material = (Material) o;
        return id == material.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}