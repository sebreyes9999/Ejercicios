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
public class Ejercicio5 {
    
     public static void main(String[] args) {
         
         int nota1;
         int nota2;
         int nota3;
         int nota4;
         float suma;
         float promedio;
         suma =0;
         promedio =0;
         
         System.out.println("Promedio de notas del estudiante");
         Scanner promer = new Scanner(System.in);
         
         System.out.println("Introduzca primera nota: ");
         nota1 = promer.nextInt();
         
         System.out.println("Introduzca segunda nota: ");
         nota2 = promer.nextInt();
         
         System.out.println("Introduzca tercera nota: ");
         nota3 = promer.nextInt();
         
         System.out.println("Introduzca cuarta nota: ");
         nota4 = promer.nextInt();
         
          suma = nota1+nota2+nota3+nota4;
          System.out.println("La suma de las notas es: "+suma);
          promedio = suma/4;
          System.out.println("El promedio es: "+promedio);
     
     }
    
}
