/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

/**
 *
 * @author Sebastian
 */
public class Ejercicio12 {
    
     public static void main(String[] args ){
         int numeros[] = new int[100];
         int suma;
         suma =0;
       
       System.out.println("Un arreglo de numeros pares y su suma");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        
        }
        
        
        for(int i = 1; i < numeros.length; i +=2){
            suma = suma + numeros[i];
            System.out.println("Arreglo["+i+"] = "+numeros[i]);
            System.out.println("La suma de los pares es: "+suma);
            
        }
     
     }
    
}
