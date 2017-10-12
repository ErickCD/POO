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
public class PrincipalTabla {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);

        int x = 1;
        do {

            procesoApp();

            System.out.println("\nDesea hacer mas registros? Y = 1:");
            x = entrada.nextInt();

        } while (x == 1);
    }

    public static void procesoApp() {

        Scanner entradaS = new Scanner(System.in);
        Scanner entradaI = new Scanner(System.in);

        int n;
        int i;

        System.out.print("\nInserte el numero de personas a registrar a registrar: ");
        n = entradaI.nextInt();

        Persona tabla[] = new Persona[n];

        String nombre;
        String apellidoM;
        String apellidoP;
        String sexo;
        String rfc;
        int edad;

        for (i = 0; i < tabla.length; i++) {
            tabla[i] = new Persona();
        }

        for (i = 0; i < n; i++) {

            System.out.println("\nPersona numero: " + (i + 1));

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

            tabla[i].seNombre(nombre);
            tabla[i].setApellidos(apellidoM, apellidoP);
            tabla[i].setSexo(sexo);
            tabla[i].setRFC(rfc);
            tabla[i].setFechaNacimiento(edad);
        }

        System.out.println("\n\n*****Registro de personas*****");

        for (i = 0; i < n; i++) {
            System.out.println("\nPersona numero: [" + (i + 1) + "]");

            System.out.printf("\n%s \t%s \t%s \t%s \t%s\n",("Nombre"),("Apellidos"),("Sexo"),("RFC"),("Edad"));
            System.out.printf("\n%s \t%s \t%s \t%s \t%d\n",tabla[i].getNombre(),tabla[i].getApellidos(),tabla[i].getSexo(),tabla[i].getRfc(),tabla[i].getEdad());

        }

    }
}
