package Poligonos;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    static ArrayList<Poligono> poligonos  = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        llenarPoligono();
        mostrarResultado();


    }



    public static void llenarPoligono(){
        int opcion;
        char respuesta;
        do {
            do {
                System.out.println("Que poligono desea llenar: ");
                System.out.println("1.- Triangulo");
                System.out.println("2.- Rectangulo");
                opcion = input.nextInt();
                    switch (opcion) {
                        case 1:
                            llenarTriangulo();
                            break;
                        case 2:
                            llenarRectangulo();
                            break;
                    }
                } while (opcion < 1 || opcion > 2);

                System.out.println("Desea llenar otro poligono? s/n");
                respuesta = input.next().charAt(0);
            } while (respuesta == 's' || respuesta == 'S');
        }
    public static void llenarTriangulo(){
        float lado1,lado2,lado3;
        System.out.println("Digite los lados del triangulo: ");
        System.out.println("Lado 1: ");
        lado1 = input.nextFloat();
        System.out.println("Lado 2: ");
        lado2 = input.nextFloat();
        System.out.println("Lado 3: ");
        lado3 = input.nextFloat();

        Triangulo triangulo = new Triangulo(lado1,lado2,lado3);

        poligonos.add(triangulo);
    }
    public static void llenarRectangulo(){
        float lado1,lado2;
        System.out.println("Digite los lados del triangulo: ");
        System.out.println("Lado 1: ");
        lado1 = input.nextFloat();
        System.out.println("Lado 2: ");
        lado2 = input.nextFloat();

        Rectangulo rectangulo = new Rectangulo(lado1,lado2);

        poligonos.add(rectangulo);
    }
    
    public static void mostrarResultado(){
        for (Poligono poli : poligonos) {
            System.out.println(poli.toString());
            System.out.println("Area = "+poli.area());
            System.out.println();
            
        }
    }

}


