package Clases_Abstractas;

import java.util.Scanner;

public class Usa_Habitante {

    public static void main(String[] args) {
        //ejecutar();
        Usa_Habitante uh = new Usa_Habitante();
        uh.ejecutar();
    }

    public void ejecutar() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la frase de Homero: ");
        String homero = entrada.nextLine();
        System.out.println("\nIngrese la frase de Barth: ");
        String barth = entrada.nextLine();
        System.out.println("\nIngrese la frase de lisa: ");
        String lisa = entrada.nextLine();

        //Crear los objetos Homero y Barth
        Adulto Homero = new Adulto(homero);
        Infante Barth = new Infante(barth);
        Infante Lisa = new Infante(lisa);

        Habitante Sprinfild[] = new Habitante[3];

        Sprinfild[0] = Homero;
        Sprinfild[1] = Barth;
        Sprinfild[2] = Lisa;

        System.out.println("\n\n");
        for (int i = 0; i < Sprinfild.length; i++) {
            System.out.println(Sprinfild[i].getNombre() + "; " + Sprinfild[i].habla());
        }
    }
}
