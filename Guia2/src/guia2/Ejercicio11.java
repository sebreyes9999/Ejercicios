/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

/**
 *
 * @author Sebastian
 */
public class Ejercicio11 {
    
    public static void main(String[] args ){
    
        int arreglo[] = new int[100];
        int var1 =0;
        int var2 =1;
        int suma;
        suma =0;
        
        System.out.println("Bienvenido a la sucesion Fibonacci de 100 numeros");
        for(int i = 0; i<100; i++){
            
            
            suma = var1 + var2;
            var1 = var2;
            var2 = suma;
            arreglo[i]=var1;
        
        }
        
        for(int i = 0; i<100; i++){
            
            System.out.println("Arreglo["+i+"] = "+arreglo[i]);
        
        }
        System.out.println("Sucesion completa");
    }
    
}
