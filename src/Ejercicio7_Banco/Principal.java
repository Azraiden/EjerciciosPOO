package Ejercicio7_Banco;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcion;
        String nombre, apellido, dni;
        Cuenta[] cuentas;
        int n;
        int numero_cuenta;
        float saldo;


        System.out.println("Bienvenido al Banco");

        System.out.println("Introduzca su nombre: ");
        nombre = input.nextLine();
        System.out.println("Apellido: ");
        apellido = input.nextLine();
        System.out.println("DNI: ");
        dni = input.nextLine();
        System.out.println("Cuantas cuentas posee");
        n = input.nextInt();
        cuentas = new Cuenta[n];


        for (int i = 0; i < cuentas.length; i++) {
            System.out.println("Numero de cuenta "+(i+1)+": ");
            numero_cuenta = input.nextInt();

            System.out.println("Saldo actual de la cuenta "+(i+1)+": ");
            saldo = input.nextFloat();

            cuentas[i] = new Cuenta(numero_cuenta,saldo);
        }
        Cliente cliente1 = new Cliente(nombre,apellido,dni,cuentas);


        do{
            System.out.println("Menu");
            System.out.println("1.-Consultar Saldo");
            System.out.println("2.-Ingresar dinero");
            System.out.println("3.-Retirar dinero");
            System.out.println("4.-Salir");
            opcion = input.nextInt();


            switch (opcion) {
                case 1:
                    System.out.println("Cual de sus cuentas desea revisar: ");
                    n = input.nextInt();

                    System.out.println("Saldo actual de la cuenta " + cuentas[n].getNumeroCuenta() + " " + cliente1.consultar_saldo(n) + "$");
                    break;

                case 2:
                    System.out.println("En cual de sus cuentas desea ingresar dinero: ");
                    n = input.nextInt();
                    System.out.println("Cuanto dinero desea ingresar: ");
                    saldo = input.nextInt();
                    cliente1.ingresar_saldo(n, saldo);
                    System.out.println("Saldo actual de la cuenta " + cuentas[n].getNumeroCuenta() + ": " + cliente1.consultar_saldo(n) + "$");
                    break;

                case 3:
                    System.out.println("De cual de sus cuentas desea retirar dinero: ");
                    n = input.nextInt();
                    System.out.println("Cuanto dinero desea retirar: ");
                    saldo = input.nextInt();
                    cliente1.retirar_saldo(n, saldo);
                    System.out.println("Saldo actual de la cuenta " + cuentas[n].getNumeroCuenta() + ": " + cliente1.consultar_saldo(n) + "$");
                    break;

                case 4:
                    System.out.println("Gracias por usar nuestro banco.");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
            }
        }while (opcion != 4);

    }
}
