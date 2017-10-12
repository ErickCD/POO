package DemoU6_Flujos_Y_Archivos.demo04_FileStream;

import java.io.IOException;
import java.io.FileInputStream;

public class Demo_FileInputStream {

    public static void main(String[] args) throws IOException {

        FileInputStream fis = null;
        int i, x;
        char c;
        byte[] bs = new byte[4];

        try {
            // Abre el archivo
            fis = new FileInputStream("D:\\Mensajes.txt");

            // Lee el buffer
            i = fis.read(bs);

            // Imprime
            System.out.println("Numero de Bytes leidos: " + i);
            System.out.print("Bytes leidos: ");

            // Imprimir los bytes leÃ­dos
            for (byte b : bs) {
                // Convertir el byte a un tipo caracter
                c = (char) b;
                System.out.print(c);
            }
        } catch (Exception ex) {
            // Si ocurre algÃºn error 
            ex.printStackTrace();
        } finally {
            // Liberar recursos del sistema
            if (fis != null) {
                fis.close(); // Cierra el archivo 
            }
        }
    }
}
