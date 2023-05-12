package Practicas.CentroCultural;

public abstract class Material {
    int id;
    String titulo;
    String autor;
    int estanteria;
    int altura;

    public Material(int id, String titulo, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
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

    public int getEstanteria() {
        return estanteria;
    }

    public void setEstanteria(int estanteria) {
        this.estanteria = estanteria;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    void colocarMaterial(){
        //System.out.println("El material con código XXX debe colocarlo en la estantería XX y altura X");
        //this.estanteria = XX;
        //this.altura = X;
    }
}