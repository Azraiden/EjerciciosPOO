package Poligonos;

public abstract class Poligono {
    protected int numLados;

    protected Poligono(int numLados) {
        this.numLados = numLados;
    }

    public int getNumLados() {
        return numLados;
    }

    @Override
    public String toString() {
        return "Poligono{" +
                "numLados=" + numLados +
                '}';
    }

    public abstract double area();
}

