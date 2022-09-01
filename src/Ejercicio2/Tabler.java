package Ejercicio2;

import java.util.Scanner;

public class Tabler {
    public static void main(String[] args) {
        int opcion, x, y;
        int movimiento;
        Tablero ficha;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite la posicion inicial de su ficha: ");
        System.out.print("Posicion en X: ");
        x = input.nextInt();
        System.out.print("Posicion en Y: ");
        y = input.nextInt();
        ficha = new Tablero(x, y);


        do {
            System.out.println("Posicion actual: "+ficha.getX()+" "+ficha.getY());

            System.out.println("Menu\n" +
                    "1-Mover arriba\n" +
                    "2-Mover abajo\n" +
                    "3-Mover derecha\n" +
                    "4-Mover izquierda\n" +
                    "5-Salir");
            System.out.println("Digite su movimiento: ");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Cuantas posiciones desea mover: ");
                    movimiento = input.nextInt();
                    ficha.moverArriba(movimiento);
                    break;
                case 2:
                    System.out.print("Cuantas posiciones desea mover: ");
                    movimiento = input.nextInt();
                    ficha.moverAbajo(movimiento);
                    break;
                case 3:
                    System.out.print("Cuantas posiciones desea mover: ");
                    movimiento = input.nextInt();
                    ficha.moverDerecha(movimiento);
                    break;
                case 4:
                    System.out.print("Cuantas posiciones desea mover: ");
                    movimiento = input.nextInt();
                    ficha.moverIzquierda(movimiento);
                    break;
                case 5:
                    System.out.println("Gracias por usar el tablero.");
                    break;
            }
        }while (opcion != 5);
    }
}
