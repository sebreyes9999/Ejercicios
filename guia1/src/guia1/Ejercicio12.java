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
public class Ejercicio12 {
    
    public static void main(String[] args){
        
        double radio;
        double diametro;
        double area;
        area =0;
        diametro =0;
        
         System.out.println("Calcular el area de un Circulo");
         
         Scanner circulo = new Scanner(System.in);
         System.out.println("Introduzca el valor del radio: ");
         radio = circulo.nextInt();
         
         diametro = radio * 2;
         
         System.out.println(area+ " es el diametro del circulo");
         
         area = (3.1416) * (radio * radio);
         
         
         System.out.println(area+ " es el valor del area del circulo");
    
    }
}
