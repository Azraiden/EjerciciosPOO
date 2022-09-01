package EjercicioAuladeClases;

public class Profesor extends Persona {
    private String materia;

    public Profesor() {
        super();
        String[] materias = {"filosofia", "fisica", "matematicas"};

        materia = materias[MetodosSueltos.aleatorio(0,2)];

        edad = MetodosSueltos.aleatorio(20,50);

    }

    public String getMateria() {
        return materia;
    }

    @Override
    public boolean asistencia(){
        return MetodosSueltos.aleatorio(1, 5) != 5; }
    }

