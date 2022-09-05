package EjercicioAuladeClases;

public abstract class Persona {
    protected String nombre;
    protected int edad;
    protected String sexo;

    private final String[] NOMBRES_MASCULINOS = {"Raul","Miguel", "Enrique","Juan","Jose"};
    private final String[] NOMBRES_FEMENINOS = {"Paola","Maria", "Laura","Andrea","Lorena"};

    public Persona() {
        int aux;
        aux = MetodosSueltos.aleatorio(1,2);
        if(aux == 1){
            sexo = "masculino";
            nombre = NOMBRES_MASCULINOS[MetodosSueltos.aleatorio(0,4)];
        }else{
            sexo = "femenino";
            nombre = NOMBRES_FEMENINOS[MetodosSueltos.aleatorio(0,4)];
        }
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    abstract public boolean asistencia();

}
