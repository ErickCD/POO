package Tarea_Menu;

public class Profesor extends Persona{
    private float salario;
    private String cedula;
    
    public Profesor(){
    }
    public Profesor(String nombre, String apePaterno, String apeMaterno, String curp, int edad, String sexo, float salario, String cedula) {
        super(nombre, apePaterno, apeMaterno, curp, edad, sexo);
        this.salario = salario;
        this.cedula = cedula;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public float getSalario() {
        return salario;
    }

    public String getCedula() {
        return cedula;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\nSalario: " + getSalario() + "\nCedulaProfecional: " + getCedula();
    }
    
}
