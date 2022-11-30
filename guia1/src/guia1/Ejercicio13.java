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
public class Ejercicio13 {
    
    public static void main(String[] args){
        
        int base;
        int altura;
        int area;
        area =0;
        
        System.out.println("Calcular el area de un Rectangulo");
        Scanner rectan = new Scanner(System.in);
        
        System.out.println("Introduzca el valor de la base: ");
        base = rectan.nextInt();
        
        System.out.println("Introduzca el valor de la altura: ");
        altura = rectan.nextInt();
        
        area = base * altura;
        
        System.out.println(area+ " es el area del Rectangulo");
        
        
    }
    
}
