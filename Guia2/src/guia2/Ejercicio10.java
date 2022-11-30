/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;


/**
 *
 * @author Sebastian
 */
public class Ejercicio10 {
    
    public static void main(String[] args ){
        
       int numeros[] = new int[20];
       
       System.out.println("Un arreglo de posiciones impares con contenido par");
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = i + 1;
        
        }
        
        
        for(int i = 1; i < numeros.length; i +=2){
            System.out.println("Arreglo["+i+"] = "+numeros[i]);
        }
        
   }
}    

