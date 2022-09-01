package Poligonos;

public class Rectangulo extends Poligono{
    private float lado1;
    private float lado2;

    public Rectangulo( float lado1, float lado2) {
        super(2);
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo"+
                super.toString() +
                "lado1 = " + lado1 +
                ", lado2 = " + lado2;
    }

    @Override
    public double area(){
        return lado1*lado2;
    }


}
