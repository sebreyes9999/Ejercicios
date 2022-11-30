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
public class Ejercicio7 {
    
    public static void main(String[] args ){
        
        int n;
        
        Scanner limitSuces = new Scanner(System.in);
        System.out.println("Introduce el limite de la sucesion:");
        n = limitSuces.nextInt();
        
        for(int i = 1; i<=n; i++){
            
            System.out.println(i*i);
        
        }
        System.out.println("Sucesion completa");
        
    }
    
    
}
    
