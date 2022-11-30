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
public class Ejercicio2 {
    
     public static void main(String[] args) {
         
         int numero;
         
         System.out.println("Definir si es positivo o negativo.");
         Scanner leer = new Scanner(System.in);
         System.out.println("Introduzca un numero: ");
         numero = leer.nextInt();
         
         if(numero<0){
             
             System.out.println(numero+ " es negativo");
         
         }else{
             
             System.out.println(numero+ " es positivo");
         
         }
     
     }
    
}
