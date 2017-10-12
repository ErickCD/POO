package U5_Excepcionesgeneradad;

public class Aplicacion1 {

    public static void main(String[] args) {

        String arreglo[] = {"Carlos", "Sarita", "Lupe"};

        try { 
            for (int i = 0; i < arreglo.length + 1; i++) {
                System.out.println(arreglo[i]);

            }

        }catch(java.lang.ArrayIndexOutOfBoundsException e){
            System.err.println("Buen trabajo, te equivocaste!!!");
        }  
        }
    }
