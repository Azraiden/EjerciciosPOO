package EjercicioAuladeClases;
//Queremos representar con programación orientada a objetos , un aula con estudiantes y un profesor . Tanto de los estudiantes como de
// los profesores necesitamos saber su nombre , edad y sexo . De los estudiantes , queremos saber también su calificación actual
// ( entre 0 y 10 ) y del profesor que materia da . Las materias disponibles son matemáticas , filosofía y física . Los estudiantes
// tendrán un 50 % de hacer novillos , por lo que si hacen novillos no van a clase pero aunque no vayan quedara registrado en el aula
// ( como que cada uno tiene su sitio ) . El profesor tiene un 20 % de no encontrarse disponible ( reuniones , baja , etc. )
// Las dos operaciones anteriores deben llamarse igual en Estudiante y Profesor ( polimorfismo ) . El aula debe tener un identificador
// numérico , el número máximo de estudiantes y para que esta destinada ( matemáticas , filosofía o física ) . Piensa que más atributos
// necesita . Un aula para que se pueda dar clase necesita que el profesor esté disponible , que el profesor de la materia
// correspondiente en el aula correspondiente ( un profesor de filosofía no puede . dar en un aula de matemáticas ) y que haya más del
// 50 % de alumnos . El objetivo es crear un aula de alumnos y un profesor y determinar si puede darse clase , teniendo en cuenta las
// condiciones antes dichas .
//Si se puede dar clase mostrar cuántos alumnos y alumnas (por separado) están aprobados de momento (imagina que les estás entregando
// las notas).
//NOTA: los datos pueden ser aleatorios (nombres, edad, calificación, etc.) siempre y cuando tengan sentido (edad no puede ser 80 en un estudiante o calificación ser 12)

import java.util.ArrayList;

public class Aula {
    private Profesor profesor;
    private String materia;

    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private int numeroDeAula;

    protected int numMaxAlumnos;

    public ArrayList<Alumno> getAlumnos() {
        return alumnos;
    }

    public Aula(String materia, int numeroDeAula, int numMaxAlumnos) {
        profesor = new Profesor();


        for (int a = 0; a < numMaxAlumnos; a++) {
            alumnos.add(new Alumno());
        }
        this.materia = materia;
        this.numeroDeAula = numeroDeAula;
        this.numMaxAlumnos = numMaxAlumnos;
    }

    public int porcentajeAsistencia(ArrayList<Alumno> alumnos) {
        int porcentaje = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).asistencia()) {
                porcentaje++;
            }
        }
        return porcentaje * 100 / numMaxAlumnos;
    }


    public boolean cumplirCondiciones() {
        boolean condiciones = true;
        if (!profesor.getMateria().equals(materia) || porcentajeAsistencia(alumnos) < 50 || !profesor.asistencia()) {
            condiciones = false;
        }
        return condiciones;
    }

    public static String calificarAlumnos(ArrayList<Alumno> alumnos) {
        int masculinosAprobados = 0;
        int femeninasAprobadas = 0;
        for (int i = 0; i < alumnos.size(); i++) {
            if (alumnos.get(i).getCalificacion() >= 5 && alumnos.get(i).getSexo().equals("masculino")) {
                masculinosAprobados++;
            } else if (alumnos.get(i).getCalificacion() >= 5 && alumnos.get(i).getSexo().equals("femenino")) {
                femeninasAprobadas++;
            }
        }
        return "Aprobaron " + masculinosAprobados + " hombres" + "\nAprobaron " + femeninasAprobadas + " mujeres";
    }

    public void hayClases(ArrayList<Alumno> alumnos) {
        if (cumplirCondiciones()){
            System.out.println(calificarAlumnos(alumnos));
        }else {
            System.out.println("No se cumplieron las condiciones para dar clases");
        }
    }
}