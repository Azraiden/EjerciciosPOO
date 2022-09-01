package EjercicioAuladeClases;

import java.util.ArrayList;

public class MetodosSueltos {

    public static int aleatorio(int minimo, int maximo){
        return (int) (Math.random()*maximo+minimo);
    }

    public static String aprobado(ArrayList<Alumno> alumnos) {
        int masculinosAprobados = 0;
        int femeninasAprobadas = 0;

        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getCalificacion() >= 5 && alumnos.get(i).getSexo().equals("masculino")) {
                masculinosAprobados++;
            } else if (alumnos.get(i).getCalificacion() >= 5 && alumnos.get(i).getSexo().equals("femenino")) {
                femeninasAprobadas++;
            }
        }
        return "Aprobaron "+masculinosAprobados+" hombres"+"\nAprobaron "+femeninasAprobadas+" mujeres";}
}
