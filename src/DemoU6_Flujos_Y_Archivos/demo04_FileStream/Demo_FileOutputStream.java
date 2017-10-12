package DemoU6_Flujos_Y_Archivos.demo04_FileStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo_FileOutputStream {
   public static void main(String[] args) throws IOException {
      
      FileOutputStream fos = null;
      FileInputStream fis = null;
      byte[] b = {65,66,67,68,69};
      int i;
      char c;
      
      try{
         // Crea/abre el archivo sobre la cual se va escribir 
         fos=new FileOutputStream("D:\\Mensajes.txt");
         fos.write(b);
         fos.flush();
         // Abre el archivo a leer
         fis = new FileInputStream("D:\\Mensajes.txt");
         
         // 
         while((i=fis.read())!=-1)
         {
            // Convertir el entero en caracter
            c=(char)i;
            System.out.print(c);
         }
      }catch(Exception ex){
         ex.printStackTrace();
      }finally{
         if(fos!=null)
            fos.close();
         if(fis!=null)
            fis.close();
      }
   }
}
