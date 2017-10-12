package Demo_01_Herencia;

public class Alumno extends Persona{
    private int semestre;

    
    public Alumno(){
    }
    public Alumno(String nombre, String apePaterno, String apeMaterno, String curp, int edad, String sexo, int semestre) {
        super(nombre, apePaterno, apeMaterno, curp, edad, sexo);
        this.semestre = semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getSemestre() {
        return semestre;
    }
    
    // Sobre-escritura del metodo toString
    @Override
    public String toString(){
        return super.toString() + "\nSemestre: " + getSemestre();
    }
}
