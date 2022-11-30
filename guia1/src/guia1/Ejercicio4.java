/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package guia1;

import java.util.Scanner;

/**
 *
 * @author Sebastian
 */
public class Ejercicio4 {
    
     public static void main(String[] args) {
         
         int numer1;
         int numer2;
         
         System.out.println("Definir cual es mayor");
         Scanner maymen = new Scanner(System.in);
         
         System.out.println("Introduzca el primer numero: ");
         numer1 = maymen.nextInt();
         
         System.out.println("Introduzca el segundo numero: ");
         numer2 = maymen.nextInt();
         
         if(numer1>numer2){
             
            System.out.println(numer1+ " es mayor que " +numer2);
         
         }else{
             
            System.out.println(numer1+" es menor que " +numer2);
         
         }
         
         if(numer1<numer2){
             
            System.out.println(numer2+ " es mayor que " +numer1);
         
         }else{
             
            System.out.println(numer2+ "es menor que " +numer1);
         
         }
     
     }
        
       
    
}
