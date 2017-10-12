package animales;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

public class archivos {
    
    public void guardarDatos(String nombrearchivo, String datos) {
        try {
            File archivo = new File(nombrearchivo);
            BufferedWriter bw = null;
            if (archivo.exists()) {
                bw = new BufferedWriter(new FileWriter(archivo, true));
                bw.write(datos);
                bw.flush();
            } else {
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(datos);
                bw.flush();
            }
        } catch (IOException io) {
            JOptionPane.showMessageDialog(null, io, "Hubo un problema en el archivo", JOptionPane.ERROR_MESSAGE);
        }
    }
}
