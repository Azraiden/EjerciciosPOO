package Ejercicio4;

import java.util.Scanner;

public class carrera {
    public static int corredorGanador(Atleta[] corredores) {
        float tiempo;
        int indice = 0;

        tiempo = corredores[0].getTiempo();
        for (int i = 1; i < corredores.length; i++) {
            if(corredores[i].getTiempo() < tiempo){
                tiempo = corredores[i].getTiempo();
                indice = i;
            }
        } return indice;}

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nAtletas;
        Atleta[] corredores;
        int numero;
        String nombre;
        float tiempo;
        int ganador;

        System.out.println("Digite cuantos atletas corrieron: ");
        nAtletas = input.nextInt();

        corredores = new Atleta[nAtletas];

        for (int i = 0; i < nAtletas; i++) {

            System.out.println("Datos del corredor " + (i + 1) + ":");

            System.out.println("Numero: ");
            numero = input.nextInt();
            input.nextLine();
            System.out.println("Nombre: ");
            nombre = input.nextLine();
            System.out.println("Tiempo: ");
            tiempo = input.nextFloat();

            corredores[i] = new Atleta(tiempo,numero,nombre);
        }

        ganador  = corredorGanador(corredores);

        System.out.println(corredores[ganador].mostrarGanador());



    }
}