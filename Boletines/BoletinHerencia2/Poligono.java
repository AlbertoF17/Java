package Boletines.BoletinHerencia2;

public abstract class Poligono {
    //1. Cree una clase Polígono, que tenga un atributo vértices, que indica la cantidad de
    //vértices que tiene el polígono. Cree constructores, getters, setters y código de
    //validación, y marque todos los miembros con el modificador de visibilidad que
    //considere adecuado. Debe tener un método abstracto llamado calcularArea, que
    //devuelve un float con el área del polígono.
    int vertices;

    public Poligono(){
       vertices = 1;
    }
    public Poligono(int vertices){
        this.vertices = vertices;
    }

    public int getVertices() {
        return vertices;
    }

    public void setVertices(int vertices) {
        validarVertices(vertices);
        this.vertices = vertices;
    }

    public void validarVertices(int vertices){
        if (vertices<3){
            throw new IllegalArgumentException("Debe tener 3 o más vértices");
        }
    }
    public void validarLongitud(double numero){
        if (vertices<=0){
            throw new IllegalArgumentException("Debe medir más de 0");
        }
    }
    abstract double calcularArea(double base, double altura);
    //4. Cree una clase Triángulo, y añádala a la jerarquía en el nivel que estime conveniente.
    //Puede crear tantas clases nuevas como sea necesario.
    //5. Cree una clase Círculo, y añádala a la jerarquía en el nivel que estime conveniente.
    //Puede crear tantas clases nuevas como sea necesario. Tenga en cuenta que un círculo
    //no tiene vértices.
    //Importante: por cada clase que cree, piense en el método calcularArea y téngalo en
    //cuenta.
}
