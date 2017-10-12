package animales;

public class loro_mutante extends loro{
    private String nivel_mutacion = "Tengo tentaculos y halas";
    private String mensaje_mutante = "Soy un loro mutante";

    public loro_mutante() {
    }

    public loro_mutante(String patas, String mensaje,String cola, String ojos, String mensaje_mutante, String nivel_mutacion) {
        super (patas, mensaje, cola, ojos );
        this.nivel_mutacion = nivel_mutacion;
        this.mensaje_mutante = mensaje_mutante;
    }

    public String getNivel_mutacion() {
        return nivel_mutacion;
    }
    
    public String getMensajeM() {
        return mensaje_mutante;
    }
}
