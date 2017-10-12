package Demo01_U5_Exacepciones_DivicionEntreCero;

import static Demo01_U5_Exacepciones_DivicionEntreCero.Aplicacion.cosciente;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Divicion_Excepciones {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;

        do {
            try {
                int numero1, numero2;
                System.out.println("Ingrese el primer numero: ");
                numero1 = entrada.nextInt();
                System.out.println("Ingrese el segundo numero: ");
                numero2 = entrada.nextInt();

                cosciente(numero1, numero2);
            } catch (InputMismatchException a) {
                System.err.println("Comertio un error!!!");
                entrada.nextInt();
                System.out.println("Debe de introducir numero, vuelva a intentarlo");
                continuar = true;
            } catch (ArithmeticException e) {
                System.err.println("La divicion por cero no es posible genio ¬_¬");
                entrada.nextInt();
                System.out.println("Debe de introducir numero, vuelva a intentarlo");
            }

        } while (continuar);

    }

    public static void cosciente(int valor1, int valor2)throws ArithmeticException{
        int numero1 = 0, numero2 = 0, suma;

        numero1 = valor1;
        numero2 = valor2;

        suma = numero1 / numero2;
        System.out.println("La suma es: " + suma);
    }
}
