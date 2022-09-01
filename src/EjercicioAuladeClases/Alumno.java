package EjercicioAuladeClases;
import java.util.ArrayList;
public class Alumno extends  Persona {
    private double calificacion;

    public Alumno() {
        super();
        edad = MetodosSueltos.aleatorio(12, 16);
        calificacion = MetodosSueltos.aleatorio(0, 10);
    }

    public double getCalificacion() {
        return calificacion;
    }

    @Override
    public boolean asistencia() {
        if (MetodosSueltos.aleatorio(1, 2) == 1) {
            return true;
        } else {
            return false;
        }
    }


}
