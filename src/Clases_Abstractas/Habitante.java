package Clases_Abstractas;

//clas abstracta habitante
public abstract class Habitante {
    //Atributos o variables de clase
    protected String nombre;
    //Constructor de la clase Habitante
    public Habitante (String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public abstract String habla();
}
