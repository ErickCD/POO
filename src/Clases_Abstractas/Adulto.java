package Clases_Abstractas;

public class Adulto extends Habitante{
    
    public Adulto(String nombre){
        super(nombre);
    }

    @Override
    public String habla() {
        return "auch....!!!";
    }
    
}

