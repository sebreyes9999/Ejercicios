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
public class Ejercicio10 {
    
    public static void main(String[] args){
        
        int lado;
        int area;
        area =0;
        
         System.out.println("Calcular el area de un cuadrado");
         
         Scanner cuadrado = new Scanner(System.in);
         System.out.println("Introduzca el valor de los lados: ");
         lado = cuadrado.nextInt();
         
         area = lado*lado;
         
         System.out.println(area+ " es el valor del area del cuadrado");
         
         
    
    
    }
    
}
