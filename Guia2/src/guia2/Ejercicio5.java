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
public class Ejercicio5 {
    
    public static void main(String[] args ){
        
        int num;
        
        int factorial = 1;
        
        System.out.println("Sistema de factorización");
        
        Scanner factorTeclado = new Scanner(System.in);
        System.out.println("Introduzca el numero a factorizar: ");
        num = factorTeclado.nextInt();
        
        for(int i=1; i<=num; i++){
            
            factorial = i * factorial;
        }
        
        System.out.println("El factorial de "+num+" es: "+factorial);
    
    
    }
    
}
