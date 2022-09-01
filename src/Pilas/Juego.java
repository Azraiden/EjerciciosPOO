package Pilas;

public class Juego {
    private  String nombre;
    private String genero;
    private int fecha;


    public Juego(String nombre, String genero, int fecha) {
        this.nombre = nombre;
        this.genero = genero;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getFecha() {
        return fecha;
    }

    @Override
    public String toString() {
        return "nombre = " + nombre + '\n' +
                "genero = " + genero + '\n' +
                "fecha= " + fecha ;
    }
}
