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
public class PrincipalDO {

    public static void main(String args[]) {

        objeto1();
        objeto2();

    }

    public static void objeto1() {

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
        System.out.printf("Edad: %d\n", objeto1.getEdad());

    }

    public static void objeto2() {

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


        Persona objeto2 = new Persona();

        objeto2.seNombre(nombre);
        objeto2.setApellidos(apellidoM, apellidoP);
        objeto2.setSexo(sexo);
        objeto2.setRFC(rfc);
        objeto2.setFechaNacimiento(edad);


        System.out.printf("\n\nNombre: %s\n", objeto2.getNombre());
        System.out.printf("Apellidos: %s\n", objeto2.getApellidos());
        System.out.printf("Sexo: %s\n", objeto2.getSexo());
        System.out.printf("rfc: %s\n", objeto2.getRfc());
        System.out.printf("Edad: %d\n", objeto2.getEdad());
    }
}
