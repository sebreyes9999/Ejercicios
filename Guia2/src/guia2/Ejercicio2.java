/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

/**
 *
 * @author Sebastian
 */
public class Ejercicio2 {
    
    public static void main(String[] args ){
        int num1 = 0;
        int num2 = 1;
        int i;
        int suma;
        suma =0;
        
        System.out.println("Bienvenido a la sucesion Fibonacci de 10 numeros");
        for(i = 0; i<10; i++){
            
            System.out.println(num1 + "");
            
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        
        }
        System.out.println("Sucesion completa");
        
    }
    
    
}
