package Demo03_UsoExecepcionesPropias;
import java.util.Scanner;
public class AppExepcionPropia {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el numerador: ");
        String numerador = entrada.nextLine();
        System.out.println("Ingrese el denominador: ");
        String denominador = entrada.nextLine();
        
        OperacionBasica op = new OperacionBasica();
        op.setDivision(numerador, denominador);
    }
    
}
