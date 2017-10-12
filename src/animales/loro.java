package animales;

public class loro extends animal{
private String patas = "Tengo 2 patas", mensaje = "Soy un Loro";

    public loro() {
    }

    
    public loro(String patas, String mensaje, String cola, String ojos) {
        super (cola, ojos);
        this.mensaje = mensaje;
        this.patas = patas;
    }

    public String getPatas(){
        return patas;
    }
    public String getMensaje(){
        return mensaje;
    }
}
