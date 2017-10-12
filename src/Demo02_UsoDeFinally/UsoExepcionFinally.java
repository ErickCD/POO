package Demo02_UsoDeFinally;

public class UsoExepcionFinally {
    public static void main(String[] args) {
        try{
            LanzaExcepcion();
        }catch(Exception a){
            System.err.println("Excepcion lanzada eb el metodo Lanza Excepcion.");
        }
        //Invocar metodo NoLanzaExcepcion
        NoLanzaExcepcion();
    }
    //Demuestra los bloques de try ... catch ... finally
    public static void LanzaExcepcion() throws Exception{
        try{
            System.out.println("Metodo, lanza Excepcion.");
            //Genera la Excepcion
            throw  new Exception();
        }catch(Exception d){
            System.err.println("La excepcion se manejo en el metodo lanza excepcion"+d);
            //Genera la Excepcion
            throw d;
        }finally{
            System.out.println("Se ejecuto con finally en lanza excepcion");
        }
        
    }
    public static void NoLanzaExcepcion(){
        try{
            //El bloque try no lanza ninguna excepcion
            System.out.println("Metodo, no lanza excepcion!!!");
        }catch(Exception e){
            System.err.println(e);
        }finally{
            System.out.println("Se ejecutó el bloque finally, no lanza excepcion.");
        }
        
    }
 
}
