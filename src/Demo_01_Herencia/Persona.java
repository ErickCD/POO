package Demo_01_Herencia;

public class Persona {
    private String nombre;
    private String apePaterno;
    private String apeMaterno;
    private String curp;
    private int edad;
    private String sexo;
    
    public Persona(){
    }
    public Persona(String nombre, String apePaterno, String apeMaterno, String curp, int edad, String sexo) {
        this.nombre = nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.curp = curp;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    @Override 
    public String toString(){
        return "Nombre: " + getNombre() + "\nCurp: " + getCurp() + "\nEdad: " + getEdad();
    }
    
}
