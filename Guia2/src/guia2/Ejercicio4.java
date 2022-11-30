/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia2;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio4 {
    
     public static void main(String[] args ){
         
         int valor;
         System.out.println("Conjetura de Ulam");
         Scanner obtener = new Scanner(System.in);
         System.out.println("Indroduzca el numero:");
         valor = obtener.nextInt();
         
         if(valor>0){
             
             while(valor!=1){

                 if(valor%2 == 0){
                    valor = valor/2;
                 
                 }else{
                     valor = valor*3+1;
                 }
                 System.out.println(valor+" ");
             }
              
         }else{
             System.out.println("El numero debe ser positivo");
         }
     
     }
    
}
