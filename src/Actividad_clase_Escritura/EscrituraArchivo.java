package Actividad_clase_Escritura;

import java.io.*;
import javax.swing.JOptionPane;
import java.io.IOException;

public class EscrituraArchivo {

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
        
    

   public void leerArchivo(String nombre){
        try {
            FileReader file = new FileReader(nombre);
            BufferedReader reader = new BufferedReader(file);
            String linea = reader.readLine();
            int numLinea = 0;
            while (linea != null) {
                numLinea++;
                System.out.println("linea " + numLinea + ": " + linea.toString());
                linea = reader.readLine();
            }
            reader.close();

        } catch (FileNotFoundException a) {
            JOptionPane.showMessageDialog(null,"No seEncuentra el archivo ", "a", JOptionPane.ERROR_MESSAGE);
        } catch (IOException b) {
            JOptionPane.showMessageDialog(null, "No se encuentra ", "b", JOptionPane.ERROR_MESSAGE);
        }
    }
}
