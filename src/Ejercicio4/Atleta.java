package Ejercicio4;

public class Atleta {
    float tiempo;
    int numero;
    String nombre;


    public Atleta(float tiempo, int numero, String nombre) {
        this.tiempo = tiempo;
        this.numero = numero;
        this.nombre = nombre;
    }
    public float getTiempo(){
        return tiempo;
    }

    public String mostrarGanador(){
        return "Nombre: "+nombre+"\nNumero: "+numero+"\n Tiempo: "+tiempo;
    }
}
