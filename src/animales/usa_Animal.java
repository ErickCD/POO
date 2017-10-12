package animales;

import java.util.Scanner;
import java.util.InputMismatchException;

public class usa_Animal {

    public static void main(String[] args) {
        Scanner entrada;
        int x = 0;
        String gato = "";
        do {
            try {
                entrada = new Scanner(System.in);
                System.out.println("\n\nInserte la opcionque decea ver:\n1.- Gato\n2.- Loro\n3.- Loro Mutante\n4.- Perro\n5.- Guardar datos\n6.- Salir\n");
                x = entrada.nextInt();

                if (x == 1) {
                    gato gto = new gato();
                    System.out.println(gto.getMensaje() + "\n" + gto.getCola() + "\n" + gto.getPatas() + "\n" + gto.getOjos());
                    gato = gto.getMensaje() + "\n" + gto.getCola() + "\n" + gto.getPatas() + "\n" + gto.getOjos();
                } else if (x == 2) {
                    loro lro = new loro();
                    System.out.println(lro.getMensaje() + "\n" + lro.getCola() + "\n" + lro.getPatas() + "\n" + lro.getOjos());
                    
                } else if (x == 3) {
                    loro_mutante mutante = new loro_mutante();
                    System.out.println(mutante.getMensaje() + "\n" + mutante.getCola() + "\n" + mutante.getMensajeM() + "\n" + mutante.getPatas() + "\n" + mutante.getNivel_mutacion());
                } else if (x == 4) {
                    perro pro = new perro();
                    System.out.println(pro.getMensaje() + "\n" + pro.getCola() + "\n" + pro.getRaza() + "\n" + pro.getOjos() + "\n" + pro.getOrejas());
                } else if (x == 5) {
                    System.out.println("Esta en el 5");
                    proceso(gato);  
                }else if(x == 6){
                    System.out.println("Adios");
                    break;
                } else if (x != 1 && x != 2 && x != 3 && x != 4 && x != 5) {
                    System.err.println("Opcion no valida!!!!!!!!!");
                }
            } catch (InputMismatchException err) {

                System.err.println("\nSolo hacepta numeros \n");
            }
        } while (x != 1 || x != 2 || x != 3);

    }
    public static void proceso(String gato){
        Scanner texto = new Scanner(System.in);
        archivos escritura = new archivos();
        String variables;
        int x = 0;
        String gatov = gato; 
        System.out.println("Que animal dese guardar en su coleccion? ");
        x = texto.nextInt();
        if(x == 1){
            System.out.println("Que nombre le quiere dar al archivo");
            variables = texto.nextLine();
            escritura.guardarDatos("D:\\ "+variables, gatov);
        }
        
    }
}
