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
public class Ejercicio6 {
    
     public static void main(String[] args) {
         
        int num;
        
         System.out.println("Calcular el cuadraro y cubo de un numero");
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un numero: ");
        num = teclado.nextInt();
        
        double cuadrado = (int)Math.pow(num,2);
        System.out.println(cuadrado+ " es el cuadrado de " +num);
        
        double cubo = (int)Math.pow(num,3);
        System.out.println(cubo+ " es el cubo de " +num);
    }
     
}
    
