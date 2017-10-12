package animales;

public class gato extends animal{
    private String patas = "Tengo 2 patas", mensaje = "Soy un gato";

    public gato() {
    }

    
    public gato(String patas, String mensaje, String cola, String ojos) {
        super (cola, ojos);
        this.mensaje = mensaje;
        this.patas = patas;
    }
    
    public String getPatas() {
        return patas;
    }
    
    public String getMensaje() {
        return mensaje;
    }
}
