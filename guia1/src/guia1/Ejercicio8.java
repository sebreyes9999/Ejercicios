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
public class Ejercicio8 {
    
    public static void main(String[] args) {
    
        int number1;
        int number2;
        int number3;
        
        System.out.println("Mostrar numeros pares entre el rango de 100 a 200");
        Scanner rango = new Scanner(System.in);
        
        System.out.println("Introduce el numero #1: ");
        number1 = rango.nextInt();
        
        System.out.println("Introduce el numero #2: ");
        number2 = rango.nextInt();
        
        System.out.println("Introduce el numero #3: ");
        number3 = rango.nextInt();
        
        if((number1 %2 ==0) && (number1 >=100) && number1 <=200 ){
            
            System.out.println(number1+ " es par");
        
            
        }else{
            
            System.out.println(number1+ " es impar");
            System.out.println("Supera el rango establecido");
            
        }     
        if((number2 %2 ==0) && (number2 >=100) && number2 <=200 ){
            
            System.out.println(number2+ " es par");   
                
        }else{
                
            System.out.println(number2+ " es impar"); 
            System.out.println("Supera el rango establecido");
            
        }
        
         if((number3 %2 ==0) && (number3 >=100) && number3 <=200 ){
            
            System.out.println(number3+ " es par");   
                
        }else{
                
            System.out.println(number3+ " es impar");
            System.out.println("Supera el rango establecido");
            
        }
                
                
                
    }
    
}
