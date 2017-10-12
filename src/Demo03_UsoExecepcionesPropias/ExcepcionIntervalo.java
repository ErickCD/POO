package Demo03_UsoExecepcionesPropias;

//Clase que describe a una excepcion propia llamada: Excepcion intervalo
//Que extiende a la clase padre (o super clase) Exception
public class ExcepcionIntervalo extends Exception{
    
    public ExcepcionIntervalo(String mensajeError){
        //Constructor de la clase ExcepcionIntervalo
        super(mensajeError);
    }
}
