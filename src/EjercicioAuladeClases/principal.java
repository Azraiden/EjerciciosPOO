package EjercicioAuladeClases;

public class principal {
    public static void main(String[] args) {

        Aula aula1 = new Aula("filosofia",10, 25 );


        aula1.hayClases(aula1.getAlumnos());
    }
}

