package DemoU6_Flujos_Y_Archivos.Entrada;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

public class LecturaArchivoTexto {
        public void leerArchivo(String nombrearchivo) throws IOException{
        
        try{
            FileReader archivo = new FileReader(nombrearchivo);
            
            BufferedReader reader = new BufferedReader(archivo);
            String linea = reader.readLine();
            int numLinea = 0;
            while(linea != null){
                numLinea++;
                System.out.println("linea "+ numLinea+ ": "+ linea.toString());
                linea = reader.readLine();
            }
            reader.close();
            
        }catch(FileNotFoundException a){
            JOptionPane.showMessageDialog(null, "No seEncuentra el archivo ","a", JOptionPane.ERROR_MESSAGE);
        }catch(IOException b){
            JOptionPane.showMessageDialog(null, "No se encuentra ","b", JOptionPane.ERROR_MESSAGE);
        }
    }
}
