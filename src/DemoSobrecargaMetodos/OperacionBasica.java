package DemoSobrecargaMetodos;

public class OperacionBasica {
    private float valor1;
    private float valor2;
    private float resultado;
    private float datos[];
    
    public OperacionBasica(float  valor1, float valor2){
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    public OperacionBasica(float datos[]){
        this.datos = datos;
    }
    private  void sumar(float valor1, float valor2){
        resultado = valor1 + valor2;
    }
    private void sumar(float datos[]){
        resultado = 0;
        for(int i = 0; i < datos.length ; i++){
            resultado = resultado + datos[i];
        }
    }
    public void setOperando1(float valor1){
        this.valor1 = valor1;
    }
    public void setOperando2(float valor2){
        this.valor2 = valor2;
    }
    public void actualizarDatosArreglo(float datos[]){
        
        
    }
    public float getSuma(float valor1, float valor2){
        sumar(valor1 , valor2);
        return resultado;
    }
    public float getSuma(float datos[]){
        sumar(datos);
        return resultado;
    }
}
