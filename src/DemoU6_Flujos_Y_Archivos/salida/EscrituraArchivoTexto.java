package DemoU6_Flujos_Y_Archivos.salida;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class EscrituraArchivoTexto {
    public void salvarDatos(String nombreArchivoSalida, String info){
        try{
            FileWriter fw = new FileWriter(nombreArchivoSalida);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter salida = new PrintWriter(bw);
            //Guardar informacion enel archivo
            salida.println(info);
            //cerrar archivo
            salida.close();
        }catch(IOException io){
            System.err.println("Hubo un errror en el archivo...");
        }
    }
    
    public void guardarDatos(String nombrearchivo, String datos){
        try{
            File archivo = new File(nombrearchivo);
            BufferedWriter bw = null;
            if(archivo.exists()){
                bw = new BufferedWriter(new FileWriter(archivo, true));
                bw.write(datos);
                bw.flush();
            }else{
                bw = new BufferedWriter(new FileWriter(archivo));
                bw.write(datos);
                bw.flush();
            }
        }catch(IOException io){
            JOptionPane.showMessageDialog(null,io, "Hubo un problema en el archivo",JOptionPane.ERROR_MESSAGE);
        }
    }
}
