package Ejercicio7_Banco;

public class Cuenta {

    int numeroCuenta;
    float saldo;

    public Cuenta(int numeroCuenta, float saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }

    public void retirarSaldo(float monto){
            saldo -= monto;
    }

    public void introducirSaldo(float monto) {
        saldo += monto;
    }
}
