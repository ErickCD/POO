/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Demos_U1_introduccionPOO;

import java.util.Scanner;
/**
 *
 * @author ERICK CLAIR
 */
public class ProgramaPrincpal {
    public static void main(String args[]){
        Scanner entrada = new Scanner(System.in);
        int x = 1;
        
        do{
        procesoApp();
            System.out.print("\nDesea hacer otro registro? Y = 1: ");
            x = entrada.nextInt();
        }while(x == 1);
    }
        public static void procesoApp(){
            
Scanner entrada = new Scanner(System.in);
        
String nombre;
String apellidoM;
String apellidoP;
String sexo;
String rfc;
int edad;


            System.out.println("\nDeme el nombre de la persona: ");
            nombre = entrada.nextLine();
            System.out.println("Deme el apellido materno: ");
            apellidoM = entrada.nextLine();
            System.out.println("Deme el apellido paterno: ");
            apellidoP = entrada.nextLine();
            System.out.println("Deme el sexo de la persona: ");
            sexo = entrada.nextLine();
            System.out.println("Escriba el RFC de la persona: ");
            rfc = entrada.nextLine();
            System.out.println("Deme la fecha de nacimiento de la persona: ");
            edad = entrada.nextInt();
            
        Persona objeto1 = new Persona();
        
        objeto1.seNombre(nombre);
        objeto1.setApellidos(apellidoM, apellidoP);
        objeto1.setSexo(sexo);
        objeto1.setRFC(rfc);
        objeto1.setFechaNacimiento(edad);
        
            System.out.printf("\n\nNombre: %s\n", objeto1.getNombre());
            System.out.printf("Apellidos: %s\n", objeto1.getApellidos());
            System.out.printf("Sexo: %s\n", objeto1.getSexo());
            System.out.printf("rfc: %s\n", objeto1.getRfc());
            System.out.println("Edad: "+ objeto1.getEdad());
        
        }
        
    
}
