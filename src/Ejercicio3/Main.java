package Ejercicio3;

import java.util.Scanner;

public class Main {
    public static int indiceCarroMBarato(Vehiculo[] carros) {
        float precio;
        int indice = 0;

        precio = carros[0].getPrecio();
        for (int i = 1; i < carros.length; i++) {
            if(carros[i].getPrecio() < precio){
                precio = carros[i].getPrecio();
                indice = i;
            }
        } return indice;}


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Vehiculo[] carros;
        int nVehiculos,indiceBarato;
        String marca, modelo;
        float precio;


        System.out.println("Digite cuantos vehiculos desea: ");
        nVehiculos = input.nextInt();

        carros = new Vehiculo[nVehiculos];

        for (int i = 0; i < nVehiculos; i++) {
            input.nextLine();
            System.out.println("Datos del Vehiculo "+(i+1)+":");
            System.out.println("Marca del vehiculo: ");
            marca = input.nextLine();
            System.out.println("Modelo del vehiculo: ");
            modelo = input.nextLine();
            System.out.println("Precio del vehiculo: ");
            precio = input.nextFloat();

            carros[i] = new Vehiculo(marca,modelo,precio);
        }
        indiceBarato = indiceCarroMBarato(carros);

        System.out.println("El carro mas barato es: ");
        System.out.println(carros[indiceBarato].mostrarDatos());




    }
}
