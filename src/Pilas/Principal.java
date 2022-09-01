package Pilas;

import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int tam,fecha;
        String nombre,genero;
        Juego juego;

        System.out.println("Cuantos juegos favoritos tienes: ");
        tam = input.nextInt();
        Stack<Juego> pila = new Stack<>();

        System.out.println("Introduce tus juegos favoritos: ");

        for (int i = 0; i < tam; i++) {
            input.nextLine();
            System.out.print("Nombre: ");
            nombre = input.nextLine();
            System.out.print("Genero: ");
            genero = input.nextLine();
            System.out.print("Fecha de lanzamiento: ");
            fecha = input.nextInt();

           juego = new Juego(nombre,genero, fecha);

           pila.push(juego);
        }

        for (int i = 0; i < tam; i++) {
            juego = pila.pop();
            if(juego.getGenero().equals("accion")){
                System.out.println(juego.getNombre()+" es un juego de accion");
            }
        }



    }
}
