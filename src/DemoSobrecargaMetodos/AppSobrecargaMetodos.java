
package DemoSobrecargaMetodos;

public class AppSobrecargaMetodos {
    public static void main(String args[]){
        proceso();
    }
    
    public static void proceso(){
        //valor con las que se probará el ejemplo
        float a = 25, b = 45, c = 30, d = 50;
        //declarando y creando el objeto op1 utilizando al constructor con dos parametros
        OperacionBasica  op1 = new OperacionBasica(a, b);
        //Se llama al metodo getSUma(...) para realizar la suma de los dos valores a y b
        //y se almacena en la variable suma
        float suma = op1.getSuma(a, b);
        //imprime el resultado de la operacion getSuma(a, b)
        System.out.println("La suma de " +a+ " mas "+b+" = "+ suma);
        
        OperacionBasica op2 = new OperacionBasica(c, d);
        
        float suma2 = op2.getSuma(c, d);
        
        float arreglo[] = new float[5];
        
        arreglo [0] = 13;
        arreglo [1] = 12;
        arreglo [2] = 5;
        arreglo [3] = 14;
        arreglo [4] = 23;
        
        OperacionBasica Op3 = new OperacionBasica(arreglo);
        
        float suma3 = Op3.getSuma(arreglo);
        
        float arreglo2[] = new float[3];
        arreglo2[0] = 23;
        arreglo2[1] = 32;
        arreglo2[2] = 55;
        
        OperacionBasica Op4 = new OperacionBasica(arreglo2);
        
        float suma4 = Op4.getSuma(arreglo2);
        
        System.out.println("\n\n*****variables actualizadas*****");
        System.out.println("\nLa suma de "+c+" mas "+d+" = "+ suma2);
        System.out.println("\n\n*****arreglo*****");
        System.out.println("\nLa suma del arreglo = "+ suma3);
        System.out.println("\n\n*****arreglo actualizado*****");
        System.out.println("\nLa suma del arreglo = "+ suma4);
    }
}
