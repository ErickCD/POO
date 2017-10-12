package Clases_Abstractas;

public class Infante extends Habitante{
    
    public Infante(String nombre){
        super(nombre);
    }

    @Override
    public String habla() {
        return "risa...";
    }

}
