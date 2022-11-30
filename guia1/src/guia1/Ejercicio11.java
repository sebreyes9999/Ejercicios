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
public class Ejercicio11 {
    
    public static void main(String[] args){
        
        int base;
        int altura;
        float area;
        area =0;
        
         System.out.println("Calcular el area de un Triangulo Equilatero");
         
         Scanner triangulo = new Scanner(System.in);
         System.out.println("Introduzca el valor de la base: ");
         base = triangulo.nextInt();
         
         System.out.println("Introduzca el valor de la altura: ");
         altura = triangulo.nextInt();
         
         area = base * altura /2;
         
         System.out.println(area+ " es el valor del area del triangulo");
    
    }
}
