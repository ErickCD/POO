package DemoU6_Flujos_Y_Archivos;

import DemoU6_Flujos_Y_Archivos.Entrada.LecturaArchivoTexto;
import DemoU6_Flujos_Y_Archivos.salida.EscrituraArchivoTexto;
import java.io.IOException;
import java.util.Scanner;

public class UsoFlujoArchivos {
    
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        LecturaArchivoTexto archivotexto = new LecturaArchivoTexto();
        EscrituraArchivoTexto escritura = new EscrituraArchivoTexto();
        String cadena = "";
        for(int i = 0; i < 5 ; i++){
            String habla = entrada.nextLine();
            cadena = cadena + habla + "\n";
        }
        escritura.guardarDatos("D:\\Nuevo_Mensajes.txt", cadena);
        //escritura.salvarDatos("D:\\Mensajes.txt", cadena);
        archivotexto.leerArchivo("D:\\Nuevo_Mensajes.txt");
    }
}
