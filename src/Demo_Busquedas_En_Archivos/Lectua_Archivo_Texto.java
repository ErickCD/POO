package Demo_Busquedas_En_Archivos;
import DemoU6_Flujos_Y_Archivos.Entrada.*;
import java.io.IOException;

public class Lectua_Archivo_Texto {
    LecturaArchivoTexto leer = new LecturaArchivoTexto();
    
    public static void main(String[] args) throws IOException {
        Proceso();
    }
    public static void Proceso() throws IOException{
    leer.leerArchivo("D:\\Mensajes.txt");
}
}
