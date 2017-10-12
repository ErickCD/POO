package animales;

public class animal {
    private String cola = "Tengo cola";
    private String ojos = "Tengo dos ojos";
    
    public animal(){
        
    }

    public animal(String cola, String ojos) {
        this.cola = cola;
        this.ojos = ojos;
    }
    

    public String getCola() {
        return cola;
    }

    public String getOjos() {
        return ojos;
    }
}
