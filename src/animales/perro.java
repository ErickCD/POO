package animales;

public class perro extends animal{
    private String raza = "Mi raza es pointer", mensaje = "Hola soy un perro", orejas = "Tengo dos orejas grandes";

    public perro() {
    }

    public perro(String cola, String ojos, String mensaje, String raza, String orejas) {
        super(cola, ojos);
        this.orejas = orejas;
        this.raza = raza;
        this.mensaje = mensaje;
    }

    public String getRaza() {
        return raza;
    }

    public String getOrejas() {
        return orejas;
    }
    public String getMensaje() {
        return mensaje;
    }
}
