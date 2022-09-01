package Ejercicio2;

public class Tablero{

    //atributos
    private int x;
    private int y;
    //metodos

    public Tablero(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void moverArriba(int movimiento){
        y += movimiento;
    }
    public void moverAbajo(int movimiento){
        y -= movimiento;
    }
    public void moverDerecha(int movimiento){
        x += movimiento;
    }
    public void moverIzquierda(int movimiento){
        x -= movimiento;
    }
    public int getY(){
        return y;
    }
    public int getX(){
        return x;
    }
}
