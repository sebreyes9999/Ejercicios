/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args ) {
        int numero;
        int i;
        int contador;
        contador =0;
        System.out.println("Detector de numeros primos");
        Scanner obtener = new Scanner(System.in);
        
        System.out.println("Introduzca un numero: ");
        numero = obtener.nextInt();
        
        for(i = 1; i <= numero; i++){
            
            if((numero % i) == 0){
                
                contador++;
            
            }
        
        }
        
        if((contador<=2)&&(contador!=1)){
            System.out.println("El numero es primo");
        }else{
            System.out.println("El numero no es primo");
        }
    }
    
}
