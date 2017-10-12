package Fibonacci;

import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        
        int y;
        do{
            
        Scanner entrada = new Scanner(System.in);
        System.out.println("Cuantos numeros quiere recorrer en la serie fibonacci?");
        int x = entrada.nextInt();
        
        if(x == 1){
            System.out.println("0");
        }else if(x == 2){
            System.out.println("0, 1");
        } else if (x > 2){
            proceso(x);
        }
            System.out.println("\n\nDesea hacer otra operacion?:\n Si = 1\nNo = 0");
            y = entrada.nextInt();
            
        }while(y == 1);
    }
    
    private static void proceso(int x){
         int i , a = 0, b = 1, c =0;
         String d = "";
         for(i = 1; i < (x - 1) ; i++){
             a = b + c;
             c = b;
             b = a;
             d =  d +", "+ a;
         }
         System.out.println("0, 1" + d);
    }
}
