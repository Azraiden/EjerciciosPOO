package Poligonos;

public class Triangulo extends Poligono {
    private float lado1;
    private float lado2;
    private float lado3;

    public Triangulo(float lado1, float lado2, float lado3) {
        super(3);
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    @Override
    public double area() {
        double p = (lado1 + lado2 + lado3) / 2;
        return Math.sqrt(p*(p-lado1)*(p-lado2)*(p-lado3));
    }

    @Override
    public String toString() {
        return "Triangulo: " +
                super.toString()+
                "lado1 = " + lado1 +
                ", lado2 = " + lado2 +
                ", lado3 = " + lado3;
    }
}
