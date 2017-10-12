package Demo01_U5_Exacepciones_DivicionEntreCero;

import java.util.Scanner;

public class Aplicacion {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Ingrese el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numero2 = entrada.nextInt();
        
        cosciente(numero1, numero2);

    }

    public static void cosciente(int valor1, int valor2){
        int numero1 = 0, numero2 = 0, suma;
        
        numero1 =  valor1;
        numero2 = valor2;

        suma = numero1 / numero2;
        System.out.println("La suma es: " + suma);
    }
}
