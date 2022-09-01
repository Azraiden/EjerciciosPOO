package Ejercicio7_Banco;

public class Cliente {
    private String name;
    private String apellido;
    private String dni;

    Cuenta[] cuentas;

    public Cliente(String name, String apellido, String dni, Cuenta[] cuentas) {
        this.name = name;
        this.apellido = apellido;
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getName() {
        return name;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDni() {
        return dni;
    }

    public float consultar_saldo(int n) {
        return cuentas[n].getSaldo();
    }

    public void ingresar_saldo(int n, float cantidad) {
        cuentas[n].introducirSaldo(cantidad);
    }

    public void retirar_saldo(int n, float cantidad) {
        cuentas[n].retirarSaldo(cantidad);
    }
}
