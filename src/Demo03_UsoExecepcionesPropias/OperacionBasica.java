package Demo03_UsoExecepcionesPropias;

import java.util.InputMismatchException;

public class OperacionBasica {

    public OperacionBasica() {
    }

    public void setDivision(String nume, String denom) {
        try {
            int numeador = Integer.parseInt(nume);
            int denominador = Integer.parseInt(denom);
            this.rango(numeador, denominador);
            int resultado = cosciente(numeador, denominador);

        } catch (InputMismatchException a) {
            System.err.println("Excepcion: " + a);
            System.out.println("Debe de introducir numero enteros, vuelva a intentarlo");
        } catch (ArithmeticException e) {
            System.err.println("Excepcion: " + e);
            System.out.println("Debe de introducir numero, vuelva a intentarlo");
        } catch (NumberFormatException d) {
            System.err.println("Excepcion: " + d);
            System.out.println("Cero es un denominador invalido, vuelva a intentarlo");
        }catch(ExcepcionIntervalo f){
            System.err.println("" + f.getMessage());
        }
    }
    
    private int cosciente(int numerador, int denominador) throws ArithmeticException{
        return numerador/ denominador;
    }
    
    public void rango(int num, int denom )throws ExcepcionIntervalo{
        if((num > 10)||(denom < 5)){
            throw new ExcepcionIntervalo("Los numeros del intervalo no estan permitidos: ");
        }
    }
}
