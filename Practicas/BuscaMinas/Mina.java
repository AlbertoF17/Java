package Practicas.BuscaMinas;

public final class Mina {
    private int i;
    private int j;

    public Mina(int i, int j) throws MinaException {
        validadorCoordenadas(i,j);
        this.i = i;
        this.j = j;
    }

    private void validadorCoordenadas(int i, int j) throws MinaException {
        if(i<0||j<0){
            throw new MinaException("Las coordenadas de la bomba no pueden ser negativas");
        }
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }

    @Override
    public String toString() {
        return "Mina{" +
                "i=" + i +
                ", j=" + j +
                '}';
    }
}
