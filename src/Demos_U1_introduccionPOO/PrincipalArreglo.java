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
public class PrincipalArreglo {

    public static void main(String args[]) {
        procesoApp();
    }

    public static void procesoApp() {
        Scanner entradaS = new Scanner(System.in);
        Scanner entradaI = new Scanner(System.in);

        int n;
        int i;

        System.out.println("Deme el numero de Personas a registrar: ");
        n = entradaI.nextInt();

        Persona lista[] = new Persona[n];

        String nombre;
        String apellidoM;
        String apellidoP;
        String sexo;
        String rfc;
        int edad;
        
        for (i = 0; i < lista.length; i++) { //Crear posición del objeto en la posicón de del arreglo
            lista[i] = new Persona();
        }


        for (i = 0; i < n; i++) {
            
            System.out.println("\nPersona numero: "+ (i+ 1));

            System.out.println("\nDeme el nombre de la persona: ");
            nombre = entradaS.nextLine();
            System.out.println("Deme el apellido materno: ");
            apellidoM = entradaS.nextLine();
            System.out.println("Deme el apellido paterno: ");
            apellidoP = entradaS.nextLine();
            System.out.println("Deme el sexo de la persona: ");
            sexo = entradaS.nextLine();
            System.out.println("Escriba el RFC de la persona: ");
            rfc = entradaS.nextLine();
            System.out.println("Deme la fecha de nacimiento de la persona: ");
            edad = entradaI.nextInt();

            lista[i].seNombre(nombre);
            lista[i].setApellidos(apellidoM, apellidoP);
            lista[i].setSexo(sexo);
            lista[i].setRFC(rfc);
            lista[i].setFechaNacimiento(edad);
        }
        
        System.out.println("\n\n*****Lista de registros*****");

        for (i = 0; i < n; i++) {
            
            System.out.println("\nPersona numero: ["+ (i+ 1) + "]");
            
            System.out.printf("\n%s %s\n", lista[i].getNombre(),lista[i].getApellidos());
            System.out.printf("Sexo: %s\n", lista[i].getSexo());
            System.out.printf("rfc: %s\n", lista[i].getRfc());
            System.out.printf("Edad: %d\n\n", lista[i].getEdad());

        }
    }
}
