package Actividad_clase_Escritura;

import java.io.IOException;
import java.util.Scanner;

public class AppEscritura_Guardar_Leer {
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        
        EscrituraArchivo escritura = new EscrituraArchivo();
        
        String cadena = "";
        for(int i = 0; i < 5 ; i++){
            String habla = entrada.nextLine();
            cadena = cadena + habla + "\n";
        }
        escritura.guardarDatos("D:\\Nuevo_Mensajes.txt", cadena);
        escritura.leerArchivo("D:\\Nuevo_Mensajes.txt");
    }
    
}
