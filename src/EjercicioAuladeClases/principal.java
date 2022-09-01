package EjercicioAuladeClases;

public class principal {
    public static void main(String[] args) {

        Aula aula1 = new Aula("filosofia",10, 25 );

        if(aula1.hayClases()){
            System.out.println(MetodosSueltos.aprobado(aula1.alumnos));
        }else {
            System.out.println("No hubo clases porque no se cumplieron las condiciones");
        }

    }
}
